/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdfinal.workoutapi.dao.CategoryDAO;
import com.fsdfinal.workoutapi.dao.WorkoutDAO;
import com.fsdfinal.workoutapi.to.WorkoutRequestTO;
import com.fsdfinal.workoutapi.to.WorkoutResponseTO;
import com.fsdfinal.workoutapi.valueobject.Category;
import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
@Service
public class WorkoutServiceImpl implements WorkoutService {
	@Autowired
	private WorkoutDAO workoutDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	/**
	 * @see com.fsdfinal.workoutapi.service.WorkoutService#getCategories()
	 */
	@Override
	public List<Workout> getWorkouts() {
		List<Workout> workouts = workoutDAO.getWorkouts();
		return workouts;
	}
	
	@Override
	public WorkoutResponseTO saveWorkout(WorkoutRequestTO workoutTO){
		WorkoutResponseTO responseTO= new WorkoutResponseTO();
		Workout workout =null;
		boolean success= false;
		
		// workout update
		if(workoutTO.getWorkoutId()!=0){
				workout = workoutDAO.getWorkoutById(workoutTO.getWorkoutId());
				if(workout!=null){
					workout.setWorkoutTitle(workoutTO.getWorkoutTitle());
					workout.setWorkoutNote(workoutTO.getWorkoutNote());
					workout.setCaloriesBurnt(workoutTO.getCaloriesBurnt());
					Category category = categoryDAO.getCategoryById(workoutTO.getCategoryId());
					workout.setCategory(category);
					success= workoutDAO.saveWorkout(workout);
		         }else{
		        	 success=false;
			         responseTO.setMessage("Workout Does not Exists");
		         }
	    }else{
	    		workout = workoutDAO.getWorkoutByName(workoutTO.getWorkoutTitle());
				// Check if the workout already exists
				if(workout!=null 
						&& workoutTO.getWorkoutTitle().equalsIgnoreCase(workout.getWorkoutTitle())){
					success=false;
					responseTO.setMessage("Workout Already Exists");
				}else{
				// new workout
				workout = new Workout();
				workout.setWorkoutTitle(workoutTO.getWorkoutTitle());
				workout.setWorkoutNote(workoutTO.getWorkoutNote());
				workout.setCaloriesBurnt(workoutTO.getCaloriesBurnt());
				Category category = categoryDAO.getCategoryById(workoutTO.getCategoryId());
				workout.setCategory(category);
				success= workoutDAO.saveWorkout(workout);
			  }
		}
		responseTO.setSuccess(success);
		if(success){		
			if(responseTO.getMessage()==null) 
				responseTO.setMessage("Workout Saved Successfully");
		}
		else{
			if(responseTO.getMessage()==null) 
			responseTO.setMessage("Workout Save Failed");
		}
		return responseTO;
	}

	@Override
	public WorkoutResponseTO deleteWorkout(WorkoutRequestTO workoutTO) {
		WorkoutResponseTO responseTO= new WorkoutResponseTO();
		 Workout workout = workoutDAO.getWorkoutById(workoutTO.getWorkoutId());
		 if(workout!=null){
			 workoutDAO.deleteWorkout(workout);
			 responseTO.setMessage("Workout Deleted successfully!!");
			 responseTO.setSuccess(true);
		 }else{
			 responseTO.setMessage("Workout does not exist!!");
			 responseTO.setSuccess(false);
		 }
		 return responseTO;
	}

	@Override
	public WorkoutResponseTO getWorkout(WorkoutRequestTO workoutTO) {
		WorkoutResponseTO responseTO= new WorkoutResponseTO();
		 Workout workout = workoutDAO.getWorkoutById(workoutTO.getWorkoutId());
		 if(workout!=null){
			 responseTO.setMessage("Workout Retrived Successfully");
			 responseTO.setSuccess(true);
			 responseTO.setWorkout(workout);
		 }else{
			 responseTO.setMessage("No Records Found");
			 responseTO.setSuccess(false);
		 }
		 return responseTO;
	}
		

}

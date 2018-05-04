/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedhaf
 *
 */

@Transactional
@Repository
public class WorkoutDAOImpl implements WorkoutDAO {
	/**
	 * Logger implementation for DAO Layer
	 */
	private static Logger log=Logger.getLogger(WorkoutDAOImpl.class);
	/**
	 * Workout Repository
	 */
	@Autowired
	public WorkoutRepository workoutRepository;
	
		
	/**

	/**
	 * @see com.fsdfinal.workoutapi.dao.WorkoutDAO#getCategories()
	 */
	@Override
	public List<Workout> getWorkouts() {
		log.info("In Get Workouts");
		 return workoutRepository.findAll();
	}
	
	/**
	 * @param workout
	 */
	public boolean saveWorkout(Workout workout){
		boolean successSave = false;
		
		
		workout = workoutRepository.save(workout);
		
		if (workout.getWorkoutId()!=null)
			successSave=true;
		return successSave;
	}

	@Override
	public Workout getWorkoutById(Integer workoutId) {
		return workoutRepository.findByWorkoutId(workoutId);
	}

	@Override
	public Workout getWorkoutByName(String workoutTitle) {
		return workoutRepository.findByWorkoutTitle(workoutTitle);
	}

	@Override
	public void deleteWorkout(Workout workout) {
		 workoutRepository.delete(workout);
	}
	
    
	
	

}

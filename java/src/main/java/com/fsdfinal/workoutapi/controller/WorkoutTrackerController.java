/**
 * 
 */
package com.fsdfinal.workoutapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fsdfinal.workoutapi.service.CategoryService;
import com.fsdfinal.workoutapi.service.DailyWorkoutService;
import com.fsdfinal.workoutapi.service.WorkoutService;
import com.fsdfinal.workoutapi.to.CategoryRequestTO;
import com.fsdfinal.workoutapi.to.CategoryResponseTO;
import com.fsdfinal.workoutapi.to.DailyWorkoutRequestTO;
import com.fsdfinal.workoutapi.to.DailyWorkoutResponseTO;
import com.fsdfinal.workoutapi.to.WorkoutRequestTO;
import com.fsdfinal.workoutapi.to.WorkoutResponseTO;
import com.fsdfinal.workoutapi.valueobject.Category;
import com.fsdfinal.workoutapi.valueobject.DailyWorkout;
import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
@RestController
@RequestMapping("/fsdworkout")
public class WorkoutTrackerController {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private WorkoutService workoutService;
	
	@Autowired
	private DailyWorkoutService dailyWorkoutService;
		
	@RequestMapping(method = RequestMethod.GET, value = "/getCategories")
	public CategoryResponseTO getCategories() 
	{
		CategoryResponseTO categoryResponse = new CategoryResponseTO();
		List<Category> categories = categoryService.getCategories();
		categoryResponse.setCategories(categories);
		categoryResponse.setSuccess(true);
		categoryResponse.setMessage("Category List");
		return categoryResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveCategory")
	public CategoryResponseTO saveCategory(@RequestBody CategoryRequestTO categoryTO) 
	{
		CategoryResponseTO categoryResponse = new CategoryResponseTO();
		 if(categoryTO.getCategoryId()==null){
			 // set category id to zero for new category
			 categoryTO.setCategoryId(0);
		 }
		categoryResponse= categoryService.saveCategory(categoryTO);
		if(categoryResponse.isSuccess()){ 
			List<Category> categories = categoryService.getCategories();
			categoryResponse.setCategories(categories);
		}
		return categoryResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteCategory")
	public CategoryResponseTO deleteCategory(@RequestBody CategoryRequestTO categoryTO) 
	{
		CategoryResponseTO categoryResponse = new CategoryResponseTO();
		 
		categoryResponse= categoryService.deleteCategory(categoryTO);
		if(categoryResponse.isSuccess()){ 
			List<Category> categories = categoryService.getCategories();
			categoryResponse.setCategories(categories);
		}
		
		return categoryResponse;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getWorkouts")
	public WorkoutResponseTO getWorkouts() 
	{
		WorkoutResponseTO workoutResponse = new WorkoutResponseTO();
		List<Workout> workouts = workoutService.getWorkouts();
		workoutResponse.setWorkouts(workouts);
		workoutResponse.setSuccess(true);
		workoutResponse.setMessage("Workout List");
		return workoutResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/getWorkout")
	public WorkoutResponseTO getWorkout(@RequestBody WorkoutRequestTO workoutTO) 
	{
		WorkoutResponseTO workoutResponse = new WorkoutResponseTO();
		 
		workoutResponse= workoutService.getWorkout(workoutTO);
		 
		return workoutResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveWorkout")
	public WorkoutResponseTO saveWorkout(@RequestBody WorkoutRequestTO workoutTO) 
	{
		WorkoutResponseTO workoutResponse = new WorkoutResponseTO();
		 
		workoutResponse= workoutService.saveWorkout(workoutTO);
		if(workoutResponse.isSuccess()){ 
			List<Workout> workouts = workoutService.getWorkouts();
			workoutResponse.setWorkouts(workouts);
		}
		return workoutResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/deleteWorkout")
	public WorkoutResponseTO deleteWorkout(@RequestBody WorkoutRequestTO workoutTO) 
	{
		WorkoutResponseTO workoutResponse = new WorkoutResponseTO();
		 
		workoutResponse= workoutService.deleteWorkout(workoutTO);
		if(workoutResponse.isSuccess()){ 
			List<Workout> workouts = workoutService.getWorkouts();
			workoutResponse.setWorkouts(workouts);
		}
		return workoutResponse;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getDailyWorkouts")
	public DailyWorkoutResponseTO geDailytWorkouts() 
	{
		DailyWorkoutResponseTO dailyWorkoutResponse = new DailyWorkoutResponseTO();
		List<DailyWorkout> dailyWorkouts = dailyWorkoutService.getDailyWorkouts();
		dailyWorkoutResponse.setDailyWorkouts(dailyWorkouts);
		
		return dailyWorkoutResponse;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveDailyWorkout")
	public DailyWorkoutResponseTO saveDailyWorkout(@RequestBody DailyWorkoutRequestTO dailyWorkoutTO) 
	{
		DailyWorkoutResponseTO dailyWorkoutResponse = new DailyWorkoutResponseTO();
		 
		dailyWorkoutResponse= dailyWorkoutService.saveDailyWorkout(dailyWorkoutTO);
		dailyWorkoutResponse.setSuccess(true);
		dailyWorkoutResponse.setMessage("Daily Workout List");
		if(dailyWorkoutResponse.isSuccess()){ 
			List<DailyWorkout> dailyWorkouts = dailyWorkoutService.getDailyWorkouts();
			dailyWorkoutResponse.setDailyWorkouts(dailyWorkouts);
			dailyWorkoutResponse.setWorkouts(workoutService.getWorkouts());
		}
		return dailyWorkoutResponse;
	}

}

/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.util.List;

import com.fsdfinal.workoutapi.to.WorkoutRequestTO;
import com.fsdfinal.workoutapi.to.WorkoutResponseTO;
import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
public interface WorkoutService {
	
	/**
	 * @return List of categories
	 */
	public List<Workout> getWorkouts();
	
	/**
	 * @param workout
	 */
	public WorkoutResponseTO saveWorkout(WorkoutRequestTO workout);
	
	public WorkoutResponseTO deleteWorkout(WorkoutRequestTO workout);
	
	public WorkoutResponseTO getWorkout(WorkoutRequestTO workout);
	 

}

/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.util.List;

import com.fsdfinal.workoutapi.to.DailyWorkoutRequestTO;
import com.fsdfinal.workoutapi.to.DailyWorkoutResponseTO;
import com.fsdfinal.workoutapi.valueobject.DailyWorkout;

/**
 * @author Fareedha
 *
 */
public interface DailyWorkoutService {
	
	/**
	 * @return List of Daily work outs
	 */
	public List<DailyWorkout> getDailyWorkouts();
	
	/**
	 * @param workout
	 */
	public DailyWorkoutResponseTO saveDailyWorkout(DailyWorkoutRequestTO workout);
	
	public DailyWorkoutResponseTO deleteDailyWorkout(DailyWorkoutRequestTO workout);

}

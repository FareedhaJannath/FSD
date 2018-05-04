/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import com.fsdfinal.workoutapi.valueobject.DailyWorkout;

/**
 * @author 142555
 *
 */
public interface DailyWorkoutDAO {
	 
	/**
	 * @return list of Daily workouts
	 */
	public List<DailyWorkout>  getDailyWorkouts();
	
	/**
	 * @param dailyWorkout
	 */
	public boolean saveDailyWorkout(DailyWorkout dailyWorkout);
	
	public DailyWorkout getDailyWorkoutById(Integer dailyWorkoutId);
	
	public void deleteDailyWorkout(DailyWorkout dailyWorkout);

}

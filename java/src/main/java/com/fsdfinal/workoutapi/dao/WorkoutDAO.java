/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author 142555
 *
 */
public interface WorkoutDAO {
	 
	/**
	 * @return list of workouts
	 */
	public List<Workout>  getWorkouts();
	
	/**
	 * @param workoutOO
	 */
	public boolean saveWorkout(Workout workout);
	
	public Workout getWorkoutById(Integer workoutId);
	
	public Workout getWorkoutByName(String workoutTitle);
	
	public void deleteWorkout(Workout workout);

}

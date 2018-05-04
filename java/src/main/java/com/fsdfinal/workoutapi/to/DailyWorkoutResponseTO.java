/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fsdfinal.workoutapi.valueobject.DailyWorkout;
import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
public class DailyWorkoutResponseTO extends BaseResponseTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6499479406133448835L;
	
	private List<DailyWorkout> dailyWorkouts = new ArrayList<DailyWorkout>();
	
	private List<Workout> workouts = new ArrayList<Workout>();

	/**
	 * @return the dailyWorkouts
	 */
	public List<DailyWorkout> getDailyWorkouts() {
		return dailyWorkouts;
	}

	/**
	 * @param dailyWorkouts the dailyWorkouts to set
	 */
	public void setDailyWorkouts(List<DailyWorkout> dailyWorkouts) {
		this.dailyWorkouts = dailyWorkouts;
	}

	/**
	 * @return the workouts
	 */
	public List<Workout> getWorkouts() {
		return workouts;
	}

	/**
	 * @param workouts the workouts to set
	 */
	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}

		
}

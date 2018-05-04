/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fsdfinal.workoutapi.valueobject.Workout;

/**
 * @author Fareedha
 *
 */
public class WorkoutResponseTO extends BaseResponseTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6499479406133448835L;
	
	private List<Workout> workouts = new ArrayList<Workout>();
	
	private Workout workout;

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

	/**
	 * @return the workout
	 */
	public Workout getWorkout() {
		return workout;
	}

	/**
	 * @param workout the workout to set
	 */
	public void setWorkout(Workout workout) {
		this.workout = workout;
	}

	 
	
	
}

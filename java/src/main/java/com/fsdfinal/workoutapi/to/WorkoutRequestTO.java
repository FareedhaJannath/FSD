/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;

/**
 * @author Fareedha
 *
 */
public class WorkoutRequestTO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 919716486923017873L;
	
	private Integer workoutId;
	
	private String workoutTitle;
	
	private String workoutNote;
	
	private Integer categoryId;
	
	private Float caloriesBurnt;

	/**
	 * @return the workoutId
	 */
	public Integer getWorkoutId() {
		return workoutId;
	}

	/**
	 * @param workoutId the workoutId to set
	 */
	public void setWorkoutId(Integer workoutId) {
		this.workoutId = workoutId;
	}

	/**
	 * @return the workoutTitle
	 */
	public String getWorkoutTitle() {
		return workoutTitle;
	}

	/**
	 * @param workoutTitle the workoutTitle to set
	 */
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}

	/**
	 * @return the workoutNote
	 */
	public String getWorkoutNote() {
		return workoutNote;
	}

	/**
	 * @param workoutNote the workoutNote to set
	 */
	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}

	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the caloriesBurnt
	 */
	public Float getCaloriesBurnt() {
		return caloriesBurnt;
	}

	/**
	 * @param caloriesBurnt the caloriesBurnt to set
	 */
	public void setCaloriesBurnt(Float caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}


}

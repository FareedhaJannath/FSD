/**
 * 
 */
package com.fsdfinal.workoutapi.valueobject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Fareedha
 *
 */
@Entity
@Table(name="workout_collection")
public class Workout implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -632094775048172907L;
	/**
	 * Work out Id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WORKOUT_ID")
	private Integer workoutId;
	
	/**
	 * Work out title
	 */
	@Column(name="WORKOUT_TITLE",nullable = false, length = 100)
	private String workoutTitle;
	
	@Column(name="WORKOUT_NOTE",nullable = false, length = 500)
	private String workoutNote;
	
	/**
	 * Calories burnt per minute
	 */
	@Column(name="CALORIES_BURN_PER_MIN")
	private Float caloriesBurnt;
	
	/**
	 * Category set
	 */
	
	@ManyToOne 
	@JoinColumn(name="CATEGORY_ID")
	private  Category category;
	
	@JsonIgnore
	@OneToMany(mappedBy="workout")
	private Set<DailyWorkout> dailyWorkout=new HashSet<DailyWorkout>(0);
	
	public Workout(){}

	public Workout(String workoutTitle, String workoutNote, Float caloriesBurnt, Category category) {
		super();
		this.workoutTitle = workoutTitle;
		this.workoutNote = workoutNote;
		this.caloriesBurnt = caloriesBurnt;
		this.category = category;
	}

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
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the dailyWorkout
	 */
	public Set<DailyWorkout> getDailyWorkout() {
		return dailyWorkout;
	}

	/**
	 * @param dailyWorkout the dailyWorkout to set
	 */
	public void setDailyWorkout(Set<DailyWorkout> dailyWorkout) {
		this.dailyWorkout = dailyWorkout;
	}

	 
}

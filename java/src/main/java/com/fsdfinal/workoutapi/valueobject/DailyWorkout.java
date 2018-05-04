/**
 * 
 */
package com.fsdfinal.workoutapi.valueobject;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Fareedha
 *
 */
@Entity
@Table(name="workout_active")
public class DailyWorkout implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5790626445381984016L;
	
	@Id
	@Column(name="WORKOUT_ACT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer dailyWorkoutId;
	
	@Column(name="COMMENT")
	private String comment;
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;
	
	
	@Column(name="START_TIME")
	private Time startTime;
	
	 
	@Column(name="END_TIME")
	private Time endTime;
	
	@Column(name="STATUS")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="WORKOUT_ID")
	private Workout workout;


	/**
	 * @return the dailyWorkoutId
	 */
	public Integer getDailyWorkoutId() {
		return dailyWorkoutId;
	}

	/**
	 * @param dailyWorkoutId the dailyWorkoutId to set
	 */
	public void setDailyWorkoutId(Integer dailyWorkoutId) {
		this.dailyWorkoutId = dailyWorkoutId;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the startTime
	 */
	public Time getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Time getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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

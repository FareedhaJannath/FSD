/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Fareedha
 *
 */
public class DailyWorkoutRequestTO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 919716486923017873L;
	
	private Integer dailyWorkoutId;
	
	private Integer workoutId;
	
	private String comment;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date startDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date endDate;
	
	/*@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDateTime startTime;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDateTime endTime;*/
	
	private String startTime;
	
	private String endTime;
	
	private String status;

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
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
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
	
	
}

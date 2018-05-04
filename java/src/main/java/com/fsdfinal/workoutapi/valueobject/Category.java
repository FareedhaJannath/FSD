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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Fareedha
 *
 */

@Entity
@Table(name = "WORKOUT_CATEGORY")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8999965771190613844L;
	/**
	 * Category Id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private Integer categoryId;
    /** 
     * Category Title
     */
	@Column(name="CATEGORY_TITLE",nullable = false, length = 100)
	private String categoryTitle;
	
    @JsonIgnore
	@OneToMany(mappedBy="category")
	private Set<Workout> workouts = new HashSet<Workout>(0);
    
    private boolean editable;

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
	 * @return the categoryTitle
	 */
	public String getCategoryTitle() {
		return categoryTitle;
	}
	/**
	 * @param categoryTitle the categoryTitle to set
	 */
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	/**
	 * @return the workouts
	 */
	public Set<Workout> getWorkouts() {
		return workouts;
	}

	/**
	 * @param workouts the workouts to set
	 */
	public void setWorkouts(Set<Workout> workouts) {
		this.workouts = workouts;
	}

	/**
	 * @return the editable
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * @param editable the editable to set
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	
	
}

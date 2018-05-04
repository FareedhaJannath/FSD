/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;

/**
 * @author Fareedha
 *
 */
public class CategoryRequestTO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 919716486923017873L;
	
	private Integer categoryId;
	
	private String categoryTitle;

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

}

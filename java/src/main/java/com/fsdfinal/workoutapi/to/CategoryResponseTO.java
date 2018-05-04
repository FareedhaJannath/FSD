/**
 * 
 */
package com.fsdfinal.workoutapi.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author Fareedha
 *
 */
public class CategoryResponseTO extends BaseResponseTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6499479406133448835L;
	
	private List<Category> categories = new ArrayList<Category>();

	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
}

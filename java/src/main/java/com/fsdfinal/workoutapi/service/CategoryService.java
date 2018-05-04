/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.util.List;

import com.fsdfinal.workoutapi.to.CategoryRequestTO;
import com.fsdfinal.workoutapi.to.CategoryResponseTO;
import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author Fareedha
 *
 */
public interface CategoryService {
	
	/**
	 * @return List of categories
	 */
	public List<Category> getCategories();
	
	/**
	 * @param category
	 */
	public CategoryResponseTO saveCategory(CategoryRequestTO category);
	
	public CategoryResponseTO deleteCategory(CategoryRequestTO category);

}

/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author 142555
 *
 */
public interface CategoryDAO {
	 
	/**
	 * @return list of categories
	 */
	public List<Category>  getCategories();
	
	/**
	 * @param category
	 */
	public boolean saveCategory(Category category);
	
	public Category getCategoryById(Integer categoryId);
	
	public Category getCategoryByName(String categoryTitle);
	
	public void deleteCategory(Category category);

}

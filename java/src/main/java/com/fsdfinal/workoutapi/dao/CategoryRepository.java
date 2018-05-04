/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author Fareedha
 *
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{

	
	public List<Category> findAll();
	
	@SuppressWarnings("unchecked")
	public Category save(Category category);
	
	/**
	 * @param 
	 * @return
	 */
	public Category findByCategoryId(Integer categoryId);
	
	/**
	 * @param 
	 * @return
	 */
	public Category findByCategoryTitle(String categoryTitle);
	
	public void delete(Category category);

}

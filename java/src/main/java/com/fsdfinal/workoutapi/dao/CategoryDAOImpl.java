/**
 * 
 */
package com.fsdfinal.workoutapi.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author Fareedha
 *
 */

@Transactional
@Repository
public class CategoryDAOImpl implements CategoryDAO {
	/**
	 * Logger implementation for DAO Layer
	 */
	private static Logger log=Logger.getLogger(CategoryDAOImpl.class);
	/**
	 * Category Repository
	 */
	@Autowired
	public CategoryRepository categoryRepository;
	
		
	/**

	/**
	 * @see com.fsdfinal.workoutapi.dao.CategoryDAO#getCategories()
	 */
	@Override
	public List<Category> getCategories() {
		log.info("In Get Categories");
		 return categoryRepository.findAll();
	}
	
	/**
	 * @param category
	 */
	public boolean saveCategory(Category category){
		boolean successSave = false;
		
		
		category = categoryRepository.save(category);
		
		if (category.getCategoryId()!=null)
			successSave=true;
		return successSave;
	}

	@Override
	public Category getCategoryById(Integer categoryId) {
		return categoryRepository.findByCategoryId(categoryId);
	}

	@Override
	public Category getCategoryByName(String categoryTitle) {
		return categoryRepository.findByCategoryTitle(categoryTitle);
	}

	@Override
	public void deleteCategory(Category category) {
		 categoryRepository.delete(category);
	}
	
    
	
	

}

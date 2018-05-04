/**
 * 
 */
package com.fsdfinal.workoutapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdfinal.workoutapi.dao.CategoryDAO;
import com.fsdfinal.workoutapi.to.CategoryRequestTO;
import com.fsdfinal.workoutapi.to.CategoryResponseTO;
import com.fsdfinal.workoutapi.valueobject.Category;

/**
 * @author Fareedha
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO workoutDAO;
	/**
	 * @see com.fsdfinal.workoutapi.service.CategoryService#getCategories()
	 */
	@Override
	public List<Category> getCategories() {
		List<Category> categories = workoutDAO.getCategories();
		return categories;
	}
	
	@Override
	public CategoryResponseTO saveCategory(CategoryRequestTO categoryTO){
		CategoryResponseTO responseTO= new CategoryResponseTO();
		Category category =null;
		boolean success= false;
		
		// category update
		if(categoryTO.getCategoryId()!=0){
				category = workoutDAO.getCategoryById(categoryTO.getCategoryId());
				category.setCategoryTitle(categoryTO.getCategoryTitle());
				success= workoutDAO.saveCategory(category);
	    }else{
	    		category = workoutDAO.getCategoryByName(categoryTO.getCategoryTitle());
				// Check if the category already exists
				if(category!=null 
						&& categoryTO.getCategoryTitle().equalsIgnoreCase(category.getCategoryTitle())){
					success=false;
					responseTO.setMessage("Category Already Exists");
				}else{
				// new category
				category = new Category();
				category.setCategoryTitle(categoryTO.getCategoryTitle());
				success= workoutDAO.saveCategory(category);
			  }
		}
		responseTO.setSuccess(success);
		if(success){		
			if(responseTO.getMessage()==null) 
				responseTO.setMessage("Category Saved Successfully");
		}
		else{
			if(responseTO.getMessage()==null) 
				responseTO.setMessage("Category Save Failed");
		}
		return responseTO;
	}

	@Override
	public CategoryResponseTO deleteCategory(CategoryRequestTO categoryTO) {
		CategoryResponseTO responseTO= new CategoryResponseTO();
		 Category category = workoutDAO.getCategoryById(categoryTO.getCategoryId());
		 if(category!=null){
			 workoutDAO.deleteCategory(category);
			 responseTO.setMessage("Category Deleted successfully!!");
			 responseTO.setSuccess(true);
		 }else{
			 responseTO.setMessage("Category does not exist!!");
			 responseTO.setSuccess(false);
		 }
		 return responseTO;
	}
		

}

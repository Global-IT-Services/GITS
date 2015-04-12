package kh.com.gits.service;

import java.util.List;

import kh.com.gits.model.CategoryModel;


public interface CateogoryService {

	public boolean addCategory(CategoryModel category);
	public boolean deleteCategoryById(Integer id);
	public boolean updateCategory(CategoryModel category);
	public List<CategoryModel> getAllCategories();
	public CategoryModel getCategoryById(Integer id);

}

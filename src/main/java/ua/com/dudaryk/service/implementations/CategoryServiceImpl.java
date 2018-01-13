package ua.com.dudaryk.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.dudaryk.model.Category;
import ua.com.dudaryk.repository.interfaces.CategoryDAO;
import ua.com.dudaryk.service.interfaces.CategoryService;
import ua.com.dudaryk.service.dto.CategoryDTO;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryDAO categoryDAO;
    static List<Category> categoryList = new ArrayList<>();

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public Category save(Category category) {
        return categoryDAO.saveCategory(category);
    }

    public Category update(Category category) {
        return categoryDAO.updateCategory(category);
    }

    public List<Category> findAll() {
        categoryList.addAll(categoryDAO.findAllCategory());
        return categoryList;
    }

    public Category findByDudarykId(Long id) {
        return categoryDAO.findByDudarykId(id);


    }

    static {
        Category category = new Category();
        category.setCategoryId(1000);
        category.setName("artist");
        categoryList.add(category);
    }


}

package ua.com.dudaryk.repository.interfaces;

import ua.com.dudaryk.model.Category;

import java.util.List;

public interface CategoryDAO {


    Category saveCategory(Category category);

    Category updateCategory(Category category);

    List<Category> findAllCategory();

    Category findByDudarykId(Long id);

}

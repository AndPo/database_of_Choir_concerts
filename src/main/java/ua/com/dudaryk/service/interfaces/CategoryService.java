package ua.com.dudaryk.service.interfaces;

import ua.com.dudaryk.model.Category;
import ua.com.dudaryk.service.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {



    Category findByDudarykId(Long id);

    Category save(Category category);

    Category update(Category category);

    List<Category> findAll();
}

package ua.com.dudaryk.service.dto;

import ua.com.dudaryk.model.Category;
import ua.com.dudaryk.model.Dudaryk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CategoryDTO implements Serializable {

    private long categoryId;

    private String name;

    private Dudaryk dudaryk;

    private static CategoryDTO toDto(Category category) {
        return new CategoryDTO()
                .setCategoryId(category.getCategoryId())
                .setName(category.getName())
                .setDudaryk(category.getDudaryk());
    }

    public static List<CategoryDTO> toDto(List<Category> categories) {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for (Category category : categories) {
            categoryDTOList.add(toDto(category));
        }
        return categoryDTOList;
    }


    public long getCategoryId() {
        return categoryId;
    }

    private CategoryDTO setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getName() {
        return name;
    }

    private CategoryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Dudaryk getDudaryk() {
        return dudaryk;
    }

    private CategoryDTO setDudaryk(Dudaryk dudaryk) {
        this.dudaryk = dudaryk;
        return this;
    }


}

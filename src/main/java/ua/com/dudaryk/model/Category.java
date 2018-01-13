package ua.com.dudaryk.model;


import org.hibernate.validator.constraints.NotEmpty;
import ua.com.dudaryk.service.dto.CategoryDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private long categoryId;

    @Column(name = "NAME")
    @NotEmpty
    private String name;

    @ManyToOne
    @JoinColumn(name = "DUDARYK_ID")
    private Dudaryk dudaryk;

    public static Category toEntity(CategoryDTO categoryDTO) {
        Category category = new Category()
                .setName(categoryDTO.getName())
                .setDudaryk(categoryDTO.getDudaryk());
        if (categoryDTO.getCategoryId() != 0) {
            category.setCategoryId(categoryDTO.getCategoryId());
        }
        return category;
    }

    public Dudaryk getDudaryk() {
        return dudaryk;
    }

    public Category setDudaryk(Dudaryk dudaryk) {
        this.dudaryk = dudaryk;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public Category setCategoryId(long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}

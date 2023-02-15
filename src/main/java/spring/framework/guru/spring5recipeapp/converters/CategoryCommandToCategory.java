package spring.framework.guru.spring5recipeapp.converters;

import jakarta.annotation.*;
import lombok.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.*;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source){
        if(source == null){
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}

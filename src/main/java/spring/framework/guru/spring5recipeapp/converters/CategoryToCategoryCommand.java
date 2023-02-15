package spring.framework.guru.spring5recipeapp.converters;

import lombok.*;
import org.springframework.core.convert.converter.*;
import org.springframework.lang.*;
import org.springframework.stereotype.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.*;
    @Component
    public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {
        @Synchronized
        @Nullable
        @Override
        public CategoryCommand convert(Category source) {
            if (source == null) {
                return null;
            }

            final CategoryCommand categoryCommand = new CategoryCommand();

            categoryCommand.setId(source.getId());
            categoryCommand.setDescription(source.getDescription());

            return categoryCommand;
        }
    }

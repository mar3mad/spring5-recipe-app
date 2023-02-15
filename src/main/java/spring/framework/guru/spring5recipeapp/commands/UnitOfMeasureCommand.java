package spring.framework.guru.spring5recipeapp.commands;

import jakarta.persistence.*;
import lombok.*;
import spring.framework.guru.spring5recipeapp.domain.*;
@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
    private IngredientCommand ingredient;
}

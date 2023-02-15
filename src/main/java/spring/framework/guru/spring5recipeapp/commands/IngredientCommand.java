package spring.framework.guru.spring5recipeapp.commands;

import jakarta.persistence.*;
import lombok.*;
import spring.framework.guru.spring5recipeapp.domain.*;

import java.math.*;
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
    private RecipeCommand recipe;
}

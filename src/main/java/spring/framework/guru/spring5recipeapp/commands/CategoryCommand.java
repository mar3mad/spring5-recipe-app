package spring.framework.guru.spring5recipeapp.commands;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}

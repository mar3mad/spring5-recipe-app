package spring.framework.guru.spring5recipeapp.commands;

import jakarta.persistence.*;
import lombok.*;
import spring.framework.guru.spring5recipeapp.domain.*;
@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private RecipeCommand recipe;
    private String recipeNotes;
}

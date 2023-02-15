package spring.framework.guru.spring5recipeapp.converters;

import jakarta.annotation.*;
import lombok.*;
import org.springframework.core.convert.converter.*;
import org.springframework.stereotype.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.*;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}

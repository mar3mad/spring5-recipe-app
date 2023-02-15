package spring.framework.guru.spring5recipeapp.converters;

import lombok.*;
import org.springframework.core.convert.converter.*;
import org.springframework.lang.*;
import org.springframework.stereotype.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.*;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {
        if (source == null) {
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom;
    }
}
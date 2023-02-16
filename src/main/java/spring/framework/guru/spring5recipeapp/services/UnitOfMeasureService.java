package spring.framework.guru.spring5recipeapp.services;

import spring.framework.guru.spring5recipeapp.commands.*;

import java.util.*;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}

package spring.framework.guru.spring5recipeapp.services;

import org.springframework.stereotype.*;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.converters.*;
import spring.framework.guru.spring5recipeapp.repositories.*;

import java.util.*;
import java.util.stream.*;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    private final UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository, UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.unitOfMeasureToUnitOfMeasureCommand = unitOfMeasureToUnitOfMeasureCommand;
    }
    @Override
    public Set<UnitOfMeasureCommand> listAllUoms(){
        return StreamSupport.stream(unitOfMeasureRepository.findAll()
                .spliterator(),  false)
                .map(unitOfMeasureToUnitOfMeasureCommand :: convert)
                .collect(Collectors.toSet());
    }
}
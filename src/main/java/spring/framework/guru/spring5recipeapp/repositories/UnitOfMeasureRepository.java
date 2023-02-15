package spring.framework.guru.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.guru.spring5recipeapp.domain.Category;
import spring.framework.guru.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}

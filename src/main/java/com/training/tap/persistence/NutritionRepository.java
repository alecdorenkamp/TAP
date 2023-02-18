package com.training.tap.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NutritionRepository extends CrudRepository<Nutrition, Long> {

    List<Nutrition> findByproteinInGrams(int proteinInGrams);

    Nutrition findById(long id);


}

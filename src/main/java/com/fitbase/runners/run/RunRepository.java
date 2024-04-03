package com.fitbase.runners.run;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

public interface RunRepository extends ListCrudRepository<Run, Integer> {

    List<Run> findByLocation(String location);

    // List<Run> findAll();

    // Optional<Run> findById(Integer id);

    // void create(Run run);

    // void update(Run run, Integer id);

    // void delete(Integer id);

    // int count();

    // void saveAll(List<Run> runs);

    // List<Run> findByLocation(String location);
}

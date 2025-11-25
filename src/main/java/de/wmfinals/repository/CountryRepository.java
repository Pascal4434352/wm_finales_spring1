package de.wmfinals.repository;

import de.wmfinals.entity.country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<country, Integer> {
    // NICHT nötig zu definieren:
    // save(entity), saveAll(entities)
    // findById(id), findAll(), findAllById(ids)
    // delete(entity), deleteById(id), deleteAll()
    // existsById(id), count()

    country findByname(String name);
}

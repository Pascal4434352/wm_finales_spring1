package de.wmfinals.repository;

import de.wmfinals.entity.match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface MatchRepository extends JpaRepository<match, Integer> {
    // NICHT nötig zu definieren:
    // save(entity), saveAll(entities)
    // findById(id), findAll(), findAllById(ids)
    // delete(entity), deleteById(id), deleteAll()
    // existsById(id), count()

    List<match> findBypenaltyShootout(boolean penaltyShootout);
    List<match> findBylocation(match location);
    match findBydate(Date date);
}

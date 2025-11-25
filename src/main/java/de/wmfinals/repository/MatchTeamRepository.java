package de.wmfinals.repository;

import de.wmfinals.entity.match_team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchTeamRepository extends JpaRepository<match_team, Integer> {
    // NICHT nötig zu definieren:
    // save(entity), saveAll(entities)
    // findById(id), findAll(), findAllById(ids)
    // delete(entity), deleteById(id), deleteAll()
    // existsById(id), count()

}

package lhind.internship.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<ENTITY, ID> {
    Optional<ENTITY> findById(ID id);
    List<ENTITY> findAll();
    void save(ENTITY entity);
    void delete(ENTITY entity);
}

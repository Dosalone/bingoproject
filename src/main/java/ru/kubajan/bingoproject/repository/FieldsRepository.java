package ru.kubajan.bingoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kubajan.bingoproject.entity.FieldsEntity;


@Repository
public interface FieldsRepository extends JpaRepository<FieldsEntity, Long> {
}

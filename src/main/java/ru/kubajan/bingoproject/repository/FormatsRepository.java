package ru.kubajan.bingoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kubajan.bingoproject.entity.FormatsEntity;


@Repository
public interface FormatsRepository extends JpaRepository<FormatsEntity, Long> {
}

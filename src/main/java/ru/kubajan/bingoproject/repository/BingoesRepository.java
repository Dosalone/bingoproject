package ru.kubajan.bingoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kubajan.bingoproject.entity.BingoesEntity;


@Repository
public interface BingoesRepository extends JpaRepository<BingoesEntity, Long> {
}

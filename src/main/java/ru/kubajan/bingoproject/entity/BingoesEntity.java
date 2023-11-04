package ru.kubajan.bingoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bingoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BingoesEntity {
    @Id
    //не пишем GeneratedValue, если не используем insert в эту таблицу через эту сущность
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "format_id")
    private FormatsEntity formatsEntity;

    public BingoesEntity(Long id, String name){
        this.id = id;
        this.name = name;
    }

}
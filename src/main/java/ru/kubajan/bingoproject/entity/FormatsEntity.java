package ru.kubajan.bingoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "formats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormatsEntity {
    @Id
    //не пишем GeneratedValue, если не используем insert в эту таблицу через эту сущность
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "format", nullable = false)
    private int format;

}

package ru.kubajan.bingoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "fields")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldsEntity {
    @Id
    //не пишем GeneratedValue, если не используем insert в эту таблицу через эту сущность
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @OneToOne
    //если таблица имеет FK на PK другой таблицы, в коде получаем экземпляр сущности
    @JoinColumn(name = "bingo_id")
    private BingoesEntity bingoesEntity;

    @Column(name = "field")
    private String field;

    @Column(name = "field_x", nullable = false)
    //координата по горизонтали
    private int field_x;

    @Column(name = "field_y", nullable = false)
    //координата по вертикали
    private int field_y;

    public FieldsEntity(String field, int field_x, int field_y){
        this.field = field;
        this.field_x = field_x;
        this.field_y = field_y;
    }

}

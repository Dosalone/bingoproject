package ru.kubajan.bingoproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldsModel {
    private Long id;

    private BingoesModel bingoesModel;

    private String field;

    private int field_x;

    private int field_y;
}

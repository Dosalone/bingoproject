package ru.kubajan.bingoproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BingoesModel {
    private Long id;

    private String name;

    private Long format_id;

}
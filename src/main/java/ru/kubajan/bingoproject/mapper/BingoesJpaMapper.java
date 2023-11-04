package ru.kubajan.bingoproject.mapper;

import ru.kubajan.bingoproject.entity.BingoesEntity;
import ru.kubajan.bingoproject.model.BingoesModel;

public class BingoesJpaMapper {
    public static BingoesEntity toJpa(BingoesModel bingoesModel){
        return new BingoesEntity(null,
                bingoesModel.getName());
    }

}

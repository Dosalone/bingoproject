package ru.kubajan.bingoproject.service;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kubajan.bingoproject.entity.BingoesEntity;
import ru.kubajan.bingoproject.entity.FieldsEntity;
import ru.kubajan.bingoproject.mapper.BingoesJpaMapper;
import ru.kubajan.bingoproject.model.BingoesModel;
import ru.kubajan.bingoproject.repository.FieldsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldsService {
    @Autowired
    private FieldsRepository fieldsRepository;

    public List<FieldsEntity> addFieldsToNewBingo(BingoesEntity bingoesEntity){
        int format = bingoesEntity.getFormatsEntity().getFormat();
        List<FieldsEntity> result = new ArrayList<>();
        for(int i = 0; i < format; i++){
            for (int j = 0; j < format; j++){
                FieldsEntity newField = new FieldsEntity("Введите текст", i, j);
                newField.setBingoesEntity(bingoesEntity);
                result.add(newField);
            }
        }
        saveFieldsList(result);
        return result;
    }

    public void saveFieldsList(List<FieldsEntity> fieldsEntityList){
        for(FieldsEntity f : fieldsEntityList){
            addField(f);
        }
    }

    public void addField(FieldsEntity fieldsEntity){
        FieldsEntity newField = new FieldsEntity(
                fieldsEntity.getField(),
                fieldsEntity.getField_x(),
                fieldsEntity.getField_y());
        newField.setBingoesEntity(fieldsEntity.getBingoesEntity());
        fieldsRepository.save(newField);
    }
}

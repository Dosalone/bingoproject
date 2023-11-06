package ru.kubajan.bingoproject.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kubajan.bingoproject.entity.BingoesEntity;
import ru.kubajan.bingoproject.mapper.BingoesJpaMapper;
import ru.kubajan.bingoproject.model.BingoesModel;
import ru.kubajan.bingoproject.repository.BingoesRepository;

@Service
public class BingoesService {
    @Autowired
    private BingoesRepository bingoesRepository;

    @Autowired
    private FormatsService formatsService;

    @Autowired
    private FieldsService fieldsService;

    public Long createNewBingo(@NotNull BingoesModel bingoesModel) {
        BingoesEntity newBingo = BingoesJpaMapper.toJpa(bingoesModel);
        newBingo.setFormatsEntity(formatsService.getFormatById(bingoesModel.getFormat_id()));
        bingoesRepository.save(newBingo);
        fieldsService.addFieldsToNewBingo(newBingo);
        return newBingo.getId();
    }

    public String deleteBingoFromId(Long id) {
        if(bingoesRepository.existsById(id)){
            bingoesRepository.deleteById(id);
            return "Удаление успешно завершено";
        } else return "Удаление не удалось";
    }

    public Long getBingoesFormatFromId(Long id) {
        if(bingoesRepository.existsById(id)){
            return bingoesRepository.findById(id).get().getFormatsEntity().getId();
        } else return 0L;
    }
}

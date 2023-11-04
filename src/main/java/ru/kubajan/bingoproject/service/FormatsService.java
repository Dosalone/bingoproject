package ru.kubajan.bingoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kubajan.bingoproject.entity.FormatsEntity;
import ru.kubajan.bingoproject.repository.FormatsRepository;

@Service
public class FormatsService {
    @Autowired
    private FormatsRepository formatsRepository;

    public FormatsEntity getFormatById(Long id){
        return formatsRepository.findById(id).get();
    }
}

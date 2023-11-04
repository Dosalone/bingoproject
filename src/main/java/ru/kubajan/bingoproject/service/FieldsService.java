package ru.kubajan.bingoproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kubajan.bingoproject.repository.FieldsRepository;

@Service
public class FieldsService {
    @Autowired
    private FieldsRepository fieldsRepository;

}

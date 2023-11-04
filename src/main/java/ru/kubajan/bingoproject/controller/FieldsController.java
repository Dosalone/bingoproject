package ru.kubajan.bingoproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kubajan.bingoproject.service.FieldsService;

@RestController
@RequestMapping("fields")
public class FieldsController {
    @Autowired
    private FieldsService fieldsService;
}

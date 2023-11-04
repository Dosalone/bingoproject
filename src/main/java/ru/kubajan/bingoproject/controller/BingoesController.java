package ru.kubajan.bingoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.kubajan.bingoproject.model.BingoesModel;
import ru.kubajan.bingoproject.service.BingoesService;

@RestController
@RequestMapping("bingoes")
public class BingoesController {
    @Autowired
    private BingoesService bingoesService;

    @PostMapping(path = "/add", consumes = "application/json")
    public Long createNewBingo(@RequestBody BingoesModel bingoesModel){
        return bingoesService.createNewBingo(bingoesModel);
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteBingoFromId(@PathVariable Long id){
        return bingoesService.deleteBingoFromId(id);
    }

}

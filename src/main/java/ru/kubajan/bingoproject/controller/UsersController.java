package ru.kubajan.bingoproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kubajan.bingoproject.service.UsersService;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/authorisation/{name}")
    public boolean loginUserByName(@PathVariable String name){
        return usersService.loginUserByName(name);
    }
}

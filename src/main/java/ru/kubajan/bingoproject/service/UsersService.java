package ru.kubajan.bingoproject.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kubajan.bingoproject.entity.UsersEntity;
import ru.kubajan.bingoproject.repository.UsersRepository;

import javax.persistence.Column;

@Service
@AllArgsConstructor
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public boolean loginUserByName(String name){
        return usersRepository.existsByName(name);
    }
}

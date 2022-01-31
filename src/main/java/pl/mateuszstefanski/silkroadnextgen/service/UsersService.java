package pl.mateuszstefanski.silkroadnextgen.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mateuszstefanski.silkroadnextgen.model.User;
import pl.mateuszstefanski.silkroadnextgen.repository.UsersRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersService {

    private UsersRepository usersRepository;

    public List<User> getUsers(){
        return usersRepository.findAll();
    }


}

package pl.mateuszstefanski.silkroadnextgen.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mateuszstefanski.silkroadnextgen.dto.UserDto;
import pl.mateuszstefanski.silkroadnextgen.mapper.UsersMapper;
import pl.mateuszstefanski.silkroadnextgen.service.UsersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private UsersService usersService;
    private UsersMapper usersMapper;

    @GetMapping
    List<UserDto> getUsers(){
        var users = usersService.getUsers();
        return usersMapper.map(users);
    }
}

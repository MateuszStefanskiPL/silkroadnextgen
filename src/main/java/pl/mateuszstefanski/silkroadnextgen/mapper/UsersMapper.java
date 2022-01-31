package pl.mateuszstefanski.silkroadnextgen.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import pl.mateuszstefanski.silkroadnextgen.dto.UserDto;
import pl.mateuszstefanski.silkroadnextgen.model.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper {

    List<UserDto> map(List<User> source);
    UserDto map(UserDto source);

    @AfterMapping
    default void afterUserToDto(User source, @MappingTarget UserDto target){
        target.setEmail(source.getEmail());
        target.setPassword(source.getPassword());
        target.setPhone(source.getPhone());
    }
}

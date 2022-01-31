package pl.mateuszstefanski.silkroadnextgen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mateuszstefanski.silkroadnextgen.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

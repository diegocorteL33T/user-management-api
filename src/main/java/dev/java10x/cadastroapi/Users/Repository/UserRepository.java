package dev.java10x.cadastroapi.Users.Repository;

import dev.java10x.cadastroapi.Users.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}

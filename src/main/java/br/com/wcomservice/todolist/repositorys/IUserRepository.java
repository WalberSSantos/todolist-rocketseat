package br.com.wcomservice.todolist.repositorys;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wcomservice.todolist.models.UserModel;


public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByuserName(String username);
}

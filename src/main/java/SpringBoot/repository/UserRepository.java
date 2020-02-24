package SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

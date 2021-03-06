package SpringBoot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringBoot.entities.User;
import SpringBoot.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        Optional<User> user = userRepository.findById(id);
        
        return user.get();
    }
    
    @GetMapping("/user")
    public User insertUser(User user) {
        User save = userRepository.save(user);
        
        return save;
    }
}

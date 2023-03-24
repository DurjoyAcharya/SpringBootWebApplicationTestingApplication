package com.app.springbootwebapplicationtesting.Service;

import com.app.springbootwebapplicationtesting.Model.User;
import com.app.springbootwebapplicationtesting.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository repository;

    @GetMapping("/all")
    public List<User> getAllUser()
    {
        return (List<User>) repository.findAll();
    }

    public String addNewUser(User user)
    {
       repository.save(user);
        return "New User Added";
    }

    public Optional<User> getUser(Long id)
    {
        return repository.findById(id);
    }
    public String delete(Long id)
    {
        if (repository.existsById(id))
        {
            repository.deleteById(id);
            return "Entry has been deleted successfully...";
        }
        return "Doesn't matched Id...";
    }
}

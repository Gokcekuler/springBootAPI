package com.akalin.projectManagement.resource;

import com.akalin.projectManagement.models.User;
import com.akalin.projectManagement.repository.UserRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    UserRepository repository;

    @Inject
    public void setRepository(UserRepository repository) {

        this.repository = repository;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)//hepsini getirdi.
    public List<User> getUser() {

        return repository.findAll();
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return repository.save(user);

    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)//bu id'ye sahip olanı getirdi.
    public User getId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException());

    }

}

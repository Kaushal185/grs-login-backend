package com.grsAuth.grs.service;
import com.grsAuth.grs.entity.LoginRequest;
import com.grsAuth.grs.entity.LoginResponse;
import com.grsAuth.grs.entity.Person;
import com.grsAuth.grs.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    @Override
    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }
    @Override
    public LoginResponse postPersonById(LoginRequest loginRequest) {
        Optional<Person> existingUser = personRepository.findById(loginRequest.getId());

        if (existingUser.isPresent()) {
            Person user = existingUser.get();
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return new LoginResponse(true, "Authentication successful");
            } else {
                return new LoginResponse(false, "Incorrect password");
            }
        } else {
            return new LoginResponse(false, "User not found");
        }
    }


}


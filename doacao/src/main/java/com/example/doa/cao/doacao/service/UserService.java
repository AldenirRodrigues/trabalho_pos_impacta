package com.example.doa.cao.doacao.service;

import com.example.doa.cao.doacao.model.User;
import com.example.doa.cao.doacao.model.dto.UserDTO;
import com.example.doa.cao.doacao.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapper objectMapper;


    public List<UserDTO> findAll() {
        return List.of(objectMapper.convertValue(userRepository.findAll(), UserDTO.class));
    }

    public UserDTO findUser(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Ops... Usuário não encontrado!"));
        return objectMapper.convertValue(user, UserDTO.class);
    }

    public UserDTO saveUser(User user) {
        return objectMapper.convertValue(userRepository.save(user), UserDTO.class);
    }

    public UserDTO updateUser(User user) {
        User user1 = objectMapper.convertValue(findUser(user.getId()), User.class);
        return objectMapper.convertValue(userRepository.save(user1), UserDTO.class);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}

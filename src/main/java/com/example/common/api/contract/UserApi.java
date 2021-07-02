package com.example.common.api.contract;

import com.example.common.api.model.user.UserDTO;
import com.example.common.api.model.user.UserPrincipal;
import com.example.common.api.model.user.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/users")
public interface UserApi {
    String ID_TEMPLATE_NAME = "userID";
    String EMAIL_TEMPLATE_NAME = "email";
    String ID_TEMPLATE_PATH = "/{" + ID_TEMPLATE_NAME + "}";
    String EMAIL_TEMPLATE_PATH = "/email/{email}";

    @GetMapping
    ResponseEntity<Collection<UserResponse>> getAllUsers();

    @PostMapping
    ResponseEntity<UserResponse> createUser(@RequestBody UserDTO userDTO);

    @GetMapping(ID_TEMPLATE_PATH)
    ResponseEntity<UserResponse> getUser(@PathVariable(ID_TEMPLATE_NAME) Long id);

    @GetMapping(EMAIL_TEMPLATE_PATH)
    ResponseEntity<UserPrincipal> getUserByEmail(@PathVariable(EMAIL_TEMPLATE_NAME) String email);

    @PutMapping(ID_TEMPLATE_PATH)
    ResponseEntity<UserResponse> updateUser(@PathVariable(ID_TEMPLATE_NAME) Long id, @RequestBody UserDTO userDTO);

    @DeleteMapping(ID_TEMPLATE_PATH)
    ResponseEntity deleteUser(@PathVariable(ID_TEMPLATE_NAME) Long id);
}

package ru.mirea.dyachenkova.PrimeAud6.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.mirea.dyachenkova.PrimeAud6.dto.UserRequest;
import ru.mirea.dyachenkova.PrimeAud6.entities.UserEntitity;
import ru.mirea.dyachenkova.PrimeAud6.services.UserService;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
@Slf4j
@CommonsLog
public class UserController {
    private final UserService userService;
    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        UserEntitity user = userService.getUser(id);
        if(user == null) {
            return "Error";
        } else {
            return user.toString();
        }
    }

    @GetMapping
    public String getUserByJson(@RequestParam("id") int id) {
        UserEntitity user = userService.getUser(id);
        if(user == null) {
            return "Error";
        } else {
            return user.toString();
        }
    }
}

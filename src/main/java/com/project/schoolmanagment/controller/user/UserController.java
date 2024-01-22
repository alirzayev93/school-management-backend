package com.project.schoolmanagment.controller.user;

import com.project.schoolmanagment.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
  
  private final UserService userService;
  
  
  @PostMapping("/save/{userRole}")
  public ResponseEntity saveUser(){
    return ResponseEntity.ok(userService.saveUser());
  }

}

package com.guillaume.bees.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIRestService {

  @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }
}

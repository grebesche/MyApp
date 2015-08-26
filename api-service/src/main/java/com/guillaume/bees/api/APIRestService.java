package com.guillaume.bees.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guillaume on 25/08/15
 */
@RestController
public class APIRestService {

  @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }
}

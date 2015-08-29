package com.guillaume.bees.events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventsService {

  @RequestMapping("/")
  public String home() {
    return "Hello Events!";
  }
}

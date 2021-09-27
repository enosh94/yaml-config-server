package com.spring.yamlconfigserver.controller;

import com.spring.yamlconfigserver.model.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RetriveConfigController.BASE_MAPPING)
public class RetriveConfigController {

  public static final String BASE_MAPPING = "/configs";

  @Autowired
  private ServerProperties serverProperties;

  @GetMapping
  public ResponseEntity<ServerProperties> getConfigurations() {
    ResponseEntity responseEntity = new ResponseEntity(
        serverProperties, HttpStatus.OK);
    return responseEntity;
  }
}

package com.spring.yamlconfigserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class ServerProperties<K,V> {
  private Map<String, String> application;
  private Map<K, V> padgea;
  private Map<String, Credential> users;

  @Getter
  @Setter
  public static class Credential {
    private String username;
    private String password;
  }
}

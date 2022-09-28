package com.squadront.consuming.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yogahapriana on 28/09/2022 - 20.54
 */
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
  private final Integer id;
  private final String email;
  private final Address address;
}

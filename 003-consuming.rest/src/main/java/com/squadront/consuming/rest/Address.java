package com.squadront.consuming.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yogahapriana on 28/09/2022 - 20.59
 */
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
  private final String city;
  private final String streetName;
  private final String streetAddress;
  private final String zipCode;
  private final String state;
  private final String country;
}

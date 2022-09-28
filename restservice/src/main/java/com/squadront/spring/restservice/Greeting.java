package com.squadront.spring.restservice;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yogahapriana on 28/09/2022 - 18.38
 */
@AllArgsConstructor
@Data
public class Greeting {

  private final long id;
  private final String content;
}

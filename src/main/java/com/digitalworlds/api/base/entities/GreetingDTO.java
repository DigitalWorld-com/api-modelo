package com.digitalworlds.api.base.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GreetingDTO {
    Long id;
    String greeting;
}

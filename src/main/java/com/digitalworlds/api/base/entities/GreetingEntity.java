package com.digitalworlds.api.base.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "greeting")
public class GreetingEntity {

    @Id
    @GeneratedValue
    Long id;
    String greeting;
}

package com.foly.lab.buoi4.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    String id;
    String name;
    int age  ;
    String address;
    boolean gender;
}

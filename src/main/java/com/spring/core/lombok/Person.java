package com.spring.core.lombok;

import lombok.*;

@Setter @Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor // 모든파라미터 초기화 생성자
@NoArgsConstructor // 기본 생성자
public class Person {

    private String name;
    private int age;


}

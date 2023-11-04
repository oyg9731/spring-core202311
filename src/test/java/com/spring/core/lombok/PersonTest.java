package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// junit5 : 단위테스트 프레임워크 - public을 붙이면 안됨
// junit4 : 같은건데 이전버전
class PersonTest {

    @Test
    void lombokTest(){
        Person person = new Person();
        person.setName("검저엉");
        person.setAge(12);

        String name = person.getName();
        System.out.println("person = " + person);

        new Person("바경희", 35);
    }

}
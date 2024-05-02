package org.springCore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Person {
    private String firstname;
    private Integer age;
    private List<String> nicknames = new ArrayList<>();

    public Person() {
    }

    public Person(String firstname, Integer age) {
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

}

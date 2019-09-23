package com.example.showmethelist;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Person> getList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Jordan", "mj23@bulls.com", "2123452321", ""));
        people.add(new Person("Michael", "Jackson", "MJ@kingofpop.com", "2123452321", ""));
        people.add(new Person("Arnold", "Schwarzenegger", "ArnoldS123@terminate.com", "2123452321", ""));
        return people;
    }
}

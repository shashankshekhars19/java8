package com.mvn.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by shekhar on 07-08-2018.
 */
public class TestPredicate {


    public static Predicate<Person> isAdultPersonMale(){
        return p -> p.getAge() > 18 && p.getGender()== 'M';
    }

    public static Predicate<Person> isAdultPersonFemale(){
        return p -> p.getAge() > 18 && p.getGender()== 'F';
    }
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1  =  new Person("Shashank",24,'M');

        Person p2  =  new Person("Shekhar",24,'M');

        Person p3  =  new Person("Shambhavi",18,'F');

        Person p4  =  new Person("Shailja",20,'F');

        Person p5  =  new Person("Pravin",23,'M');

        Person p6  =  new Person("Prashant",24,'M');

        Person p7  =  new Person("Arushi",23,'M');

        personList.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));

        personList.stream().filter(isAdultPersonFemale()).forEach(e -> System.out.println(e));

        personList.stream().filter(isAdultPersonMale()).forEach( e -> System.out.println(e));

        List<Person> pe = personList.stream().filter(e -> e.getAge() == 26).collect(Collectors.toList());

        if(!pe.isEmpty())
            pe.forEach(e -> System.out.print(e));
    }
}

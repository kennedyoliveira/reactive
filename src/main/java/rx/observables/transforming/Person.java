package rx.observables.transforming;

import java.io.Serializable;

/**
 * Created by pabloperezgarcia on 20/12/15.
 */
public class Person implements Serializable {
    String name;
    Integer age;
    String sex;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

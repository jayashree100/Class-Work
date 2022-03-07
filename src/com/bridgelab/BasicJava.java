package com.bridgelab;

import java.sql.Date;

public class BasicJava {
	
	static int a = 0;
    float b = 0.1f;
    boolean c;
    short a1 = 2;
    long a2;
    byte a3;
    char d;
    double g;
    String str;
    Date date;
    Bird b1;
    Integer i;
    Float f1;
    Boolean c1;
    Long l1;
    Double d1;
    Byte b2;
    Short s;
    Character ch;
    static Bird penguinBird;
    static final int FINAL = 10;

    
    public static void main(String[] args) {
        System.out.println("hello world");
        a = 20;
        Bird penguinBird = new Bird();
        penguinBird.a = 10;
        penguinBird.name = "penguin";
        Bird parrot = new Bird();
        parrot.name = "Parrot";
        parrot.a = 20;
        Bird duck = new Bird();
        duck.name = "Duck";
        duck.a = 30;
        System.out.println(penguinBird.a + " " + parrot.a + " " + duck.a + " " + Bird.a);
        System.out.println(penguinBird.name + " " + parrot.name + " " + duck.name);

        /*penguinBird.eat();
        penguinBird.name = "Penguin";*/

    }

}
class Bird {
    static int a;
    String name;
    String color;
    String species;

    void fly() {
    }

    void swing() {
    }

    void eat() {
    }
}




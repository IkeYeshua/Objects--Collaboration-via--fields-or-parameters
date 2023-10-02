package org.example;

import ObjectCollaborationPackage.Cat;
import ObjectCollaborationPackage.Dog;
import ObjectCollaborationPackage.Lion;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new Cat());
        dog.chase();
        Lion lion = new Lion();
        lion.chase(new Cat());

    }

}
package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public static void main(String[] args) {
		Person max = new Person("Max");
		System.out.println("Hallo, ich bin " + max.getName());
	}
}

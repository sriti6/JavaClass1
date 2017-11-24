/**
 * Get the age of a person
 * return age of a person
 */


public class Person {

private String name;
private int age;

    /**
     * Construct a new person with name = John and age = 23
     */
    public Person(){
    name = "Sriti";
    age =23;

}

    /**
     * Construct a new person with values provided from name and age parameter.
     * @param name the name of a person
     * @param age the age of a person
     */

public Person (String name, int age){
         this.name =name;
         this.age = age;
}


    public String getName() {
        return name;
    }

public void setName (String name){
     this.name = name;
}

public int getAge(){
    return age;
}

    /**
     * Set the age of a person according to age paremeter.
     * @param age age of a person
     */
    public void setAge (int age) {
    this.age = age;
}

    /**
     * Return a name and age of a person.
     * @return
     */
    public String toString(){
    return "Name:" + name + "Age: " + age;
}


}

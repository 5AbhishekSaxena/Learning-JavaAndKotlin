package in.abhisheksaxena.java;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 2:35 PM
 */

abstract class Person {

    private String name;
    private int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(){
        if (id >5)
            Utils.println(name + " - Working");
        else
            Utils.println(name + " - Not Working");

    }
}

package in.abhisheksaxena.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Abhishek Saxena
 * @since 07/08/19 3:21 AM
 */

class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
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

    protected String someMethod(){
        return "Mr. " + name + "(" + id + ")";
    }
}

class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine().trim();
            if (!line.equalsIgnoreCase("end")) {
                sb.append(line);
                sb.append("\n");
            } else
                break;
        }
        List<Student> students = new ArrayList<>();
        //Adding elements to the List
        students.add(new Student("abc", 1));
        students.add(new Student("def", 2));
        students.add(new Student("geh", 3));
        students.add(new Student("ijk", 4));

        for (Student student : students) {
            System.out.println(student.someMethod()); //You can access any public and protected method like this

        }
    }
}

package JavaCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}

class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }

}

public class List_Sort {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(10001, "Aman Bind", 21, 23000));
        emp.add(new Employee(10002, "Abhishek Bind", 24, 30000));
        emp.add(new Employee(10003, "Anjali Bind", 22, 20000));
        emp.add(new Employee(10003, "Rakesh Roshan", 23, 27000));
        emp.add(new Employee(10004, "Aashish Chauhan", 20, 18000));
        emp.add(new Employee(10005, "Lokesh Mathur", 29, 38000));
        emp.add(new Employee(10006, "Mukul Agnihotri", 26, 28000));
        emp.add(new Employee(10007, "Cathy Cat", 25, 21000));
        emp.add(new Employee(10008, "Manish Sharma", 30, 38000));
        emp.add(new Employee(10009, "Rahul Pandey", 27, 25000));
        emp.add(new Employee(10010, "Idrak Sheikh", 28, 29000));
        emp.add(new Employee(10011, "Shubh Robert", 31, 40000));

        System.out.println(emp);

        // By implementing Comparator Interface
        Collections.sort(emp, new MySort()); // Asending order -> Salary
        System.out.println(emp);

        // Anonymous Implementation
        Collections.sort(emp, new Comparator<Employee>() { // Descending order -> Salary
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) (e2.getSalary() - e1.getSalary());
            }
        });
        System.out.println(emp);


        // Lambda Implementation
        Collections.sort(emp, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary())); // Ascending order -> Salary
        System.out.println(emp);


        Collections.sort(emp, (e1, e2) -> e1.getName().compareTo(e2.getName())); // Sorting by Name in Ascending Order
        System.out.println(emp);


        Collections.sort(emp, (e1, e2) -> e2.getName().compareTo(e1.getName())); // Sorting by Name in Descending Order
        System.out.println(emp);
    }

}

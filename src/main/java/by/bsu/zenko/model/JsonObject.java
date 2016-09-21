package by.bsu.zenko.model;

import java.util.List;
import java.util.stream.Collectors;

public class JsonObject {
    private String name;
    private int age;
    private String position;
    private int salary;
    private List<String> skills;

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: ").append(name).append("; ");
        str.append("Age: ").append(age).append("; ");
        str.append("Position: ").append(position).append("; ");
        str.append("Salary: ").append(salary).append("; ");
        str.append("Skills: ").append(skills.stream().collect(Collectors.joining(", ")));
        return str.toString();
    }
}

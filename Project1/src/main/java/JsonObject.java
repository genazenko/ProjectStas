import java.util.List;

/**
 * Created by 123 on 20.09.2016.
 */
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
}

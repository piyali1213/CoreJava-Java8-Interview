import java.util.*;

public class Student {
    private int id;
    private String name;
    private List<String> companies = new ArrayList<>();

    public Student(int id, String name, List<String> companies) {
        this.id = id;
        this.name = name;
        this.companies = companies;

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

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companies=" + companies +
                '}';
    }
}

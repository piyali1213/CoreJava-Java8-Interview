import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
        private String name;
        private int age;

        private List<String> cities = new ArrayList<>();

        public Employee(int id, String name, int age ,List<String> cities) {
            this.id = id;
            this.name = name;
            this.age= age;
            this.cities = cities;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
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

        public List<String> getCities() {
            return cities;
        }

        public void setCities(List<String> cities) {
            this.cities = cities;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", cities=" + cities +
                    '}';
        }
    }



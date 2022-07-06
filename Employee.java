import java.util.Objects;

public class Employee {
    private String name;
    private Integer sal;

    public Employee(String name, Integer sal) {
        this.name = name;
        this.sal = sal;
    }
public Employee(){}
    public String getName() {
        return name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(sal, employee.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

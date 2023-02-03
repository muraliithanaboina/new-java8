package java8.streams.java8.streamspractice.models;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Builder
public class students {
    @Id
    private Integer id;
    private String name;
    private String lastname;
    private  String company;
    private Long salary;

    public students(Integer id, String name, String lastname, String company, Long salary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        this.salary = salary;
    }

    public students() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        students students = (students) o;
        return Objects.equals(id, students.id) && Objects.equals(name, students.name) && Objects.equals(lastname, students.lastname) && Objects.equals(company, students.company) && Objects.equals(salary, students.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, company, salary);
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}

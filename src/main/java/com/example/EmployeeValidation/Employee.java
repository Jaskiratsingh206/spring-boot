package com.example.EmployeeValidation;


import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Objects;

public class Employee{
    //int->age String->name String->email String->phoneNo//
    @Max(60)
    @Min(18)
    private int age;



    @NotBlank
    @NotEmpty
    @NotNull
    @Size(min = 3)
    private String name;


    @Size(min=6)
    @Size(max=100)
    @NotEmpty
    @NotEmpty
    private String email;

    @Size(max=14)
    @Size(min=10)
    @NotEmpty
    private String phoneNo;

    public Employee( String name,int age, String phoneNo,String email) {

        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(phoneNo, employee.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, email, phoneNo);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNo = phoneNO;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getGratuity() {
        return BigDecimal.valueOf(1000 * (getAge() - 18));
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}


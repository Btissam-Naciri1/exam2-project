package com.example.employeprj.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 128, nullable = false)
    private String name;

    @Column(name = "project_name", length = 128, nullable = false)
    private String projectName;

    @Column(nullable = false)
    private int implication;

    @Column(length = 128, nullable = false)
    private String email;

    @Column(length = 128, nullable = false)
    private String skill;

    public Employee() {

    }

    public Employee(String name, String projectName, int implication, String email, String skill) {
        this.name = name;
        this.projectName = projectName;
        this.implication = implication;
        this.email = email;
        this.skill = skill;
    }

    // Getters and setters for all fields

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getImplication() {
        return implication;
    }

    public void setImplication(int implication) {
        this.implication = implication;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", projectName=" + projectName + ", implication=" + implication + ", email=" + email + ", skill=" + skill + "]";
    }
}

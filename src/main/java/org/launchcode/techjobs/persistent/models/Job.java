package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Job extends AbstractEntity{

    //    @Id
//    @GeneratedValue
//    private int id;

//    private String name;

    private String Employer;
    private String skills;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.Employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String employer) {
        this.Employer = Employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

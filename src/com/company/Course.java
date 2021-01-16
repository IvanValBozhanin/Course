package com.company;

public class Course implements Cloneable{
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    private String courseName;
    private String [] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
        students = new String[128];
    }

    public void addStudent(String student){
        if(numberOfStudents == 100){
            System.out.println("Sorry! The course is already full!");
            return;
        }
        students[numberOfStudents]  = student;
        ++ numberOfStudents;
    }

    public void dropStudent(String student){
        int id = -1;
        for(int i = 0 ; i < numberOfStudents; ++i){
            if(students[i].equals(student)){
                id = i;
                students[i] = students[i+1];
            } else if(id != -1){
                students[i] = students[i+1];
            }
        }
        if(id == -1){
            throw new IllegalArgumentException("Non-existent name!");
        }
        students[numberOfStudents] = null;
        -- numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Object clone(){
        try{
            Course cl = (Course) super.clone();
            cl.students = students.clone();
            return cl;
        } catch (CloneNotSupportedException cloneNotSupportedException){
            return null;
        }
    }
}

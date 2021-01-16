/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.company;

public class Main {

    public static void main(String[] args) {
//        Test1();
        Test2();
    }

    public static void Test2(){
        Course c1 = new Course("Mathematics");
        c1.addStudent("Peter");
        c1.addStudent("Ivan");
        c1.addStudent("Georgi");
        c1.addStudent("Matthew");
        Course c2 = (Course) c1.clone();
        c2.dropStudent("Georgi");
        c2.setCourseName("Informatics");
        System.out.print("Course 1 - " + c1.getCourseName() + ": ");
        for(int i=0;i<c1.getNumberOfStudents(); ++i){
            System.out.print(c1.getStudents()[i] + " ");
        }
        System.out.print("\nCourse 2 - " + c2.getCourseName() + ": ");
        for(int i=0;i<c2.getNumberOfStudents(); ++i){
            System.out.print(c2.getStudents()[i] + " ");
        }
    }

    public static void Test1(){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        course1.dropStudent("Kim Smith");
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
    }
}

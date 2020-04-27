/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Ferra", "Junian Wahidna", "FJ087");
       
       TextBook myTextBook = new TextBook("Negeri 5 Menara", "Ahmad Fuadi", "Gramedia");
       
       Course myCourse = new Course("Kursus Pengembangan Diri", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}

package com.exercises.oop;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++)
        {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 41 + 60);
        }

        StudentTest studentTest = new StudentTest();
        studentTest.getAllStudents(students);
        System.out.println("---------state == 3---------");
        studentTest.getNStateStudents(students, 3);
        System.out.println("---------Bubble Sort by score---------");
        studentTest.sortByScore(students);
        studentTest.getAllStudents(students);
    }

    public void getNStateStudents(Student[] students, int n)
    {
        for (Student student : students)
        {
            if (student.state == n)
            {
                System.out.println("学号：" + student.number + ", 年级：" + student.state + ", 成绩：" + student.score);
            }
        }
    }

    public void getAllStudents(Student[] students)
    {
        for (Student student : students)
        {
            System.out.println("学号：" + student.number + ", 年级：" + student.state + ", 成绩：" + student.score);
        }
    }

    public void sortByScore(Student[] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            for (int j = 0; j < students.length - i - 1; j++)
            {
                if (students[j].score > students[j + 1].score)
                {
                    Student temp;
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

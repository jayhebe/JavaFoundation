package com.exercises.array;

import java.util.Scanner;

public class ArrayTest2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of student: ");
        int numberOfStudent = scanner.nextInt();
        int[] studentScores = new int[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++)
        {
            System.out.print("Please enter student " + (i + 1) + "'s score: ");
            studentScores[i] = scanner.nextInt();
        }

        ArrayTest2 test = new ArrayTest2();
        int maxScore = test.getMaxScore(studentScores);
        System.out.println("The max score is: " + maxScore);

        for (int i = 0; i < numberOfStudent; i++)
        {
            String grade;
            if (studentScores[i] >= (maxScore - 10))
            {
                grade = "A";
            }
            else if (studentScores[i] >= (maxScore - 20))
            {
                grade = "B";
            }
            else if (studentScores[i] >= (maxScore - 30))
            {
                grade = "C";
            }
            else
            {
                grade = "D";
            }
            System.out.println("The student " + i + " score is " + studentScores[i] + " grade is " + grade);
        }
    }

    public int getMaxScore(int[] scores)
    {
        int maxScore = 0;
        for (int score : scores)
        {
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

//    public double getAverageScore(int[] scores)
//    {
//        int totalScore = 0;
//        double averageScore = 0;
//        for (int score : scores)
//        {
//            totalScore += score;
//        }
//        averageScore = totalScore / scores.length;
//
//        return averageScore;
//    }
}

package part7.ex6;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Integer> grades;

    public GradeBook() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int gradeToAdd) {
        if (gradeToAdd >= 0 && gradeToAdd <= 100) {
            grades.add(gradeToAdd);
        }
    }

    public String gradeAverage() {
        double result = 0;
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }
        result = 1.0 * sum / this.grades.size();
        return result+"";
    }

    public String gradeAveragePassing() {
        double result = 0;
        int counter = 0 ;
        int sum = 0;

        for (int grade : grades) {
           if(grade>=50) {
               sum += grade;
               counter += 1;
           }
        }
        if(counter!=0){
            result = 1.0 * sum / counter;
            return result+"";
        }else{
            return "-";
        }
    }

    public String passPercentage(){
        double result = 0;
        int counterPassing = 0 ;
        int counterParticipants = 0;

        for (int grade : grades) {
            if(grade>=50) {
                counterPassing += 1;
            }
            counterParticipants ++;
        }
        result = 100 * counterPassing / counterParticipants;
        return result+"";
    }

    public void printGrades() {
        System.out.println(gradeAverage());
        System.out.println(gradeAveragePassing());
        System.out.println(passPercentage());
    }
}

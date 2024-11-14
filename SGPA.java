import java.util.Scanner;

class Subject {
    int subM;
    int cred;
    int grade;

    void setSubDet(int marks, int cred) {
        this.subM = marks;
        this.cred = cred;

        if (subM >= 90) {
            grade = 10;
        } else if (subM >= 80) {
            grade = 9;
        } else if (subM >= 70) {
            grade = 8;
        } else if (subM >= 60) {
            grade = 7;
        } else if (subM >= 50) {
            grade = 6;
        } else if (subM >= 40) {
            grade = 5;
        } else {
            grade = 0;
        }
    }
}

class Student {

    Scanner s = new Scanner(System.in);
    Subject[] subjects = new Subject[8];

    Student() {
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = new Subject();
        }
    }

    void getMarks() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            int marks = s.nextInt();
            System.out.print("Enter credit for subject " + (i + 1) + ": ");
            int cred = s.nextInt();
            subjects[i].setSubDet(marks, cred);
        }
    }

    double calSGPA() {
        double Score = 0;
        int totalCred = 0;
        double SGPA = 0.0;

        for (Subject subject : subjects) {
            Score += (subject.grade * subject.cred);
            totalCred += subject.cred;
        }

        if (totalCred > 0) {
            SGPA = Score / totalCred;
        } else {
            SGPA = 0;
        }
        return SGPA;
    }
}

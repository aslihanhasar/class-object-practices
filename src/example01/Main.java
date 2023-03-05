package example01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department departmentOne = new Department();
        departmentOne.name = "Software Engineering";

        Professor professorOne = new Professor();
        professorOne.no = "001";
        professorOne.name = "James Gosling";

        Course courseOne = new Course();
        courseOne.code = "Cs101";
        courseOne.name = "Computer Science 101";

        Student studentOne = new Student();
        studentOne.no = "1001";
        studentOne.name = "John Dalton";
        studentOne.department = departmentOne;

        departmentOne.head = professorOne;
        professorOne.department = departmentOne;

        courseOne.department = departmentOne;
        departmentOne.courses = new Course[50];
        departmentOne.courses[0] = courseOne;

        courseOne.teacher = professorOne;
        professorOne.coursesGiven = new Course[4];
        professorOne.coursesGiven[0] = courseOne;

        professorOne.advisee = new Student[7];
        professorOne.advisee[0] = studentOne;
        studentOne.advisor = professorOne;

        studentOne.coursesTaken = new Course[8];
        studentOne.coursesTaken[0] = courseOne;

        courseOne.students = new Student[100];
        courseOne.students[0] = studentOne;

        System.out.println("Student one - No: " + studentOne.no);
        System.out.println("Student one - Name: " + studentOne.name + " Department: " + studentOne.department.name);
        System.out.println("First course name : " + studentOne.coursesTaken[0].name);
        System.out.println("First course's professor - No: " + studentOne.coursesTaken[0].teacher.no);
        System.out.println("First course's professor - Name: " + studentOne.coursesTaken[0].teacher.name);
        System.out.println("First course's professor - Department: " + studentOne.coursesTaken[0].teacher.department.name);

        System.out.println("************************************************************************");
        System.out.println();

        Department departmentTwo = new Department();
        departmentTwo.name = "Chemical Engineering";

        Professor professorTwo = new Professor();
        professorTwo.no = "002";
        professorTwo.name = "Edward Davis";

        Professor professorThree = new Professor();
        professorThree.no = "003";
        professorThree.name = "Alfred Nobel";

        Course courseTwo = new Course();
        courseTwo.code = "CRM-101";
        courseTwo.name = "Chemical Reaction Engineering";

        Course courseThree = new Course();
        courseThree.code = "PD-101";
        courseThree.name = "Process Design";

        Student studentTwo = new Student();
        studentTwo.no = "1002";
        studentTwo.name = "Klara Bloom";

        Student studentThree = new Student();
        studentThree.no = "1003";
        studentThree.name = "Carlos Diego";

        Student studentFour = new Student();
        studentFour.no = "1004";
        studentFour.name = "David Guerra";

        departmentTwo.head = professorTwo;

        departmentTwo.students = new Student[3];
        departmentTwo.students[0] = studentTwo;
        departmentTwo.students[1] = studentThree;
        departmentTwo.students[2] = studentFour;
        departmentTwo.courses = new Course[2];
        departmentTwo.courses[0] = courseTwo;
        departmentTwo.courses[1] = courseThree;

        studentTwo.department = departmentTwo;
        studentTwo.advisor = professorThree;
        studentTwo.coursesTaken = new Course[1];
        studentTwo.coursesTaken[0] = courseTwo;

        studentThree.department = departmentTwo;
        studentThree.advisor = professorThree;
        studentThree.coursesTaken = new Course[2];
        studentThree.coursesTaken[0] = courseTwo;
        studentThree.coursesTaken[1] = courseThree;

        studentFour.department = departmentTwo;
        studentFour.advisor = professorTwo;
        studentFour.coursesTaken = new Course[1];
        studentFour.coursesTaken[0] = courseThree;

        courseTwo.department = departmentTwo;
        courseTwo.teacher = professorTwo;
        courseTwo.students = new Student[2];
        courseTwo.students[0] = studentTwo;
        courseTwo.students[1] = studentThree;
        courseTwo.days = new String[]{"Monday", "Friday"};

        courseThree.department = departmentTwo;
        courseThree.teacher = professorThree;
        courseThree.students = new Student[]{studentThree, studentFour};
        courseThree.days = new String[]{"Tuesday", "Thursday"};

        professorTwo.department = departmentTwo;
        professorTwo.advisee = new Student[]{studentFour};
        professorTwo.coursesGiven = new Course[]{courseTwo};

        professorThree.department = departmentTwo;
        professorThree.advisee = new Student[]{studentTwo, studentThree};
        professorThree.coursesGiven = new Course[]{courseThree};

        System.out.println("****** Department Information ******\n" +
                "Department Name: " + departmentTwo.name + "\n" +
                "Department head professor: " + departmentTwo.head.name + " - " + departmentTwo.head.no + "\n" +
                "Courses and Professors: " + "\n" + departmentTwo.courses[0].name + " - " + departmentTwo.courses[0].teacher.name +
                "\n" + departmentTwo.courses[1].name + " - " + departmentTwo.courses[1].teacher.name);

        System.out.println();

        System.out.println("****** Professor Information ******\n" +
                "Advisee of " + professorTwo.name + " is: " + professorTwo.advisee[0].name + "\n" +
                "Advisees of " + professorThree.name + " are " + professorThree.advisee[0].name + "," +
                professorThree.advisee[1].name);

        System.out.println();

        System.out.println("****** Course Information ******\n" +
                "Course code, name and days: " + "\n" + courseTwo.code + " - " + courseTwo.name + " - " +
                Arrays.toString(courseTwo.days) + "\n" + courseThree.code + " - " + courseThree.name + " - " +
                Arrays.toString(courseThree.days) + "\n" + "Course name and Students name: " + "\n" +
                courseTwo.name + " - " + courseTwo.students[0].name + " , " + courseTwo.students[1].name + "\n" +
                courseThree.name + " - " + courseThree.students[0].name + " , " + courseThree.students[1].name);

        System.out.println();

        System.out.println("****** Student Information ******\n" +
                studentTwo.no + " - " + studentTwo.name + "\n" +
                "Student's advisor: " + studentTwo.advisor.name + "\n" +
                "Student's courses: " + studentTwo.coursesTaken[0].name + "\n" +
                studentThree.no + " - " + studentThree.name + "\n" +
                "Student's advisor: " + studentThree.advisor.name + "\n" +
                "Student's courses: " + studentThree.coursesTaken[0].name + " , " +
                studentThree.coursesTaken[1].name + "\n" +
                studentFour.no + " - " + studentFour.name + "\n" +
                "Student's advisor: " + studentFour.advisor.name + "\n" +
                "Student's courses: " + studentFour.coursesTaken[0].name);

    }

}

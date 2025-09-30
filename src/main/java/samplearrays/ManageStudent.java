package samplearrays;



import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student student = new Student(0, null);
        int old = 0;
        for(Student s:students){
            if (s.getAge()>old){
                student = s;
                old = s.getAge();

            }
        }

        return student;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;
        for (Student s:students){
            if(s.getAge()>=18){
                count++;
            }
        }
        return count;

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sum = 0;
        for (Student s:students){
            sum+=s.getGrade();
        }
        return (double) sum/students.length;

    }


    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s:students){
            if (s.getName() == name){
                return s;
            }

        }

        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for(int i = 0;i<students.length;i++){
            for(int j = 0;j<students.length-1-i;j++){
                if (students[j].getGrade()<students[j+1].getGrade()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }

            }
        }

    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {


        for(Student s:students){
            if (s.getGrade()>=15){
                System.out.println(s);
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s:students){
            if (s.getId() == id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {

        for(Student s:students){
            int count = 0;
            for(Student t:students){
                if (s.getName() == t.getName()){
                    count++;
                }
            }
            if (count>1){return true;}
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents = new Student[students.length+1];
        for(int i = 0;i<students.length;i++){
            newStudents[i] = students[i];
        }
        newStudents[students.length] = newStudent;
        return newStudents;

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students

        Student[] arr = new Student[5];
        arr[0] = new Student(001,"zakariae");
        arr[1] = new Student(4,"Dina",20);
        arr[2] = new Student(003,"zakariae",19,20);
        arr[3] = new Student(004,"haytham");
        arr[4] = new Student(005,"karim",30,16);
        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println(findOldest(arr));


        // 3) Count adults
        System.out.println("Adults number: "+countAdults(arr));


        // 4) Average grade
        System.out.println("Average grade: "+averageGrade(arr));



        // 5) Find by name
        System.out.println(findStudentByName(arr, "yassine"));


        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated = updateGrade(arr, 4, 15);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        System.out.println("Duplicate names:");
        System.out.println(hasDuplicateNames(arr));


        // 10) Append new student
        System.out.println("after adding a student:");
        Student[] t = appendStudent(arr, new Student(1025,"mounir"));
        for(Student s:t){
            System.out.println(s);
        }
        System.out.println("============2D arrays=======================");
        Student[][] students = new Student[2][3];
        students[0][0] = new Student(003,"zach0",19,20);
        students[0][1] = new Student(003,"zach1",19,16);
        students[0][2] = new Student(003,"zach2",19,15);
        students[1][0] = new Student(003,"yassine0",19,14);
        students[1][1] = new Student(003,"yassine1",19,17);
        students[1][2] = new Student(003,"yassine2",19,19);
        for(int i = 0;i<students.length;i++){
            System.out.println("Class "+(i+1));
            for(int j = 0;j<students[0].length;j++){
                System.out.println(students[i][j].getName());
            }
        }
        System.out.println("=====top students===========");
        for(int i=0;i<students.length;i++){
            sortByGradeDesc(students[i]);
        }
        for(int i=0;i<students.length;i++){
            System.out.println(students[i][0]);
        }


    }
}


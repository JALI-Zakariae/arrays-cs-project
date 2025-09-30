package samplearrays;

public class CourseNumbersArray {
    public int[] registeredCourses = {};
    public CourseNumbersArray(int[] registeredCourses){
        this.registeredCourses = registeredCourses;
    }
    public int[] addCourse(int courseNumber){
        int[] newRegisteredCourses = new int[registeredCourses.length+1];
        for(int i=0;i<registeredCourses.length;i++){
            newRegisteredCourses[i] = registeredCourses[i];

        }
        newRegisteredCourses[registeredCourses.length] = courseNumber;
        registeredCourses = newRegisteredCourses;
        return newRegisteredCourses;
    }
    public void printContent(){
        System.out.print("Your courses:  ");
        for(int i = 0;i<registeredCourses.length;i++){
            System.out.print(registeredCourses[i]+"     ");
        }
        System.out.println();
    }
    public boolean checkNumber(int number){

        for (int i = 0;i<registeredCourses.length;i++){
            if (registeredCourses[i] == number){
                return true;
            }
        }
        return false;



    }
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        CourseNumbersArray student1 = new CourseNumbersArray(registeredCourses);
        student1.addCourse(501233);
        student1.printContent();
        System.out.println(student1.checkNumber(2160));

    }
}


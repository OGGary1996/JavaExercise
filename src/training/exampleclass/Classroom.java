package training.exampleclass;
import java.util.Scanner;
public class Classroom {
    private int studentCount;
    public class Math extends Classroom{
        public void setStudentCount(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input the student count: ");
            studentCount = scan.nextInt();
        }
        public int getStudentCount(){
            return studentCount;
        }
    }
}
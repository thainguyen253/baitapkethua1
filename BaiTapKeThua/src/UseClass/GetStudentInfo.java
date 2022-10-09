package UseClass;
import BaiTapKeThua.Student;
import java.util.Scanner;
public class GetStudentInfo {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student std = new Student();
        std.insertStudentInfo(sc);
        std.displayStudentInfo();

        if(Student.scholarship()){
            System.out.println("Sinh viên đạt học bổng");
        }else{
            System.out.println("Sinh viên không đạt học bổng");
        }
    }
}


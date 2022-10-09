package BaiTapKeThua;

import java.util.Scanner;

public class Student extends Person {
    protected static String studentId;
    protected static int grade;
    protected static String email;

    public Student() {

    }

    public Student(String studentId, int grade, String email ) {
        this.studentId=studentId;
        this.grade=grade;
        this.email=email;
    }

    public void insertStudentInfo(Scanner sc) {
        System.out.println("Nhập tên sinh viên: ");
        name=sc.nextLine();
        System.out.println("Nhập giới tính: ");
        sex=sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        dateOfBirth=sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address=sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        studentId=sc.nextLine();
        System.out.println("Nhập điểm của sinh viên: ");
        grade= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email của sinh viên: ");
        email=sc.nextLine();
    }
    public void displayStudentInfo() {
        System.out.println(" Tên: "+ name);
        System.out.println(" Giới tính: "+ sex);
        System.out.println(" Ngày sinh: "+ dateOfBirth);
        System.out.println(" Địa chỉ: "+address);
        System.out.println(" Mã sinh viên: "+studentId);
        System.out.println(" Điểm: "+grade);
        System.out.println(" Email: "+email);
    }
    public static boolean scholarship() {
        if (grade > 8 ) {

        }   return true;
    }
}

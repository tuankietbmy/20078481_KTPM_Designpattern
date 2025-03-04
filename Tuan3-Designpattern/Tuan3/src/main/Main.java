package main;

import java.util.Scanner;

import entity.Employee;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chức vụ của nhân viên
        System.out.print("Nhập chức vụ của nhân viên (Đội trưởng, Giám đốc, Nhân viên VP, Nhân viên Xưởng, Kế toán trưởng): ");
        String chucvu = scanner.nextLine();

        // Tạo một đối tượng Employee với chức vụ người dùng nhập
        Employee nhanVien = new Employee(chucvu);

        // Gọi phương thức handleRequest để in ra các công việc của nhân viên
        nhanVien.handleRequest();

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}

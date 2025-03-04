package entity;
import java.util.Scanner;

public class Employee {
    private String chucvu; // Chức vụ của nhân viên

    // Constructor để khởi tạo chức vụ của nhân viên
    public Employee(String chucvu) {
        this.chucvu = chucvu;
    }

    // Phương thức xử lý công việc dựa trên chức vụ
    public void handleRequest() {
        if(chucvu.equals("Đội trưởng")) {
            // Các công việc của Đội trưởng
            doTour();
            assignTasksToEmployees();
        }
        else if(chucvu.equals("Giám đốc")) {
            // Các công việc của Giám đốc
            makeDecisions();
            overseeOperations();
        }
        else if(chucvu.equals("Nhân viên VP")) {
            // Các công việc của Nhân viên VP
            pha();
            phe();
        }
        else if(chucvu.equals("Nhân viên Xưởng")) {
            // Các công việc của Nhân viên Xưởng
            operateMachinery();
            maintainInventory();
        }
        else if(chucvu.equals("Kế toán trưởng")) {
            // Các công việc của Kế toán trưởng
            manageAccounts();
            prepareFinancialReports();
        }
        else {
            System.out.println("Chức vụ không hợp lệ.");
        }
    }

    // Phương thức mô phỏng công việc của Đội trưởng
    private void doTour() {
        System.out.println("Đi tuần kiểm tra công việc.");
    }

    private void assignTasksToEmployees() {
        System.out.println("Gán việc cho nhân viên.");
    }

    // Phương thức mô phỏng công việc của Giám đốc
    private void makeDecisions() {
        System.out.println("Ra quyết định chiến lược.");
    }

    private void overseeOperations() {
        System.out.println("Giám sát hoạt động của công ty.");
    }

    // Phương thức mô phỏng công việc của Nhân viên VP
    private void pha() {
        System.out.println("Pha trà, cà phê.");
    }

    private void phe() {
        System.out.println("Phê duyệt tài liệu.");
    }

    // Phương thức mô phỏng công việc của Nhân viên Xưởng
    private void operateMachinery() {
        System.out.println("Vận hành máy móc.");
    }

    private void maintainInventory() {
        System.out.println("Bảo dưỡng và kiểm kê nguyên vật liệu.");
    }

    // Phương thức mô phỏng công việc của Kế toán trưởng
    private void manageAccounts() {
        System.out.println("Quản lý sổ sách kế toán.");
    }

    private void prepareFinancialReports() {
        System.out.println("Chuẩn bị báo cáo tài chính.");
    }
    
}

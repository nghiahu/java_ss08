package baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập địa chỉ email: ");
            String email = scanner.nextLine().trim();
            String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z.]+\\.[a-zA-Z]{2,6}$";
            if(email.matches(emailRegex)){
                break;
            }else {
                System.out.println("Email không hợp lệ, vui lòng nhập lại");
            }
        }while (true);
        do{
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            String pasRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%()*/.+|\\-\\_=]).{8,}$";
            if (password.matches(pasRegex)) {
                break;
            } else {
                System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại ");
            }
        }while (true);
        System.out.println("Email và mật khẩu hợp lệ");
    }
}

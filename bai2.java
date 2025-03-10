package baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập vào kích thước của mảng: ");
            n = scanner.nextInt();
            if(n <= 0 ){
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập lại");
            }else{
                break;
            }
        }while (true);
        int[] arr = new int [n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d] : ",i);
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        boolean isnum = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                sum += arr[i];
                isnum = true;
            }
        }
        if(isnum){
            System.out.println("Tổng: " + sum);
        }else{
            System.out.println("Không có số chia hết cho 3");
        }

    }
}

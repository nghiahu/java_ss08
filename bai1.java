package baitap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước của mảng: ");
        int n = scanner.nextInt();
        if(n <= 0 ){
            System.out.println("Kích thước không hợp lệ");
        }else {
            int[] arr = new int [n];
            System.out.println("Nhập vào các phần tử của mảng: ");
            for(int i = 0; i < n; i++){
                System.out.printf("arr[%d] : ",i);
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            int min = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("Giá trị lớn nhất: " + max);
            System.out.println("Giá trị nhỏ nhất: " + min);
        }
    }
}

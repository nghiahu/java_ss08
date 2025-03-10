package baitap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        int n = 0;
        do {
            System.out.println("******************** MENU ********************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng (`n` nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (`>0`) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng `k` trong mảng (`k` nhập từ bàn phím)");
            System.out.println("5. Tính số lượng các phần tử là **số nguyên tố** trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng (1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phần tử n: ");
                    n = sc.nextInt();
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                    } else {
                        System.out.print("Các phần tử trong mảng: ");
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                    } else {
                        double sum = 0;
                        int count = 0;
                        for (int num : arr) {
                            if (num > 0) {
                                sum += num;
                                count++;
                            }
                        }
                        if (count > 0) {
                            System.out.println("Trung bình các phần tử dương: " + (sum / count));
                        } else {
                            System.out.println("Không có phần tử dương nào.");
                        }
                    }
                    break;
                case 4:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                    } else {
                        System.out.print("Nhập giá trị k: ");
                        int k = sc.nextInt();
                        System.out.print("Vị trí các phần tử có giá trị bằng " + k + ": ");
                        boolean found = false;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == k) {
                                System.out.print(i + " ");
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.print("Không tìm thấy.");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (arr == null) {
                        System.out.println("Mảng chưa được khởi tạo!");
                    } else {
                        int primeCount = 0;
                        for (int num : arr) {
                            if (num >= 2) {
                                boolean isPrime = true;
                                for (int i = 2; i <= Math.sqrt(num); i++) {
                                    if (num % i == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                                if (isPrime) {
                                    primeCount++;
                                }
                            }
                        }
                        System.out.println("Số lượng phần tử là số nguyên tố: " + primeCount);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }while (true);
    }
}

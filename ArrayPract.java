package baitap;

import java.util.Scanner;

public class ArrayPract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        int size;

        System.out.println("Nhập vào số phần tử của mảng: ");
        size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Chèn phần tử");
            System.out.println("2. Cập nhật phần tử");
            System.out.println("3. Xóa phần tử");
            System.out.println("4. Hiển thị mảng");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị phần tử cần chèn: ");
                    int value = scanner.nextInt();
                    System.out.print("Nhập chỉ số để chèn: ");
                    int index = scanner.nextInt();

                    if (index < 0 || index > array.length) {
                        System.out.println("Chỉ số không hợp lệ!");
                        break;
                    }
                    int[] newArray = new int[array.length + 1];
                    for (int i = 0, j = 0; i < newArray.length; i++) {
                        if (i == index) {
                            newArray[i] = value;
                        } else {
                            newArray[i] = array[j++];
                        }
                    }
                    array = newArray;
                    System.out.println("Đã chèn thành công.");
                    break;
                case 2:
                    System.out.print("Nhập chỉ số cần cập nhật: ");
                    int updateIndex = scanner.nextInt();
                    if (updateIndex < 0 || updateIndex >= array.length) {
                        System.out.println("Chỉ số không hợp lệ!");
                        break;
                    }
                    System.out.print("Nhập giá trị mới: ");
                    array[updateIndex] = scanner.nextInt();
                    System.out.println("Đã cập nhật thành công.");
                    break;
                case 3:
                    System.out.print("Nhập chỉ số cần xóa: ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex < 0 || deleteIndex >= array.length) {
                        System.out.println("Chỉ số không hợp lệ!");
                        break;
                    }
                    int[] reducedArray = new int[array.length - 1];
                    for (int i = 0, j = 0; i < array.length; i++) {
                        if (i != deleteIndex) {
                            reducedArray[j++] = array[i];
                        }
                    }
                    array = reducedArray;
                    System.out.println("Đã xóa thành công.");
                    break;
                case 4:
                    System.out.print("Mảng hiện tại: ");
                    for (int element : array) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 5);
    }
}

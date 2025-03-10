package baitap;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int[] arr = null;
        do {
            System.out.println("========= MENU CHÍNH ==========");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1 - 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("========= MENU XỬ LÝ CHUỖI ==========");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng thừa trong chuỗi");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1 - 5): ");
                        choice = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice) {
                            case 1:
                                System.out.print("Nhập vào chuỗi: ");
                                str = scanner.nextLine();
                                System.out.println("Chuỗi đã nhập: " + str);
                                break;
                            case 2:
                                if (str.isEmpty()) {
                                    System.out.println("Vui lòng nhập chuỗi trước!");
                                } else {
                                    str = str.trim().replaceAll("\\s+", " ");
                                    System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + str);
                                }
                                break;
                            case 3:
                                if (str.isEmpty()) {
                                    System.out.println("Vui lòng nhập chuỗi trước!");
                                } else {
                                    int[] freq = new int[256];
                                    for (char c : str.toCharArray()) {
                                        freq[c]++;
                                    }
                                    System.out.println("Số lần xuất hiện của từng ký tự:");
                                    for (int i = 0; i < 256; i++) {
                                        if (freq[i] > 0) {
                                            System.out.println((char) i + ": " + freq[i]);
                                        }
                                    }
                                }
                                break;
                            case 4:
                                if (str.isEmpty()) {
                                    System.out.println("Vui lòng nhập chuỗi trước!");
                                } else {
                                    str = str.trim().toLowerCase();
                                    String[] words = str.split("\\s+");
                                    String result = "";
                                    for (String word : words) {
                                        if (!word.isEmpty()) {
                                            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                                        }
                                    }
                                    str = result.trim();
                                    System.out.println("Chuỗi sau khi chuẩn hóa: " + str);
                                }
                                break;
                            case 5:
                                System.out.println("Quay lại menu chính");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                                break;
                        }
                    } while (choice != 5);
                    break;

                case 2:
                    do {
                        System.out.println("========= MENU XỬ MẢNG SỐ NGUYÊN ==========");
                        System.out.println("1. Nhập mảng số nguyên");
                        System.out.println("2. Tìm số nguyên lớn nhất trong mảng");
                        System.out.println("3. Đếm số phần tử có chữ số đầu tiên là số lẻ");
                        System.out.println("4. Kiểm tra mảng có phải mảng đối xứng không");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1 - 5): ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Nhập số lượng phần tử của mảng: ");
                                int n = scanner.nextInt();
                                arr = new int[n];
                                System.out.println("Nhập các phần tử của mảng:");
                                for (int i = 0; i < n; i++) {
                                    System.out.print("Phần tử thứ " + (i + 1) + ": ");
                                    arr[i] = scanner.nextInt();
                                }
                                break;
                            case 2:
                                if (arr == null) {
                                    System.out.println("Vui lòng nhập mảng trước!");
                                } else {
                                    int max = arr[0];
                                    for (int num : arr) {
                                        if (num > max) max = num;
                                    }
                                    System.out.println("Số nguyên lớn nhất trong mảng: " + max);
                                }
                                break;
                            case 3:
                                if (arr == null) {
                                    System.out.println("Vui lòng nhập mảng trước!");
                                } else {
                                    int count = 0;
                                    for (int num : arr) {
                                        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
                                        if (firstDigit % 2 != 0) count++;
                                    }
                                    System.out.println("Số phần tử có chữ số đầu tiên là số lẻ: " + count);
                                }
                                break;
                            case 4:
                                if (arr == null) {
                                    System.out.println("Vui lòng nhập mảng trước!");
                                } else {
                                    boolean isSymmetric = true;
                                    for (int i = 0; i < arr.length / 2; i++) {
                                        if (arr[i] != arr[arr.length - 1 - i]) {
                                            isSymmetric = false;
                                            break;
                                        }
                                    }
                                    System.out.println(isSymmetric ? "Mảng là mảng đối xứng" : "Mảng không phải là mảng đối xứng");
                                }
                                break;
                            case 5:
                                System.out.println("Quay lại menu chính");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                                break;
                        }
                    } while (choice != 5);
                    break;

                case 3:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        } while (true);
    }
}

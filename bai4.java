package baitap;

public class bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);
        System.out.println("Thao tác với StringBuilder:");

        StringBuilder sb = new StringBuilder(initialString);
        long startTime = System.nanoTime();
        sb.reverse();
        long endTime = System.nanoTime();
        System.out.println("Thời gian đảo ngược chuỗi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        startTime = System.nanoTime();
        sb.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Thời gian chèn chuỗi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        startTime = System.nanoTime();
        sb.delete(500000, 500010);
        endTime = System.nanoTime();
        System.out.println("Thời gian xóa chuỗi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        startTime = System.nanoTime();
        sb.replace(500000, 500010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Thời gian thay thế chuỗi: " + (endTime - startTime) + " ns");

        System.out.println("\nThao tác với StringBuffer:");

        StringBuffer sbf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sbf.reverse();
        endTime = System.nanoTime();
        System.out.println("Thời gian đảo ngược chuỗi: " + (endTime - startTime) + " ns");

        sbf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sbf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Thời gian chèn chuỗi: " + (endTime - startTime) + " ns");

        sbf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sbf.delete(500000, 500010);
        endTime = System.nanoTime();
        System.out.println("Thời gian xóa chuỗi: " + (endTime - startTime) + " ns");

        sbf = new StringBuffer(initialString);
        startTime = System.nanoTime();
        sbf.replace(500000, 500010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Thời gian thay thế chuỗi: " + (endTime - startTime) + " ns");
    }
}

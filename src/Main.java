import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh tiền lãi nhé!");
        double money,month,laiXuat;
//        money = 1;
//        month = 1;
//        laiXuat = 1;
        System.out.println("nhập số tiền bạn muốn gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng bạn muốn gửi");
        month = scanner.nextDouble();
        System.out.println("Nhập lãi xuất");
        laiXuat = scanner.nextDouble();
        double tongTien = 0;
//        for (double i = 0;i < month;i++){
            tongTien += money * (laiXuat/100)/12*month;
        //}
        System.out.println(" tổng tiền lãi là: " + tongTien);

    }
}
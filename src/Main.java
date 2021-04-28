import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductMaganet productMaganet = new ProductMaganet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban");
        int choice;
do {
menu();
choice=scanner.nextInt();
switch (choice){
    case 1:{
        productMaganet.inputInfo();

        break;
    }
    case 2:{
        productMaganet.showSanPham();
        break;
    }
    case 3:{
       productMaganet.writeToFile(productMaganet.productList, "C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
       break;
    }
    case 4:{
        productMaganet.readToFile("C:\\Users\\Pham Duyet\\Desktop\\New folder\\result.txt");
        break;
    }
}
} while (choice!=0);

    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin san pham");
        System.out.println("2. Hiển thị thông tin san pham");
        System.out.println("3. ghi");
        System.out.println("4. doc");

    }
}

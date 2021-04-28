import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private int id;
    private String name;
    private String hangsanxuat;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String hangsanxuat, double price) {
        this.id = id;
        this.name = name;
        this.hangsanxuat = hangsanxuat;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void inputInfoSanPham(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma san phan");
        this.id=scanner.nextInt();
        System.out.println("Nhap ten san pham");
        this.name=scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        this.hangsanxuat=scanner.nextLine();
        System.out.println("Nhap gia ca");
        this.price=scanner.nextDouble();
    }

   public void showinfoSanPham(){
       System.out.printf("Ma san pham la :%s,Ten san pham la :%s,Hang san xuat la :%s,Gia la :%s",id,name,hangsanxuat,price);
   }
}

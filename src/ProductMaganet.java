import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductMaganet {
    List<Product> productList = new ArrayList<>();

    //nhap thong tin
    public void inputInfo() {
        Product product = new Product();
        product.inputInfoSanPham();
        productList.add(product);
    }

    //hien thi
    public void showSanPham() {
        for (Product product : productList) {
            product.showinfoSanPham();
        }
    }

    //ghi
    public  void writeToFile(List<Product> productList, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(productList);
            oss.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //doc
   public void readToFile(String path){
       try {
           FileInputStream fis=new FileInputStream(path);
           ObjectInputStream ois=new ObjectInputStream(fis);
           List<Product>productList=(List<Product>) ois.readObject();
           for (Product product:productList){
               System.out.println(product);
           }
       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
}

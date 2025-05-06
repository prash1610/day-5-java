public class Product{
       static String category = "Electronics";
String productName;
public static void main(String[] args){
Product product1=new Product();
product1.productName="Laptop";
Product product2=new Product();
product2.productName="Smartphone";
System.out.println("Category:"+Product.category);


System.out.println("Product 1:"+product1.productName);
System.out.println("Product 2:"+product2.productName);
}
}


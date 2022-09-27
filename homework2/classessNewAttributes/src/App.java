public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Laptop", "Dell Laptop", 15000, 9, "Siyah");
        // product1.setId(1);
        // product1.setName( "Lenovo V14");
        // product1.setDescription("16 GB Ram");
        // product1.setPrice(10_000);
        // product1.setStockAmount(3);
        // product1.setColor("Siyah");
        
       
        ProductManager productManager = new ProductManager();
        productManager.Add(product1);

        System.out.println(product1.getName());
        System.out.println(product1.getCode());

    }
}

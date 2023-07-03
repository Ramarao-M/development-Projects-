import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();


        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2023));
        service.addProduct(new Product("Mac", "Laptop", "Blue Table", 2029));
        service.addProduct(new Product("Acer", "Laptop", "Black Table", 2028));
        service.addProduct(new Product("Asus", "Mouse", "White Table", 2024));
        service.addProduct(new Product("Wacom pad", "Writing pad", "Big Table", 2027));
        service.addProduct(new Product("Black Beast", "Desktop", "White Table", 2024));
        service.addProduct(new Product("HP Mouse", "Mouse", "Green Table", 2023));
        service.addProduct(new Product("Lenovo", "Laptop", "Black Table", 2025));


        List<Product> products = service.getAllProducts();
        for (Product p : products) {
            System.out.println(p);
//
//        }
//        System.out.println("************************************************");
//
//        System.out.println("a Particular product");
//
//        Product p = service.getProduct("Mac");
//        //System.out.println(p);
//        System.out.println("************************************************");
//        System.out.println("a Particular text");
//
//        List<Product> prods = service.getProductWithText("black");
//        for (Product product : prods) {
//            System.out.println(p);
//
//        }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Klavye";
        product.price = 15;

        manager.add(product);

            // inner class
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();

    }
}
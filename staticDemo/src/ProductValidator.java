public class ProductValidator {

    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }

    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return  true;
        } else {
            return  false;
        }
    }

    public void standart(){

    };

        // inner class
    public static class baskaClass{
        public static void sil(){

        }
    }
}

// Static -> Bir kere oluşur ve program süresince kalır.

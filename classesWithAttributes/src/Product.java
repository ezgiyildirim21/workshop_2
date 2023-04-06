public class Product {

    public Product(int id, String name, String description, int stockAmount, double price, String renk){
        System.out.println("Yapıcı blok çalıştı dolu");
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockAmount = stockAmount;
        this.price = price;
        this.renk = renk;
    }
            // overrade = aşırı yükleme
    public Product(){
        System.out.println("Yapıcı blok çalıştı boş");
    }

    // attribute || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    // getter
    public int getId(){
        return id;
    }
    // setter
    public void setId(int id){
      this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}



// encapsulation
    // public: Sistemdeki bütün sınıfların erişebilmesini sağlar. Yalnızca aynı proje içinden değil, diğer projelerden de erişim sağlanabilir.
    // private: Bir "özellik (property)"in veya "metod"un sadece tanımlandığı sınıftan erişilebilmesini sağlar. Oluşturulan sınıf veya yapıların "public" olması açık bir şekilde belirtilmez ise, derleyici tarafından "private" olarak belirlenir.
    // internal: Aynı derleyici (assembly) içinde bulunan tüm sınıflardan erişim sağlanır.
    // protected: Sadece tanımlandığı sınıfın içinde ve o sınıftan türetilmiş diğer sınıfların içinde erişilebilir.

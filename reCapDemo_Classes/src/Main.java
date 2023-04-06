public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.Topla(3,4);
        int sonuc2 = dortIslem.Cikar(7,1);
        int sonuc3 = dortIslem.Carp(2,8);
        int sonuc4 = dortIslem.Bol(12,3);

        System.out.println("Toplam Sonucu: " + sonuc1);
        System.out.println("Çıkartma Sonucu: " + sonuc2);
        System.out.println("Çarpma Sonucu: " + sonuc3);
        System.out.println("Bölme Sonucu: " + sonuc4);
    }
}
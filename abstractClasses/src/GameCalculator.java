public abstract class GameCalculator {
//    public void hesapla(){
//        System.out.println("Puanınız: ...");
//    }
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}


// classın içindeki her methodu kullanmak istemiyorsak 2 yol var
    // 1.yol ezip override edebiliriz.
    // 2.yol abstract class yapma

// final varsa override olmaz
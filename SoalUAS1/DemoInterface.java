package SoalUAS1;

public class DemoInterface implements Membaca{
    public static void main (String[] args){
        DemoInterface a = new DemoInterface();
        a.menulis();
        a.membaca();
    }

    @Override
    public void menulis() {
        System.out.println("Ini menulis");
    }

    @Override
    public void membaca() {
        System.out.println("Ini membaca");
    }
}

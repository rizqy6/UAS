package SoalUAS2;



public class Pembelian {
    static Customer a = new Customer();
    static HandBag b = new HandBag();

    public Pembelian(Customer a, HandBag b) {
        a.setNama("Rizqy");
        a.setAlamat("Wonogiri");
        a.setID(015);
        a.setOngkir(120000);
        b.setHarga(1000);
        b.setBanyaktas(1);
        b.setMerk("Luis Vetong");
        
    }
    void tampilkanDataPembeli(){
        System.out.println("Data Pembelian");
        System.out.println("Nama: " + a.getNama());
        System.out.println("Alamat: " + a.getAlamat());
        System.out.println("ID: " + a.getID());
        System.out.println("=======================");
        System.out.println("Harga: " + b.getHarga());
        System.out.println("Banyak Tas: " + b.banyaktas);
        System.out.println("Merk: " + b.getMerk());
        
    }
    
    public static void main(String[] args) {
        Pembelian c = new Pembelian(a,b);
        c.tampilkanDataPembeli();
    }
}

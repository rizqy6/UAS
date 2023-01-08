package Soal;


public class Pegawai{
    //Instance variabel dengan akses modifier private ditandai dengan (-) di dalam UML
    private String nama;
    private String NIP;

    //Sebuah Constructor dengan nilai NULL
    public Pegawai(){
        
    }
    
    //Penerapan Overloading cunstructor karena memiliki paramter yang berbeda dengan constructor sebelumnya
    public  Pegawai(String nama, String NIP){
        setNama(nama);
        setNIP(NIP);
    }


    //Kode dibawah ini merupakan konsep Encapulation
    // Method void paramete
    protected void setNama(String newNama){
        this.nama = newNama;
    }

    //Pemanggilan instance nama dalam kasus akses modifier private
    public String getnewNama(){
        return nama;
    }

    // Method void paramete
    protected void setNIP(String newNIP){
        this.NIP = newNIP;
    }

    //Pemanggilan instance NIP dalam kasus akses modifier private
    public String getnewNIP(){
        return NIP;
    }

    // ini hanya pengetesan saja
    public static void main(String[] args){
        Pegawai pegawai = new Pegawai("rix","22323");
        pegawai.setNama("Pegawai");
        pegawai.setNIP("1234567890");

        System.out.println(pegawai.getnewNama());
        System.out.println(pegawai.getnewNIP());
    }
} 
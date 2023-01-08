package Soal;


public class Pegawai{
    private String nama;
    private String NIP;


    public  Pegawai(String nama, String NIP){
        setNama(nama);
        setNIP(NIP);
    }

    public Pegawai(){
        // this.nama = nama;
        // this.NIP = NIP;

        // System.out.println("Nama" + nama + " NIP" + NIP);
    }

    protected void setNama(String newNama){
        this.nama = newNama;
    }

    public String getnewNama(){
        return nama;
    }

    protected void setNIP(String newNIP){
        this.NIP = newNIP;
    }

    public String getnewNIP(){
        return NIP;
    }


    public static void main(String[] args){
        Pegawai pegawai = new Pegawai("rix","22323");
        pegawai.setNama("Pegawai");
        pegawai.setNIP("1234567890");

        System.out.println(pegawai.getnewNama());
        System.out.println(pegawai.getnewNIP());
    }
} 
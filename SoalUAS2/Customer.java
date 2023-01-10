package SoalUAS2;

public class Customer {
    
    String nama,alamat;
    int id,ongkir;



    void setID (int newID){
        this.id = newID;
    }

    int getID(){
        return this.id;
    }

    void setNama (String newNama){
        this.nama = newNama;
    }

    String getNama(){
        return this.nama;
    }

    void setAlamat (String newAlamat){
        this.alamat = newAlamat;
    }
    String getAlamat(){
        return this.alamat;
    }

    void setOngkir (int newOngkir){
        this.ongkir = newOngkir;
    }

    int getOngkir(){
        return this.ongkir;
    }
}

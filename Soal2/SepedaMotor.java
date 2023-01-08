package Soal2;


//Sebuah class abstarct ditandai dengan penulisan abstarct
public abstract class SepedaMotor {
    
    //Pembuatan instance variable String 
    String merk;


    //Pembuatan instance variable integer bernilai awal 0
    int gerigi = 0;

    //Terdapat interface dengan method abstarct
    interface OperasiGergigi{
        abstract void tambahGergigi();
        abstract void kurangGergigi();
    }

    //static class  MotorSport yang diturunkan dari classSepedaMotor dan pengaplikasian implements OperasiGergigi

    static class MotorSport extends SepedaMotor implements OperasiGergigi{

        //Constructor motorsport yang memiliki parameter String merk
        public MotorSport (String merk){
            
        }
        // Dibawah ini terdapat override karena class MotorSport memakai method abstarct dari Operasi Gergigi sehingga terjadi overrding
        //Jika tidak diovveding maka Class motorSport akan eror
        @Override
        public void tambahGergigi() {
            // TODO Auto-generated method stub
            gerigi ++;
        }

        @Override
        public void kurangGergigi() {
            // TODO Auto-generated method stub
            gerigi --;
        }
    }
}

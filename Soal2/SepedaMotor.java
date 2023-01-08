package Soal2;

public abstract class SepedaMotor {
    
    String merk;

    int gerigi = 0;

    interface OperasiGergigi{
        abstract void tambahGergigi();
        abstract void kurangGergigi();
    }

    static class MotorSport extends SepedaMotor implements OperasiGergigi{
        public MotorSport (String merk){
            
        }

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

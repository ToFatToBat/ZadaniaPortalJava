package projektowanieObiektowe1;

public class Car {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("SL", "Mercedes",true, true );
        Cabrio cabrio1 = new Cabrio("SL", "Mercedes",false, true );
        Cabrio cabrio2 = new Cabrio("SL", "Mercedes",false, false );

        cabrio.changeRoofPosition(cabrio.isRoofOpen);
        cabrio1.changeRoofPosition(cabrio1.isRoofOpen);
        cabrio2.changeRoofPosition(cabrio2.isRoofOpen);
    }
}

public class Test {
    public static void main(String[] args) {
        Office office = new Office();
        PoliceStation policeStation = new PoliceStation();

        office.accept(new Manager());
        office.accept(new PoliceOfficer());

        policeStation.accept(new Manager());
        policeStation.accept(new PoliceOfficer());
    }
}
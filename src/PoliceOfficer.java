public class PoliceOfficer implements Visitor{

    @Override
    public void visit(Office office) {
        System.out.println("Checked office");
    }

    @Override
    public void visit(PoliceStation policeStation) {
        System.out.println("Working here");
    }
}

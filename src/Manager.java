public class Manager implements Visitor{
    @Override
    public void visit(Office office) {
        System.out.println("Working here");
    }

    @Override
    public void visit(PoliceStation policeStation) {
        System.out.println("Walking to excursion");
    }
}

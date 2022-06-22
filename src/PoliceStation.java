public class PoliceStation implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

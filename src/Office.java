public class Office implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

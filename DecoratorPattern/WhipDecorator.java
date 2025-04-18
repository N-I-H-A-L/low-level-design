public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}

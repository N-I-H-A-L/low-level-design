public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = $" + coffee.getCost());

        // Add milk
        coffee = new MilkDecorator(coffee);

        // Add sugar
        coffee = new SugarDecorator(coffee);

        // Add whip cream
        coffee = new WhipDecorator(coffee);

        System.out.println(coffee.getDescription() + " = $" + coffee.getCost());
    }
}

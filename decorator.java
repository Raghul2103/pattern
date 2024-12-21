interface Coffee {
    double cost();
    String description();
   }
   
   //Step 2: ConcreteComponent - Simple Coffee class
   class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0; // Base cost of simple coffee
    }
   
    @Override
    public String description() {
        return "Simple Coffee";
    }
   }
   
   //Step 3: Decorator - Abstract class that wraps a Coffee object
   abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
   
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
   
    @Override
    public double cost() {
        return decoratedCoffee.cost(); // Delegate cost calculation
    }
   
    @Override
    public String description() {
        return decoratedCoffee.description(); // Delegate description
    }
   }
   
   //Step 4: Concrete Decorators - Milk and Sugar decorators
   class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
   
    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.5; // Add cost of milk
    }
   
    @Override
    public String description() {
        return decoratedCoffee.description() + " + Milk"; // Add milk description
    }
   }
   
   class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
   
    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5; // Add cost of sugar
    }
   
    @Override
    public String description() {
        return decoratedCoffee.description() + " + Sugar"; // Add sugar description
    }
   }
   
   public class decorator {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.description() + " Cost: $" + simpleCoffee.cost());
   
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.description() + " Cost: $" + milkCoffee.cost());
   
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.description() + " Cost: $" + milkSugarCoffee.cost());
    }
   }
   

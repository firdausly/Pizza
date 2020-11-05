public class PizzaTestDrive {

    public static void main(String[] args){
        SimplePizzaFactory factory=new SimplePizzaFactory();
        PizzaStore store=new PizzaStore(factory);

        Pizza pizza=store.orderPizza("cheese");
        System.out.println("We ordered "+pizza.getName());
        System.out.println(pizza);
    }
}

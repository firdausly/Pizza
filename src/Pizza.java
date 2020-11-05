import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings=new ArrayList<String>();

    public Pizza() {
    }

    public void prepare(){
        System.out.println("Preparing "+this.getName());
    }

    public void bake(){
        System.out.println("Baking "+this.getName());
    }

    public void cut(){
        System.out.println("Cutting "+this.getName());
    }

    public void box(){
        System.out.println("Boxing "+this.getName());
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        String toppinglist="";
        for(int i=0;i<toppings.size();i++){
            toppinglist=toppinglist+toppings.get(i)+" \n";
        }
        return "----"+this.getName()+"----- \n" +
                dough + '\n' +
                sauce + '\n' +
                toppinglist
                ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    //    Pizza orderPizza(){
//     Pizza pizza=new Pizza();
//
//     pizza.prepare();
//     pizza.bake();
//     pizza.cut();
//     pizza.box();
//     return pizza;
//    }
//
//    Pizza orderPizza(String type){
//        Pizza pizza=null;
//
//        if(type.equals("cheese")){
//            pizza=new CheesePizza();
//        } else if(type.equals("greek")){
//            pizza= new GreekPizza();
//        } else if(type.equals("pepperoni")){
//            pizza=new PepperoniPizza();
//        }
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//        return pizza;
//
//    }

}

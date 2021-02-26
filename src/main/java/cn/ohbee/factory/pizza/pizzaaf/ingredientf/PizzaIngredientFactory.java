package cn.ohbee.factory.pizza.pizzaaf.ingredientf;

import cn.ohbee.factory.pizza.pizzaaf.ingredient.*;

public interface PizzaIngredientFactory {

     Dough createDough();
     Sauce createSauce();
     Cheese createCheese();
     Veggies[] createVeggies();
     Pepperoni createPepperoni();
     Clams createClam();

}

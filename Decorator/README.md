# Decorator

This is a structural design pattern of encapsulating objects into other objects, essentially adding features to the object. Decorating the object, like you would a Christmas tree or adding decorating a pizza with toppings. This is handy when you need to add functionality to objects in a flexible and resusable way.

Following the pizza example, lets say we are designing a system for keeping track of pizza's sold and how much a certain pizza costs. Imagine Mod Pizza where you go down the ingredients aisle in a subway fashion adding whatever ingredients you want. [Mod Pizza](https://modpizza.com/menu/) literally has the following amount of ingredients...

- 3 Crusts
- 8 Suaces
- 6 Cheeses
- 10 Meats
- 26 Veggies
- 8 Topping Sauces

Lets calculate the possible combinations using the the formula C(n, k) = n! / (k!(n-k)!), where n is the number of options and k is the number of options to choose from. Carry the 2, divide the 6 and this equals _a-shit-ton-of-combinations_ (I couldn't figure out how to calculate this).

In our system we could represent all these possible pizzas as individual objects with their own pricing property. But just because we could dosen't mean that we should. This would be crazy to generate instances of ever combination pizza.

Instead, we can utilize decorators. As a pizza is being built we can dynamically create the class object and in this case continously add the price of ingredient that gets added.

Some people may ask why not inheritance...

- Inheritance is static and cannot be updated dynamically
- Subclasses usually cannot inherit from more than one class, while decorators can keep piling on modifications.

However some Cons for decorators are

- Modificaiton order is signifcant and hard to imnplent otherwise
- The implementation it's self can get complicated and messy with many decoration layers.

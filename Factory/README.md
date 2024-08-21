# Factory

When a method returns one of several possible classes that share a common super class

**We ultimately want classes to be generated at run time**

Let’s say we want to generate some object at random - using basic programming techniques will make this very difficult. Thus a factory can be used to generate objects during run time.

Parameterized factories are the simpiliest form of a factory but can be easily implemented to illustrate the core concept of a factory.

Essentially you can have a factory class that will be passed some parameter and will return the creation of some type of class object. The factory will have a creation method for this, hence why this is alternatively called the Factory Method pattern.

```rb
public class ProductFactory{
    public Product createProduct(String ProductID){
        if (id == ID1)
            return new OneProduct();
        if (id == ID2) return
            return new AnotherProduct();
        return null;
    }
}
```

## When to user Factory Pattern

- When you don't know beforehand the exact types and dependencies of the objets your code should work with.
  - We will still need to hard code the available objects that could potentially be created but at run time we can decide upon which types to generate.
  - However, this allows us to separate the object creation from the code that is actually going to use the object.
- When you want to encapsulate object creation along with supporting customization / configuration of object creatation

## Cons

- Increased complexity with the introduction of more classes and interfaces. The use of polymorphism and dynamic binding can increase the complexity as well.
- Testing the factory logic can be difficult.

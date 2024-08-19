# Dependency Injection

> _"Dependency injection mean giving an object its instance variables....
> Dependency Injection” is a 25-dollar term for a 5-cent concept."_ > [James Shore](https://www.jamesshore.com/v2/blog/2006/dependency-injection-demystified)

When you have a piece of code that uses another piece of code. Instead of using the other piece of code directly you pass it in instead. A class will recieve and object/functions it depends on instead of creating them itself.

Classes will can initilize instance variables in a class constructor, like so.

```rb
public class Example {
  private DatabaseObject myDatabase;

  public Example() {
    myDatabase = new DatabaseObject();
  }

  public void DoStuff() {
    ...
    myDatabase.GetData();
    ...
  }
}
```

The database variable instance is the dependency for this exampl class. Example class depends on the database object to DoStuff.

What we could do instead is inject the dependency into the Example object like so....

```rb
public class Example {
  private DatabaseObject _myDatabase;

  public Example(DatabaseObject myDatabase) {
    _myDatabase = myDatabase;
  }

  public void DoStuff() {
    ...
    _myDatabase.GetData();
    ...
  }
}
```

We are injecting the database object into the class instead of creating it within the Example class with the "new" command.

This is useful for encapsulating classes. Particularly useful when testing your code. We can mock dependencies and inject them to classes to have more granular testing.

```rb
public class ExampleTest {
  TestDoStuff() {
    MockDatabase mockDatabase = new MockDatabase();

    Example example = new Example(mockDatabase);

    example.DoStuff();
    mockDatabase.AssertGetDataWasCalled();
  }
}
```

## When to use Dependency Injection

- When you need to inject the same dependency into multiple classes
- When you need to pass different configurations of a dependency to classes
- When you need to inject different implementations (types) of the same dependency.

## When NOT use Dependency Injection

- When you will never need a different dependency implementation or configuration

Dependency Injection

"Dependency injection mean giving an object its instance variables."

When you have a piece of code that uses another piece of code. Instead of using the other piece of code directly you pass it in istead.

https://www.jamesshore.com/v2/blog/2006/dependency-injection-demystified

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

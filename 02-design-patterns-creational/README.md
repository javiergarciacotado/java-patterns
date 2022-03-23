# Creational design patterns

The focus of creational patterns is on how to instantiate an object or a group of related objects.

They reduce complexities and instability by creating objects in a controlled manner.The _new_ operator is often considered damaging as it allows to spread objects throughout the application. Because classes grow tightly connected over time, changing an implementation might become difficult.

**Creational Design Patterns** address this issue by decoupling the client from the actual initialization process.

## Getting started 

### [] What is its purpose?

🚗 &rarr; &rarr; &rarr; &rarr; &rarr; 🚗\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 🚗\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 🚗\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 🚗\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 🚗

### Factory

**It's a software entity which is responsible to build things allowing you to extract a factory method that returns an object of a certain type and executes the action based on the behavior of the actual object.**

#### When to use it

- Whenever we come with similar operations.

### Singleton

TBD #really?

### Builder 

**Split the build of a complex object to create different representations**

#### When to use it

- The build process **must** allow different representations/values for the object that is build

#### Resources

- [Builder](https://refactoring.guru/design-patterns/builder)

### Named constructor

[Joshua Block's Effective Java Item 1](https://www.pearson.com/us/higher-education/program/Bloch-Effective-Java-3rd-Edition/PGM1763855.html)

```
    Consider static factory methods instead of constructors
```

### When to use it

- Production code: whenever we would improve the semantics of our class
- Testing:  https://ecararus.github.io/BuilderVsObjectMother/

### Abstract factory

**Produce families of related objects without specifying their concrete classes.**

#### When to use it

- You don’t want to modify existing code when adding new families of instances to the program.
- This constraint must be enforced since the family of related bankProduct objects is meant to be utilized together.

#### Resources

[Class diagram](https://refactoring.guru/design-patterns/abstract-factory)

### Factory method

**Defines an interface for creating an object, but let subclasses decide which class to instantiate.**
The Factory method lets a class defer instantiation to subclasses

#### When to use it

- Class has no way of knowing what kind of objects it will have to produce.
- Class wants its subclasses to specify the objects it creates.
- Classes delegate **responsibility to one** of several subclasses, and you want to localize the knowledge of which helper subclass is the delegate.

#### Resources

[Class diagram](https://refactoring.guru/design-patterns/factory-method)





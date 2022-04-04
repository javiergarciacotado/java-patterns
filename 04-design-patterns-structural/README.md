# Structural design patterns

Describe how to combine objects and classes into larger structures while maintaining flexibility and efficiency.

## Getting started

### [ ] What is its purpose?

🖥️ &rarr; &rarr; &rarr; &rarr; &rarr; 💻 \
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 🖱️\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; 💽\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; &rarr; &rarr; &rarr; ⌨️

### Adapter

Convert the interface of a class into another interface the clients expect. 

#### When to use it

- Whenever we have to enable classes to work together that couldn't otherwise because of incompatible interfaces

### Bridge

Decouple an abstraction from its implementation so that the two can vary independently.

#### When to use it

- Whenever we want to separate out responsibilities into different abstract classes.

### Decorator

Attach additional responsibilities to an object dynamically.

#### When to use it

- Whenever we want to provide a flexible way to subclassing for extending functionality.

#### References

### Facade

Provide a unified interface to a set of interfaces in a subsystem

#### When to use it

- Whenever we want to provide a high level interface that makes the subsystem easier to use.
- A good candidate while we are developing libraries

#### References

### Proxy

It allows us to create an intermediary that acts as an interface to another resource

#### When to use it

- Whenever we want a simplified version of a complex or a heavy object (aka virtual proxy).
- Whenever we want a security layer to the original proxy (aka Protection proxy) 
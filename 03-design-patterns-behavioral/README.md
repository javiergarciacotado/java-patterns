# Behavioral design patterns

Identify common communication patterns among objects. They are concerned with the interaction and responsibility of objects.

The interaction between the objects in these design patterns should be such that they may readily communicate with one another while being loosely coupled.

These patterns increase flexibility in carrying out communication.

## Getting started

### [ ] What is its purpose?

🧍 &nbsp; &rarr; &rarr; interacts &rarr; &rarr; &rarr; 👶\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; interacts &rarr; &rarr; &rarr; 👧\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &rarr; &rarr; interacts &rarr; &rarr; &rarr; 🖥️

_How do they communicate to each other?_

### Command

Used to encapsulate all information needed to perform an action or trigger an event at a later time

- The _command_ declares an interface for executing an operation.
- The _concrete command_ class defines the binding between an object and an action.
- The _receiver_ class knows how to perform the operations associated with carrying out a request.
- The _invoker_ class sends the command to carry out a request.
- The client class creates a ConcreteCommand object and sets its receiver.

#### When to use it

- If you wish to queue, specify and execute requests at separate times, you'll need a command with a life span independent of the original request.

#### References

- [Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)

### Visitor

Represent an operation that will be executed on an object structure's elements without modifying the classes of the components on which it acts.
Visitor allows you to specify a new operation.

#### When to use it

- Allows one or more operations to be applied to a set of objects at runtime, decoupling the operations from the object structure.
- Use the pattern when a behavior makes sense in some classes of a class hierarchy, but not in others.

#### References

- [FileVisitor](https://docs.oracle.com/javase/8/docs/api/java/nio/file/FileVisitor.html)
- [Element](https://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html)

#### When to use it

### Strategy

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. 
It lets the algorithm vary independently from the clients that use it by:

- Declaring an interface common to all implementations.
- A concrete strategy implements the algorithm using the strategy interface.
- The Context uses this interface to call the algorithm defined by a concrete strategy.

#### When to use it

- Select an algorithm at runtime.

#### References

- [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#compare-T-T-)
- [Filter](https://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-)

### Template

Defines a skeleton of an algorithm in an operation by:

- The abstract class specifies how concrete subclasses should implement actions.
- The actions are implemented by concrete classes to carry out subclass-specific steps of the algorithm.

#### When to use it

- When common behavior among subclasses should be factored and localized in a common class to avoid code duplication.
- To control subclasses extensions.

#### References

- [Reader](https://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)
- [Writer](https://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)

### Chain of responsability

Allowing more than one object to handle a request helps to avoid coupling the request's sender and receiver. 
Chain the receiving objects together and transmit the request down the chain until it is handled by one of them.

#### When to use it

- To process different types of requests in various ways
- Use the pattern when it’s essential to execute several handlers in a particular order.

#### References

- [Log](https://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log-java.util.logging.Level-java.lang.String-)

### Observer

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

#### When to use it

- When a change to one object requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. 

#### References

- [Event Listener](https://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html)

### Iterator

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

#### When to use it

- To access an aggregate object's contents without exposing its internal representation.
- To provide a uniform interface for traversing different aggregate structures.

#### References

- [Iterator](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)





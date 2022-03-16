## Introduction

This repository contains code for:

- Each principle has its code at his own package.
- Principle violated (dislike the naming) code will be under the weird package, and right one (at least, to me) will under the refactor package.
- If you feel we could do better in refactoring, don't forget to create a PR with your changes
- If you have any feedback, please email me @jgarciacotado@gmail.com

## Getting started

### [ ] STUPID vs SOLID

### STUPID

This may hurt your feelings, but you've most likely (99.999% sure) already have written STUPID code. **I've done the same**. But what exactly does that imply?

#### Stupid code, seriously?

- **S**ingleton
- **T**ight coupling
- **U**ntestability
- **P**remature Optimization
- **I**ndescriptive naming
- **D**uplication

#### Singleton

Programs that rely on global state are extremely difficult to verify, because often mask their dependencies. 

come on ... it's a common pattern from GoF (Gangs of Four Design Patterns), shall we avoid it? IMHO, yes, You can often replace its usage by something better. 

#### Tight coupling

_When changing one module in your application you need to change another && another, coupling is present._
i.e: For instance, you instantiate objects in your constructor’s class instead of passing instances as arguments.
Tightly coupled modules are difficult to reuse, and also hard to test.

#### Untestability

i.e: Related with the previous topics

#### Premature Optimization

Are you going to need it?

#### Indescriptive naming

Write code for people, not for machines ❗❗

#### Duplication

Do you want something else???
💡 Tip: Polymorphism over inheritance

## 🚨🚨 **SOLID to the rescue** 🚨🚨

### SOLID

#### **S**ingle Responsability Pattern

##### Summary

**A class should never have more than one reason to change.**

##### Description
Each class should be responsible for only one thing, and that responsability should be totally contained within the class.
Responsibility can be defined as a reason to change, a class or module should only have one reason to change.

##### Why

- High cohesion and robustness
- Allow class composition
- Avoid duplication

#### Open/Closed principle

##### Summary

**Software entities (e.g. classes) should be open for extension, but closed for modification**

##### Description

Avoid depending on specific implementations, making use of abstract classes or interfaces.

##### Why

- Improve maintainability and stability by minimizing changes to existing code.

#### Liskov Principle

##### Summary

Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.

##### Description

##### Why

- it helps us model good inheritance hierarchies.

#### Interface Segregation Principle

##### Summary

**An interface is owned by its clients**

##### Description
Reduce fat interfaces into multiple smaller and more specific client specific interfaces. An interface should be more dependent on the code that calls it than the code that implements it.

##### Why

- High cohesion 
- A client should not be exposed to methods it doesn't need

#### Dependency inversion

##### Summary

##### Description
high level modules should not depend on low level modules; both should depend on abstractions. Abstractions should not depend on details. Details should depend upon abstractions.

### Why

- Inversion of control is used to increase modularity of the program and make it extensible.
- To decouple the execution of a task from implementation.
- To focus a module on the task it is designed for.
- To free modules from assumptions about how other systems do what they do and instead rely on contracts.
- To prevent side effects when replacing a module.




## Object Orientation

#### Polymorphism
* any object that can pass multiple IS-A test is polymorphic
* compile time: method can be used based on reference type
* runtime: the code is dynamically selected based on the actual object 

#### Overriding, overloading
* overriding method cannot be more restrictive
* overriding method must fulfill the contract of the superclass
* rules:
  * must have the same argument list
  * may have covariant return type
  * must be inherited (accessible, non-private, non-final)
  * cannot throw new or broader checked exceptions
  * can throw any unchecked exception
  * the overriding method **does not have to declare** any exceptions that it will never throw!!!
  * cannot override final method
* accessing interface's method: `InterfaceX.super.method()`

* Overloading rules:
  * same argument list
  * covariant return type
  * any access modifier
  * can declare any exception
  * a method can be overloaded in a subtype
  * reference type determines which version is called
  
**
* overridden: runtime, based on object type
* overloading: compile time, based on reference type**

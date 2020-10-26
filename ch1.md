## Declarations, Access Control, Enums

#### Class access
* create instance
* extend/inherit
* access methods, variables

* only public and default for classes
#### Non-access class modifiers
* **strictfp**
  * methods will conform strictly to the IEEE754
  * without strictfp floating points are platform-dependent
  * class or method
  * but not variable
* **final** class
  * cannot be subclassed
  * cannot be abstract
  * eg: String
* **abstract**
  * the purpose is to be extended
  * even a single method is abstract, the whole class must be declared abstract
  * cannot be final

#### Interfaces
* all methods are implicitly **public** and **abstract**
* all variables are implicitly **public** **static** **final**
* method cannot be marked **final**, **strictfp** or **native**

##### Interface **default** and **static** methods
* must have a concrete method body
* invoking static interface method, the interface name must be included
```java
interface StaticInInterface {
   static void useless() { }
   main(String[] args) {
     StaticIface.useless();
   }
 }
```

#### Class members
##### Access modifiers
* **public** member can be referenced or inherited if the class is visible
* **private** member
  * cannot be accesed by any code regardless of the visibility.
  * cannot be inherited
    * cannot be overridden
  * method with the same name does not override the method in subclass
    * eg. no restriction on return type, parameter types, and on exceptions
* **protected** and default access
  * difference only when talking about subclasses
  * default member: same package only
  * protected member:
    * can be accessd through inheritance even from different package
    * the subclass inherits the member
    * but subclass cannot access the member through reference (as if it were public)
    * not visible outside of child classes
```java
package parent;
public class Parent {
  protected int secret;
}
```
```java
package child;
public class Child extends Parent{ 
  public void doSomething() {
    int y = secret; // implicitly super.secret;
  } 
}

class Neighbor {
  public void doSomething() {
    Child child = new Child();
    // although 'secret' is protected in Child
    // and Neighbor is in the same package
    // 'secret' became private for Neighbor 
  }
}
```

##### Non-Access member modifiers
* **final** methods
* **final** arguments
  * cannot be modified within the method
  * (which means it cannot be reassigned a new value)
* **abstract** method
  * cannot be **final**, **private** or **static**
* **synchronized** method

#### Var-args
* argument: The things between parentheses when invoking a method
* parameter: The things in the method's signature
* counter examples:
  * void doStuff(int x...)
  * void doStuff(int... x, char...ch)
  * void doStuff(int... x, String s)

#### Constructor declarations
* cannot be overridden

#### Numbers
* byte
  * 7 bits + sign
  * -128 ... 127
  * -2^7 ... (2^7-1)
* short: 16 bits = 15 bit + sign
* int: 32 bits
* long: 64 bits
* in general: half of them negative, half-1 are positive
* char: 2-byte Unicode character
  * it can be assigned to int or long

#### Instance vs local variables
* local variables are always on the stack
* if the variable is a reference, the object itself will be on the heap
* "local object" means "locally declared reference variable"!
* local variable must be initialized before use
* local variable doesn't get default value



  
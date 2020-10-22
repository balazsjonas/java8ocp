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




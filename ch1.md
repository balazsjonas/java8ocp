## Declarations, Access Control, Enums

#### Class access
* create instance
* extend/inherit
* access methods, variables

* only public and default for classes
#### Nonaccess class modifiers
* strictfp
  * methods will confrom strictly to the IEEE754
  * without strictfp floating points are platform-dependent
  * class or method
  * but not variable
* final class
  * cannot be subclassed
  * cannot be abstract
  * eg: String
* abstract
  * the purpose is to be extended
  * even a single method is abstract, the whole class must be declared abstract
  * cannot be final

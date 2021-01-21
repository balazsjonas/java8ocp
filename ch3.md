## Assertions, Exceptions

#### Assertion
* anythingResultingBoolean : anythingThatReturnsAValueWhichIsConvertedToString
* java -enableassertions or java -ea
* selective enabling/disableing
  * by exact class
  * by package (+subpackages)
  * for systemclasses (-dsa)
* inappropiate uses (by Oracle)
  * assert argument of public method (assert can be switched off)
  * validation of command line arguments
  * expression with side effect
  
#### Exceptions
* multiple catch
  * common variable name
  * methods of the base class are available
  * exception types cannot be in the same inheritance tree
    * cannot be subclasses of each other
  * cannot assign new value
  * base class can be caught despite it is not declared
  * catch(Exception e) does not mean it really catches all Exception subclasses
* Try with resource
  * the scope of the variable in try() is just the try block
  * it has implicit finally block
  * custom finally block can be added, both will get called
  * `interface Closeable extends AutoCloseable`
    * Closeable --> IOException
    * AutoCloseable --> any Exception
  * Closeable::close() is required to be idempotent
    * for AutoCloseable::close there is no guaranteed
  * if the catch of finally block throws an exception, no suppressions happenn!
  
  
  


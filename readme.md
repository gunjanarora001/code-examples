##Errors
##Singleton
###Error
- getInstance() method is not thread-safe. It can lead to multiple instances being created in a multi-threaded environment.
___________

##Builder
###Error
- The CarBuilder class exposes individual setter methods for each property, but there is no proper separation between building and setting the properties. The builder does not provide a way to enforce the required properties or validate them before building the Car object.
___________

##Command
###Error
- Pattern is implemented with the Command interface and its concrete implementation, LightSwitchCommand. 
However, the LightSwitchCommand takes a boolean parameter (isOn) to determine whether to turn the light on or off. 
This violates the principle of having a single responsibility per command. Each command should encapsulate a specific action, such as turning the light on or off. 
- Additionally, the RemoteControl class does not enforce the use of a command, making it possible to call pressButton() without setting a command.
___________

##Decorator
###Error
- The MilkDecorator class does not properly delegate the cost() and getDescription() methods to the wrapped Beverage object. As a result, calling cost() or getDescription() on a MilkDecorator object will not consider the cost or description of the decorated beverage.
___________

##Observer
###Error
- Implemented without proper initialization of the observers list, leading to a NullPointerException when attempting to add or notify observers.
- Additionally, there is no state or data passed to the observers during the update() method call, which limits the usefulness of the pattern
___________

##Prototype
###Error
- The Prototype pattern is implemented with the Cloneable interface. However, the clone() method is not implemented correctly. It only calls the super.clone() method, which performs a shallow copy and does not properly clone the state of the object. This can lead to unexpected behavior when cloning Shape objects.
___________

##Prototype
###Error
- The Strategy pattern is implemented with the PaymentStrategy interface and its concrete implementation, CreditCardStrategy. However, the CreditCardStrategy has a setter method for setting the interest rate, which violates the encapsulation principle. The interest rate should be set through the constructor or a dedicated method in a proper implementation. 
- Additionally, the ShoppingCart class does not enforce the use of a strategy, making it possible to call calculateTotal() without setting a payment strategy.
___________
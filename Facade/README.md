# Facade

This is a structural design pattern of encapsulating complex systems or functionality into a simplied interface. This essentially hides all the complexity from the user that is not necessary for them to know. The interface will create simply take the user input and then exectute the required actions. This is a very common design patter within programming that is virtually done in all programs. You write code in a method and you call the method in another function not caring how the function actually works.

The main advantage is the capability of isolating code and pushing complexity out of site. While on the other hand having a too large of an interface can create a [God Object](https://en.wikipedia.org/wiki/God_object). This is essentially having too many references to un-related types and functions.

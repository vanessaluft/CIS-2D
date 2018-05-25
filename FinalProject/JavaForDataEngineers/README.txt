Java for Data Scientists Essential Training

To be a data scientist, you need to be able to assess and abstract problem, and come up with a  concrete solution to that problem.

     Here are the important parts I learned:

•	Test-driven development
Test-driven development is a software methodology that emphasizes the role of testing within the software development process.

	Executable documentation illustrates how code works.

	There are two types of tests ? black box/functional tests, and white box/transparent tests.
Black box -> the people who write the test code and the people who write the applications code are different people, often they work on different teams.
White box -> the people who write the test code and the people who write the applications code are the same people.

	While Mock Objects can help with some testing scenarios, there are other scenarios that are inherently difficult. These include: websites, user interfaces, and user experience situations. One source of this difficulty is that a good user experience requires an interface that supports, rather than restricts, a person’s preferred work flow.
This implies that a user can perform actions in a sequence that may not have been anticipated by developers and consequently, is difficult to test.

•	Object-Oriented Java

	Primitives
Data types in Java are designated as either objects or primitives. There are five integer primitives: byte, character, short, integer, and long. Two floating-point primitives: float and double. A Boolean and void.
	
	Strings
Text represents such an important concept within information processing that most computer languages have designated data structures and methods for processing text. In Java the data structure is a string and the processing methods within the string class.
Strings are immutable within Java.
The concatenation of string changes the location in memory.
If you have a situation where you need to concatenate multiple strings the technique to do this is to use a string buffer.

	Classes and attributes
Object oriented theory uses the term attribute, and Java uses the term field. Fields can be associated with objects or with classes. Fields associated with classes are known as static fields. 
Types of modifiers -> public, private, protected and package-private.

	Classes and constructors
Constructors enable objects to create instance of a class using the constructor for that class. The simplest constructor to write is no constructor at all. If you don’t write a particular constructor, then your class will inherit the default no argument constructor from the class object.

	Enumerations
An enumeration is a data structure with a finite number of fields. To create an enumeration you use the keyword “enum” and give the class a name.

•	Libraries
Libraries provide functionality that is not included within the core language.

	Gson
Gson is a Java library that can be used to convert Java Objects into their JSON representation.

	StringUtils
Apache commons language is a library that contains StringUtils. It supplements the capability of Java String class and provides methods that are null safe.

•	Reflection
Reflection is the ability of one Java object to examine the properties of a different Java during run time. This is also referred to as introspection.

•	Design Patterns
Design Patterns are software templates for recurring problems that software engineers frequently encounter. There are three categories of design patterns: creational, structural and behavioral.
	
	Decorator Patterns
We can use a decorator pattern to provide additional functionality to a class without using inheritance.



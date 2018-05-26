							Data Structures 

						What are Data Structures?

	In computer science a data structure is a particular way of collecting and organizing data.
	Choosing the right data structure impacts the efficiency of your program. The collection of data can be from many 
sources such as retrieved from a database, or a file, or even acquired over the network. 

	Types of data structure:

	Array -> stores objects and can grow and shrink
	LinkedList -> uses pointers to keep track of elements
	Vector -> can grow and shrink; provides synchronization
	Stack -> operates on last in, first out
	Queue -> operates on first in, first out


						Using Data Structures

	Collection interface

	The Collections Framework provides high performance, high-quality implementations of usable data structures and 
algorithms.
	Collections are sometimes referred to as containers. Collections are used to store, manipulate, and aggregate data.
	In Java, we have two types of containers. Some containers store a collection of elements,and other containers store 
key/value pairs. Those types of containers are called a map. The Collections interface provides the basic operations for 
adding and removing elements in a Collection.
	It also provides important query operations


	Iterable Interface

	Each collection in Java has an Iterator object that can be used to traverse all the elements in the collection. 
Meaning that it can navigate from one element to the next. 
	So the ListIterator is actually used for list data structures, such as your link list.
	So the Iterable interface, is an integral part of using data structures, such as Array list, and Link lists, 
and queues and stacks

	LinkedList

	The LinkedList provides methods for retrieving, inserting, and removing elements from both ends of the list. A 
LinkedList is good if you know that you're going to be adding elements to the middle or to the end of the list because it 
doesn't take as much overhead as it does to do that with an ArrayList.

	Stack

	Stack allows you to add things onto a stack and then when you take them back off again, they'll be in reverse 
order.

	Queue
 	A queue is a linear list in which items are added at one end and deleted from the other end.
	Elements of queue:
	Add() – used to add elements to the end
	Peek() – returns a copy of the first element
	Remove() – removes the top element; error if empty
	Poll() – removes from the top; returns null if the queue is empty



# Creational Design Pattern Examples
## Builder 
The UserDTO (Data Transfer Object)/UserWebDTO are created by our UserDTOBuilder. The BuilderTest (Client) class will play the role of Director in this example. UserRESTDTOBuilder/UserRESTDTO show how the example can be enhanced to create different type of objects from the builder.
## Simple Factory:
Our PostFactory creates subclasses of the Post class using a static method. A Strin type is used to differenciate between subclasses.
## Factory Method:
## Prototype:
## Singleton:
## Abstract Factory:
Two implementations of our abstract factory (ResourceFactory) create a set of object meant to work together. The GoogleCloudResourceFactory/AWSResourceFactory creates the associated concrete storage and instance.

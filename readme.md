# Simple Stack Implementation POC in Java

This is a very simple example of a stack implementation in Java. This example is using an ArrayList internally to maintain
the stack elements. You can also implement the ```Collection<E>``` interface and override all the methods to introduce more custom
functionality. But as I wanted to keep the example simple, I just added a private ArrayList.

# Use of the generic class ```T```

If you check the ```StackImpl``` class, I'm taking the generic class ```T``` as the type of stack elements. This is so that during
runtime, we can have a string stack or integer stack, or a stack of a custom class as well. ```T``` is a generic class in Java,
the type of which can be decided in runtime.

You can see this in action in the ```App.java``` class, where I have used the same ```StackImpl``` to create a stack of strings
and a class of integers. This comes in pretty handy.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/StackImplementationPOC-1.0-SNAPSHOT.jar
```
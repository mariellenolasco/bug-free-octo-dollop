# Programming Basics

Programming is a lot like recipe making. In fact, there exists a programming language called chef that creates programs through recipes! It's mainly all about telling your computer what to do and when to do it. Programming requires you to think in a very step by step manner. It also makes you consider certain things we might take forgranted as humans because we know how to infer from context. But computers can't! Keeping in mind that you're telling an excited rock what to do helps in keeping your patience when your code doesn't work.

## Variables

Variables are references to the data you have in memory. Computer memory is not very human readable, and remembering exact memory addresses should not be your responsibility as a developer. So variables are there to remember where the memory spaces are, all you have to remember is the variable name.

With strongly typed lanuages like Java and C#, you have to remember to bind your variable to a data type. Strongly typed languages check the data type of the variable during compile time and run time.

**Declaring Variables in Java**:

```java
Datatype variableName = new DataTypeConstructor();
//For example
Object newObject = new Object();
```

There are certain data types called primitives that don't need the new key word when you instantiate it.

```java
//For example
 int number = 5;
 boolean isPrimitive = true;
```

---

### Vocab Words

- **Computer Memory** - Space in your machine that stores the data you work with.
  - [More on computer memory](https://www.geeksforgeeks.org/computer-memory/)

---

Programming with Java, you work with 2 kinds of memory spaces, **stack and heap**. _Heap_ is where more complex data types such as objects are stored, while the _stack_ contains methods calls and primitive variables.

## Control Flow

We can't just keep declaring variables and call that a program. For one thing, that would be very boring, for another, it would also be kinda useless. Thus, we have control flow statements. We use these statements to add decisioning logic in our code.

### If Statement

The if statement is the most intuitive to understand. Much like how you would present options to someone, you structure an if statement the same way. An if statement checks if a boolean expression is true then executes the underlying code block.

For example:

```java

    if(x == 0)
    {
        //do something
    }

```

---

### Vocab terms

- **Boolean Expression**
  - A boolean expression is a statement that can be either true or false. For example, x == 0.
- **Logical Operators**
  - Used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration.
  - [Article on Logical Operators](https://www.geeksforgeeks.org/java-logical-operators-with-examples/)

---

An if statement can stand alone and in fact you can have a couple of consecutive if statements. This type of programming design is discussed further in this [article](https://medium.com/swlh/return-early-pattern-3d18a41bba8).

However, considering we are discussing basics, there exists a common companion to the if statement, the else. The else statement is the answer to the famous question "or else what???". Well, if the condition in the if statement is false, then you execute the code block in the else statement.

```java
if(x == 0)
{
    // Execute something
} else {
    //If x is not equal to zero, do something else
}
```

**Q**: What if you have more than one condition to check????

**A**: You can make use of the if else if statement block. You order the conditions to check for the most pertinent ones first.

```java
if(x == 0) {
    //Execute something
} else if(x == 1) {
    // Execute something else
} else {
    // Execute some other thing
}
```

Note that you can have more than one else if block

### Switch Statement

## Iteration

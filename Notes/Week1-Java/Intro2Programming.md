# Programming Basics

Programming is a lot like recipe making. In fact, there exists a programming language called chef that creates programs through recipes! It's mainly all about telling your computer what to do and when to do it. Programming requires you to think in a very step by step manner. It also makes you consider certain things we might take forgranted as humans because we know how to infer from context. But computers can't! Keeping in mind that you're telling an excited rock what to do helps in keeping your patience when your code doesn't work.

## Variables

Variables are references to the data you have in memory. Computer memory is not very human readable, and remembering exact memory addresses should not be your responsibility as a developer. So variables are there to remember where the memory spaces are, all you have to remember is the variable name.

With strongly typed lanuages like Java and C#, you have to remember to bind your variable to a data type. Strongly typed languages check the data type of the variable during compile time and run time.

**Declaring Variables in Java**:

    Datatype variableName = new DataTypeConstructor();

    Ex: Object newObject = new Object();

There are certain data types called primitives that don't need the new key word when you instantiate it.

    Ex: int number = 5;
        bool isPrimitive = true;

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

---

### Vocab terms

- **Boolean Expression**
  - A boolean expression is a statement that can be either true or false. For example, x == 0.
  - You usually find logical operators

---

### Switch Statement

## Iteration

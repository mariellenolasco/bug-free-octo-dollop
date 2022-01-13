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

---

### Memory Management

One conundrum developers used to lose a lot of hair on was memory allocation for all the variables they would create. What if with all the variables we're creating we lose memory space????? With modern computer architecture that is now a thing of the past. Furthemore, high level languages such as Java and C# has automatic memory management.

The runtime environment provides services for memory management more commonly known as garbage collection. There exists this entity called the garbage collector, that periodically checks memory to see if there are any objects that are no longer being used (for example, they are out of scope or no longer being referenced and is therefore unreachable). The garbage collector disposes of these objects to free up memory. It automatically deallocates memory for useless objects.

You can't really tell the garbage collector when to run but you can suggest a collection using the method, _System.gc()_.

Another notable method involved with garbage collection is an object's _finalize()_ method. This is the method your garbage collector calls before destroying the object. The garbage collector calls on this method for any clean up activity such as closing resources associated with that object such as a database connection. This method is called for basically resource deallocation.

---

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

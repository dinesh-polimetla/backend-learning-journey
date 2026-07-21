# Day 1 - Java Fundamentals

**Date:** 21 July 2026

---

## Topics Covered

- JDK
- JRE
- JVM
- javac
- Bytecode
- Class Loader
- JVM Memory (Basic)
- Garbage Collection (Basic)
- Primitive Data Types
- Wrapper Classes
- Autoboxing
- Unboxing
- Type Casting
- final keyword
- var
- String vs StringBuilder vs StringBuffer

---

## What I Learned

### JDK

- Java Development Kit
- Used to develop Java applications.
- Contains JRE + Development Tools.
- Includes javac compiler.

---

### JRE

- Java Runtime Environment.
- Used to run Java programs.
- Contains JVM + libraries.

---

### JVM

- Java Virtual Machine.
- Executes bytecode.
- Converts bytecode into machine code.

---

### Compilation Flow

.java

↓

javac

↓

.class (Bytecode)

↓

JVM

↓

Machine Code

---

## Heap vs Stack

Stack

- Local variables
- Method calls

Heap

- Objects
- Arrays

---

## Garbage Collection

- Removes unreachable objects.
- Runs automatically.
- System.gc() only requests GC.

---

## Wrapper Classes

| Primitive | Wrapper |
|-----------|----------|
| int | Integer |
| char | Character |
| boolean | Boolean |
| double | Double |

---

## Autoboxing

Primitive → Wrapper

```java
int x = 5;
Integer y = x;
```

---

## Unboxing

Wrapper → Primitive

```java
Integer x = 5;
int y = x;
```

---

## final

- Cannot reassign the reference.
- Does not make an object immutable.

---

## var

- Introduced in Java 10.
- Only for local variables.
- Type is inferred by compiler.

---

## String

Immutable

Example:

```java
String s = "Hello";
s.concat(" World");
```

Output

```
Hello
```

---

## StringBuilder

Mutable

Fast

Not thread-safe.

---

## StringBuffer

Mutable

Thread-safe.

---

## Common Mistakes I Made

- Thought JVM creates bytecode.
- Confused Autoboxing and Unboxing.
- Forgot Character wrapper.
- Thought final makes object immutable.

---

## Interview Questions

- Difference between JDK and JRE?
- What is Bytecode?
- Explain JVM.
- Heap vs Stack.
- Why are Strings immutable?
- Difference between StringBuilder and StringBuffer?

---

## Today's Score

MCQ

19 / 25

Need Improvement

- Autoboxing
- Unboxing
- final reference
- JVM vs JRE

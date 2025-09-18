# Copilot Instructions for HelloWorld VScode Java Project

## Project Overview
This is a simple Java project for learning and experimenting with basic Java concepts. The codebase consists of two main files:
- `Main.java`: Contains the main method and demonstrates various Java features (data types, control flow, loops, arrays, sorting, searching, and method calls).
- `Method.java`: Intended for utility methods (e.g., addition, string array processing). Most methods are currently commented out.

## Architecture & Data Flow
- All logic is currently in the `Main` class. The `Method` class is used for utility functions, but its methods are commented out.
- Data flows are simple: variables are declared and manipulated within the main method, with occasional calls to utility methods (when uncommented).
- No external dependencies or frameworks are used.

## Developer Workflows
- **Build & Run:**
  - Compile: `javac Main.java Method.java`
  - Run: `java Main`
- **Debugging:**
  - Use print statements (`System.out.println`) for debugging.
  - No test framework is present; manual testing via console output.
- **Adding Methods:**
  - Utility methods should be added to `Method.java`.
  - To use a method, instantiate `Method` in `Main.java` and call the method.

## Project-Specific Patterns
- Many code examples are commented out in `Main.java` for reference. Uncomment relevant sections to experiment.
- Array sorting uses a manual bubble sort implementation.
- Searching for values in arrays is done with a simple loop.
- String processing examples are provided in comments.

## Conventions
- Keep utility methods in `Method.java`.
- Main logic and experimentation should be in `Main.java`.
- Use clear variable names and comment code for educational clarity.

## Key Files
- `Main.java`: Main entry point, contains most logic and examples.
- `Method.java`: Utility methods (add, demo for string arrays).

## Example: Adding a Utility Method
```java
// In Method.java
public int add(int x, int y) {
    return x + y;
}

// In Main.java
Method m = new Method();
int result = m.add(2, 3);
System.out.println(result);
```

---
For questions or improvements, clarify which workflow or pattern is unclear so instructions can be updated.
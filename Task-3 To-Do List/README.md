# To-Do List Application

A lightweight console to-do list that allows users to add tasks, mark tasks as complete, and view their current task list.

## Features

- Creates tasks with a unique numeric ID.
- Stores tasks in an in-memory list.
- Displays completion status using a checklist format.
- Marks an existing task as completed.
- Keeps the application running until the user selects Exit.

## Concepts Demonstrated

- Object-oriented data modeling with a `Task` record
- Lists and collection manipulation
- Immutable task updates
- Loops and menu-driven input
- Conditional statements

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder in IntelliJ IDEA.
2. Open `src/TodoListApplication.java`.
3. Run the `main` method.
4. Use the menu to add, complete, or display tasks.

## Run from the Terminal

```bash
javac -d out src/TodoListApplication.java
java -cp out TodoListApplication
```

## Menu

| Option | Action |
| --- | --- |
| `1` | Add a task |
| `2` | Mark a task complete |
| `3` | Show all tasks |
| `0` | Exit |

## Example

```text
1 Add  2 Complete  3 Show  0 Exit
1
Task title: Complete Java internship
```

## Current Limitations

- Tasks are stored only in memory and disappear when the program exits.
- Invalid task IDs should be validated before conversion.
- Tasks cannot currently be edited or deleted.

## Possible Enhancements

- Persist tasks to a JSON or text file.
- Add delete and edit operations.
- Add due dates and priorities.
- Add automated tests for task creation and completion.

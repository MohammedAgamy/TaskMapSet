# Kotlin Collections and Data Structures Examples

This repository contains Kotlin examples demonstrating the use of collections such as `Map`, `Set`, `List`, and more, as well as operations like handling duplicates, working with pairs and triples, and manipulating mutable collections.

## Table of Contents

- [Creating Immutable and Mutable Maps](#creating-immutable-and-mutable-maps)
- [Creating Immutable and Mutable Sets](#creating-immutable-and-mutable-sets)
- [Working with Pairs and Triples](#working-with-pairs-and-triples)
- [Handling Duplications](#handling-duplications)

## Creating Immutable and Mutable Maps

### `createMap()`
- **Description**: Demonstrates how to declare an immutable `Map` of strings to integers and perform various operations on it.
- **Operations**:
  - Iterate through the map and print each key-value pair.
  - Retrieve a value using `getValue`.
  - Check if the map contains a specific key.

### `createAMutableMap()`
- **Description**: Demonstrates how to declare a mutable `Map` of strings to doubles and perform various operations on it.
- **Operations**:
  - Add a new key-value pair.
  - Remove a key-value pair.
  - Iterate through the map using `forEach`.
  - Sort the map by key in ascending order.

## Creating Immutable and Mutable Sets

### `createASet()`
- **Description**: Demonstrates how to declare an immutable `Set` of integers and perform various operations on it.
- **Operations**:
  - Iterate through the set and print each value.
  - Check if the set contains a specific value.

### `createMutableSet()`
- **Description**: Demonstrates how to declare a mutable `Set` of strings and perform various operations on it.
- **Operations**:
  - Add and remove elements from the set.
  - Iterate through the set using `forEach`.
  - Convert the set to a sorted list.

## Working with Pairs and Triples

### `workingWithPairs()`
- **Description**: Demonstrates how to work with `Pair` in Kotlin.
- **Operations**:
  - Declare a pair of a string and an integer.
  - Access and print the first and second elements.
  - Create and iterate through a list of pairs.

### `workingWithTriples()`
- **Description**: Demonstrates how to work with `Triple` in Kotlin.
- **Operations**:
  - Declare a triple of a string, an integer, and a double.
  - Access and print the first, second, and third elements.
  - Create and iterate through a list of triples.

## Handling Duplications

### `handlingDuplications()`
- **Description**: Demonstrates how to handle duplicate elements in a list.
- **Operations**:
  - Identify and store duplicate elements in a `MutableList`.
  - Remove duplicates by converting the list to a `Set`.
  - Convert the `Set` back to a list and print the result.

## Getting Started

### Prerequisites
- Kotlin 1.5 or later

### Running the Code
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/kotlin-collections-examples.git
    ```
2. Open the project in your favorite Kotlin IDE (e.g., IntelliJ IDEA).
3. Run the `main()` function from any Kotlin file to see the output.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

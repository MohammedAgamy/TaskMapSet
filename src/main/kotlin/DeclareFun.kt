fun createMap() {
    //1.1. Declare an immutable Map of strings to integers with the
    val immutableMap: Map<String, Int> = mapOf("apple" to 3, "banana" to 2, "cherry" to 5)

    //1.2. Use a loop to iterate through the map and print each key-value
    //pair using entries
    for ((key, value) in immutableMap.entries)
        println("Out of map key = $key value = $value ")

    //Use the getValue function to retrieve the value for the key
    //"banana" and print it
    val getValue = immutableMap.getValue("banana")
    println("getValue by key = $getValue")

    //Check if the map contains the key "apple" using containsKey
    //and print the result
    val mapContains = immutableMap.containsKey("apple")
    println("map it contains apple = $mapContains")

}


fun createAMutableMap() {

    //. Declare a MutableMap of strings to doubles with the values
    val mutableMap = mutableMapOf("one" to 1.1, "two" to 2.2, "three" to 3.3)

    //Add a new key-value pair "four" to 4.4 to the mutable map
    mutableMap["four"] = 4.4

    //. Remove the key "two" from the mutable map.
    mutableMap.remove("two")

    //. Use a loop to iterate through the mutable map and print each
    //key-value pair using forEach
    mutableMap.forEach { (key, value) ->
        println("Out of map key = $key value = $value ")
    }

    //Sort the mutable map by key in ascending order and print the
    //sorted map
    val sorting = mutableMap.toSortedMap()
    println("Sorting map by key $sorting")
}


fun createASet() {
    //Declare an immutable Set of integers with the values [1, 2, 3, 4,5].
    val immutableSet = setOf(1, 2, 3, 4, 5)

    //1.2. Use a loop to iterate through the set and print each value
    for (indexSet in immutableSet)
        println("print immutableSet = $immutableSet")


    //Check if the set contains the value 3 using the contains
    //operator and print the resul
    val contains = immutableSet.contains(3)
    println("set contains 3 = $contains")


}

fun createMutableSet() {
    //Declare a MutableSet of strings with the values ["apple", "banana", "cherry"]
    val mutableSet = mutableSetOf("apple", "banana", "cherry")

    //. Add the value "date" to the mutable set
    mutableSet.add("date")

    //Remove the value "banana" from the mutable set
    mutableSet.remove("banana")

    // Use a loop to iterate through the mutable set and print each
    //value using forEach.
    mutableSet.forEach { value ->
        println("Mutable set is = $value")
    }

    //Convert the mutable set to a sorted list and print the sorted
    //list
    val sortedList = mutableSet.sorted().toList()
    println("sorted list is = $sortedList")


}


fun workingWithPairs() {
    // Declare a Pair of a string and an integer with the values ("apple", 5).
    val dPair = "apple" to 5

    //Access the first and second elements of the pair and print them
    println("pair first ${dPair.first} and pair second ${dPair.second} ")

    //Create a list of pairs with the values [("one", 1), ("two", 2), ("three", 3)]
    val listPair = listOf("one" to 1, "two" to 2, "three" to 3)

    //. Use a loop to iterate through the list of pairs and print each pair
    for (index in listPair)
        println("pair of first = ${index.first} , pair of second = ${index.second}")


}

fun workingWithTriples() {
    //Declare a Triple of a string, an integer, and a double with the values ("apple", 5, 1.1)
    val dTriple = Triple("apple", 5, 1.1)

    //. Access the first, second, and third elements of the triple and
    //print them.
    println("triple of first = ${dTriple.first} , triple of second = ${dTriple.second} ,  triple of third = ${dTriple.third}")

    //Create a list of triples with the values [("one", 1, 1.1), ("two", 2, 2.2), ("three", 3, 3.3)].
    //Use a loop to iterate through the list of triples and print each triple
    listOf(
        Triple("one", 1, 1.1), Triple("two", 2, 2.2), Triple("three", 3, 3.3)
    ).forEach {
        println("triple of first = ${it.first} , triple of second = ${it.second} ,  triple of third = ${it.third}")
    }


}


fun handlingDuplications() {
    //Declare a List of integers with the values [1, 2, 3, 2, 4, 5, 3, 6, 1]
    val dList = listOf(1, 2, 3, 2, 4, 5, 3, 6, 1)

    //Create a MutableList to store duplicated elements
    val duplicates = mutableListOf<Int>()

    //Use a loop to iterate through the list and add any element that
    val seen = mutableSetOf<Int>()
    for (number in dList) {
        if (number in seen && number !in duplicates) {
            duplicates.add(number)
        } else {
            seen.add(number)
        }
    }

    //Print the MutableList of duplicated elements
    println("Duplicated elements: $duplicates")


    //Remove Duplications Using Set
    // Convert the original list to a Set to remove all duplications.
    val toSet = dList.toSet()
    println("remove all duplications. = $toSet")

    // Convert the Set back to a list
    // Print the list after removing duplication
    val toList = toSet.toList()
    println("Back to List and remove duplication = $toList")


}
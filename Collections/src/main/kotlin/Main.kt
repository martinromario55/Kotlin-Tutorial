fun main() {
//    Collections are group of objects stored together in a single varialble
//    List, Set, Map
//    Immutable collections, Mutable collections

//    Lists
//    val names = listOf("Mathew", "Mark", "Luke", "John") //Immutable List

//    val names = mutableListOf("Mathew", "Mark", "Luke") //Mutable List
//    names.add("John")
//    names.removeAt(0)
//    names.forEach{ println(it) }

//    Sets
//    val names = setOf("Mathew", "Mark", "Luke", "John", "Mark") //  Immutable Set
//    names.forEach { println(it) }

//    val names = mutableSetOf("Mathew", "Mark", "Luke", "John", "Mark") //  Mutable Set
//    names.add("Job")
//    names.forEach { println(it) }

//    Maps
//    val users = mapOf(1 to "Maria", 2 to "Alex", 3 to "John") //    Immutable Map
//    println(users[1])

    val users = mutableMapOf(1 to "Maria", 2 to "Alex", 3 to "John") //    Mutable Map
    users[4] = "James"
    users[5] = "Abby"
    users.remove(4)
    users.forEach { t, u ->
        println("$t and $u")
    }
}
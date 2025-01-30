fun main() {
//    val numbers = setOf(1,2,3,4,5)
////    println(numbers.map { it * 10 })
//    println(numbers.map { if (it == 3) it * 100 else it * 10 })
//
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
//    println(numbersMap.mapKeys { it.key.uppercase() })
//    println(numbersMap.mapValues { it.value + it.key.length })

//    Zipping
//    val colors = listOf("red", "blue", "green")
//    val animals = listOf("fox", "bear", "wolf")
////    println(colors.zip(animals))
//    println(colors.zip(animals){
//        color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
//    })
//    unZip
//    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//    println(numberPairs.unzip())

//    Association
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length }) // Associate With
//    println(numbers.associateBy { it.first().uppercase() }) //  Associate By

//    Flatten
//    val numbersSets = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
//    for (numbers in numbersSets) {
//        for (number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }
//    val numbersFlatten = numbersSets.flatten()
//    println(numbersFlatten)

//    String Representation
//    val numberStrings = listOf("one", "two", "three", "four")
//    println(numberStrings.joinToString())
//
//    val listString = StringBuffer("The list of numbers: ")
//    println(numberStrings.joinTo(listString))
//    println(numberStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString(limit = 15, truncated = "<...>")) //   Truncate

//    Filtering
//    val numbers = listOf("One", "Two", "Three", "Four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3)
//
//    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
//    val filterMap = numberMap.filter { it.key.endsWith("1") && it.value > 100 }
//    println(filterMap)
//
//    val filteredIndex = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
//    println(filteredIndex)
//
//    val filteredNot = numbers.filterNot { it.length <= 3 }
//    println(filteredNot)
//
//    val mixedList = listOf(1,2,3,4,'A', 'B', 'C', "Hello World", "Alex", false)
//    mixedList.filterIsInstance<Char>().forEach{
//        println(it)
//    }

//    Partition Filter
//    val (match, rest) = numbers.partition { it.length > 3 }
//    println(match)
//    println(rest)

//    Testing Predicate
//    println(numbers.any{it.endsWith("e")})
//    println(numbers.none { it.endsWith("w") })
//    println(numbers.all { it.length > 1 })

//    + and - Operators
//    val numbers = mutableListOf("One", "Two", "Three", "Four")
//    val plusList = numbers + "Five"
//    println(plusList)
//
//    val minusList = numbers - mutableListOf("Three", "Four")
//    println(minusList)

//    Grouping
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.groupBy { it.first().uppercase() })
//    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))

//    Slice
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(1..3))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3,5,0)))

//    Take and Drop
//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))

//    Take and Drop While...
//    println(numbers.takeWhile { !it.startsWith("f") })
//    println(numbers.takeLastWhile { it != "three" })
//    println(numbers.dropWhile { it.length == 3 })
//    println(numbers.dropLastWhile { it.contains("i") })

//    Chunked
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3) {it.sum()})

//    Windowed
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.windowed(3))

//    Filter Functions
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.elementAt(3))
//    println(numbers.first())
//    println(numbers.last())
//
//    println(numbers.first {it.length > 3})
//    println(numbers.last {it.startsWith("f")})
//    println(numbers.random())
//    println(numbers.isEmpty())

//    Aggregate Operations
//    val numbers = listOf(6,10,14,4,100)
//    println("The sum is ${numbers.sum()}")
//    println("The count is ${numbers.count()}")
//    println("The average is ${numbers.average()}")
//    println("The max is ${numbers.maxOrNull()}")
//    println("The min is ${numbers.minOrNull()}")
//    println("The sum is: ${numbers.sumOf { it * 2 }}")

//    Ordering
//    val numbers = mutableListOf(2,4,1,5,40,20,100,60)
//    numbers.sorted().forEach { println(it) }
//
//    val laptops = mutableListOf(
//        Laptop("Dell", 2021,8,600),
//        Laptop("Acer", 2020, 4, 800),
//        Laptop("Apple", 2022, 16, 1000)
//    )
//
//    laptops.sorted().forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(compareBy{it.price}).forEach { println(it) } // Creates Comparator using lambda internally
//    println("\n")
//    laptops.sortedBy { it.ram }.forEach { println(it) } //  Creates comparator internally

//    Binary Search
//    println(searchElement(27, mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)))

//    Generic
    val ronaldo = FootballPlayer("Ronaldo")
    val rooney = FootballPlayer("Rooney")

    val oconnor = BaseballPlayer("O'Connor")
    val yankee = BaseballPlayer("Yankee")

    val manUtd = Team<FootballPlayer>("Manchester United", mutableListOf(rooney))
    manUtd.addPlayers(ronaldo)

    val nyYankees = Team("New York Yankees", mutableListOf(oconnor))
    nyYankees.addPlayers(yankee)
}

class Team<T>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        } else {
            players.add(player)
            println("Player: ${(player as Player).name} was added in the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)

private fun searchElement(searchedElement: Int, numbers: MutableList<Int>): Int {
//    Linear iteration
//        var i = 0
//    for (number in numbers) {
//            i++
//            println("Searched number: $i")
//        if (number == searchedElement) {
//            return number
//        }
//    }
//    return -1

//    Binary Iteration
//    var low = 0
//    var high = numbers.size - 1
//
//    var i = 0
//
//    while (low <= high) {
//        i++
//        println("Searched number: $i")
//        val mid = (low + high) / 2
//        val cmp = numbers[mid].compareTo(searchedElement)
//
//        if (cmp < 0) {
//            low = mid + 1
//        } else if (cmp > 0) {
//            low = mid - 1
//        } else {
//            return numbers[mid]
//        }
//    }
//    return -1

//    Binary Search Short format
    return numbers[numbers.binarySearch(27)]
}

//data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int): Comparable<Laptop> {
//    override fun compareTo(other: Laptop): Int {
//        return if (this.price > other.price) {
//            1
//        } else if (this.price < other.price) {
//            -1
//        } else {
//            0
//        }
//    }
//
//}
//
//class ComparatorRam: Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.ram > laptop2.ram) {
//            return 1
//        } else if (laptop1.ram < laptop2.ram) {
//            return -1
//        } else {
//            return 0
//        }
//    }
//
//}
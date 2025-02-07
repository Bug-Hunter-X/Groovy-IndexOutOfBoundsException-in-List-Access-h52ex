def list = [1, 2, 3, 4, 5]

// Solution 1: Using the Elvis operator
println list[5] ?: "Index out of bounds"

// Solution 2: Checking the index
if (5 < list.size()) {
    println list[5]
} else {
    println "Index out of bounds"
}

//Solution 3: Using the get method with a default value
println list.get(5, "Index out of bounds") 
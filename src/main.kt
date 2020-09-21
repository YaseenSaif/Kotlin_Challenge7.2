
data class User(val name: String, val age: Int)
class Manager(name: String,age: Int) {
    var name =name;
    var age=age;
}
fun main(args: Array<String>) {
    println("in data class the compiler automatically generates:\n" +
            "copy() function, equals() and hashCode() pair, and toString() form of the primary constructor " +
            "as will be shown in the examples below:")
    println()
    //creating objects of  data class
    val u1 = User("Yaseen", 24)
    val u2 = u1.copy() //using copy function to create a data class object
    val u3 = User("Ahmed",35)

    //creating objects of  normal class
    val m1 = Manager("khaled", 55)
    val m2 = Manager("khaled", 55)
    val m3 = Manager("monef", 33)


    //in data class The toString() function returns a string representation of the object.
    println("toString function with data class object :${u1.toString()}")
    println("toString function with normal class object :${m1.toString()}")

    println("hashcode of data class objects")
    println("u1 hashcode = ${u1.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")

    println("hashcode of normal class objects")
    println("u1 hashcode = ${m1.hashCode()}")
    println("u2 hashcode = ${m2.hashCode()}")
    println("u3 hashcode = ${m3.hashCode()}")

    println("comparing between data class objects using equal to function")
    if (u1.equals(u2) == true)
        println("u1 is equal to u2.")
    else
        println("u1 is not equal to u2.")
    if (u1.equals(u3) == true)
        println("u1 is equal to u3.")
    else
        println("u1 is not equal to u3.")

    println("comparing between normal class objects using equal to function")
    if (m1.equals(m2) == true)
        println("m1 is equal to m2.")
    else
        println("m1 is not equal to m2.")
    if (m1.equals(m3) == true)
        println("m1 is equal to m3.")
    else
        println("m1 is not equal to m3.")

    println("destructure an object of data class into a number of variables using componentN() method")
    val name = u1.component1()
    val age = u1.component2()
    println("name = $name")
    println("age = $age")
}
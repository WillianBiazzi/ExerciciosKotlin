// Defina a interface Animal com o método makeSound
interface Animal {
    fun makeSound(): String
}

// Implemente a interface Animal na classe Dog
class Dog : Animal {
    override fun makeSound(): String {
        return "Woof! Woof!"
    }
}

// Implemente a interface Animal na classe Cat
class Cat : Animal {
    override fun makeSound(): String {
        return "Meow! Meow!"
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    println("O cachorro faz o som: ${dog.makeSound()}")
    println("O gato faz o som: ${cat.makeSound()}")
}

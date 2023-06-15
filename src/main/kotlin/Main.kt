fun main() {
    val student = Student("Lucky Wangari", 18, listOf(80, 70, 90, 85, 75))

    student.displayInformation()

    val averageGrade1 = student.AverageGrade()
    println("Average Grade: $averageGrade1")

    val hasPassed = student.hasPassed()
    println("$hasPassed")

}

//Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

class Product(var name: String, var price: Int, var quantity: Int){
    fun totalValue(){
        var final = price * quantity
        println(final)
    }
}
//6. Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.
class Student(val name: String, val age: Int, val grades: List<Int>): {
    fun AverageGrade(): Double {
        val sum = grades.sum()
        return sum.toDouble() / grades.size
    }

    fun displayInformation() {
        println("Name: $name")
        println("Age: $age")
        println("Grades: $grades")
    }

    fun hasPassed(): {
        if (grades >= 60) {
            println("$name has passed")
        }else{
            println("$name Has faile")
        }
    }

//Create a FlightBooking class that represents a flight booking system. Implement
//methods to search for available flights based on destination and date, reserve
//seats for customers, manage passenger information, and generate booking
//confirmations.

    //**African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.
    open class Recipe(val name: String, val ingredients: List<String>, val preparation: String, val cooking: String,

                      ) {
        open fun cook() {
            println("Cooking $name...")

        }
    }

    class MoroccanRecipe(name: String, ingredients: List<String>, preparation: String, cooking: String, val spice: String
    ) : Recipe(name, ingredients, preparation, cooking) {
        override fun cook() {
            val food = "roti"
            println(food)
        }
    }

    class EthiopianRecipe(name: String, ingredients: List<String>, preparation: Int, cooking: String, nutrition: Map<String, String>,
    ) : Recipe(name, ingredients, preparation, cooking) {
        override fun cook() {
            val food3 = "shiru"
            println(food3)
        }

    }


    class NigerianRecipe(name: String, ingredients: List<String>, preparation: String, cooking: String, nutrition: Map<String, String>, val difficultyLevel: String
    ) : Recipe(name, ingredients, preparation, cooking) {
        override fun cook() {
            var food4 = "fufu"
            println(food4)
        }

    }
}











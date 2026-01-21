/**
 * Это класс Car, создан для задания 1.
 */
class Car {
    var model: String = "Mercedes"
    var color: String = "Black"
    var year: Int = 2005
    fun drive () {
        println("Машина марки $model, цветом $color и годом выпуска $year начала движение")
    }
}

/**
 * Это enum класс DayOfWeek, создан для задания 2.
 */
enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

/**
 * Это объект Singleton, создан для задания 3.
 */
object Singleton {
    fun printMessage() {
        println("Всем ку")
    }
}

/**
 * Это класс Person, создан для задания 4 и 5.
 */
class Person {
    var name: String = ""
        set(value) {
            println("Значение свойства name теперь - $value")
            field = value
        }
        get() {
            println("Получаем имя $field")
            return field
        }
    var age: Int = 0
        set(value) {
            if (value < 0) {
                println("Возраст не может быть отрицательным")
            } else {
                println("Значение свойства age теперь - $value")
                field = value
            }
        }
        get() {
            if (field > 0) {
                println("Получаем возраст $field")
            } else {
                println("Возраст не указан")
            }
            return field
        }

    // функции для 4 задания
    fun getName() {
        println("Имя этого человека: $name")
    }

    fun getAge() {
        println("Возраст этого человека: $age")
    }
}

/**
 * Это класс Animal, создан для задания 6.
 */
open class Animal {
    open fun makeSound(){
        println("Это животное издает такой-то звук")
    }
}

/**
 * Это класс Dog, который наследует класс Animal
 */
class Dog : Animal() {
    override fun makeSound() {
        println("Собака гавкает")
    }
}

/**
 * Это класс Cat, который наследует класс Animal
 */
class Cat : Animal() {
    override fun makeSound() {
        println("Кошка мяукает")
    }
}

/**
 * Это класс MathUtils, создан для задания 7.
 */
class MathUtils {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

/**
 * Это абстрактный класс Shape, создан для задания 8.
 */
abstract class Shape {
    abstract fun area (): Double
}

/**
 * Это класс Circle, наследник Shape и реализовавывает метод area().
 */
class Circle(var r: Double, var pi: Double = 3.14) : Shape() {
    override fun area(): Double {
        return pi * r * r
    }
}

/**
 * Это класс Rectangle, наследник Shape и реализовавывает метод area().
 */
class Rectangle (var x: Double, var y: Double) : Shape() {
    override fun area(): Double {
        return x * y
    }
}

/**
 * Это интерфейс Flyable, создан для задания 9.
 */
interface Flyable {
    fun fly(): String
}

/**
 * Это интерфейс Navigable, создан для задания 9.
 */
interface Navigable {
    fun navigate(): String
}

/**
 * Это класс Bird, который реализует интерфейсы Flyable и Navigable и переопределяет их методы.
 */
class Bird : Flyable, Navigable {
    override fun fly(): String {
        return "Птица взлетела"
    }

    override fun navigate(): String {
        return "Птица полетела на юг"
    }
}

/**
 * Это класс Airplane, который реализует интерфейсы Flyable и Navigable и переопределяет их методы.
 */
class Airplane : Flyable, Navigable {
    override fun fly(): String {
        return "Самолет взлетел"
    }

    override fun navigate(): String {
        return "Автопилот повел самолет в Сочи"
    }
}

/**
 * Это data класс User, создан для задания 10.
 */
data class User (val username: String, val age: Int) {
    fun printInfo (): String {
        return "Ник пользователя - $username, возраст - $age"
    }
}

/**
 * Это sealed класс MathOperation, создан для задания 11.
 */
sealed class MathOperation {
   abstract fun operation(a: Int, b: Int): Int
}

/**
 * Это объект Add, используется для сложения 2 чисел
 */
object Add : MathOperation() {
    override fun operation(a: Int, b: Int): Int {
        return a + b
    }
}

/**
 * Это объект Subtract, используется для вычитания 2 чисел
 */
object Subtract : MathOperation() {
    override fun operation(a: Int, b: Int): Int {
        return a - b
    }
}

/**
 * Это объект Multiply, используется для умножения 2 чисел
 */
object Multiply : MathOperation() {
    override fun operation(a: Int, b: Int): Int {
        return a * b
    }
}

/**
 * Это объект Divide, используется для деления 2 чисел
 */
object Divide : MathOperation() {
    override fun operation(a: Int, b: Int): Int {
        return a / b
    }
}

/**
 * Это функция mathOperation, получает название операции и числа, над которыми нужно ее выполнить
 */
fun mathOperation(operation: MathOperation, a: Int, b: Int): Int  {
    return operation.operation(a, b)
}


/**
 * Это класс Mammal, создан для задания 12
 */
class Mammal {
    fun breastfeed(): String {
        return "Что-то делается в функции breastfeed"
    }
}

/**
 * Это класс CanFly, создан для задания 11
 */
class CanFly {
    fun fly(): String {
        return "Что-то делается в функции fly"
    }
}

/**
 * Это класс Bat, который сочетает в себе поведение классов CanFly и Mammal
 */
class Bat {
    private var mammal: Mammal = Mammal()
    private var canFly: CanFly = CanFly()

    fun performFeed(): String {
       return  mammal.breastfeed()
    }

    fun performFly(): String {
       return canFly.fly()
    }
}

/**
 * Это класс Engine, создан для задания 13
 */
class Engine {
    fun seeEngine() {
        println("У этого автомобиля такой-то двигатель")
    }
}

/**
 * Это класс Tires, создан для задания 13
 */
class Tires {
    fun changesTires() {
        println("Шины заменены")
    }
}
/**
 * Это класс Car2, который получает Engine и Tires через конструктор
 */
class Car2 (val engine: Engine, val tires: Tires) {
    fun maintenance() {
        engine.seeEngine()
        tires.changesTires()
        println("Техническое обслуживание произведено")
    }
}

/**
 * Это обобщенный интерфейс Repository<T>, создан для задания 14
 */
interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

/**
 * Это класс UserRepository, который реализует интерфейс Repository<T>
 */
class UserRepository: Repository<User> {
    private var users = mutableListOf<User>()

    override fun save(item: User) {
        users.add(item)
        println("Добавлен элемент: $item")
    }

    override fun delete(item: User) {
        users.remove(item)
        println("Удален элемент: $item")
    }

    override fun getAll(): List<User> {
        return users
    }
}

fun main() {
    /* Задание 1: Создайте класс Car с полями model, color, year и методом drive().
    Создайте несколько объектов этого класса и вызовите их метод drive().
     */
    println("Задание 1: класс Car")
    val newCar = Car().apply {
        model = "Porsche"
        color = "White"
        year = 2025
    }
    val oldCar = Car().apply {
        model = "BMW"
        color = "Blue"
        year = 1998
    }
    newCar.drive()
    oldCar.drive()
    println()
    println()

    /* Задание 2: Создайте enum class DayOfWeek, содержащий все дни недели.
    Выведите все дни недели, используя свойства values и name этого enum.
     */
    println("Задание 2: enum class DayOfWeek")
    print("Вывод всех дней недели:")
    for (day in DayOfWeek.entries) { //заменила values() на entries, по совету ide (вывод не изменился)
        print(" ${day.name}")
    }
    println()
    println()

    /* Задание 3: Создайте объект Singleton с методом printMessage(), который выводит любое сообщение.
    Вызовите этот метод.
     */
    println("Задание 3: объект Singleton")
    Singleton.printMessage()
    println()
    println()

    /* Задание 4: Создайте класс Person с приватными свойствами name, age и
    публичными методами getName() и getAge().
    Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
     */
    println("Задание 4: класс Person")
    val men = Person()
    // println("Попытка вызова приватного свойства класса: ${men.name}")
    // ide подсвечивает красным и падает в ошибку при сборке, поэтому закомментила строку 87
    println()
    println()

    /* Задание 5: В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
    Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
    Например, вы можете реализовать проверку возраста в сеттере, чтобы убедиться,
    что возраст неотрицательный.
     */
    println("Задание 5: кастомные геттеры и сеттеры")
    val girl = Person()
    girl.name = "Инна"
    girl.age = -5
    println(girl.name)
    println(girl.age)

    /* Задание 6: Создайте класс Animal с методом makeSound(), затем создайте классы Dog и Cat,
    наследующие от Animal, и переопределите метод makeSound().
    Создайте объекты Dog и Cat и вызовите их методы makeSound().
     */
    println("Задание 6: наследование класса")
    val corgi = Dog()
    corgi.makeSound()
    val mainecoon = Cat()
    mainecoon.makeSound()
    println()
    println()

    /* Задание 7: Создайте класс MathUtils и перегрузите функцию add(),
    чтобы она могла принимать два или три целых числа.
     */
    val sum = MathUtils()
    println("Задание 7: перегрузка функции")
    println("Вызов функции add с 2 параметрами. Сумма равна ${sum.add(2,3)}")
    println("Вызов функции add с 3 параметрами. Сумма равна ${sum.add(2,3, 4)}")
    println()
    println()

    /* Задание 8: Создайте абстрактный класс Shape с абстрактным методом area(),
    затем создайте классы Circle и Rectangle, реализующие этот метод.
    Создайте объекты Circle и Rectangle и выведите их площадь.
     */
    println("Задание 8: абстрактный класс Shape")
    val circle = Circle(5.2)
    val rectangle = Rectangle(3.0, 2.5)
    println("Площадь круга = ${circle.area()}")
    println("Площадь прямоугольника = ${rectangle.area()}")
    println()
    println()

    /* Задание 9: Создайте интерфейс Flyable с методом fly() и интерфейс Navigable  с методом navigate(),
    затем создайте классы Bird и Airplane, реализующие эти интерфейсы.
    Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().
     */
    println("Задание 9: интерфейсы Flyable и Navigable")
    val bird = Bird()
    val airplane = Airplane()
    println("${bird.fly()}. ${bird.navigate()}")
    println("${airplane.fly()}. ${airplane.navigate()}")
    println()
    println()

    /* Задание 10: Создайте data class User с двумя свойствами и методом printInfo(),
    который выводит информацию о пользователе. Создайте объект User и вызовите его метод printInfo().
     */
    println("Задание 10: data class User")
    val player = User("Картошка", 45)
    println(player.printInfo())
    println()
    println()

    /* Задание 11: Создайте sealed class MathOperation и несколько объектов,
    представляющих различные математические операции (например, Add, Subtract, Multiply, Divide).
    Создайте функцию, которая принимает MathOperation и два числа, и выполняет соответствующую операцию.
     */
    println("Задание 11: sealed class MathOperation")
    println("Результат сложения чисел 3 и 8: " +
            "${mathOperation(Add, 3, 8)}")
    println()
    println()

    /* Задание 12: Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(),
    а в классе CanFly - метод fly(). Затем создайте класс Bat,
    который сочетает в себе оба этих поведения (с помощью композиции).
     */
    println("Задание 12: композиция")
    val bat = Bat()
    println(bat.performFly())
    println(bat.performFeed())
    println()
    println()

    /* Задание 13: Создайте классы Engine и Tires. Затем создайте класс Car,
    который получает Engine и Tires через конструктор (Dependency Injection).
     */
    println("Задание 13: Dependency Injection")
    val myCar = Car2(Engine(), Tires())
    myCar.maintenance()
    println()
    println()

    /* Задание 14: Создайте обобщенный интерфейс Repository<T>,
    который содержит методы для сохранения (save(item: T)), удаления (delete(item: T)) и
    получения всех элементов (getAll(): List<T>).
    Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
     */
    println("Задание 14: обобщенный интерфейс")
    val people = UserRepository()
    people.save(User("User1", 1))
    people.save(User("User2", 2))
    people.delete(User("User1", 1))
    println("Вывод списка юзеров после добавления и удаления: ${people.getAll()}")


}
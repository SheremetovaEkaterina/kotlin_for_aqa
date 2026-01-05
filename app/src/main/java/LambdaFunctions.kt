

class Persons (val name: String, val age: Int)
data class Auto (val make: String, val model: String, val year: Int)


fun main () {
    /* Задание 1: Создайте список чисел от 1 до 10, затем используйте метод filter
     чтобы оставить только четные числа. После этого используйте метод map
     чтобы умножить каждое число на 2.
     */
    println("Задание 1: четные из списка от 1 до 10 + их умножение на 2")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.filter{it % 2 == 0}.map{it * 2})
    println()
    println()

    /* Задание 2: Создайте список строк [“один”, “два”, “три”, “четыре”, “пять”].
    Используйте map чтобы получить длину каждого элемента списка.
     */
    println("Задание 2: поиск длины каждого элемента списка")
    val words = listOf("один", "два", "три", "четыре", "пять")
    println("Список: $words")
    println("Длина каждого элемента соответственно: ${words.map{it.length}}")
    println()
    println()

    /* Задание 3:  Напишите функцию высшего порядка, которая принимает два параметра:
    целое число и функцию, принимающую целое число и возвращающую строку.
    Эта функция должна преобразовывать число в строку с помощью переданной функции и
    возвращать результат.
     */
    println("Задание 3: функция высшего порядка")
    fun conversation (a: Int, operation: (Int) -> String): String {
        return operation(a)
    }

    fun intToString (num: Int): String {
        return num.toString()
    }

    val result = conversation(10, ::intToString)
    println(result)
    println("Результат является строкой? ${result is String}")
    println()
    println()

    /* Задание 4: Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
    Используйте эту лямбда-функцию в другой функции, которая принимает число и возвращает строку,
    состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
     */
    println("Задание 4: лямбда-фукнкция")
    val square: (Int) -> Int = {a -> a * a}
    fun squareToString (a: Int, operation: (Int) -> Int): String {
        return "$a и его квадрат равен ${operation(a)}"
    }
    println(squareToString(4, square))
    println()
    println()

    /* Задание 5: Создайте объект класса Person со свойствами name и age.
    Создайте список из нескольких таких объектов.
    Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
     */
    println("Задание 5: вывод имен людей, которым больше 18 лет")
    val listPersons = mutableListOf<Persons>()
    listPersons.add(Persons("Иван", 15))
    listPersons.add(Persons("Антон", 40))
    listPersons.add(Persons("Ангелина", 12))
    listPersons.add(Persons("Инна", 32))
    println(listPersons.filter{it.age > 18}.map {it.name})
    println()
    println()

    /* Задание 6: Используя ленивые операции, создайте последовательность чисел от 1 до 1000,
    затем используйте filter чтобы оставить только числа, делящиеся на 5,
    затем map чтобы умножить каждое число на 2, и
    take чтобы взять первые 20 элементов этой последовательности.
     */
    println("Задание 6: вывод первых 20 элементов от 1 до 1000, делящихся на 5 и умноженных на 2")
    val sequence = (1..1000).asSequence()
        .filter { it % 5 == 0 }
        .map { it * 2 }
        .take(20)
    println(sequence.toList())
    println()
    println()

    /* Задание 7: Создайте класс Car с полями make, model и year.
    Создайте коллекцию из нескольких объектов этого класса и используйте groupBy
    чтобы сгруппировать машины по году выпуска.
     */
    println("Задание 7: группировка машин по году выпуска")
    val listCars = mutableListOf<Auto>()
    listCars.add(Auto("BMW", "X5", 2020))
    listCars.add(Auto("Toyota", "Camry", 2023))
    listCars.add(Auto("Mercedes-Benz", "C-Class", 2020))
    listCars.add(Auto("Audi", "A4", 2018))
    println(listCars.groupBy { it.year})
    println()
    println()

    /* Задание 8: Создайте переменную lazyValue типа String, инициализируемую лениво.
    Проверьте, что инициализация действительно происходит только при первом обращении к переменной.
     */
    println("Задание 8: переменная lazyValue типа String")
    val lazyValue: String by lazy {
        println("Инициализация при первом обращении")
        "Шнейне фа"
    }
    println("Первое обращение к переменной:")
    println(lazyValue)
    println("Второе обращение к переменной:")
    println(lazyValue)
    println()
    println()

    /* Задание 9: Создайте функцию высшего порядка calculate,
    которая принимает два целых числа и функцию операции.
    Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
     */
    println("Задание 9: функция высшего порядка calculate")
    fun calculate (a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    val add: (Int, Int) -> Int = {a, b -> a + b}
    val subtraction: (Int, Int) -> Int = {a, b -> a - b}
    val multiplication: (Int, Int) -> Int = {a, b -> a * b}
    println("Сумма чисел 4 и 2399 равна ${calculate(4,2399, add)}")
    println("Разность чисел 4 и 2399 равна ${calculate(4,2399, subtraction)}")
    println("Произведение чисел 4 и 2399 равно ${calculate(4,2399, multiplication)}")
    println()
    println()

    /* Задание 10: Создайте коллекцию чисел и используйте fold или reduce чтобы посчитать их сумму,
    минимальное и максимальное значения.
     */
    println("Задание 10: сумма чисел коллекции, минимальное и максимальное значения")
    val listNumbers = listOf(8, 4,  2, 5, 10, 7, 6, 1, 3)
    val sum = listNumbers.reduce { acc, i -> acc + i }
    val max = listNumbers.reduce { acc, i -> if (i > acc) i else acc }
    val min = listNumbers.reduce { acc, i -> if (i < acc) i else acc }
    println("Сумма чисел коллекции: $sum")
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}
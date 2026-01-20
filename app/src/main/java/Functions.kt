fun main () {
    /*Задание 1:
    Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов и
    возвращает наибольшее число. Затем, используйте эту функцию
    для поиска максимального числа из двух разных пар чисел.
     */
    println("Задание 1: Функция maxOfTwo")
    fun maxOfTwo (one: Int, two: Int): Int {
        return if (one >= two) one else two
    }
    val a = 2
    val b = 5
    val x = 7
    val y = 1
    println("Наибольшее число из двух пар ($a, $b) и ($x, $y): " +
            "${maxOfTwo(maxOfTwo(a, b), maxOfTwo(x, y))}")
    println()
    println()

    /*Задание 2:
    Создайте функцию sayHello, которая принимает строковый аргумент name и
    возвращает приветственное сообщение. Функция должна иметь параметр по умолчанию "мир".
    Затем вызовите функцию дважды: с именем и без имени.
     */
    println("Задание 2: Функция sayHello")
    fun sayHello(name: String = "мир"): String {
        return "Привет, $name"
    }
    println("Вызов функции с именем: ${sayHello("Kotlin")}")
    print("Вызов функции без имени: ${sayHello()}")
    println()
    println()

    /*Задание 3:
    Создайте инфиксную функцию isGreater, которая принимает два числа и возвращает true,
    если первое число больше второго, и false в противном случае.
    Затем используйте эту функцию, сравнив две пары чисел.
     */
    println("Задание 3: Функция isGreater")
    infix fun Int.isGreater(other: Int): Boolean {
        return this > other
    }
    println("Первое число больше второго в паре ($a, $b)? ${a isGreater b}") // переменные из задания 1
    println("Первое число больше второго в паре ($x, $y)? ${x isGreater y}") // переменные из задания 1
    println()
    println()

    /*Задание 4:
    Создайте рекурсивную функцию generateSequence,
    которая принимает целое число n и генерирует последовательность чисел от 1 до n.
    Используйте аннотацию tailrec для оптимизации.
    */
    println("Задание 4: Рекурсивная функция generateSequence")
    tailrec fun generateSequence(n: Int, result: Array<Int> = arrayOf()): Array<Int> {
        val sequence = arrayOf(n) + result
        return if (n == 1) sequence else generateSequence(n - 1, sequence)
    }
    // не знаю, что использовать лучше, поэтому оставлю и 2й вариант
    tailrec fun generateSequence2(n: Int, result: MutableList<Int> = mutableListOf()): MutableList<Int> {
        result.add(0,n)
        return if (n == 1) result else generateSequence2(n - 1, result)
    }
    println("Последовательность чисел от 1 до $x: ${generateSequence(x)}")
    println()
    println()

    /*Задание 5:
    Создайте список имен и используйте функции let, run, also, apply и with
    для выполнения различных операций над этим списком
    (например, добавьте имя, удалите имя, переверните список и т. д.).
     */
    println("Задание 5: функции let, run, also, apply и with")
    var names = mutableListOf("Ваня", "Петя", "Глаша", "Андрей", "Дуня")
    println("Исходный список имен: $names")
    names.let {
        it.add("Антон")
        println("Список имен после добавления нового: $it")
    }
    names.run {
        remove("Петя")
        println("Список имен после удаления одного: $this")
    }
    names
        .reversed()
        .also { println("Список имен в обратном порядке: $it") }
    names
        .shuffled()
        .apply { println("Список имен после перемешивания: $this") }
    with (names) {
        set(0, "Антонина") // это применяется к names до сортировки и перемешивания
        println("Список имен после замены первого имени: $this")
    }
}
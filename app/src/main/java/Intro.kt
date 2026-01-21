/**
 * Это функция main.
 * В ней содержатся решения заданий 2 - 5 блока "Введение в Kotlin"
 */

fun main() {
    /* Задание 2: “Hello world”
    Создайте первую программу на Kotlin, которая выводит “Hello, world!” в консоль.
    */
    println("Задание 2:")
    println("Hello, World!")
    println() // используется для визуального разделения заданий в консоли
    println()

    /* Задание 3: Работа с переменными
    Создайте несколько переменных разных типов (например, Int, String, Boolean).
    Присвойте им значения и выведите результаты на экран.
    Попробуйте изменить значения этих переменных и снова выведите результаты.
     */
    var num = 8
    var name = "Kate"
    var isFemale = true
    println("Задание 3:")
    println("Начальные значения переменных")
    println("num = $num")
    println("name = $name")
    println("isFemale = $isFemale")
    println()

    isFemale = false
    name = "Ivan"
    num = 10
    println("Обновленные значения")
    println("num = $num")
    println("name = $name")
    println("isFemale = $isFemale")
    println()
    println()

    /* Задание 4: Работа с операторами
    Напишите простые выражения с использованием различных операторов Kotlin
    (арифметические, сравнения, логические). Выведите результаты на экран.
     */
    println("Задание 4:")
    println("Арифметические операторы")
    val a = 21
    val b = 5
    println("$a * $b = ${a * b}")
    println("$a + $b = ${a + b}")
    println("$a / $b = ${a / b}")
    println("$a - $b = ${a - b}")
    println("$a % $b = ${a % b}")

    var counter = 0
    println("counter = $counter")
    counter++
    println("counter++ = $counter")
    counter--
    println("counter-- = $counter")
    println()

    println("Операторы сравнения")
    println("$a > $b = ${a > b}")
    println("$a < $b = ${a < b}")
    println("$a >= $b = ${a >= b}")
    println("$a <= $b = ${a <= b}")
    println("$a != $b = ${a != b}")
    println()

    println("Логические операторы")
    val c = 25
    println("($a > $b) && ($a < $c) = ${(a > b) && (a < c)}")
    println("($a < $b) || ($a < $c) = ${(a < b) || (a < c)}")
    println("!($a > $b) = ${!(a > b)}")
    println()
    println()

    /* Задание 5: Комментарии и стандартный ввод/вывод
    Добавьте комментарии к коду в ваших предыдущих заданиях.
    Используйте и однострочные, и комментарии документации.
    Создайте новую программу, которая запрашивает у пользователя ввод из консоли,
    сохраняет его в переменную и затем выводит эту переменную на экран.
     */
    println("Введи хайп фразу") // примеры фраз - "вряд ли / седня не / 50 на 50"
    val phrase = readLine()
    println("Твой ответ: $phrase")

}
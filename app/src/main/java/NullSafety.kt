/**
 * кастомное исключение на некорректный ввод пользователя
 */
class InvalidUserInputException(message: String): Exception(message)

/**
 * Функция проверки соответствия возраста диапазону от 18 до 99 включительно. При не соответствии
 * прокидывается кастомное исключение
 */
fun checkAge (age: Int) {
    if (age < 18) {
        throw InvalidUserInputException("Ошибка! Возраст должен быть от 18 лет")
    }
    else if (age > 99) {
        throw InvalidUserInputException("Ошибка! Возраст должен быть до 99 лет")
    }
}

/**
 * Функция проверки соответствия длины никнейма диапазону от 2 до 20 включительно. При не соответствии
 * прокидывается кастомное исключение
 */
fun checkUserName (name: String) {
    if (name.length < 2) {
        throw InvalidUserInputException("Ошибка! Никнейм должен быть от 2 символов")
    }
    else if (name.length > 20) {
        throw InvalidUserInputException("Ошибка! Никнейм должен быть до 20 символов")
    }

}
fun main () {
    /* Задание 1: Вам дан код: val a: String? = null.
    Каковы способы, которыми вы можете обратиться к a без вызова исключения NullPointerException?
     */
    val a: String? = null
    val len: Int = a?.length ?: 0 // 1 способ: использование дефолтного значения
    val num: Int? = a?.length // 2 способ: безопасное обращение через ?
    if (a != null) {
        println(a.length) // 3 способ: проверка на не null
    }
    a?.let {
        println(it.length) // 4 способ: использование let для проверки на не null
    }

    /* Задание 2: Рассмотрите следующий код:
    fun main() {
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        println(intList)
    }
    Что будет выведено в результате выполнения этого кода? Почему?

     Ответ:
    будет выведен список без null, т.е. 1, 2, 4. метод filterNotNull() Удаляет элементы null
     */

    /* Задание 3: Вам дан код: var s: String? = null.
    Преобразуйте его в ненулевое значение с помощью оператора elvis,
    чтобы вместо null было значение "empty".
     */
    var s: String? = null
    var empty: String = s ?: "empty"
    println(empty)

    /* Задание 4: Создайте функцию, которая принимает nullable параметр и использует оператор !!
    для преобразования его в ненулевое значение. Что произойдет, если вы вызовете эту функцию с null?
     */
    fun toInt (a: String?): Int {
        return a!!.length
    }
  // println(toInt(s)) // при вызове функции падает ошибка NullPointerException, т.к. s == null

    /* Задание 5: Создайте пользовательское исключение InvalidUserInputException,
    которое выбрасывается, когда пользователь вводит что-то неверное.
    Покажите, как его можно перехватить и обработать.
     */
    print("Введите свой возраст (от 18 до 99): ")
    val age = readln()
    try {
        checkAge(age.toInt())
    }
    catch (e: NumberFormatException) {
        println("Ошибка! Возраст должен быть числом")
    }
    catch (e: Exception) {
        println(e.message)
    }
    print("Введите никнейм для пользователя (от 2 до 20 символов): ")
    val userName = readln()
    try {
        checkUserName(userName)
    }
    catch (e: Exception) {
        println(e.message)
    }

}
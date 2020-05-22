package beginnersbook
import java.lang.Math.pow
import java.util.Scanner

fun suma(vararg numbers: Int): Int
{
    var sum = 0
    numbers.forEach {num -> sum +=  num}

    return sum
}

fun main(args : Array<String>){

    val numB: Byte = 127
    val numS: Short = 32767
    val numI: Int = 132456 /* pow(2):(31-1) .toInt() -- cast*/
    val numL: Long = 123456 /* pow(2):(63-1) */
    val numD = 123456 /* pow(2):(63-1)  floating */
    val numF = 101.99F
    val boolValue = false
    val ch2: Char = 'Z'
    val myName: String? = readLine()
    val read = Scanner(System.`in`)
    read.nextFloat()
    println("My Name is: "+myName)
    if (myName != null) {
        println(myName.length)
        println("String Equals? : ${myName.compareTo("abc")}")
        println("2rd Index: ${myName.get(2)}")
        println("Index from 1 to 2: " + myName.subSequence(1,2))
        println("Contains bc: ${myName.contains("bc")}")
    }
    println("String Equals? : ${myName.equals("abc")}")

    var arr = arrayOf(10, "BeginnersBook", 10.99, 'A')
    var arr2 = arrayOf<String>("ab", "bc", "cd")
    arr[3] = 100
    println(arr[3])
    println(arr.get(3))
    println("Size of Array arr is: ${arr.size}")
    arr = arrayOf(1, 22, "CPS")
    println("Array contains CPS: ${arr.contains("CPS")}")
    println("First Element: ${arr.first()}")
    println("Last Element: ${arr.last()}")
    println("Index of 22: ${arr.indexOf(22)}")

    println("Number range:")

    for(num in 1..4){
        println(num)
    }
    for(ch in 'A'..'E'){
        println(ch)
    }

    val oneToTen = 1..10

    println("3 in oneToTen: ${3 in oneToTen}")
    println("11 in oneToTen: ${11 in oneToTen}")
    val oneToFive = 1.rangeTo(5)
    val sixToThree = 6.downTo(3)

    println("rangeTo:")
    for(x in oneToFive){
        println(x)
    }

    println("downTo")
    for(n in sixToThree){
        println(n)
    }
    val odd = oneToTen.step(2)

    for(n in odd){
        println(n)
    }
    for (n in oneToFive.reversed()){
        println(n)
    }

    var num3 = 101
    if(num3<0)
        println("Negative Number")
    else {
        //Nested expression
        if(num3%2 == 0)
            println("Even Number")
        else
            println("Odd Number")
    }

    var ch = 'A'

    when(ch){

        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")

        else -> println("$ch is a Consonant")
    }
    when(ch){

        'A', 'E', 'I', 'O', 'U' -> println("$ch is a Vowel")

        else -> println("$ch is a Consonant")
    }

    var num5 = 78

    when(num5) {
        in 1..9 -> println("$num5 is a single digit number")
        in 10..99 -> println("$num5 is a two digit number")
        in 100..999 -> println("$num5 is a three digit number")
        else -> println("$num5 has more than three digits")
    }

    var age = 16

    when(age) {
        in 1..17 -> {
            val num = 18 - age
            println("You will be eligible for voting in $num years")
        }
        in 18..100 -> println("You are eligible for voting")
    }

    for(n in 10..15){
        println("Loop: $n")
    }

    val myArray = arrayOf("ab", "bc", "cd", "da", "Steve", "Robin", "Kate", "Lucy")
    for (str in myArray){
        println(str)
    }

    for (n in myArray.indices){
        println("myArray[$n]: ${myArray[n]}")
    }

    for((index, value) in myArray.withIndex()){
        println("Value at Index $index is: $value")
    }
    num5 = 10

    while(num5>=5){
        println("Loop: $num5")
        num5--
    }
    num5 = 5

    while(num5<=10){
        println("Loop: $num5")
        num5++
    }

    num5 = 100

    do {
        println("Loop: $num5")
        num5++
    }
    while (num5<=105)

    for (n in 1..5){
        println("before continue, Loop: $n")
        if(n==2||n==4)
            continue

        println("after continue, Loop: $n")

    }

    myloop@ for (x in 'A'..'D'){
        for (n in 1..4){
            if (n==2||n==4)
                continue@myloop

            println("$x and $n")
        }

    }

    for(n in 1..10){
        println("before break, Loop: $n")
        if (n==5) {
            println("I am terminating loop")
            break
        }
    }

    myloop@ for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if(n==2)
                break@myloop
        }
    }

    println("Sum: ${suma(10, 20, 30, 40)}")

    val sum2 = {num1: Int, num2: Int -> num1 + num2}

    println("6 + 4 = ${sum2(6,4)}")
    var number2:Int  = 5
    val factorial = fact(number2)
    println("Factorial of $number2 = $factorial")

    var factorial2 = fact2(number2)
    println("Factorial of $number2 = $factorial2")

    demo()
    demo(99)
    demo(ch='Z')
    demo(99, 'Z')

    //lambda function
    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("10+5: ${sum(10,5)}")

    func("BeginnersBook", ::demo2)

    val sum3 = func3(10)
    println("10 + 20: ${sum3(20)}")

    try {

        var num = 10/0
        println("BeginnersBook.com")
        println(num)


    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("It will print in any case.")
    }

    try{
        println("Before exception")
        throw Exception("Something went wrong here")
        println("After exception")
    }
    catch(e: Exception){
        println(e)

    }
    finally{
        println("You can't ignore me")
    }

    try{
        var num = 100/0
        println(num)
    }
    catch(e: ArithmeticException){
        println("Arithmetic Error in the code")

    }
    println("Out of try catch block")

    try{
        var num = 10/5
        println(num)
    }
    finally{
        println("Finally block")
    }

    println("Out of try catch block")

    try{
        var num = 10/0
        println(num)
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some Exception occurred")
    }

    println("Out of try catch block")

    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some error occurred")
    }

    println("Out of try catch block")

    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: Exception){
        println("Some error occurred")
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    println("Out of try catch block")

    try {
        val num = 100 / 5
        println(num)
        try {
            val num2 = 100 / 0
            println(num2)
        }
        catch(e: NumberFormatException){
            println("Number Format Exception")
        }
    }
    catch(e: ArithmeticException){
        println("Arithmetic Exception")
    }

    print("Enter your name: ")
    val name = readLine()

    try{
        if (name == "Chaitanya"){
            throw Exception("You don't have access")
        }
        else
        {
            println("Welcome! You have access")
        }
    }
    catch (e: Exception){
        println(e.message)
    }

    var website = "Beginnersbook.com"
    var num = try {
        website.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num)

    var number = "100"
    var num2 = try {
        number.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num2)

    val stu = Student2("Chaitanya", 31)
    val stu2 = Student2("Chaitanya")
    val stu3 = Student2()

    val stu4 = Student("Harry", 24)

    val obj = Child()
    obj.demo()
    obj.demo2()

    /* obj.num and obj.number are visible
     * obj.ch, obj.demo() and obj.str not visible
     */
    val obj2 = Parent2()
    /* obj2.ch and obj2.demo() are not visible because if
     * you override protected members in child class without
     * specifying modifier then they are by default protected
     */
    val obj3 = Child2()

    val obj5 = College5("Chaitanya", 31)
    obj5.func("I'm a Blogger")
    obj5.demo()

    val obj7 = MyClass()
    obj7.demo()
    obj7.func()
    println(obj7.str)

    val obj9 = MyClass2()
    obj9.demoX()
    obj9.demoY()
    obj9.funcX()
    obj9.funcY()

    // accessing data member of nested class
    println(OuterClass.NestedClass().nStr)

    // accessing member function of nested class
    println(OuterClass.NestedClass().demo())

    // creating object of the Nested class
    val obj10 = OuterClass.NestedClass()
    println(obj10.demo())

    val o = OuterClass2()
    println("${o.InnerClass2().demo()}")

    val i = OuterClass2().InnerClass2()
    println("${i.demo()}")


    val stu11 = Student11("Chaitanya", 31)
    val stu12 = Student11("Ajeet", 30)
    println("Student Name is: ${stu11.name}")
    println("Student Age is:  ${stu11.age}")
    println("Student Name is: ${stu12.name}")
    println("Student Age is:  ${stu12.age}")


     var stu111 = Student11("Chaitanya", 31)
     var stu112 = Student11("Chaitanya", 31)
    val stu13 = Student11("Ajeet", 30)
    if (stu111.equals(stu112) == true)
        println("stu111 is equal to stu112.")
    else
        println("stu111 is not equal to stu112.")

    if (stu111.equals(stu13) == true)
        println("stu111 is equal to stu13.")
    else
        println("stu111 is not equal to stu13.")

    println("Hashcode of stu: ${stu111.hashCode()}")
    println("Hashcode of stu2: ${stu112.hashCode()}")
    println("Hashcode of stu3: ${stu13.hashCode()}")

    println(stu111.toString())
    println(stu111.component1())

    val stu222 = stu111.copy(name = "Lucy")
    println("stu111: Name ${stu111.name}, Age ${stu111.age}")
    println("stu222: Name ${stu222.name}, Age ${stu222.age}")


    val r = Color.Red()
    eval(r)

    val r2 = Color2.Red()
    eval2(r2)
}

fun fact(num: Int): Int {
    return if(num == 1){
        num
    }
    else{
        //function fact() calling itself
        num*fact(num-1)
    }
}

tailrec fun fact2(n: Int, temp: Int = 1): Int {
    return if (n == 1) {
        temp
    } else {
        fact2(n - 1, temp * n)
    }
}

fun demo(number:Int= 100, ch: Char ='A'){
    print("Number is: $number and Character is: $ch")
}

fun func(str: String, myfunc: (String) -> Unit) {
    print("Welcome to Kotlin tutorial at ")
    myfunc(str)
}

fun demo2(str: String) {
    println(str)
}

fun func3(num: Int): (Int) -> Int = {num2 -> num2 + num}

class Student2(val name: String = "Student", var age: Int = 99) {
    val stuName: String
    var stuAge: Int

    init {
        if (name == "Student") {
            stuName = "NA"
            stuAge = 0
        } else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("Student Name is: $stuName")
        println("Student Age is: $stuAge")
    }
}

    open class College{

        constructor(name: String, age: Int){
            println("parent class constructor")
            println("Student Name: ${name.toUpperCase()}")
            println("Student Age: $age")
        }
    }
    class Student: College{
        constructor(name: String, age: Int): super(name,age){
            println("child class constructor")
            println("Student Name: $name")
            println("Student Age: $age")
        }
    }

open class Parent() {
    open var num: Int = 100
    open fun demo(){
        println("demo function of parent class")
    }
}

class Child: Parent() {
    override var num: Int  = 101
    override fun demo() {
        super.demo()
        println("demo function of child class")
    }
    fun demo2(){
        println(super.num)
    }
}

open class Parent2() {
    // by default public
    var num = 100

    // visible to this this class only
    private var str = "BeginnersBook"

    // visible to this class and the child class
    protected open val ch = 'A'

    // visible inside the same module
    internal val number = 99

    // visible to this class and child class
    open protected fun demo() { }
}

class Child2: Parent2() {

    /* num, ch, number and function demo() are
     * visible in this class but str is not visible.
     */
    override val ch = 'Z'
    override fun demo(){
        println("demo function of child class")
    }
}

abstract class Student5(name: String, age: Int) {

    init {
        println("Student name is: $name")
        println("Student age is: $age")
    }

    //non-abstract function
    fun demo() {
        println("Non-abstract function of abstract class")
    }

    //abstract function
    abstract fun func(message: String)
}

class College5(name: String, age: Int): Student5(name, age) {

    override fun func(message: String) {
        println(message)
    }
}

interface MyInterface{
    var str: String

    fun demo()

    fun func(){
        println("Hello")
    }
}

class MyClass: MyInterface{
    override var str: String = "BeginnersBook.com"
    override fun demo() {
        println("demo function")
    }
}

interface X {

    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y  {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

// This class implements X and Y interfaces
class MyClass2: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }

}

class OuterClass {

    val oStr = "Outer Class"

    class NestedClass {
        val nStr = "Nested Class"
        fun demo() = "demo() function of nested class"
    }
}

class OuterClass2 {

    val oStr = "Outer Class"

    inner class InnerClass2 {
        val nStr = "Nested Class"
        fun demo() = "demo() function using $oStr"
    }
}

data class Student11(val name: String, val age: Int)

open class Color{
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}
fun eval(c: Color) =
        when (c) {
            is Color.Red -> println("Paint in Red Color")
            is Color.Orange -> println("Paint in Orange Color")
            is Color.Blue -> println("Paint in Blue Color")
            else -> println("Paint in any Color")
        }

sealed class Color2{
    class Red : Color2()
    class Orange : Color2()
    class Blue : Color2()
}
fun eval2(c: Color2) =
        when (c) {
            is Color2.Red -> println("Paint in Red Color")
            is Color2.Orange -> println("Paint in Orange Color")
            is Color2.Blue -> println("Paint in Blue Color")
        }
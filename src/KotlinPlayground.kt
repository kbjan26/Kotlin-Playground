fun main(args: Array<String>){
    println("Playground for Kotlin. We will try to demonstrate Kotlin expressions/operators");
    var name: String;
    val fname: String;
    name="Kotlin Demo";
    fname = "fname is an example of constant in Kotlin";

    println("Printing the initialized mutable variable "+ name);

    println("Printing the initialized immutable variable "+ fname);

    println("Example of expression in Kotlin");

    var variableOne: Number;
    var variableTwo: Number;
    variableOne= 3;
    variableTwo = 5;
    if(variableOne > variableTwo)
        println("VariableOne is greater than variableTwo");

    println("Example of Class and Instance");

    var kotlinInstance =KotlinExample("Test Instance");

    kotlinInstance.functionExample();

    println("Example of higher order functions and lambdas");

    var numbers = listOf(10,20,30,40);

    val finalSum = numbers.fold(100,{
        finalSum: Int,nextElement : Int ->
        println("Value of accumulator "+ finalSum);
        val sum =finalSum + nextElement
        sum
    });
    println("Sum of numbers "+ finalSum);
}

class KotlinExample(_name: String){
    var name=_name;

    fun functionExample(){
        println("Example of function call inside class instance printing "+name);
    }


}
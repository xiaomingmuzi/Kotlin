fun main(args: Array<String>) {
	var a = 8
	var b = 2
	println("$a+$b=${plus(a,b)}")
	println("$a-$b=${sub(a,b)}")
	println("$a*$b=${mutl(a,b)}")
	println("$a/$b=${devide(a,b)}")
	
	println(sayHello("Li"))
	println(checkAge(5))
	saveLog(2)
}

fun sayHello(name:String):String{
	return "Hello,$name"
}

fun checkAge(age:Int):Boolean{
	return age>10
}

fun saveLog(logLevel:Int){
	println("The logLevel is $logLevel")
}

//fun �ǹ̶�д��  plus��������  ��a��һ��������������Int��:Int����ֵ����
fun plus(a: Int, b: Int): Int {
	return a + b
}

fun sub(a: Int, b: Int): Int {
	return a - b
}

fun mutl(a: Int, b: Int): Int {
	return a * b
}

fun devide(a: Int, b: Int): Int {
	return a / b
}
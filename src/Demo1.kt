fun main(args: Array<String>) {
	var result = add(3, 5)
	println(result)


	var i = { x: Int, y: Int -> x + y }//函数表达式
	var result2=i(3,5)
	println(result2)
	
	var j:(Int,Int)->Int={x,y->x+y}
	var result3=j(3,5)
	println(result3)
}

//结构体中只有一行代码时
fun add(x: Int, y: Int): Int = x + y

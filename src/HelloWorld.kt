/**
 *
 */
fun main(args: Array<String>) {
	println("hello kotlin")
//	var name = "张三" //计算机给我一个空间，空间名字叫name，里面存放的是张三
//	//这块空间存储的是字符串类型的数据
//	name = "李四"//计算机name里面，放李四
//	//name=8//8是一个数字，int类型不能放到string类型空间中
//	println(name)
//
//	var num1 = 4
//	var num2 = 6
//	println(num1 > num2)

//	var num3 = Math.sqrt(5.0) - Math.sqrt(4.0)
//	var num4 = Math.sqrt(4.0) - Math.sqrt(3.0)
//	println(num3 < num4)
//	
//	var num5=Math.pow(2.0,100.0)
//	var num6=Math.pow(3.0,75.0)
//	println(num5>num6)
	
//	var score=65
//	checkFace(score)
	
	
	var a=3
	var b=5
	println("${a}和${b}较大的那个数的值为${returnBig(a,b)}")
}

//颜值判断器
//颜值》80 帅哥  《=80衰哥
fun checkFace(score:Int){
	if(score>80){
		println("这是一个帅哥")
	}else{
		println("这是一个衰哥")
	}
	
}

fun returnBig(a:Int,b:Int):Int{
	if(a>b)return a else return b
		
}
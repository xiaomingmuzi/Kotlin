fun main(args: Array<String>) {
	while(true){
	println("请输入第一个数字：")
	var num1str=readLine()//返回可空字符串
	println("请输入第二个数字")
	var num2str=readLine()
	try{
	var num1=num1str!!.toInt()//输入的内容不为空
	var num2=num2str!!.toInt()
	
	println("$num1+$num2=${num1+num2}")
	}catch(e:Exception){
		println("输入有误")
	}
	}
}
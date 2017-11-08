import java.math.BigInteger

//演示递归
//阶乘 1的阶乘是1   2的阶乘是2*1  3的阶乘是3*2*1  4的阶乘是4*3*2*1
fun main(args: Array<String>) {
	var num=BigInteger("30")
	//计算5的阶乘
	println(fact(num))
	
	var num1=5
    var result=0
	println(ollAdd(num1,result))
}
//演示递归
//阶乘 1的阶乘是1   2的阶乘是2*1  3的阶乘是3*2*1  4的阶乘是4*3*2*1
fun fact(num:BigInteger):BigInteger{
	if(num==BigInteger.ONE){
		return BigInteger.ONE
	}else return num*fact(num-BigInteger.ONE)
}
 
 //n累加  尾递归优化
 tailrec fun ollAdd(num:Int,result:Int):Int{
	 println("计算机第${num}次运算，result=${result}")
	 if(num==1){
		 return 0
	 }else{
		 return ollAdd(num-1,result+num)
	 }
}
 

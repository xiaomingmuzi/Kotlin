//����һ�������������Ƿǿյ�String����  ?�����������Ϊ��
fun heat(str:String?):String{
return "��"+str	
}

fun main(args: Array<String>) {
	var result1=heat("ˮ")
    println(result1)
 
 var result2=  heat(null)
 println(result2)
 
}
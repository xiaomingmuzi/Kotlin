import java.math.BigInteger

//��ʾ�ݹ�
//�׳� 1�Ľ׳���1   2�Ľ׳���2*1  3�Ľ׳���3*2*1  4�Ľ׳���4*3*2*1
fun main(args: Array<String>) {
	var num=BigInteger("30")
	//����5�Ľ׳�
	println(fact(num))
	
	var num1=5
    var result=0
	println(ollAdd(num1,result))
}
//��ʾ�ݹ�
//�׳� 1�Ľ׳���1   2�Ľ׳���2*1  3�Ľ׳���3*2*1  4�Ľ׳���4*3*2*1
fun fact(num:BigInteger):BigInteger{
	if(num==BigInteger.ONE){
		return BigInteger.ONE
	}else return num*fact(num-BigInteger.ONE)
}
 
 //n�ۼ�  β�ݹ��Ż�
 tailrec fun ollAdd(num:Int,result:Int):Int{
	 println("�������${num}�����㣬result=${result}")
	 if(num==1){
		 return 0
	 }else{
		 return ollAdd(num-1,result+num)
	 }
}
 

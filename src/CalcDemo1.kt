fun main(args: Array<String>) {
	while(true){
	println("�������һ�����֣�")
	var num1str=readLine()//���ؿɿ��ַ���
	println("������ڶ�������")
	var num2str=readLine()
	try{
	var num1=num1str!!.toInt()//��������ݲ�Ϊ��
	var num2=num2str!!.toInt()
	
	println("$num1+$num2=${num1+num2}")
	}catch(e:Exception){
		println("��������")
	}
	}
}
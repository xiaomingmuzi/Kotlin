fun main(args: Array<String>) {
	var str1="Andy"
	var str2="andy"
	println(str1==str2)//== ������java�е�equal����
	println(str1.equals(str2))//== ������java�е�equal����
	
	println(str1.equals(str2,true))//���ص�equals���ڶ�������Ϊ�������ͣ��Ƿ���Դ�Сд
}
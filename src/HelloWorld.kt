/**
 *
 */
fun main(args: Array<String>) {
	println("hello kotlin")
//	var name = "����" //���������һ���ռ䣬�ռ����ֽ�name�������ŵ�������
//	//���ռ�洢�����ַ������͵�����
//	name = "����"//�����name���棬������
//	//name=8//8��һ�����֣�int���Ͳ��ܷŵ�string���Ϳռ���
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
	println("${a}��${b}�ϴ���Ǹ�����ֵΪ${returnBig(a,b)}")
}

//��ֵ�ж���
//��ֵ��80 ˧��  ��=80˥��
fun checkFace(score:Int){
	if(score>80){
		println("����һ��˧��")
	}else{
		println("����һ��˥��")
	}
	
}

fun returnBig(a:Int,b:Int):Int{
	if(a>b)return a else return b
		
}
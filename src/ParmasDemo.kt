val Pi=3.14f

//��ȡ�����ε����
fun getRectArea(width: Float, height: Float): Float {
	return width * height
}
//���ݰ뾶��ȡԲ���ܳ�
fun getCircleLong(PI:Float=Pi,r:Float):Float{
	return 2*PI*r
}
//����ֱ����ȡԲ���ܳ�
fun getCircleLong2(PI:Float=Pi,d:Float):Float{
	return PI*d
}
//��ȡԲ��������
fun getCircleV(PI:Float=Pi,r:Float,height:Float):Float{
	return PI*r*r*height
}
//��ȡ����ı����
fun getCircleArea(PI:Float=Pi,r:Float):Float{
	return PI*r*r*4
}
fun main(args: Array<String>) {
	var rectArea=getRectArea(3.2f,4.2f)
	println("�����ε����Ϊ��${rectArea}")

	var circle=getCircleLong2(d=4.0f)
	println("Բ���ܳ�Ϊ��${circle}")
 
}
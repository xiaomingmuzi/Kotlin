/**
 *�ռ������������ղ����ǵص㣬����ֵ���ռǵ�����
 */
fun diaryGenerater(placeName: String): String {
	var temple = """
 �����������ʣ��������ƣ�����ȥ${placeName}���棬
 ����ӳ���������ǣ�${placeName}${placeName.length}���ֽ����
 """
	return temple
}

fun main(args: Array<String>) {
	var diary=diaryGenerater("��ɽ��԰")
println(diary)
}
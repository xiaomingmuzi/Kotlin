//10�� ����  9�ָɵĲ���   8�ֻ����� 7�ֻ���Ŭ�� 6�ָպü��� ���� ��Ҫ����
fun gradeStudent(score: Int) {
	when (score) {
		10 -> println("�������֣�������")
		9 -> println("�ɵĲ���")
		8 -> println("������")
		7 -> println("����Ŭ��")
		6 -> println("�պü���")
		else -> println("��Ҫ����Ŷ")
	}
}

fun main(args: Array<String>) {
	gradeStudent(3)
}
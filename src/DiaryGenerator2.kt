fun diaryGenerator(placeName:String){
	var diary="""
  �����������ʣ��������ƣ�����ȥ${placeName}���棬
 ����ӳ���������ǣ�${placeName}${numToChinese(placeName.length)}���ֽ����
 """
	println(diary)
}

fun numToChinese(num:Int):String{
	var result=when(num){
		1->"һ"
		2->"��"
		3->"��"
		4->"��"
		5->"��"
		else ->num.toString()
	}
	return result
}

fun main(args: Array<String>) {
	diaryGenerator("˵�ķ����ķ�")

	var nums=1..100//������
	var result=0	for (num in nums){//		print("${num}��")
		result+=num
	}
	println("����ǣ�${result}")
 
	var num1=1 until 100//������
	for (num in num1){
		println(num)
	}
 
	var nums2=1..16
			for(a in nums2 step 2){
	 println(a)
 
				var nums3=nums2.reversed() //��ת
				for(a in nums3){
					println(a)
				}
 println("����Ϊ��${nums3.count()}")
}
 
 }
 
 
fun diaryGenerator(placeName:String){
	var diary="""
  今天天气晴朗，万里无云，我们去${placeName}游玩，
 首先映入眼帘的是，${placeName}${numToChinese(placeName.length)}个镏金大字
 """
	println(diary)
}

fun numToChinese(num:Int):String{
	var result=when(num){
		1->"一"
		2->"二"
		3->"三"
		4->"四"
		5->"五"
		else ->num.toString()
	}
	return result
}

fun main(args: Array<String>) {
	diaryGenerator("说的发生的房")

	var nums=1..100//闭区间
	var result=0	for (num in nums){//		print("${num}，")
		result+=num
	}
	println("结果是：${result}")
 
	var num1=1 until 100//开区间
	for (num in num1){
		println(num)
	}
 
	var nums2=1..16
			for(a in nums2 step 2){
	 println(a)
 
				var nums3=nums2.reversed() //反转
				for(a in nums3){
					println(a)
				}
 println("总数为：${nums3.count()}")
}
 
 }
 
 
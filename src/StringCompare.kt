fun main(args: Array<String>) {
	var str1="Andy"
	var str2="andy"
	println(str1==str2)//== 类似于java中的equal方法
	println(str1.equals(str2))//== 类似于java中的equal方法
	
	println(str1.equals(str2,true))//重载的equals，第二个参数为布尔类型，是否忽略大小写
}
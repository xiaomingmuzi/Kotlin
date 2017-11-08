import java.util.TreeMap
fun main(args: Array<String>) {
	var lists=listOf<String>("买鸡蛋","买大米","买杜蕾斯","买冰激凌")
	for((i,e) in lists.withIndex()){
		println("$i  $e")
	}
	
	var map=TreeMap<String,String>()
	map["好"]="good"
	map["学习"]="study"
	map["天"]="day"
	map["向上"]="up"
	println(map["好"])
}
import java.util.TreeMap
fun main(args: Array<String>) {
	var lists=listOf<String>("�򼦵�","�����","�����˹","�������")
	for((i,e) in lists.withIndex()){
		println("$i  $e")
	}
	
	var map=TreeMap<String,String>()
	map["��"]="good"
	map["ѧϰ"]="study"
	map["��"]="day"
	map["����"]="up"
	println(map["��"])
}
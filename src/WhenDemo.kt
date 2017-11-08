//10分 满分  9分干的不错   8分还可以 7分还需努力 6分刚好及格 其他 需要加油
fun gradeStudent(score: Int) {
	when (score) {
		10 -> println("考了满分，棒棒哒")
		9 -> println("干的不错")
		8 -> println("还可以")
		7 -> println("还需努力")
		6 -> println("刚好及格")
		else -> println("需要加油哦")
	}
}

fun main(args: Array<String>) {
	gradeStudent(3)
}
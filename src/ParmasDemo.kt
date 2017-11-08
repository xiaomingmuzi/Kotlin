val Pi=3.14f

//获取长方形的面积
fun getRectArea(width: Float, height: Float): Float {
	return width * height
}
//根据半径获取圆形周长
fun getCircleLong(PI:Float=Pi,r:Float):Float{
	return 2*PI*r
}
//根据直径获取圆形周长
fun getCircleLong2(PI:Float=Pi,d:Float):Float{
	return PI*d
}
//获取圆柱体的体积
fun getCircleV(PI:Float=Pi,r:Float,height:Float):Float{
	return PI*r*r*height
}
//获取球体的表面积
fun getCircleArea(PI:Float=Pi,r:Float):Float{
	return PI*r*r*4
}
fun main(args: Array<String>) {
	var rectArea=getRectArea(3.2f,4.2f)
	println("长方形的面积为：${rectArea}")

	var circle=getCircleLong2(d=4.0f)
	println("圆形周长为：${circle}")
 
}
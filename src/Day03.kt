fun main() {
    println("Hello, world!!!")
    val inputString = "to be or not to be"
val regex = "to \\w{2}".toRegex()
val match = regex.findAll(inputString)!!
println(match) // Prints the matched substring
// println(match.range) // Prints the range of the match

val mul_reg = "mul\\(\\d+,\\d+\\)".toRegex()
val input_txt ="xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"
val result = mul_reg.findAll(input_txt).map{it.value}.toList() 
println(result)
var result_f = 0
for (i in result){
    val filter = "\\d+,\\d+".toRegex()
    val line = filter.find(i)?.value
    val result_list = line?.split(",")?.map{it.toInt()}?.toList()
    println(result_list?.reduce{acc,elem->acc*elem}?.toInt())
    result_f += (result_list?.reduce{acc,elem->acc*elem}?.toInt()!!)
}
	println(result_f)
}

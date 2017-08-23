fun main(args: Array<String>) {
    val r: Rectangle = Rectangle(5, 5)
    println(r.isSquare)
    r.isSquare = true as Boolean?
    //r.isSquare?.let{x -> println(x)}
    println(r.isSquare)
}

data class Rectangle(var height: Int, var width: Int){
    var isSquare: Boolean? = null
}
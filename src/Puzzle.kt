import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

/**
 * Created by Z3nk on 23/08/2017.
 */
fun main(args: Array<String>) {
    var p: PuzzleManager = PuzzleManager()
    var s:String = "L2, L5, L5, R5, L2, L4, R1, R1, L4, R2, R1, L1, L4, R1, L4, L4, R5, R3, R1, L1, R1, L5, L1, R5, L4, R2, L5, L3, L3, R3, L3, R4, R4, L2, L5, R1, R2, L2, L1, R3, R4, L193, R3, L5, R45, L1, R4, R79, L5, L5, R5, R1, L4, R3, R3, L4, R185, L5, L3, L1, R5, L2, R1, R3, R2, L3, L4, L2, R2, L3, L2, L2, L3, L5, R3, R4, L5, R1, R2, L2, R4, R3, L4, L3, L1, R3, R2, R1, R1, L3, R4, L5, R2, R1, R3, L3, L2, L2, R2, R1, R2, R3, L3, L3, R4, L4, R4, R4, R4, L3, L1, L2, R5, R2, R2, R2, L4, L3, L4, R4, L5, L4, R2, L4, L4, R4, R1, R5, L2, L4, L5, L3, L2, L4, L4, R3, L3, L4, R1, L2, R3, L2, R1, R2, R5, L4, L2, L1, L3, R2, R3, L2, L1, L5, L2, L1, R4"
    //var s: String = "R5, L5, R5, R3"
    //var s: String = "R2, R2, R2"
    s=s.replace(" ","")
    println(s)
    s.split(delimiters = ",", ignoreCase = true).forEach{
        println("Next move : ${it}")
        p.nextMove(it)
    }
}

open class Composente(var coord: Double)
class X(coord:Double):Composente(coord)
class Y(coord:Double):Composente(coord)
class PuzzleManager(val x: X = X(0.0), val y:Y = Y(0.0), var direction: Double = 90.0){
    fun nextMove(move: String){
        when(move.get(0)){
            'L' -> {
                direction += 90.0
            }
            'R' -> {
                direction -= 90.0
            }
        }
        println("${direction}")
        println("${Math.floor(Math.cos(Math.toRadians(direction)))}")
        println("${Math.floor(Math.sin(Math.toRadians(direction)))}")
        x.coord += move.get(1).toString().toInt() * Math.round(Math.cos(Math.toRadians(direction)))
        y.coord += move.get(1).toString().toInt() * Math.round(Math.sin(Math.toRadians(direction)))

        println("Coordonées : {${x.coord},${y.coord}}")
    }
}
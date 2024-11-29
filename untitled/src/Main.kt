class Orang(
    val name : String,
    val umur : Short
)

fun main(args: Array<String>) {
    val orang : Orang = Orang("name", 7)

    println(orang.umur)
}
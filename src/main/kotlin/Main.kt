fun main(args: Array<String>) {
    var toyota = Car(

        color = "red",

        topSpeed = 200,
    )
    println("Toyota: $toyota")
    toyota.drive()
    toyota.stop()


    var hyundai = Car(
        color = "blue",
        topSpeed = 100
    )
    println("hyundai: $hyundai")
    hyundai.drive()
    hyundai.stop()

}
class Car2 {

    var color: String
    var topSpeed: Int
    var originCountry: String? = null

    constructor(color: String, topSpeed: Int) {
        this.color = color
        this.topSpeed = topSpeed
    }

    fun drive() {
        println("${color} Driving around")
    }

    fun stop() {
        println("${color} Stop at once place")
    }

    override fun toString(): String {
        return "Car(color='$color', topSpeed=$topSpeed, originCountry=$originCountry)"
    }

}
class Car(var color: String, var topSpeed: Int) {

    var originCountry: String? = null

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
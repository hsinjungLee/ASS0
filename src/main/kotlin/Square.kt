open class Square(_name: String) : Shape(_name) {

    private var length: Double = 0.0
    private var height: Double = 0.0
    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 2) {
            length = dimensions[0]
            height = dimensions[1]
        }
    }

    override fun printDimensions() {
        println("Square: Length = $length, Height = $height")
    }

    override fun getArea(): Double {
        return length * height
    }


}
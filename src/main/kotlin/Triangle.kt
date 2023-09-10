open class Triangle(_name: String) : Shape(_name) {
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 3) {
            side1 = dimensions[0]
            side2 = dimensions[1]
            side3 = dimensions[2]
        }
    }

    override fun printDimensions() {
        println("Triangle: Side 1 = $side1, Side 2 = $side2, Side 3 = $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }


}
open class Circle(name: String) : Shape(name) {
    private var radius: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 1) {
            radius = dimensions[0]
        }
    }

    override fun printDimensions() {
        println("Circle: Radius = $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}
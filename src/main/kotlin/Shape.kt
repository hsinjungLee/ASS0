open class Shape(val name: String) {
    open fun getArea(): Double {
        return 0.0
    }
    open fun setDimensions(vararg dimensions: Double) {}
    open fun printDimensions() {}
}


open class EquilateralTriangle(_name: String) : Triangle(_name) {
    override fun setDimensions(vararg dimensions: Double) {
        if (dimensions.size == 1) {
            super.setDimensions(dimensions[0], dimensions[0], dimensions[0])
        }
    }


}
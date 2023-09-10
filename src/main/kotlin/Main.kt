fun main(args: Array<String>) {

    val square = Square("My Square")
    square.setDimensions(5.0, 5.0)
    square.printDimensions()
    println("Area: ${square.getArea()}")

    val circle = Circle("My Circle")
    circle.setDimensions(3.0)
    circle.printDimensions()
    println("Area: ${circle.getArea()}")

    val triangle = Triangle("My Triangle")
    triangle.setDimensions(3.0, 4.0, 5.0)
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}")

    val equilateralTriangle = EquilateralTriangle("My Equilateral Triangle")
    equilateralTriangle.setDimensions(6.0)
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")

}
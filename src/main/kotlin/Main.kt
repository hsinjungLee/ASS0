fun main(args: Array<String>) {

    val square = Square("Square")
    square.setDimensions(10.0, 10.0)
    square.printDimensions()
    println("Area: ${square.getArea()}")

    val circle = Circle("Circle")
    circle.setDimensions(5.0)
    circle.printDimensions()
    println("Area: ${circle.getArea()}")

    val triangle = Triangle("Triangle")
    triangle.setDimensions(7.0, 7.0, 7.0)
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}")

    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")
    equilateralTriangle.setDimensions(4.0)
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")

}
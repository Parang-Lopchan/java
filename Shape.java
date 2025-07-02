class Shape {
    // Base class
}

class Square extends Shape {
    double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    double calculateArea() {
        return sideLength * sideLength;
    }
}

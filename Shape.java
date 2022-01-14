interface Shape{
    void printShapeName();
}
class  Circle implements Shape{

    @Override
    public void printShapeName() {
        System.out.println("Circle");
    }
}
class Rectangle implements Shape{

    @Override
    public void printShapeName() {
        System.out.println("Rectangle");
    }
}
class Quad implements Shape{

    @Override
    public void printShapeName() {
        System.out.println("Quad");
    }
}
class Triangle implements Shape{

    @Override
    public void printShapeName() {
        System.out.println("Triangle");
    }
}
class Ellipse implements Shape{

    @Override
    public void printShapeName() {
        System.out.println("Ellipse");
    }
}
class ShapeName {

    public void getShapeName(Shape shape){
       shape.printShapeName();
   }
}

class ShapeTest{

    public static void main(String[] args) {
        Shape f = new Ellipse();
        new ShapeName().getShapeName(f);
    }
}

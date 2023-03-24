public class FirstClass {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();

        System.out.println(r1.area(2,5));
        System.out.println(r1.perimeter(2,5));
        System.out.println(r1.isSquare(5,5));
    }
}

class Rectangle{

    public int area(int length, int breadth){
        return length*breadth;
    }

    public int perimeter(int length, int breadth){
        return 2*(length+breadth);
    }

    public boolean isSquare(int length, int breadth){
        return length==breadth;
    }
}

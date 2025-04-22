public class Polymorphism {
    // Superclass
    class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Subclass 1
    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    // Subclass 2
    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    // Main class to test polymorphism
    public class Main {
        public void main(String[] args) {
            Shape s1 = new Circle();    // Polymorphism: Shape reference → Circle object
            Shape s2 = new Rectangle(); // Shape reference → Rectangle object

            s1.draw();  // Output: Drawing a circle
            s2.draw();  // Output: Drawing a rectangle
        }
    }

}

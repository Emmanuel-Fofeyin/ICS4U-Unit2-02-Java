/*
* This is the standard Main.java starting point.
*
* @author  Emmanuel.FN 
* @version 1.0
* @since   2024-03-28
*/

/**
* This is the Main program.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants
        final String fruitsString = "fruits: ";
        final String poppedString = "popped: ";
        final String coloursString = "colours: ";
        final String shapesString = "shapes: ";

        final EmmanuelStack fruits = new EmmanuelStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println(fruitsString + fruits.showStack());
        System.out.println(poppedString + fruits.popItem());
        System.out.println(fruitsString + fruits.showStack());
        System.out.println("");

        final EmmanuelStack colours = new EmmanuelStack();
        colours.push("red");
        colours.push("green");
        colours.push("blue");
        System.out.println(coloursString + colours.showStack());
        System.out.println(poppedString + colours.popItem());
        System.out.println(poppedString + colours.popItem());
        System.out.println(coloursString + colours.showStack());
        System.out.println("");

        final EmmanuelStack shapes = new EmmanuelStack();
        shapes.push("square");
        shapes.push("triangle");
        shapes.push("circle");
        System.out.println(shapesString + shapes.showStack());
        System.out.println(poppedString + shapes.popItem());
        System.out.println(poppedString + shapes.popItem());
        System.out.println(poppedString + shapes.popItem());
        System.out.println(poppedString + shapes.popItem());
        System.out.println(shapesString + shapes.showStack());

        System.out.println("\nDone.");
    }
}

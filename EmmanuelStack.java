/*
* The EmmanuelStack Class.
*
* @author  Emmanuel.FN 
* @version 1.0
* @since   2024-03-28
*/

import java.util.ArrayList;
import java.util.List;

/**
* The EmmanuelStack() class.
*/
public class EmmanuelStack {
    /**
    * Declares a private instance variable.
    */
    private List<String> stackAsList;

    /**
    * The constructor().
    */
    public EmmanuelStack() {
        stackAsList = new ArrayList<>();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(String input) {
        stackAsList.add(input);
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values += stackAsList.get(counter);
            if (counter < stackAsList.size() - 1) {
                values += ", ";
            }
        }
    return values;
    }

    /**
    * This method pops a string from the stack.
    *
    * @return the popped string
    */
    public String popItem() {
        final String poppedItem;
        if (!stackAsList.isEmpty()) {
            poppedItem = stackAsList.remove(stackAsList.size() - 1);
        } else {
            poppedItem = null;
        }
        return poppedItem;
    }
}

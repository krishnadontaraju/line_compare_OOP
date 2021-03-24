public class line_comparision_OOP{


    public static class line_length_generator {
        // Declaring the points
        int x_one;
        int y_one;

        int x_two;
        int y_two;
        


        line_length_generator(int x1, int y1, int x2, int y2){
            // Initializing the points
            this.x_one = x1;
            this.y_one = y1;
            this.x_two = x2;
            this.y_two = y2;           
            
            
        }

        double line_length(){
            // Finding the length of the line
            return Math.sqrt(((x_two - x_one) ^ 2) + (y_two - y_one) ^ 2);
        }
    
    }
    

public static void main(String[] args) {
    // creating a new Instance of class
    line_length_generator line = new line_length_generator( 5 , 2 , 9, 9 );
    // Printing the line of the length
    System.out.println("LENGTH OF THE LINE IS "+line.line_length());
    
    }
}



//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            int door = 20;
            int window = 15;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (length*width)+((length*height)*2)+((width*height)*2)-(door+(window*2));
            //Compute the amount of paint needed
            paintNeeded = (int) (totalSqFt/COVERAGE)+1;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("The dimensions of the room are "+length+" ft,"+width+" ft, and "+height+" ft");
            System.out.println("You will need "+paintNeeded+" gallons of paint");
        }
}
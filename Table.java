
/**
 * Write a description of class Table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table
{
    public static void main() {
        makeTable();
    }
    
    public static void makeTable() {
        makeHeader();
        labelColumns();
        populateRows();
    }
    
    public static void makeHeader() {
        System.out.println("==============================");
        System.out.println("==\tStudent Points\t==");
        System.out.println("==============================");
    }
    
    public static void labelColumns() {
        
    }
    
    public static void populateRows() {
        populateOneRow("Kim", 40, 7);
        populateOneRow("Gil", 50, 8);
        populateOneRow("Bill", 22, 5);
        populateOneRow("Tömas", 15, 7);
        populateOneRow("Zop", 44, 2);
    }
    
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }
}


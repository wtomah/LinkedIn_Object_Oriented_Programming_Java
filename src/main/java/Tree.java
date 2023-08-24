import java.awt.*;

/*Object-Oriented Programming Pillars
Abstraction
Inheritance
Encapsulation
Polymorphism
Class - a blueprint contains a set of attributes and behaviors that define an item
*/
public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;

    }

    public double getHeightFt(){
        return heightFt;
    }

    public double getTrunkDiameterInches(){
        return trunkDiameterInches;
    }
    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;

    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    static void announceTree(){
        System.out.println("Look out for that " +
                TRUNK_COLOR + " tree!");
    }

    public void announceTallTree(){
        if (this.heightFt > 100) {
            System.out.println("That's a tall " +
                    this.treeType+ " tree!");
        }
    }
}

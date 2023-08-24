import java.awt.*;

/*
Non-static member- a part of a class that is accessible with an instance and belongs to that instance
static member- a part of a class that is accessible through the class and belongs to that class
*/
public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120, 5, TreeType.OAK);
        //System.out.println(myFavoriteOakTree.treeType);

        myFavoriteOakTree.announceTallTree();

        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        myFavoriteMapleTree.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();

        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;
        Color brighterBlue = myDefaultBlue.brighter();

    }
}

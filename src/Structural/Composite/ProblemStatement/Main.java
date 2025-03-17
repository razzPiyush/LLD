package Structural.Composite.ProblemStatement;

public class Main {

    public static void main(String[] args){

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
/*
Definition:
-The Composite design pattern is a structural pattern that allows you to compose objects into tree-like structures to
represent part-whole hierarchies. It enables clients to treat individual objects and compositions of objects uniformly.

When to Use:
-When you need to represent a hierarchy of objects (e.g., tree structures).
-When you want to treat individual objects and groups of objects in the same way.
-When objects in your system can have a "contains" relationship, such as a folder containing files and subfolders.
 */
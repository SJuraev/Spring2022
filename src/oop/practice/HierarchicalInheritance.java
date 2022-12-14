package oop.practice;// Java program to illustrate the
// concept of Hierarchical inheritance
import java.lang.*;

class one
{
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one
{
    public void print_for()
    {
        System.out.println("for");
    }
}
  
class three extends one
{
    @Override
    public void print_geek() {
        super.print_geek();
    }
}
  
// Drived class
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        three g = new three();
        g.print_geek();
        two t = new two();
        t.print_for();
        g.print_geek();
    }
}
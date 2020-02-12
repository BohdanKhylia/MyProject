package helpers.composition;

public class Program {
    public static void main(String[] args) {
        OopEduc test = new OopEduc();
        test.doWalk(new HumanWalk());
        test.doWalk(new AnimalWalk());
        test.doWalk(new BugWalk());
    }
}

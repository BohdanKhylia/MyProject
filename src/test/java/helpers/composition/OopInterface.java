package helpers.composition;

public interface OopInterface {
    void walk();
}

class HumanWalk implements OopInterface{
    @Override
    public void walk() {
        System.out.println("Human walk");
    }
}

class AnimalWalk implements OopInterface{
    @Override
    public void walk() {
        System.out.println("Animal walk");
    }
}

class BugWalk implements OopInterface{
    @Override
    public void walk() {
        System.out.println("Bug walk");
    }
}
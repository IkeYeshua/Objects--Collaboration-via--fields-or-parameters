package ObjectCollaborationPackage;

public class Cat implements Chase{
    @Override
    public void chase() {
        System.out.println("See Dog laugh! I'm off the tree! You can't catch me");
        
    }

    @Override
    public void chasingCat() {
        System.out.println("Ewo! I'm a dead cat! Who send me");
    }
}

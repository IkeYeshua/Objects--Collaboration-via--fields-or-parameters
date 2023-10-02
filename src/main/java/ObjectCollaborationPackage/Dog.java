package ObjectCollaborationPackage;

public class Dog {
    private final Cat cat;

   public Dog(Cat cat) {
        this.cat = cat;
    }

    public void chase(){
        cat.chase();
    }
}

package training.tutorialAdvanced.f_interface;

public interface Ability {
    public abstract void breath();
    public abstract void sleep();
    public static void message(){
        System.out.println("Abilities are important.");
    }
}

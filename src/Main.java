//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Friend friend1   = new Friend("Spongebob");
        Friend friend2   = new Friend("Patrick");
        Friend friend3   = new Friend("Squidward");
        Friend friend4   = new Friend("Sandy");


        friend1.displayFriends();
        Friend.displayFriends();

        System.out.println(Math.round(3.424));
    }
}
import koly.summator.Summator;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            IncorrectArguments();
        } else {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println(Summator.Sum(a, b));
            } catch (NumberFormatException e) {
                IncorrectArguments();
                return;
            }
        }
        return;
    }

    public static void IncorrectArguments(){
        System.out.println("incorrect arguments");
    }
}

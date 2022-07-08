package learning;

public class IfAndSwitchStatements {
    public static void main(String[] args) {
        String dzien = "sr";

        if(dzien == "pon") {
            System.out.println("dzis jest pon");
        } else if(dzien == "wt") {
            System.out.println("dzis jest wt");
        } else if(dzien == "sr") {
            System.out.println("dzis jest sr");
        } else if(dzien == "czw") {
            System.out.println("dzis jest czw");
        } else if(dzien == "pt") {
            System.out.println("dzis jest pt");
        } else {
            System.out.println("nie przewidziales kurwo!!");
        }

        switch (dzien) {
            case "pon":
                System.out.println("dzis jest pon");
                break;
            case "wt":
                System.out.println("dzis jest wt");
                break;
            case "sr":
                System.out.println("dzis jest sr");
                break;
            case "czw":
                System.out.println("dzis jest czw");
                break;
            case "pt":
                System.out.println("dzis jest pt");
                break;
            default:
                System.out.println("fokoff");
        }
    }
}

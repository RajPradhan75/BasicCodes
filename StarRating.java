public class StarRating {

    public static void main(String args[]) {

        String Rating = "4";
        switch (Rating) {

            case "1":
                System.out.println("excellent");

            case "2":
                System.out.println("YOU CAN DO BETTER");
                break;
            case "3":
                System.out.println("do hardwork");
                break;
            case "4":
                System.out.println("get serious boy");
                break;
            case "5":
                System.out.println("Almost got failed bro");
                break;

            default:
                System.out.println("Rating can only be from 1 to 5");


        }
    }

}

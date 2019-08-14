public class Statements {
    public static void main(String[] args) {
        //Simple Bartender

    String bartenderSaysYes = "Hey, what do you want to order?";
    String bartenderSaysNo = "Get outta here!!";
    int ageOfCustomer = 22;
    int ageLimit = 21;
    boolean customerIsToDrunk = false;

    if(ageOfCustomer < ageLimit || customerIsToDrunk) {
        System.out.println(bartenderSaysNo);
    } else {
        System.out.println(bartenderSaysYes);
    }
    }
}

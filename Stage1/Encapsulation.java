// Encapsulation: to hide sensitive data from user, for this we declare variable and methods as private
// we use getter and setter methods !!

class College{

    private String name;

    public void setName(String input) {
        name = input;
    }

    public String getName() {
        return name;
    }

}
public class Encapsulation {

    public static void main(String[] args) {

        College c = new College();
        c.setName("Pankaj");
        System.out.println(c.getName());

    }

}

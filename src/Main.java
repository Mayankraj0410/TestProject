//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private String name;

    public void setName(String n){
        this.name = n;
    }


    public String getName(){
        return name;
    }


    public static void main(String[] args) {

        Main m = new Main();
        m.setName("Mayank");
        System.out.println(m.getName());
    }
}
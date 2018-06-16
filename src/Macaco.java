public class Macaco extends Animal {

    public Macaco(){

    }

    public String comerBanana(){
        return "comeu banana";
    }

    @Override
    public void andar() {
        System.out.println("macaco andou");
    }
}

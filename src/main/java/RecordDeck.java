public class RecordDeck extends Component implements IPlay {

    int spinSpeed;
    boolean needleWorks;

    public RecordDeck(int spinSpeed, String make, String model){
        super(make, model);
        this.spinSpeed = spinSpeed;
        this.needleWorks = true;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public String play(){
        return ("Snap, Crackle, Hiss");
    }


}

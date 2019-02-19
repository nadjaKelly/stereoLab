public class CDPlayer extends Component implements IPlay {

    int maxCDS;

    public CDPlayer(int maxCDS, String make, String model){
        super(make, model);
        this.maxCDS = maxCDS;
    }

    public String play(){
        return ("nnnnnssss");
    }


}

public class Radio extends Component {


String station;

public Radio (String station, String make, String model){
    super(make, model);
    this.station = station;

}

public String tune(){
    return station;
}










}

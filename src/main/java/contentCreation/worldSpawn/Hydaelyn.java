package contentCreation.worldSpawn;

public class Hydaelyn {
    private String realm;
    private String cityState;

    public Hydaelyn(String realm, String cityState){
        this.realm = realm;
        this.cityState = cityState;
    }

    public String getContinent() {
        return realm;
    }

    public String getCityState() {
        return cityState;
    }

    public String toString(){
        return  getCityState() +", " + getContinent();
    }
}

package contentCreation.worldSpawn;

public class Hydaelyn {
    private String continent;
    private String cityState;

    public Hydaelyn(String continent, String cityState){
        this.continent = continent;
        this.cityState = cityState;
    }

    public String getContinent() {
        return continent;
    }

    public String getCityState() {
        return cityState;
    }
}

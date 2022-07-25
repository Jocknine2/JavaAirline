package crew;

public class Pilot extends CabinCrew{

    private String PilotLicense;

    public Pilot(String name, RankType rankType, String pilotLicense){
        super(name, rankType);
        this.PilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return PilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        PilotLicense = pilotLicense;
    }

    public String flyPlane() {
        return "We are ready for take off";
    }
}

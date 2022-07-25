package crew;

public class CabinCrew {

    private String name;
    private RankType rankType;

    public CabinCrew(String name, RankType rankType){
        this.name = name;
        this.rankType = rankType;
    }


    public String getName() {
        return name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public String passengerMessage() {
        return "please listen to the following safety announcement";
    }
}

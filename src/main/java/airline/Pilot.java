package airline;

public class Pilot extends CabinCrewMember{
    private String licenseNo;

    public Pilot(String name, String rank, String licenseNo) {
        super(name, rank);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

}

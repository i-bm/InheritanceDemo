public class Company {
    private String companyName;
    private String sector;
    private String location;

    public Company(String companyName, String sector, String location) {
        this.companyName = companyName;
        this.sector = sector;
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", sector='" + sector + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}


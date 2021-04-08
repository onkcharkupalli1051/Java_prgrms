public class Company {
    private String companyname;
    private String location;
    private int packageinlacs;

    public String getCompanyname(){
        return companyname;
    }

    public void setCompanyname(String name){
        companyname = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPackageinlacs() {
        return packageinlacs;
    }

    public void setPackageinlacs(int packageinlacs) {
        this.packageinlacs = packageinlacs;
    }
}

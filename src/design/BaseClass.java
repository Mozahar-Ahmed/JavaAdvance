package design;

public class BaseClass {
    private String name;
    private String companyName;
    private int ID;

    public BaseClass(){}

    public BaseClass(String name, String companyName, int ID){
        this.name = name;
        this.companyName = companyName;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

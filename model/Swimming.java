package model;
public class Swimming extends SpeciesNeed{
    private String startplace = "";
    public Swimming(String startplace)
    {
        this.startplace = startplace;
        need = " start on " + startplace;
    }
    public Swimming()
    {

    }
    public String getStartplace()
    {
        return startplace;
    }
    public void setStartplace(String startplace)
    {
        this.startplace = startplace;
        need = " start on " + startplace;
    }
}

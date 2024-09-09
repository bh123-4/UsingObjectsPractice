public class State {
    private String name;
    private int year;
    private String abbrev;
    public State(String name, int year, String abbrev)
    {
        this.name = name;
        this.year = year;
        this.abbrev = abbrev;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setYear (int year)
    {
        this.year = year;
    }

    public int getYear ()
    {
        return year;
    }

    public String getAbbrev ()
    {
        return abbrev;
    }

    public void setAbbrev(String newAbbrev){
        this.abbrev = newAbbrev;
    }

    public int calcAge()
    {
        
        int age = 2024 - year; 
        return age;
    }

    public void calcAbb(String abbrev)
    {

    }
    @Override
    public String toString() {
        return "State name=" + name + ", year=" + year + ", abbrev=" + abbrev + " age: " + calcAge() ;
    }

    

}

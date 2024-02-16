package day13_inheritance.state;

public class State {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }



    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Can not be null, empty, or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isBlank() || abbreviation.isEmpty()){
            System.err.println("Can not be null, empty, or blank");
            System.exit(1);}
        this.abbreviation = abbreviation;
    }

    public void setPoliticalParty(String politicalParty) {
            if (politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
                System.err.println("Can not be null, empty, or blank");
                System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
            if (governor == null || governor.isBlank() || governor.isEmpty()){
                System.err.println("Can not be null, empty, or blank");
                System.exit(1);
        }
        this.governor = governor;
    }

    public void setSenator(String senator) {
            if (senator == null || senator.isBlank() || senator.isEmpty()){
                System.err.println("Can not be null, empty, or blank");
                System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.politicalParty = politicalParty;
        this.governor = governor;
        this.senator = senator;
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

 */
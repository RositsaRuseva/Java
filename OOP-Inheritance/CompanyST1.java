package lecture13_1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompanyST1 extends Company1{

    String ownerName;
    double primaryCapital;
    double secondaryCapital;

    public CompanyST1(){
        this.ownerName = ownerName;
        this.primaryCapital = primaryCapital;
        this.secondaryCapital = secondaryCapital;
    }

    @Override
    public String toString() {
        return "Company name is: " + name + ", which is established on " + dateOfEstablishment + "with owner: " + ownerName;
    }
}

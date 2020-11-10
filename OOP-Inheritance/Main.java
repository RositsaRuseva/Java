package lecture13_1;

import jdk.incubator.jpackage.internal.Log;
import lombok.extern.slf4j.Slf4j;



@Slf4j
public class Main {

    public void main(String[] args){

        Company1 company1 = new Company1();
        CompanyST1 companyST1 = new CompanyST1();

        company1.name = "Video Games 2000 ltd";
        company1.dateOfEstablishment = "10.01.2020";
        company1.bulstat = "98082413333";

        companyST1.ownerName = "Rositsa Ruseva";
        companyST1.primaryCapital = 10000;
        companyST1.secondaryCapital = 35000;

        Log.info(companyST1.toString());
    }
}

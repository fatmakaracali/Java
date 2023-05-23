package day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {

       String capitalOfIllinois= UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

       String abbreviation= UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviation);


      UsStatesEnum state= UsStatesEnum.ALASKA;
        System.out.println(state);

        String stateName= UsStatesEnum.getStateNameByUsingAbbriviation("AK");

        System.out.println(stateName);





    }
}

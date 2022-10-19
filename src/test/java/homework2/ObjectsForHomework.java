package homework2;

import org.junit.jupiter.api.Test;

public class ObjectsForHomework {
        @Test
    public void homeworkPractise(){
        BottleOfWatter testBottleOfWatter = new BottleOfWatter();

        testBottleOfWatter.setRecycled(false);
        testBottleOfWatter.setDepositCost(0.10);
        testBottleOfWatter.setMaterial("Plastic");

        Child testChild = new Child();

        testChild.setFavoriteAnswer("No!");
        testChild.setHandFingers(10);
        testChild.setIsSickness(true);

        Film testFilm = new Film();

        testFilm.setAgeThreshold(16);
        testFilm.setName("American Pie");
        testFilm.setLength(3);

        Husband testHusband = new Husband();

        testHusband.setIsBeard(true);
        testHusband.setTaxFromSalary(300);
        testHusband.setAge(33);

        Lego testLego = new Lego();

        testLego.setLostDetailCount(135);
        testLego.setCondition("New");
        testLego.setAverageSetPrice(249.99);

        Mobile testMobile = new Mobile();

        testMobile.setIsGift(true);
        testMobile.setChargeTime(0.5);
        testMobile.setLabel("Xiaomi");

        MotherInLaw testMotherInLow = new MotherInLaw();

        testMotherInLow.setBeliefInHoroscope(true);
        testMotherInLow.setWeight(120.5);
        testMotherInLow.setSonCount(3);

        Mouse testMouse = new Mouse();

        testMouse.setColor("Grey");
        testMouse.setClickByOneYear(1234567890);
        testMouse.setIsComfort(false);

        Plant testPlant = new Plant();

        testPlant.setName("Jasha");
        testPlant.setIsPalmType(false);
        testPlant.setLeavesCount(17);

        Spoon testSpoon = new Spoon();

        testSpoon.setMaterial("Silver");
        testSpoon.setIsBrokenStatus(false);
        testSpoon.setMaterialSample(925);

        System.out.println("Bottle is recycled:");
        System.out.println(testBottleOfWatter.IsRecycled());
        System.out.println("Bottles deposit cost:");
        System.out.println(testBottleOfWatter.getDepositCost());
        System.out.println("Bottles material:");
        System.out.println(testBottleOfWatter.getMaterial());

        System.out.println("Child favorite answer:");
        System.out.println(testChild.getFavoriteAnswer());
        System.out.println("Finger count:");
        System.out.println(testChild.getHandFingers());
        System.out.println("Child is sick:");
        System.out.println(testChild.IsSickness());

        System.out.println("Age you can watch this film:");
        System.out.println(testFilm.getAgeThreshold());
        System.out.println("Film name:");
        System.out.println(testFilm.getName());
        System.out.println("Hours to spend on watching film:");
        System.out.println(testFilm.getLength());

        System.out.println("Husband has a beard:");
        System.out.println(testHusband.IsBeard());
        System.out.println("Tax from husband salary:");
        System.out.println(testHusband.getTaxFromSalary());
        System.out.println("Husband age:");
        System.out.println(testHusband.getAge());

        System.out.println("Count of lost details:");
        System.out.println(testLego.getLostDetailCount());
        System.out.println("Set condition:");
        System.out.println(testLego.getCondition());
        System.out.println("Average price for set:");
        System.out.println(testLego.getAverageSetPrice());

        System.out.println("Mobile as a gift:");
        System.out.println(testMobile.isGift());
        System.out.println("Hours needed for charge:");
        System.out.println(testMobile.getChargeTime());
        System.out.println("Brand:");
        System.out.println(testMobile.getLabel());

        System.out.println("Mother in law trusts in horoscopes:");
        System.out.println(testMotherInLow.IsBeliefInHoroscope());
        System.out.println("Her weight (kg) is:");
        System.out.println(testMotherInLow.getWeight());
        System.out.println("Sons count:");
        System.out.println(testMotherInLow.getSonCount());

        System.out.println("Color of mouse:");
        System.out.println(testMouse.getColor());
        System.out.println("Click by year:");
        System.out.println(testMouse.getClickByOneYear());
        System.out.println("Mouse is comfort for use:");
        System.out.println(testMouse.IsComfort());

        System.out.println("Plant name:");
        System.out.println(testPlant.getName());
        System.out.println("It is a palm:");
        System.out.println(testPlant.IsPalmType());
        System.out.println("Leaves count:");
        System.out.println(testPlant.getLeavesCount());

        System.out.println("Spoon material:");
        System.out.println(testSpoon.getMaterial());
        System.out.println("Is it broken:");
        System.out.println(testSpoon.IsBrokenStatus());
        System.out.println("Material sample:");
        System.out.println(testSpoon.getMaterialSample());
    }
}

package homework2;

import org.junit.jupiter.api.Test;

public class VehicleCapacityCalculate {
    @Test
    public void calculating() {

        Vehicle vehicleCar = new Vehicle();

        vehicleCar.setType("Hyundai");
        vehicleCar.setTankCapacity(45);
        vehicleCar.setConsumption(6);

        Vehicle vehiclePlane = new Vehicle();

        vehiclePlane.setType("Piston Aircraft");
        vehiclePlane.setTankCapacity(12830);
        vehiclePlane.setConsumption(488);

        Vehicle vehicleTrain = new Vehicle();

        vehicleTrain.setType("TomasTrain");
        vehicleTrain.setTankCapacity(1100);
        vehicleTrain.setConsumption(125);


        Route routeFirst = new Route();

        routeFirst.setStartName("Riga");
        routeFirst.setFinishName("Marupe");
        routeFirst.setDistance(17);

        Route routeSecond = new Route();

        routeSecond.setStartName("Marupe");
        routeSecond.setFinishName("Jurmala");
        routeSecond.setDistance(107);

        Route routeThird = new Route();

        routeThird.setStartName("Jurmala");
        routeThird.setFinishName("Malta");
        routeThird.setDistance(2005);

        //Car
        int fuelCarFirstRoute = (int) (vehicleCar.getConsumption() * routeFirst.getDistance() / 100);
        int resultCarFirst = (int) (vehicleCar.getTankCapacity() * routeFirst.getDistance() / fuelCarFirstRoute);

        int fuelCarSecondRoute = (int) (vehicleCar.getConsumption() * routeFirst.getDistance() / 100);
        int resultCarSecond = (int) (vehicleCar.getTankCapacity() * routeSecond.getDistance() / fuelCarSecondRoute);

        int fuelCarThirdRoute = (int) (vehicleCar.getConsumption() * routeThird.getDistance() / 100);
        int resultCarThird = (int) (vehicleCar.getTankCapacity() * routeThird.getDistance() / fuelCarThirdRoute);

        //Plane
        int fuelPlainFirstRoute = (int) (vehiclePlane.getConsumption() * routeFirst.getDistance() / 100);
        int resultPlaneFirst = (int) (vehiclePlane.getTankCapacity() * routeFirst.getDistance() / fuelPlainFirstRoute);

        int fuelPlainSecondRoute = (int) (vehiclePlane.getConsumption() * routeSecond.getDistance() / 100);
        int resultPlaneSecond = (int) (vehiclePlane.getTankCapacity() * routeSecond.getDistance() / fuelPlainSecondRoute);

        int fuelPlainThirdRoute = (int) (vehiclePlane.getConsumption() * routeThird.getDistance() / 100);
        int resultPlaneThird = (int) (vehiclePlane.getTankCapacity() * routeThird.getDistance() / fuelPlainThirdRoute);

        //Train
        int fuelTrainFirstRoute = (int) (vehicleTrain.getConsumption() * routeFirst.getDistance() / 100);
        int resultTrainFirst = (int) (vehicleTrain.getTankCapacity() * routeFirst.getDistance() / fuelTrainFirstRoute);

        int fuelTrainSecondRoute = (int) (vehicleTrain.getConsumption() * routeSecond.getDistance() / 100);
        int resultTrainSecond = (int) (vehicleTrain.getTankCapacity() * routeSecond.getDistance() / fuelTrainSecondRoute);

        int fuelTrainThirdRoute = (int) (vehicleTrain.getConsumption() * routeThird.getDistance() / 100);
        int resultTrainThird = (int) (vehicleTrain.getTankCapacity() * routeThird.getDistance() / fuelTrainThirdRoute);


        //First result
        System.out.println("Route from " + routeFirst.getStartName() + " to " + routeFirst.getFinishName() + ":");

        if (resultCarFirst > routeFirst.getDistance()) {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarFirstRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarFirstRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultTrainFirst > routeFirst.getDistance()) {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainFirstRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainFirstRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultPlaneFirst > routeFirst.getDistance()) {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainFirstRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainFirstRoute + " (l), can not be reached by one fuel tank");
        }


        //Second route
        System.out.println("Route from " + routeSecond.getStartName() + " to " + routeSecond.getFinishName() + ":");

        if (resultCarSecond > routeSecond.getDistance()) {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarSecondRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarSecondRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultTrainSecond > routeSecond.getDistance()) {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainSecondRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainSecondRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultPlaneSecond > routeFirst.getDistance()) {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainSecondRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainSecondRoute + " (l), can not be reached by one fuel tank");
        }


        //Third route
        System.out.println("Route from " + routeThird.getStartName() + " to " + routeThird.getFinishName() + ":");

        if (resultCarThird > routeThird.getDistance()) {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarThirdRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Car " + vehicleCar.getType() + ": " + fuelCarThirdRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultTrainThird > routeThird.getDistance()) {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainThirdRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Train " + vehicleTrain.getType() + ": " + fuelTrainThirdRoute + " (l), can not be reached by one fuel tank");
        }

        if (resultPlaneThird > routeFirst.getDistance()) {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainThirdRoute + " (l), can be reached by one fuel tank");
        } else {
            System.out.println("Plain " + vehiclePlane.getType() + ": " + fuelPlainThirdRoute + " (l), can not be reached by one fuel tank");
        }
    }
}


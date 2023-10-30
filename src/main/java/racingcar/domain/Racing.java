package racingcar.domain;

import java.util.List;

public class Racing {
    private List<Car> racingCar;

    private Racing() {
    }

    public Racing(final List<Car> racingList) {
        this.racingCar = racingList;
    }

    public void run() {
        Judgment judgment = new Judgment();
        NumberGenerator numberGenerator = new NumberGenerator();
        for (Car car : racingCar) {
            if (judgment.isMoreThanFour(numberGenerator.createRandomNumber())) {
                car.forward();
            }
            printCarLocation(car);
        }
        System.out.println();
    }

    private void printCarLocation(Car car) {
        System.out.println(car.currentLocation());
    }
}

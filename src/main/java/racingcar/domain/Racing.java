package racingcar.domain;

import java.util.List;

public class Racing {

    Judgment judgment = new Judgment();
    NumberGenerator numberGenerator = new NumberGenerator();

    private List<Car> racingCar;

    private Racing() {
    }

    public Racing(final List<Car> racingList) {
        this.racingCar = racingList;
    }

    public void run(){
        for(Car car : racingCar){
            if (judgment.isMoreThanFour(numberGenerator.createRandomNumber())){
                car.forward();
            }
            System.out.println(car.currentLocation());
        }
        System.out.println();
    }
}

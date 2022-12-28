
import org.example.MechanicCar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MechanicCarTest {

    @Test
    void testMechanicRaceCar(){
        MechanicCar raceCar = new MechanicCar.RaceCarBuilder().speed(130).build();
        Assert.assertEquals(false, raceCar.getChildChair());
    }

    @Test
    void testMechanicSchoolCar(){
        MechanicCar schoolCar = new MechanicCar.SchoolCarBuilder().build();
        Assert.assertEquals(50, schoolCar.getSpeed());
        Assert.assertEquals(true, schoolCar.getChildChair());
    }


}

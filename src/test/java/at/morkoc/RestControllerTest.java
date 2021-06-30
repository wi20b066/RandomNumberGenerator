package at.morkoc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestControllerTest {

    @Test
    public void min_test(){
//        Arrange
        RestController controller = new RestController();
//        Act
        int number = controller.rndNumber();
//        Assert
        Assertions.assertTrue(number >= 500);
    }

    @Test
    public void max_test(){
//        Arrange
        RestController controller = new RestController();
//        Act
        int number = controller.rndNumber();
//        Asserts
        Assertions.assertTrue(number <= 600);
    }

}

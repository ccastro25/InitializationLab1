package castro.caonabo.intializationLab1;

import castro.caonabo.InitializationLab1.ColorfulThing;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/10/16.
 */
public class GetColorTest {

    ColorfulThing black =new ColorfulThing(ColorfulThing.Color.black);

    ColorfulThing.Color expected = ColorfulThing.Color.black;
    ColorfulThing.Color actual =  black.getColorfulThing();

    @Test
    public void tesingColor(){

        Assert.assertEquals("the color should print purple ",expected,actual);
    }

}

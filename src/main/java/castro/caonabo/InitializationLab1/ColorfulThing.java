package castro.caonabo.InitializationLab1;

import sun.plugin.dom.core.CoreConstants;
import sun.text.resources.ro.CollationData_ro;

/**
 * Created by castro on 9/10/16.
 */
public class ColorfulThing {

    private Color colorString;

public enum Color {
    blue, green,black,yellow,red
}

    public ColorfulThing( Color colorString){
       this.colorString = colorString;

    }

    public Color getColorfulThing(){

        return colorString;
    }


    public void printColor(){

        System.out.println(this.colorString);
    }
}

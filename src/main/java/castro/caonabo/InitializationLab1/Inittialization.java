package castro.caonabo.InitializationLab1;

import sun.text.resources.ro.CollationData_ro;

public class Inittialization {

    public static void main(String[] args) {



        ColorfulThing red =  new ColorfulThing(ColorfulThing.Color.red);
        ColorfulThing blue =  new ColorfulThing(ColorfulThing.Color.blue);
        ColorfulThing green =  new ColorfulThing(ColorfulThing.Color.green);
        ColorfulThing yellow =  new ColorfulThing(ColorfulThing.Color.yellow);
        ColorfulThing black =  new ColorfulThing(ColorfulThing.Color.black);
        //ColorfulThing pink = new ColorfulThing();

        BoringThing boring1 = new BoringThing();
        BoringThing boring2 = new BoringThing();
        BoringThing boring3 = new BoringThing();
        BoringThing boring4 = new BoringThing();
        BoringThing boring5 = new BoringThing();

        red.printColor();
        blue.printColor();
        green.printColor();
        yellow.printColor();
        black.printColor();
    }


}

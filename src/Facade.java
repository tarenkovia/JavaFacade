public class Facade {
    private FirstAutomaticFactory faf;
    private SecondAutomaticFactory saf;
    private ThirdAutomaticFactory taf;

    public Facade(){
        faf = new FirstAutomaticFactory();
        saf = new SecondAutomaticFactory();
        taf = new ThirdAutomaticFactory();
    }

    public void startLighting(){
        faf.startLighting();
        saf.startLighting();
        taf.startLighting();
    }

    public void startVentilation(){
        faf.startVentilation();
        saf.startVentilation();
        taf.startVentilation();
    }

    public void unloadingOfTheControlSystem(){
        faf.unloadingOfTheControlSystem();
        saf.unloadingOfTheControlSystem();
        taf.unloadingOfTheControlSystem();
    }

    public void machineConfiguration(){
        faf.machineConfiguration();
        saf.machineConfiguration();
        taf.machineConfiguration();
    }

    public void preSetup(){
        faf.preSetup();
        saf.preSetup();
        taf.preSetup();
    }

    public void startingTheMainSystem(){
        faf.startingTheMainSystem();
        saf.startingTheMainSystem();
        taf.startingTheMainSystem();
    }

    public void startingThePipeline(){
        faf.startingThePipeline();
        saf.startingThePipeline();
        taf.startingThePipeline();
    }

    public void sequentialShutdownOfSystems(){
        faf.sequentialShutdownOfSystems();
        saf.sequentialShutdownOfSystems();
        taf.sequentialShutdownOfSystems();
    }

    public void turningOffVentilation(){
        faf.turningOffVentilation();
        saf.turningOffVentilation();
        taf.turningOffVentilation();
    }

    public void turningOffTheLight(){
        faf.turningOffTheLight();
        saf.turningOffTheLight();
        taf.turningOffTheLight();
    }
}

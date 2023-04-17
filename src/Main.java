public class Main {
    public static void TimeToSleep(long secondsToSleep){
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        int secondsToSleep = 5;
        int secondsToSleep2 = 10;
        System.out.println("Загрузка симуляции...");
        TimeToSleep(secondsToSleep);
        System.out.println("Приветсвуем тебя в нашей новой симуляции управляющего завода!");
        TimeToSleep(secondsToSleep);
        System.out.println("Тут ничего сложного нет, достаточно просто запустить все рубильники и наслаждаться");
        TimeToSleep(secondsToSleep);
        System.out.println("А в нужный момент просто всё выключить!");
        TimeToSleep(secondsToSleep);
        System.out.println();

        System.out.println("Загрузка заводов (имени золотого века литературы) и управляемого интерфейса...");
        TimeToSleep(secondsToSleep);
        System.out.println("Загрузка и построение завода имени Н.В.Гоголя");
        TimeToSleep(secondsToSleep);
        System.out.println("Загрузка и построение завода имени М.Ю.Лермонтова");
        TimeToSleep(secondsToSleep);
        System.out.println("Загрузка и построение завода имени А.С.Пушкина");
        TimeToSleep(secondsToSleep);
        System.out.println();
        Facade facade = new Facade();
        facade.startLighting();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.startVentilation();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.unloadingOfTheControlSystem();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.machineConfiguration();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.preSetup();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.startingTheMainSystem();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.startingThePipeline();
        TimeToSleep(secondsToSleep);
        System.out.println();

        System.out.println("Спустя 8 часов...");
        TimeToSleep(secondsToSleep2);
        System.out.println();

        facade.sequentialShutdownOfSystems();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.turningOffVentilation();
        TimeToSleep(secondsToSleep);
        System.out.println();

        facade.turningOffTheLight();
        TimeToSleep(secondsToSleep);
        System.out.println();

        System.out.println("Завод Гоголя сгорел в третий раз...");
        TimeToSleep(secondsToSleep);
        System.out.println("Благодарим за пробное испытание симуляции!");
        TimeToSleep(secondsToSleep);
        System.out.println("Ту би континуед..");
    }
}
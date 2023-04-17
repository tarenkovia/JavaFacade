public class SecondAutomaticFactory implements MachineTool {
    @Override
    public void startLighting() {
        System.out.println("Включение света в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void startVentilation() {
        System.out.println("Включение вентиляции в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void unloadingOfTheControlSystem() {
        System.out.println("Подгрузка контрольных систем в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void machineConfiguration() {
        System.out.println("Конфигурация машин в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void preSetup() {
        System.out.println("Предустановка данных в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void startingTheMainSystem() {
        System.out.println("Включение главной системы в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void startingThePipeline() {
        System.out.println("Включение конвейера в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void sequentialShutdownOfSystems() {
        System.out.println("Последовательное выключение всех систем в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void turningOffVentilation() {
        System.out.println("Выключение вентиляции в цеху имени М.Ю.Лермонотова");
    }

    @Override
    public void turningOffTheLight() {
        System.out.println("Выключение света в цеху имени М.Ю.Лермонотова");
    }
}

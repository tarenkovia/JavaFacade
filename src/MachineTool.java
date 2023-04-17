public interface MachineTool {
    //включение света
    void startLighting();

    //запуск винтеляции
    void startVentilation();

    //подгрузка системы
    void unloadingOfTheControlSystem();

    //конфигурация машин
    void machineConfiguration();

    //прогрузка машин
    void preSetup();

    //запуск главной системы
    void startingTheMainSystem();

    //запуск конвейера
    void startingThePipeline();

    //последовательное отключение систем
    void sequentialShutdownOfSystems();

    //отключение винтеляции
    void turningOffVentilation();

    //отключения света
    void turningOffTheLight();
}

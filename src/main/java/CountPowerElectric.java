public class CountPowerElectric {
    private String locMeteringRecord; //расположение точки учета
    private String model; //модель счетчика
    private String factoryNumber; //заводской номер
    private int valueElectricPower; //значение электрической энергии
    private String unit; //ед.из.
    private int coeffTransform; //коэф. трансформации

    public CountPowerElectric(String locMeteringRecord, String model, String factoryNumber, int valueElectricPower, String unit, int coeffTransform) {
        this.locMeteringRecord = locMeteringRecord;
        this.model = model;
        this.factoryNumber = factoryNumber;
        this.valueElectricPower = valueElectricPower;
        this.unit = unit;
        this.coeffTransform = coeffTransform;
    }


}

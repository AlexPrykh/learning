package mooc_JavaProgramming_II.part_08.vehicleRegistry;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;

/*
        Part 2: Pairing plates with owners
        Реализуйте класс VehicleRegistry, который имеет следующие методы:

        1. public boolean add(LicensePlate licensePlate, String owner) назначает полученного
           владельца в качестве параметра автомобилю, который соответствует номеру, полученному
           в качестве параметра. Если у номерного знака нет владельца, метод возвращает true.
           Если к лицензии уже прикреплен владелец, метод возвращает false и ничего не делает.
        2. public String get(LicensePlate licensePlate) возвращает владельца автомобиля,
           соответствующего номеру, полученному в качестве параметра. Если автомобиля нет в реестре,
           метод возвращает значение null.
        3. public boolean remove(LicensePlate licensePlate) удаляет номерной знак и прикрепленные данные
           из реестра. Метод возвращает true в случае успешного удаления и false, если номерной знак не
           был в реестре.

        Part 3: Expanded vehicle registry
        Добавьте следующие методы в VehicleRegistry:

        4. public void printLicensePlates() печатает номерные знаки в реестре.
        5. public void printOwners() выводит владельцев машин в реестр. Каждое имя следует печатать
           только один раз, даже если конкретное лицо владеет более чем одной машиной.

    Полезный совет! В методе printOwners вы можете создать список, используемый для запоминания
    владельцев, которые уже были напечатаны. Если владельца нет в списке, его имя печатается,
    и они добавляются в список; и наоборот, если владелец находится в списке, его имя не печатается.
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(this.registry.containsKey(licensePlate))) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : this.registry.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }

        }
    }
}

package sky.pro.homework.javacore.hw24;

import java.util.HashSet;
import java.util.Set;

public class AutoRacing {

    private Set<Transport> transportSet = new HashSet<>();
    private Set<Driver> driverSet = new HashSet<>();

    public AutoRacing(Set<Transport> transportSet, Set<Driver> driverSet) {
        this.transportSet = transportSet;
        this.driverSet = driverSet;
    }

    public void printTransports() {
        transportSet.stream().forEach(System.out::println);
    }

    public void printDrivers() {
        driverSet.stream().forEach(System.out::println);
    }

    public Set<Transport> getTransportSet() {
        return transportSet;
    }

    public void setTransportSet(Set<Transport> transportSet) {
        this.transportSet = transportSet;
    }

    public Set<Driver> getDriverSet() {
        return driverSet;
    }

    public void setDriverSet(Set<Driver> driverSet) {
        this.driverSet = driverSet;
    }
}

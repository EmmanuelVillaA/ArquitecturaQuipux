package module1.controller;

public class VehicleController {
    private final VehicleService service;

    //Esta parte respeta el metodo D, ya que se inyecta desde el esterior, osea que de otro archivo
    public VehicleController(VehicleService service) {
        this.service = service;
    }

    // Esta parte respeta la S, ya que solo cumple con una responsabilidad
    public void addVehicle(String placa, String estado) {
        service.addVehicle(placa, estado);
    }

    public void ShowVehicles() {
        List<Vehicle> vehicles = service.listVehicles();
        vehicles.forEach(vehicle -> System.out.println("Placa: " + vehicle.getPlaca() + " | Estado: " + vehicle.getEstado()));
    }
}

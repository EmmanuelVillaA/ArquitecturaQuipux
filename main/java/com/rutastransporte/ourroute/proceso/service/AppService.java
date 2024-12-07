package module1.service;

import module1.repository.VehicleRepository;
import module1.repository.VehiculoRepository;

public class AppService {
    public class App {
    public static void main(String[] args) {
        
        VehicleRepository repository = new VehicleRepository();
        VehicleService service = new VehicleService(repository);
        VehicleController controller = new VehicleController(service);
        
        controller.agregarVehiculo("ABC123", "Disponible");
        controller.agregarVehiculo("XYZ789", "En tránsito");

        controller.mostrarVehiculos();
    }
}
}
// Este codigo cumple mas que todo con la L y con la O, ya que da las alternativas de que se sigan haciendo mas cosas o añadindolas sin dañar el codigo

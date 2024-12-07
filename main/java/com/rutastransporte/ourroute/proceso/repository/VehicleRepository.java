public class VehicleRepository {
    private final List<Vehicle> vehicles = new ArrayList<>();

    // esta parte cumple con la S
    public void guardar(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Y este metodo tambien, ya que solo retorna los vehiculos almacenados y es solo una responsabilidad
    public List<Vehicle> obtenerTodos() {
        return vehicles;
    }
}

package module1.model;

public class Vehicle {
    private String placa;
    private String estado;

    // Aqui se cumple la S, ya que este solo tiene una sola responsabiliad

    public Vehicle(String placa, String estado) {
        this.placa = placa;
        this.estado = estado;
    }

    // Este igual cumple con la S por lo mismo de que cumple con una sola responsabilidad y es la de devolver los valores de las propiedades

    public String getPlaca() { return placa; }
    public String getEstado() { return estado; }
}

// Cabe recalcar que aqui tambien se cumple la O, ya que si se quisieran agregar mas atributos al vehiculo, esto se podria hacer sin modificarlo
// y la L tambien podria entrar, ya que se podria usar en un lugar donde utilice "Vehicle" sin romper nada ni dañar ningun funcionamiento

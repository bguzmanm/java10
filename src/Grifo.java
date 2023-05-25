public class Grifo extends Criatura {

  private int cantidadDePlumas;

  public Grifo(String nombre, int nivel) {
    super(nombre, nivel);
  }

  public Grifo(String nombre, int nivel, int cantidadDePlumas) {
    super(nombre, nivel);
    this.cantidadDePlumas = cantidadDePlumas;
  }

  public int getCantidadDePlumas() {
    return cantidadDePlumas;
  }

  public void setCantidadDePlumas(int cantidadDePlumas) {
    this.cantidadDePlumas = cantidadDePlumas;
  }

  public void correr(){
    System.out.println(this.getNombre() + " está corriendo");
  }

  @Override
  public void atacar() {
    System.out.println(this.getNombre() + " te saca los ojos a picotazos");
  }
}

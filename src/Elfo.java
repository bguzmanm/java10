public class Elfo extends Criatura implements ICurable {

  private String etnia;
  private boolean salvaje;
  public Elfo(String nombre, int nivel) {
    super(nombre, nivel);
  }

  public Elfo(String nombre, int nivel, String etnia, boolean salvaje) {
    super(nombre, nivel);
    this.etnia = etnia;
    this.salvaje = salvaje;
  }

  public String getEtnia() {
    return etnia;
  }

  public void setEtnia(String etnia) {
    this.etnia = etnia;
  }

  public boolean isSalvaje() {
    return salvaje;
  }

  public void setSalvaje(boolean salvaje) {
    this.salvaje = salvaje;
  }

  @Override
  public void atacar() {
    System.out.println(this.getNombre() + " te ataca con un discurso de elfos libres");
  }

  @Override
  public void curar() {
    System.out.println(this.getNombre() + " se cura con un calcetín roto");
  }
}

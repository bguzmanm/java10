public class Dragon extends Criatura {

  private String tipo;

  private String lugar;
  public Dragon(String nombre, int nivel) {
    super(nombre, nivel);
  }

  public Dragon(String nombre, int nivel, String tipo, String lugar) {
    super(nombre, nivel);
    this.tipo = tipo;
    this.lugar = lugar;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public void volar(){
    System.out.println(this.getNombre() + " está volando" );
  }

  @Override
  public void atacar() {
    System.out.println(this.getNombre() + " ataca y lanza fuego");
  }
}

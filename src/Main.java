import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Criatura> lista = new ArrayList<Criatura>();

    Dragon chimuelo = new Dragon("Chimuelo", 10, "Sombra Gris", "Noruega");
    lista.add(chimuelo);

    lista.add(new Grifo("Norberto", 5, 1500));
    lista.add(new Elfo("Dobby", -1, "Domestica", false));

    for (Criatura a: lista) {
      a.atacar();

      if (a instanceof ICurable){
        ((ICurable) a).curar();
      }

    }

  }
}
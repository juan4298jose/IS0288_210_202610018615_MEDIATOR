public class Boton {
    private Mediador mediador;

    public Boton(Mediador mediador) {
        this.mediador = mediador;
    }

    public void presionar() {
        // En lugar de llamar a la alarma, le avisa al mediador
        mediador.notificar("PresionarBoton");
    }
}
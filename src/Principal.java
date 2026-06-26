public class Principal {
    public static void main(String[] args) {
        // 1. Creamos la alarma
        Alarma alarmaCasa = new Alarma();

        // 2. Creamos el mediador y le asignamos la alarma
        MediadorConcreto central = new MediadorConcreto(alarmaCasa);

        // 3. Creamos el botón y le asignamos el mediador
        Boton botonPanico = new Boton(central);

        // 4. Simulamos que el usuario presiona el botón
        System.out.println("--- Presionando el botón de pánico ---");
        botonPanico.presionar();
    }
}
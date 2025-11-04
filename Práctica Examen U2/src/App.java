public class App {
    public static void main(String[] args) throws Exception {
        GestorTrabajos gestorTrabajos = new GestorTrabajos();

        gestorTrabajos.add(new Trabajo(1,"Integrales"));
        gestorTrabajos.add(new Trabajo(2,"Presentacion de Ética"));
        gestorTrabajos.add(new Trabajo(3,"Estructuras Personalizadas"));

        gestorTrabajos.process(2);

        gestorTrabajos.commit();

        gestorTrabajos.rollback(1);

        gestorTrabajos.print();

        System.out.println("Fin del proceso");
    }
}
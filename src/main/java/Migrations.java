import com.googlecode.flyway.core.Flyway;

public class Migrations {

    public static void migrate() {
        System.out.println("Start DB Migrations");

        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:postgresql://127.0.0.1:5432/dinosaurs", "postgres", "postgres");
        try {
            flyway.init();
        } catch(Exception e) {
            System.out.println("schema_version table already initialized");
        }
        flyway.migrate();
    }

}
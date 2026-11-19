package Adapter;

public class Application {

     private final Logger logger;
     
     public Application(Logger logger) {
        this.logger = logger;
     }

     public void run() {
        logger.info("Iniciando aplicacao");
        logger.error("Falha ao conectar no banco");
     }
}
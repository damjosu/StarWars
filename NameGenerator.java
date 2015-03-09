
/**
 * @author (Josu) 
 * @version 9.3.15 (09-03-2015)
 */
public class NameGenerator
{
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String ciudad;
    private static final int LETRAS_PRIMER_APELLIDO_INICIAL = 0;
    private static final int LETRAS_PRIMER_APELLIDO_FINAL = 2;
    private static final int LETRAS_NOMBRE_INICIAL = 0;
    private static final int LETRAS_NOMBRE_FINAL = 2;
    private static final int LETRAS_SEGUNDO_APELLIDO_INICIAL = 0;
    private static final int LETRAS_SEGUNDO_APELLIDO_FINAL = 1;
    private static final int LETRAS_CIUDAD_INICIAL = 0;
    private static final int LETRAS_CIUDAD = 2;
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String nombre, String primerApellido, String segundoApellido, String ciudad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ciudad= ciudad;
    }
    
    /**
     * Genera tu nombre en el universo de Star Wars dandole tu nombre, apellido, segundo apellido y ciudad.
     */
    public void generateStarWarsName() {
        String nombreStarWars = nombre.substring(LETRAS_PRIMER_APELLIDO_INICIAL, LETRAS_PRIMER_APELLIDO_FINAL)
        + nombre.substring(LETRAS_NOMBRE_INICIAL, LETRAS_NOMBRE_FINAL);
        String apellidoStarWars = segundoApellido.substring(LETRAS_SEGUNDO_APELLIDO_INICIAL, LETRAS_SEGUNDO_APELLIDO_FINAL) 
        + ciudad.substring(LETRAS_CIUDAD_INICIAL, LETRAS_CIUDAD);
        System.out.println("Tu nombre en el universo de Star Wars sería: " + nombreStarWars + " " + apellidoStarWars);
    }
}

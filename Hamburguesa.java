public class Hamburguesa {
    // El nombre de la hamburguesa
    private String nombre;
    // El numero de carnes que lleva
    private int numeroCarnes;
    // Si tiene pepinillo o no
    private boolean tienePepinillo;    
    
    // Constructor de la clase hamburguesa
    public Hamburguesa(String nombreHamburguesa, boolean pepinillo){
        nombre = nombreHamburguesa;
        numeroCarnes = 0;
        tienePepinillo = pepinillo;
    }
    // Devuelve el nombre de la hamburguesa
    public String getNombreHamburguesa(){
        return nombre;
    }
    // Devuelve el numero de carnes que tiene la hamburguesa
    public int getNumeroCarnes(){
        return numeroCarnes;
    }
    // Devuelve si tiene pepinillo o no
    public boolean getTienePepinillo(){
        return tienePepinillo;
    }
    // Cambiar nombre de la hamburguesa
    public void setNombre(String nuevoNombre) {
	nombre = nuevoNombre;
    }
    // Meter mas carnes en la hamburguesa
    public int introducirNuevasCarnes(int nuevasCarnes) {
	numeroCarnes = numeroCarnes + nuevasCarnes;
	return numeroCarnes;
    }
    // Cambiar el booleano a su contrario
    public void introducirPepinillo(){
        if (tienePepinillo == true){
            tienePepinillo = false;
        }
        else {
            tienePepinillo = true;            
        } 
    }
    // Imprime por pantalla los 3 atributos
    public void imprimeAtributos(){
        String tienePepinilloString;
        if (tienePepinillo == true) {
            tienePepinilloString = "Sí";
        }
        else {
            tienePepinilloString = "No";
        }
        System.out.println("Nombre: " + nombre + " | Número de carnes: " + numeroCarnes + " | Tiene pepinillo: " + tienePepinilloString);   
        System.out.println();  
    }
    // Covertir lo impreso por pantalla a string
    public String estadoObjeto(){
        String tienePepinilloString;
        if (tienePepinillo == true) {
            tienePepinilloString = "Sí";
        }
        else {
            tienePepinilloString = "No";
        }
        String estadoObjeto = ("Nombre: " + nombre + " | Número de carnes: " + numeroCarnes + " | Tiene pepinillo: " + tienePepinilloString);
        return estadoObjeto;
    }
}
package clase2802;

public class Main {

	public static void main(String[] args) {
        Conjunto<String> conjunto1 = new Conjunto<>();
        conjunto1.anadir("a");
        conjunto1.anadir("b");
        conjunto1.anadir("c");
        
        conjunto1.imprimir();
        
        Conjunto<Integer> conjunto2 = new Conjunto<>();
        conjunto2.anadir(5);
        conjunto2.anadir(2);
        conjunto2.anadir(1985);
        
        conjunto2.imprimir();
        
        Conjunto<Double> conjunto3 = new Conjunto<>();
        conjunto3.anadir(3.756);
        conjunto3.anadir(0.85);
        conjunto3.anadir(156.904);
        
        Conjunto<String> conjunto4 = new Conjunto<>();
        conjunto4.anadir("a");
        conjunto4.anadir("b");
        
        conjunto4.imprimir();
        
        System.out.println("Esta contenidoel 4 en el 1? "+conjunto4.isConjuntoContenido(conjunto1));
        
        conjunto3.imprimir();
        
        Conjunto<String> conjunto5 = conjunto1.unir(conjunto4);
        
        conjunto5.imprimir();
	}

}

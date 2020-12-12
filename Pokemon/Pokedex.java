public class Pokedex{
	private final Pokemon [] pokemones;
	private String [] nombreAtaques = new String[SetupPokemon.cantidadAtaques];
        private Combate p;

	Pokedex(){
		pokemones = new Pokemon[SetupPokemon.cantidadPokemones];
		
		for(int i=0;i<SetupPokemon.cantidadPokemones;i++){
			nombreAtaques = SetupPokemon.ataques[i];
			pokemones[i] = new Pokemon(i,SetupPokemon.nombres[i],nombreAtaques);
		}
	}

	public Pokemon getPokemon(int numeroPokemon){
		return pokemones[numeroPokemon];
	}
	public void capturarPokemon(int pos){
		this.pokemones[pos].setCapturado();
	}
	public int getCantidadPokemones(){
		return SetupPokemon.cantidadPokemones;
	}
	public void listarPokedex(){
		System.out.println("Pokedex Personal");
		System.out.println("======= ========\n");
		for(int i=0;i<SetupPokemon.cantidadPokemones;i++){
			if(pokemones[i].getCapturado()){
				System.out.println("Id: "+pokemones[i].getId()+"- Nombre: "+pokemones[i].getNombre());
				for(int j=0;j<3;j++){
					System.out.println("Ataque "+pokemones[i].getAtaques()[j].getNombre()+" ");
					System.out.println("*** Daño:"+pokemones[i].getAtaques()[j].getDano());
					System.out.println("*** Cura:"+pokemones[i].getAtaques()[j].getCura());
					System.out.println("*** Bloqueo:"+pokemones[i].getAtaques()[j].getBloqueo());
                                        
				}
                                System.out.println("***Nivel: " + pokemones[i].getnivel()+ "***");
                                System.out.println("***Experiencia: "+ pokemones[i].getexp()+"***");
				System.out.println("**********************");
			}
				
		}
		System.out.println("\n\nPresione ENTER para continuar");
	}
}
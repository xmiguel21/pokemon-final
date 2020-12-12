import java.io.*;

public class Juego{
	private Pokedex pokedexGral;
	private Partida [] partidas;
	private int contadorPartidas;
	private Mapa mapaGral;

	private BufferedReader buffer;

	Juego(){
		this.pokedexGral = new Pokedex();
		this.partidas = new Partida[SetupPokemon.cantidadPartidas]; 
		this.contadorPartidas = 0;
		this.mapaGral= new Mapa();
	}
	public void jugar(){
		this.partidas[this.contadorPartidas]= new Partida(pokedexGral);
	}

}
public class Mapa{
	
	private boolean gymAgua;
	private boolean gymFuego;
	private boolean gymPlanta;
	private boolean gymElectrico;
	private boolean gymHielo;

	Mapa(){
		this.gymAgua=false;
		this.gymFuego=false;
		this.gymPlanta=false;
		this.gymElectrico=false;
		this.gymHielo=false;


	}

	public boolean getGymAgua(){
		return this.gymAgua;
	}

	public void setGymAgua(){
		this.gymAgua=true;
	}

	public boolean getGymFuego(){
		return this.gymFuego;
	}

	public void setGymFuego(){
		this.gymFuego = true;
	}

	public boolean getGymPlanta(){
		return this.gymPlanta;
	}

	public void setGymPlanta(){
		this.gymPlanta = true;
	}

	public boolean getGymElectrico(){
		return this.gymElectrico;
	}

	public void setGymElectrico(){
		this.gymElectrico = true;
	}

	public boolean getGymHielo(){
		return this.gymHielo;
	}

	public void setGymHielo(){
		this.gymHielo = true;
	}

	public void setGym(int n){
		if(n==1){
			this.gymAgua=true;
		}
	}



}
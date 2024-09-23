import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalyseurDeTexte {
	private List<Observer> observerList=new ArrayList<>();

	public void addObserver(Observer observer){
		this.observerList.add(observer);
	}
	public void removeObserver(Observer observer){
		this.observerList.remove(observer);
	}

	public void lireFichier( BufferedReader lecteurAvecBuffer) throws IOException {
		String ligne;
		do{
			ligne = lecteurAvecBuffer.readLine();
			for(Observer observer:observerList){
				observer.update(ligne);
			}
		}while(ligne!=null);
	}
}

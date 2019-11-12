import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PetStore {
	private ArrayList<Mamifero> mamiferos;

	public PetStore() {	
		this.mamiferos = new ArrayList<Mamifero>();
	}

	public void adicionaAnimal(Mamifero mani) {
		mamiferos.add(mani);
	}
	public void listarAnimais() {
		for (Mamifero m : mamiferos) {
		System.out.println(m.toString());
		}
	}
	public void excluirAnimal(Mamifero mani) {
		if(this.mamiferos.contains(mani)) {
			this.mamiferos.remove(mani);
			System.out.println("[Pokemon " + mani.toString() + "excluido com sucesso!\n");
		}
		else System.out.println("Pokemon inexistente!\n");
	}
	public void excluirAnimais() {
		mamiferos.clear();
		System.out.println("Pokemons transferidos com sucesso!\n");
	}
	public void gravarAnimais() {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream (new FileOutputStream("c:\\temp\\pokemon.pkm"));
			for(Mamifero mani : mamiferos) {
				outputStream.writeObject(mani);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		} 
		finally {
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();

			}
		}
	}
	public void recuperarAnimais() {
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream (new FileInputStream("c:\\temp\\pokemon.pkm"));
			Object obj = null;
			while((obj = inputStream.readObject()) != null) {
				if(obj instanceof Gato) 
					this.mamiferos.add((Gato)obj);
				else if (obj instanceof Cao)
					this.mamiferos.add((Cao)obj);
			}
		} catch (EOFException ex) {
			System.out.println("End of file reached - Cabou...");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(inputStream != null) {
					inputStream.close();
					System.out.println("Pokemons recuperados com sucesso!\n");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
		public static void main(String args[]) {
			PetStore pet = new PetStore();

			Gato felix = new Gato("Felix", 3, "Maria");
			Gato garfield = new Gato("Garfield", 7, "Maria");
			Cao rex = new Cao ("Rex", 2, "Jose");
			Cao toto = new Cao ("Toto", 5, "Jose");

			pet.adicionaAnimal(felix);
			pet.adicionaAnimal(garfield);
			pet.adicionaAnimal(rex);
			pet.adicionaAnimal(toto);

			pet.listarAnimais();
			pet.gravarAnimais();
			pet.excluirAnimal(garfield);

			pet.listarAnimais();
			pet.excluirAnimais();

			pet.listarAnimais();
			pet.recuperarAnimais();

			pet.listarAnimais();		
		}
	}

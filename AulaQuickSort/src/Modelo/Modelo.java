package Modelo;

public class Modelo {
	
	public int[] numeros;

    public Modelo(int tamanho) {
        numeros = new int[tamanho];
    }

    public void adicionarNumero(int indice, int numero) {
        numeros[indice] = numero;
    }

    public int getNumero(int indice) {
        return numeros[indice];
    }

    public int getNumeroElementos() {
        return numeros.length;
    }
}

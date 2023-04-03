package Trabalho;

public class Conta {
	int numero;
	double saldo;
	int tipo;
	
	
	public Conta(int numero, double saldo, int tipo) {
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}


	public Conta(int numero, int tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public Conta() {
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public boolean setSaldo(double saldo) {
        if (tipo == 3 || saldo >= 0) {
            this.saldo = saldo;
            return true;
        }
        return false;
    }


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
	
	
}

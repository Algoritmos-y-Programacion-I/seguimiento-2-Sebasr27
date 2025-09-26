package model;

public class Cuenta {
    private String nombreBanco;
    private TipoCuenta tipo;
    private double saldo;


    public  Cuenta(String nombreBanco, TipoCuenta tipo, double saldo){
        this.nombreBanco = nombreBanco;
        this.tipo = tipo;
        this.saldo = saldo;
        }
        public String getNombreBanco() {
        return nombreBanco;
        }
        public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        }

        public double getSaldo() {
        return saldo;
        }
        public void setSaldo(double saldo) {
        this.saldo = saldo;
        }


        public void depositar(double monto) {
            this.saldo = saldo + monto;
        }
        public void retiar(double monto) {
            if(monto > 0 && saldo >= monto){
                saldo-=monto;
        }


    }
    }


        

    
    










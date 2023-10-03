import java.math.BigDecimal;

public class Conta {

    String numeroConta;
    int agencia;
    String nome;
    BigDecimal saldo;

    public Conta(String numeroConta, int agencia, String nome, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}

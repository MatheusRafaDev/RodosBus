package models;

public class Motorista {
    private int idMotorista;
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;

    public int getIdMotorista() { return idMotorista; }
    public void setIdMotorista(int idMotorista) { this.idMotorista = idMotorista; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
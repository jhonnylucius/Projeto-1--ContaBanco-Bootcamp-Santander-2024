public class Pessoa {
   private String nome;
   private String cpf;
   private String endereço;

   public Pessoa (String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
   }


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getEndereço() {
    return endereço;
}

public void setEndereço(String endereço) {
    this.endereço = endereço;
}
}
public enum EstadosBrasileiros {
SAO_PAULO ("SP", "São Paulo"),
RIO_JANEIRO ("RJ", "Rio de Janeiro");

private String sigla;
private String nome;

private EstadosBrasileiros(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
}

public String getSigla() {
    return sigla;
}
public String getNome() {
    return nome;
    
}
public String getNomeMaiusculo() {
    return nome.toUpperCase();
}
}
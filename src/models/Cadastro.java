package models;

import enums.Gender;

import java.util.Date;
import java.util.Objects;

public class Cadastro {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Gender sexo;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String email;
    private Long telefone;
    private Long celular;
    private boolean celularWhats;
    private String profissão;
    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    private Double pretencaoMinima;
    private Double pretencaoMaxima;
    private String Habilidades;

    public Cadastro(){

    }
    public Cadastro(String nome, String cpf, Date dataNascimento, Gender sexo, String logradouro, String numero, String bairro, String complemento, String cidade, String estado, String email, Long telefone, Long celular, boolean celularWhats, String profissão, String empresa, Double salario, boolean empregoAtual, Double pretencaoMinima, Double pretencaoMaxima, String habilidades) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhats = celularWhats;
        this.profissão = profissão;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.pretencaoMinima = pretencaoMinima;
        this.pretencaoMaxima = pretencaoMaxima;
        Habilidades = habilidades;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Gender getSexo() {
        return sexo;
    }

    public void setSexo(Gender sexo) {
        this.sexo = sexo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public boolean isCelularWhats() {
        return celularWhats;
    }

    public void setCelularWhats(boolean celularWhats) {
        this.celularWhats = celularWhats;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Double getPretencaoMinima() {
        return pretencaoMinima;
    }

    public void setPretencaoMinima(Double pretencaoMinima) {
        this.pretencaoMinima = pretencaoMinima;
    }

    public Double getPretencaoMaxima() {
        return pretencaoMaxima;
    }

    public void setPretencaoMaxima(Double pretencaoMaxima) {
        this.pretencaoMaxima = pretencaoMaxima;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadastro cadastro = (Cadastro) o;
        return Objects.equals(cpf, cadastro.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}

package util;

import models.Cadastro;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Layout {

    private Cadastro cadastro;

    public Layout(){

    }

    public Layout(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Path criarArquivo() {
        Path path = Paths.get("C:/Users/rodri/Documents/Curso MJV/mjv-school-java/UserRegistration/arquivo.csv");
        return path;
    }

    public void criarCabecalho(){
        if (cadastro != null){
            try {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("Nome").append(";");
                stringBuilder.append("CPF").append(";");
                stringBuilder.append("Data").append(";");
                stringBuilder.append("Sexo").append(";");
                stringBuilder.append("Logradouro").append(";");
                stringBuilder.append("Numero").append(";");
                stringBuilder.append("Complemento").append(";");
                stringBuilder.append("Bairro").append(";");
                stringBuilder.append("Cidade").append(";");
                stringBuilder.append("Estado").append(";");
                stringBuilder.append("E-mail").append(";");
                stringBuilder.append("Telefone").append(";");
                stringBuilder.append("Celular").append(";");
                stringBuilder.append("Celular é Whats?").append(";");
                stringBuilder.append("Profissão").append(";");
                stringBuilder.append("Empresa").append(";");
                stringBuilder.append("Salário").append(";");
                stringBuilder.append("Emprego Atual").append(";");
                stringBuilder.append("Pretenção Mínima").append(";");
                stringBuilder.append("Pretenção Máxima").append(";");
                stringBuilder.append("Habilidades").append("\n");

                Files.writeString(criarArquivo(), stringBuilder.toString(), StandardOpenOption.CREATE);

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public void criarConteudo(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        String formated = sdf.format(cadastro.getDataNascimento());

        if (cadastro != null){
            try{
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(cadastro.getNome()).append(";");
                stringBuilder.append(cadastro.getCpf()).append(";");
                stringBuilder.append(formated).append(";");
                stringBuilder.append(cadastro.getSexo()).append(";");
                stringBuilder.append(cadastro.getLogradouro()).append(";");
                stringBuilder.append(cadastro.getNumero()).append(";");
                stringBuilder.append(cadastro.getBairro()).append(";");
                stringBuilder.append(cadastro.getComplemento()).append(";");
                stringBuilder.append(cadastro.getCidade()).append(";");
                stringBuilder.append(cadastro.getEstado()).append(";");
                stringBuilder.append(cadastro.getEmail()).append(";");
                stringBuilder.append(cadastro.getTelefone()).append(";");
                stringBuilder.append(cadastro.getCelular()).append(";");
                stringBuilder.append(cadastro.isCelularWhats()).append(";");
                stringBuilder.append(cadastro.getProfissão()).append(";");
                stringBuilder.append(cadastro.getEmpresa()).append(";");
                stringBuilder.append(String.format("%.2f",cadastro.getSalario())).append(";");
                stringBuilder.append(cadastro.isEmpregoAtual()).append(";");
                stringBuilder.append(String.format("%.2f", cadastro.getPretencaoMinima())).append(";");
                stringBuilder.append(String.format("%.2f", cadastro.getPretencaoMaxima())).append(";");
                stringBuilder.append(cadastro.getHabilidades()).append("c");

                Files.writeString(criarArquivo(), stringBuilder.toString(), StandardOpenOption.APPEND);

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}

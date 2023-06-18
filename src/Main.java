import models.Cadastro;
import enums.Gender;
import util.Layout;

import java.io.IOException;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Cadastro cadastro = new Cadastro();

        cadastro.setNome("Rodrigo");
        cadastro.setCpf("097.633.701-08");
        cadastro.setDataNascimento(new Date("2003/08/04"));
        cadastro.setSexo(Gender.MASCULINO);
        cadastro.setLogradouro("Avenida Monumental");
        cadastro.setNumero("301");
        cadastro.setBairro("Total Ville");
        cadastro.setComplemento("Monumento Chifrudo");
        cadastro.setCidade("Santa Maria");
        cadastro.setEstado("Distrito Federal");
        cadastro.setEmail("rodrigodx52@gmail.com");
        cadastro.setTelefone(61998426512l);
        cadastro.setCelular(61998426512l);
        cadastro.setCelularWhats(true);
        cadastro.setProfissão("Desenvolvedor Java");
        cadastro.setEmpresa("JavaCoders");
        cadastro.setSalario(3800.0);
        cadastro.setEmpregoAtual(true);
        cadastro.setPretencaoMinima(3000.0);
        cadastro.setPretencaoMaxima(4500.0);
        cadastro.setHabilidades("Java, Spring, MySQL");

        Layout layout = new Layout(cadastro);


        layout.criarCabecalho();

        layout.criarConteudo();

    }
}
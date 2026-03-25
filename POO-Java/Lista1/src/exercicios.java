import java.util.Scanner;

public class exercicios {
    public static void exercicio1() {

        /*Comparação Inteligente de Strings. Leia dois nomes do teclado e:
        Verifique se são iguais considerando maiúsculas/minúsculas.
        Verifique se são iguais ignorando maiúsculas/minúsculas.
        Informe qual nome vem primeiro em ordem alfabética.*/

        System.out.println("Digite o primeiro nome:");
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.nextLine();
        System.out.println("Digite o segundo nome:");
        String nome2 = sc.nextLine();

        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais considerando maiúsculas e minúsculas.");
        } else {
            System.out.println("Os nomes são diferentes considerando maiúsculas e minúsculas.");
        }

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais desconsiderando maiúsculas e minúsculas.");
        } else {
            System.out.println("Os nomes são diferentes desconsiderando maiúsculas e minúsculas.");
        }

        if (nome1.compareTo(nome2) == 0) {
            System.out.println("Os nomes são iguais em ordem alfabética.");

        } else if (nome1.compareTo(nome2) < 0) {

            System.out.println("Ordem alfabética:");
            System.out.println(nome1 + ", " + nome2);
        } else {
            System.out.println("Ordem alfabética:");
            System.out.println(nome2);
            System.out.println(nome1);
        }
    }

    public static void exercicio2() {

        /*Analisador de Texto. Leia uma frase e informe:
        Quantidade total de caracteres.
        Quantidade de caracteres sem considerar espaços.
        Quantidade de vogais.
        Quantidade de consoantes.*/

        System.out.println("Digite uma frase:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        int totalCaracteres = frase.length();
        int caracteresSemEspacos = 0;
        int vogais = 0;
        int consoantes = 0;
    
    }

    public static void exercicio3() {

        /*Verificador de Senha. Leia uma senha do teclado e valide se ela:
        Possui no mínimo 8 caracteres.
        Contém pelo menos uma letra maiúscula.
        Contém pelo menos um número.
        Contém pelo menos um caractere especial.
        Exiba quais critérios foram atendidos e se a senha é válida.*/

        System.out.println("Digite sua senha:");
        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();
        
        boolean tamanho = true;
        boolean letraMaiuscula = true;
        boolean letraMinuscula = true;
        boolean numero = true;
        boolean especial = true;

        tamanho = senha.length() >= 8;
        char[] letras = senha.toCharArray();

        for (char letra : senha.toCharArray()){
            if(Character.isUpperCase(letra))
                letraMaiuscula = true;

            if(Character.isLowerCase(letra))
                letraMinuscula = true;

            if(Character.isDigit(letra))
                numero = true;

            if(!Character.isLetterOrDigit(letra))
                especial = true;
        }

        if(tamanho && letraMaiuscula && numero && especial){
            System.out.println("Senha válida.");

        } else {
            if(!tamanho)
                System.out.println("Tamanho inválido");

            if(!letraMaiuscula)
                System.out.println("Não possui letra maiúscula");

            if(!letraMinuscula)
                System.out.println("Não possui minúscula");

            if(!numero)
                System.out.println("Não possui número");

            if(!especial)
                System.out.println("Não possui caractere especial");


        
        }

    }

    public static void exercicio4() {

        /*
        Inversor de String. Leia uma palavra ou frase e exiba:
        A string invertida.
        Se ela é um palíndromo (desconsiderando espaços e maiúsculas/minúsculas).
        */

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        String invertida = "";
        boolean palindromo = true;

        for(int i = palavra.length() - 1; i>=0; i--){
            invertida += palavra.charAt(i);

        }

        String originalSemEspacos = palavra.replace(" ", "");
        String invertidaSemEspacos = invertida.replace(" ", "");

        if(originalSemEspacos.equalsIgnoreCase(invertidaSemEspacos)){
            palindromo = true;
        }

        String message = String.format("Palavra Invertida: %s,", invertida);

        if(!palindromo){
            message += " Não é um palíndromo.";
        } else {
            message += " É um palíndromo.";
        }

        System.out.println(message);

    }

    public static void exercicio5() {

        /*Tokenização de Dados. Leia uma linha no seguinte formato:
        nome;idade;curso;ira
        Carlos Silva;21;Engenharia de Computação;8.75
        O programa deve:
        Separar os dados.
        Exibir cada campo separadamente.
        Converter idade para int e IRA para double.
        Informar se o aluno está acima da média (IRA >= 7).
        */

        Scanner sc = new Scanner(System.in);

        String dado = sc.nextLine(); //Joao;40;Eng;8.3
        String [] palavras = dado.split(";");

        for(String palavra: palavras){
            System.out.println("Campo: " +palavra);
        }

        int idade = 0;
        if(palavras.length >= 2){
            idade = Integer.parseInt(palavras[1]);
        }
        System.out.println("Idade: "+idade);

        if(palavras.length >= 3){
        double ira = Double.parseDouble(palavras[3]);
        System.out.println(String.format("IRA: %f", ira));
        if(ira >= 7){
            System.out.println("Aluno acima da média.");
        } else {
            System.out.println("Aluno abaixo da média.");
        }

        sc.close();
        }

    }

     public static void ExercicioString6(){
             Scanner sc = new Scanner(System.in);

        System.out.println("Digite um parágrafo:");
        String texto = sc.nextLine();

        // Split
        String[] palavras = texto.split("\\s+");

        // Contar palavras
        int totalPalavras = palavras.length;

        // Palavra específica
        System.out.println("Digite a palavra para buscar:");
        String busca = sc.nextLine();

        int contador = 0;

        // Palavra mais longa
        String maiorPalavra = "";

        for (String p : palavras) {

            // Contagem da palavra específica
            if (p.equalsIgnoreCase(busca)) {
                contador++;
            }

            // maior palavra
            if (p.length() > maiorPalavra.length()) {
                maiorPalavra = p;
            }
        }

        // printar 
        System.out.println("Total de palavras: " + totalPalavras);
        System.out.println("Ocorrências de \"" + busca + "\": " + contador);
        System.out.println("Maior palavra: " + maiorPalavra);
                }

        public static void ExercicioString7(){

            String email;
            boolean valido = true;

            System.out.println("Digite seu email: ");
            Scanner sc = new Scanner(System.in);
            email = sc.nextLine();
            if(email.contains(" ")){
                System.out.println("Email inválido, não pode conter espaços");
                valido = false;
            }
            
            int primeiroArroba = email.indexOf("@");
            int ultimoArroba = email.lastIndexOf("@");

            if (primeiroArroba == -1 || primeiroArroba != ultimoArroba) {
                valido = false;
            }

            if(email.startsWith("@") || email.endsWith("@")) {
                System.out.println("Email inválido, '@' não pode estar no início ou no fim");
                valido = false;
            }

            if(email.startsWith(".") || email.endsWith(".")) {
                System.out.println("Email inválido, '.' não pode estar no início ou no fim");
                valido = false;
            }

            if(primeiroArroba != -1) {
                String depoisDoArroba = email.substring(primeiroArroba + 1);
                if(!depoisDoArroba.contains(".")) {
                    System.out.println("Email inválido, deve conter um '.' após o '@'");
                    valido = false;
                }
            }

            if(valido) {
                System.out.println("Email válido");
            } else {
                System.out.println("Email inválido");
            }

        }

        public static void ExercicioString8(){

            String texto;

            System.out.println("Digite um texto: ");
            Scanner sc = new Scanner(System.in);
            texto = sc.nextLine();

            StringBuilder resultado = new StringBuilder();

            int contador = 1;

            for (int i = 0; i < texto.length(); i++) {
                if (i < texto.length() - 1 && texto.charAt(i) == texto.charAt(i + 1)) {
                contador++;
                } else {

                resultado.append(texto.charAt(i));
                resultado.append(contador);
                contador = 1;
                }
                
            }

            System.out.println("Compactado: " + resultado);

        }

        public static void ExercicioString9(){

           Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo:");
        String nome = sc.nextLine();

        nome = nome.trim();

        String[] partes = nome.split("\\s+");

        for (int i = 0; i < partes.length; i++) {
            partes[i] = partes[i].substring(0, 1).toUpperCase() +
                        partes[i].substring(1).toLowerCase();
        }

        String sobrenome = partes[partes.length - 1];
        StringBuilder resultado = new StringBuilder();

        resultado.append(sobrenome).append(", ");

        resultado.append(partes[0]);

        for (int i = 1; i < partes.length - 1; i++) {
            resultado.append(" ");
            
            String p = partes[i].toLowerCase();
            if (p.equals("da") || p.equals("de") || p.equals("do") || 
                p.equals("das") || p.equals("dos")) {
                resultado.append(p);
            } else {
                resultado.append(partes[i]);
            }
        }

        System.out.println("Formatado: " + resultado);
        

        }
    public static void main(String[] args) throws Exception {
        
        ExercicioString1();
        ExercicioString2();
        ExercicioString3();
        ExercicioString4();
        ExercicioString5();
        ExercicioString6();
        ExercicioString7();
        ExercicioString8();
        ExercicioString9();


            

    }
}





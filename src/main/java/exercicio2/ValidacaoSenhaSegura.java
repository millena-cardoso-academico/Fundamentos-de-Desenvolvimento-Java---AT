package exercicio2;
public class ValidacaoSenhaSegura {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java ValidacaoSenhaSegura <nome> <senha>");
            return;
        }

        String nome = args[0];
        String senha = args[1];

        if (validarSenha(senha)) {
            System.out.println("Senha válida! Cadastro realizado com sucesso para " + nome + ".");
        } else {
            System.out.println("Senha inválida. Tente novamente.");
        }
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            System.out.println("A senha deve ter no mínimo 8 caracteres.");
            return false;
        }

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        String caracteresEspeciais = "!@#$%^&*()-+";

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
            if (Character.isDigit(c)) {
                temNumero = true;
            }
            if (caracteresEspeciais.contains(String.valueOf(c))) {
                temEspecial = true;
            }
        }

        if (!temMaiuscula) {
            System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!temNumero) {
            System.out.println("A senha deve conter pelo menos um número.");
        }
        if (!temEspecial) {
            System.out.println("A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
        }

        return temMaiuscula && temNumero && temEspecial;
    }
} // Para teste:  java ValidacaoSenhaSegura.java João Senha@123

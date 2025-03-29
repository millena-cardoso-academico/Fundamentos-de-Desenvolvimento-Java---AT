package exercicio5;

public class SaudacaoCGI {

    public static void main(String[] args) {
        // Cabeçalhos HTTP
        String cabecalhoContentType = "Content-Type: text/html"; // Header
        String linhaEmBranco = "";

        // body
        String html = "<html>\n" +
                "<head><title>Saudação CGI</title></head>\n" +
                "<body>\n" +
                "  <h1>Olá, Terráqueos!</h1>\n" +
                "</body>\n" +
                "</html>";

        System.out.println(cabecalhoContentType);
        System.out.println(linhaEmBranco);
        System.out.println(html);
    }
}
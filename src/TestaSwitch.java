public class TestaSwitch {
    public static void main (String[] args){

        /*Em um switch, podemos trabalhar com tipos numéricos INTEIROS e Strings */
        /*Double e float nao podem ser usados em um switch */
        int opcao =7;
        final int var = 5;
        switch (opcao){
            case 1:
            System.out.println("Primeira opcao");   
            break; // quando o switch chegar no case especificado, o break quebra a compilaçao do switch
            //impedindo que mostre outros resultados

            case 2:
            System.out.println("Segunda opção");
            // break;  - se o valor da variavel opcao for 2, compila o case 2 e tmb o case 3 pq comentei o break
            //break sao importantes no switch para parar o looping 

            case 3:
            System.out.println("Terceira opção");
            break; 

            case (9-5): //4 - podemos sim fazer operacao nos cases
            System.out.println("Quarta opcao");
            break;

            //se nao cair em nenhum dos cases, imprime o case default
            default: // o case default pode ser codificado em qualquer parte do meu switch
            System.out.println("Default"); 
            break;

            //Nao podemos fazer case variavel, a nao ser que essa variavel seja final, ou seja, não há possibilidades de mudar  o seu valor
            //final int var = 5 - declarado acima
            case var: // entao se opcao = 5, cai nesse case
                System.out.println("Exemplo var final no switch");
            break;

            //podemos ter um case vazio, isso é
            case 8:
            break;
        }
        
        //Argumento String, e cases String
        String s = "Oi";        
        switch (s) {
            case "Oi": System.out.println("Olá");
            case "Hi": System.out.println("Hello");
        }

        
        int valor = 20;
        final int CINCO = 5;
        int trinta = 30;

        switch (valor) {
            case CINCO: // constante
                System.out.println(5);
            case 10: // literal
                System.out.println(10);
            case CINCO * 4: // operação com constante e literal
                System.out.println(20);
            case trinta: // erro, variável
                System.out.println(30);
            case trinta + CINCO: //erro, operação envolvendo variável
                System.out.println(35);
            case null: // erro, null em case
                System.out.println("null");
        }
        /*Para ser considerada uma constante em um case, a variável, além de ser final, também
         deve ter sido inicializada durante a sua declaração. Inicializar a
         variável em outra linha faz com que ela não possa ser usada como valor em um case: */
         
        int v = 10;
        final int DEZ = 10;
        final int VINTE; // final, mas não inicializada
        VINTE = 20; // inicializada

        switch (v) {
        case DEZ:
            System.out.println("DEZ!");
            break;
        case VINTE: //erro
            System.out.println("DEZ!");
            break;
        }
    }
}

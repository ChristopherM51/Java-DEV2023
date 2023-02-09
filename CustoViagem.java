public class CustoViagem {
    public static void main(String[] args) {
        int distanciaPercorrida = 300;
        // distancia percorrida em km
        int custoCombustivel = 5;
        // Custo por litro de combustivel
        int autonomiaPorLitro = 12;
        // quantidade de km por litro de combustivel
        float CustoViagem = (distanciaPercorrida / autonomiaPorLitro) * custoCombustivel;

        System.out.println("o custo da viagem é " + CustoViagem);
    }
}

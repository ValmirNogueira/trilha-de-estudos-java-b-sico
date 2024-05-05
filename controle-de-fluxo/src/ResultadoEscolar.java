public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;
       
       String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? " Possível recuperação ": nota >=4 && nota < 5? "Recuperação direto": " Reprovado";
   System.out.println(resultado);
   
    }
    
}

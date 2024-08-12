public class App {
    public static void main(String[] args) {
        System.out.println("METODO 1: "+met1(6,6));
        System.out.println("METODO 2: "+met2(2, 7));
        System.out.println("METODO 3: "+met3(5));
        System.out.println("METODO 4: "+met4(5));
        System.out.println("METODO 5: "+met5(2, 2));
        int[] vet = {1, 2};
        int[] vet2 = {1, 2, 3};
        System.out.println("METODO 6: ");
        vet = met6(vet);
        for (int i = 0; i < vet.length; i++) {
             System.out.println(vet[i]+"");
        }
        System.out.println("METODO AULA 1: "+metAula1(5));
        System.out.println("METODO AULA 2: "+metAula2Fib(1));
        System.out.println("METODO AULA 3: "+metAula3(2, 4));
        System.out.println("METODO AULA 2 FIB: "+aula2Metodo3Fib(5));
        System.out.println("METODO AULA 2 SOMATORIO: "+aula2Metodo4Som(5,9));
        System.out.println("METODO AULA 2 PALINDROME: "+aula2Metodo5Palindromo("bob"));
    }

     
    
    public static int aula2Metodo1Fatorial(int n){
        //!5 = 5*4*3*2*1
        if(n==0){
            return 1;
        }
        else{
            return n*aula2Metodo1Fatorial(n-1);
        }
    }

    public static int aula2Metodo2somatorio(int n){ 
        int res=0;
        if(n==0){
            return 0;
        }
        if(n<0){
            throw new IllegalArgumentException("n deve ser maior que 0");
        }
        else{
            res = n + aula2Metodo2somatorio(n-1);
        }
        return res;
    }

    public static int aula2Metodo3Fib(int n){
        // 1 1 2 3 5 8 13 21 34 55
        int res = 0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            res = aula2Metodo3Fib(n-1)+aula2Metodo3Fib(n-2);
        }
        return res;        
    }

    public static int aula2Metodo4Som(int k,int j){
        int res = 0;
        if(j<k){
            return res;
        }
        else{
            res = j + aula2Metodo4Som(k, j-1);
        }
        return res;
    }

    public static boolean aula2Metodo5Palindromo(String s){ 
        return aula2Metodo5Palindromo(s, 0, s.length()-1);
    }

    private static boolean aula2Metodo5Palindromo(String s, int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        
        return aula2Metodo5Palindromo(s, i+1, j-1);
    }

    



    public static int aula2Metodo2(int n){
       return 0;
    }


    
    public static int met1(int a, int b){
        int res = 0;
        if (a == 1){
            res = b;
        } else {
            res = b + met1(a-1, b);
        }
        return res;
    }

    public static int met2(int a, int b){
        int res = 0;
            if(b!=0){ 
                res = met2(a, b-1)+1;
            } 
            else if(a!=0 && b==0){
                res = met2(a-1, b)+1;
            } 
        
        
        return res;
    }

    public static double met3(int n){
        double res = 0.0;
            if(n>1){
                res = (double)1/n + met3(n-1);
            }
            else{
                res+=n;
            }
        
        return res;
    }

    public static int met4(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        else{
            return 2*met4(n-1)+3*met4(n-2);
        }
    }

    public static int met5(int m, int n){
        if(m==0){
            return n+1;
        }
        if(m!=0 && n==0){
            return met5(m-1, 1);
        }
        else{
            return met5(m-1, met5(m, n-1));
        }
    }




    public static int[] met6(int[] vet) {
        return met6(vet, 0, 0, 1);
    }
    
    private static int[] met6(int[] vet, int cont, int soma, int produto) {
        if (cont < vet.length) {
            soma += vet[cont];
            produto *= vet[cont];
            return met6(vet, cont + 1, soma, produto);
        } else {
            return new int[]{soma, produto};
        }
    }

    public static int metAula1(int n){ 
        int res=0;
        if(n==0){
            return 0;
        }
        if(n<0){
            throw new IllegalArgumentException("n deve ser maior que 0");
        }
        else{
            res = n + metAula1(n-1);
        }
        return res;
    }

    public static int metAula2Fib(int n){
        int res=0;
        int cont = n*10;
        if(n<=0){
            return 0;
        }
        if(cont==1){https://github.com/PUCRS-Poli-ES-ALAV/2-mais-exercicios-de-recursao-benjamin-bernardo
            res = 1;
        }
        if(cont==2){
            res = 1;
        }
        if(cont!=0){
             res = metAula2Fib(cont-1)+metAula2Fib(cont-2);
             cont--;
        }
        return res;
    }

    public static int metAula3(int k, int j){
        int res=0;
        if(j!=k){
            res = j + metAula3(k,j-1);
        }
        return res;
    }

    public static boolean metAula5isPal(String s){
        //CASOS BASE
        //TAMANHO DA STRING = 0 -> TRUE
        //TAMANHO DA STRING = 1 -> TRUE
        //TAMANHO DA STRING = 2 -> COMPARA OS DOIS CARACTERES
        //charAt(0) != charAt(length-1) -> FALSE
        //CASOS ERRO
        //STRING == NULL
        //CASOS RECURSIVOS
        //charAt(0) == charAt(length-1) -> CHAMAR A FUNÇÃO NOVAMENTE COM A STRING SEM O PRIMEIRO E O ULTIMO CARACTERE
        String invertido = "";
        if(s.length()==0){
            return true;
        }
        else{
            invertido = s.charAt(s.length()-1)+invertido;
            return s.equals(invertido);
        }
    }



}
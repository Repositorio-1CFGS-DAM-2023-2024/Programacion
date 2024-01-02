import java.util.Arrays;

public class EntregaArrays {
    public static void main(String[] args) {
        int suma=0,i;
        int v[]=new int[10];

        for( i=0;i<v.length;i++){
            v[i]= (int) (Math.random()*31);
        }Arrays.sort(v);


        //b y c
        for( i=0;i<v.length;i++){
           suma=suma+v[i];
        }

        for( i=0;i<v.length;i++){
            System.out.print(v[i]+" ");

        }
        System.out.println(" ");
        System.out.print("La suma de tots el valors es "+suma+" ");
        System.out.println();
        System.out.print("La media de los valores es "+(suma/10));
        System.out.println(" ");
        //d
        int maximo=0,minimo=1000000;
        for( i=0;i<v.length;i++){
            if(maximo<v[i]){
                maximo=v[i];
            }
            if(minimo>=v[i]){
                minimo=v[i];
            }
        }
        System.out.println("El máximo es: "+ maximo);
        System.out.println("El mínimo es: " +minimo);
        System.out.println(" ");
        //e
        int v1[]={-10,-10,-10,-10,-10,-10,-10,-10,-10,-10};
        for( i=0;i<v.length;i++){
            System.out.print(v1[i]+" ");
        }
        System.out.println(" ");
        //f
         int []copia=v1;
         copia[5]=3;
         copia[9]=3;
           System.out.print("Esta es la copia"+Arrays.toString(copia));
        System.out.println(" ");
        //h
        int []v3=new int[10];
        int multi=1;
        for( i=0;i<v3.length;i++){
            multi=v[i]*copia[i];
            v3[i]=multi;
        }

        System.out.print("La multiplicación de el primer vector con el último es:");
        Arrays.sort(v3);
        for( i=0;i<v3.length;i++){
            System.out.print(v3[i]+" ");
        }






    }




}












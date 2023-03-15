public class home {public static void main(String[] args) {
    int[] mas = new int[15];
    int j;
    j = 0;
    for(int i=0; i<mas.length; i++){
        mas[i] = (int)(Math.random()*10);
    }
    for(int i=0; i<mas.length; i++) {
        if(mas[i]%2==0) {
            j++;
        }
        System.out.print(mas[i]+" ");
    }
    System.out.println();
    System.out.println(j);
}
}

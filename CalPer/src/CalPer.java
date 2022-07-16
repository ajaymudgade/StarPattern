import java.util.*;
class Per{
    int sub[];

    void Eight(int sub[]){
    this.sub = sub;
    }

    void Nine(){
        int agg = 0;
        float per;

        for (int i=0; i<sub.length; i++){
            agg = agg + sub[i];
        }
        per = agg / sub.length;
        System.out.println("Total Percentage : "+per);
    }
    void Ten(){
        int agg = 0;
        float per;

        for (int i=0; i<sub.length - 1; i++){
            agg = agg + sub[i];
        }
        per = agg / sub.length;
        System.out.println("Best of five Percentage : "+per);
    }

}

public class CalPer {
    public static void main(String[] args) {
        Per p = new Per();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];

        System.out.println("Enter Subject Marks : ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       p.Eight(arr);
        p.Nine();
        p.Ten();
    }
}

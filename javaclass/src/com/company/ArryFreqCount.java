package com.company;

class freq{
    int a[];

    void setFreq(int a[]){
        this.a = a;
    }

    void countFreq(){

        for (int i=0; i<a.length; i++){
            a[i]++;
            if (a[i] == i){
                System.out.printf("%d appears %d times\n", i, a[i]);
            }
        }
    }

}


class ArryFreqCount{
    public static void main(String[] args) {
        freq f = new freq();
        int[] a = {2,3,3,2,1};

        f.setFreq(a);
        f.countFreq();


    }
}
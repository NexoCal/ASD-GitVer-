public class mainSrc {

    static int BinSearch(int [] x, int y){
        boolean found = false;
        int kiri = 0; //Ini diubah ke 0 sebab jika 1 akan melewatkan indek 0;
        int kanan = x.length-1; //x.length-1 sebab ukuran dari array sebenarnya, supaya tidak Out of Bound;
        int posisi = 0;

        while(found == false && kiri <= kanan){
            int middle = (kiri+kanan)/2;
            if (x[middle] == y){
                found = true;
                posisi = middle;
                break;
            }else if(y < x[middle]){
                kanan = middle-1;
            }else{
                kiri = middle + 1;
            }     
        }
        if(found){
            return posisi;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        
        int [] x = {1,2,3,4,5,6,7,8,9,10};
        int result = BinSearch(x, 69);
        if (result != -1){
            System.out.println("Data yang dicari berada pada index: "+ result);
        }else{
            System.out.println("Data yang dicari tidak ada");
        }
        
    }
}

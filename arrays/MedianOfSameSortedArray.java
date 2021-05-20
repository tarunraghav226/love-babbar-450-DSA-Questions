public class MedianOfSameSortedArray {
    public static int median(int[] arr, int s,int e){
        return (arr[(s+e)/2]+arr[(s+e+1)/2])/2;
    }

    public static int getMedian(int[] a1, int sa, int ea, int[] a2, int sb, int eb){
        if(ea-sa <= 1){
            return (Math.max(a1[sa], a2[sb]) + Math.min(a1[ea],a2[eb])) / 2; 
        }
        int m1 = median(a1, sa, ea);
        int m2 = median(a2, sb, eb);

        if(m1==m2) return m1;
        if(m1 > m2)
            return getMedian(a1, sa, (sa + ea +1)/2, a2, (sb + eb +1)/2, eb);
        return getMedian(a1, (sa + ea + 1)/2, ea, a2, sb, (sb+eb+1)/2);
    }
    public static void main(String[] args) {
        
    }
}

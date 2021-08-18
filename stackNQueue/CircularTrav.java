public class CircularTrav{
    int tour(int petrol[], int distance[]){
        int deficit=0, start=0,cal=0;
        for(int i=0;i<petrol.length;i++){
            cal+=petrol[i]-distance[i];
            if(cal<0){
                start=i+1;
                deficit+=cal;
                cal=0;
            }
        }
        return (cal+deficit)>=0 ? start :-1;
    }
}
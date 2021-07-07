
public class Challenge1 {

    public void challenge(int a, int b, int n){

            for(int j=0; j<n; j++){
                double mainIncreament=0;

                for(int k=0; k<=j; k++){
                double increament = Math.pow(2,k);
                double totalIncreament = increament*b;
                mainIncreament = totalIncreament+mainIncreament;

                }
                System.out.println(a+(int)mainIncreament);

            }
        }
    }



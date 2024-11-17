public class App {
    
    public static void main(String[] args) {
        int n = 5; 
        int m=5;
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++)
            {
                if(i==3||i==1&&j==3||i==2&&j==2||i==2&&j==4||i==4&&j==2||i==4&&j==4||i==5&&j==2||i==5&&j==4||i==5&&j==3)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            
            System.out.println();
        }
    }
}
import java.util.*;
public class BitManipulation {
static int bitMask;

    //Find the respective bit is 1 or 0
    static void get(int x){
        if((x & bitMask)==0)
        System.out.println("The bit is 0.");
        else
        System.out.println("The bit is 1.");
    }

    //Convert to respective position bit to 0
    static int clear(int x){
        int newBitMask=~bitMask;
        x=newBitMask&x;
        return x;
    }

//Convert to respective position bit to 1
static int set(int x){
    x=bitMask | x;
    return x;
}

//Updaing the respective bit position
static void update(int  x){
    System.out.println("Updating the bit");
    if((x & bitMask)==0)
    System.out.println("changing the position bit to 1: "+set(x));
    else
    System.out.println("changing the position bit to 0: "+clear(x));
}

    static int deciToBinary(int x){
        int d=0;
       while (x!=0){
        d=d*10+x%2;
        x=x/2;
       }
       return d;
    }

    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        System.out.print("Enter the position: ");
        int p=in.nextInt()-1;
        System.out.println(n+" in binary: "+(deciToBinary(n)));
        bitMask=n<<p;
        get(n);//Identify the respective bit is 1 or 0

        System.out.println("changing the position bit to 0: "+clear(n));
        System.out.println(clear(n)+" in binary: "+deciToBinary(clear(n)));
        System.out.println("changing the position bit to 1: "+set(n));
        System.out.println(set(n)+" in binary: "+deciToBinary(set(n)));

        update(n);
    }
}

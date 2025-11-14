public class TOH {
    public static void printTOH(int n , String src , String helper , String destination){
        if(n==1){
            System.out.println("Transfer Disk 1 from " + src+" to "+destination);
            return ;
        }
        printTOH(n-1,src,destination,helper);
        System.out.println("Transfer Disk " +n+ " from " + src+ " to "+ destination);
        printTOH(n-1,helper,src,destination);
    }
    public static void main(String args[]){
        printTOH(3,"A","B","C");
    }
}

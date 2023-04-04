 class Numbercheck {
     void displayBigNumber(int n1, int n2, int n3) {
         if (n1 > n2) {
             if (n1 > n3)
                 System.out.println(n1 + "is the biggest number");
         } else if (n2 > n3)
             System.out.println(n2 + "is the biggest number");
         else System.out.println(n3 + "is the biggest number");
     }
 }

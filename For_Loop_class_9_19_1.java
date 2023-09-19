
    import java.util.Scanner;
    public class For_Loop_class_9_19_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double total_bf_d = 0;

            System.out.println("Enter how many types of items have you eaten");
            int ate = sc.nextInt();
            for (int i = 1; i <= ate; i++) {
                System.out.println("What have you eaten");
                String item = sc.next();
                System.out.println("What is the quantity of " + item);
                int i_quantity = sc.nextInt();
                System.out.println("What is the price of the " + item);
                float rate = sc.nextFloat();
                double total = rate * i_quantity;
                total_bf_d = total_bf_d + total;
                System.out.println("Item\tQty\tRate\tAmt");
                System.out.println(item + "\t" + i_quantity + "\t" + rate + "\t" + total);
            }
            System.out.println("Do you have a memebership");
            String member = sc.next();
            if(member.equals("Yes")||member.equals("yes")){
                double discount = total_bf_d*0.1;
                double total_af_d = total_bf_d-discount;
                System.out.println("Discount is = "+discount);
                System.out.println("Final Price = "+total_af_d);
            }
            else{
                System.out.println("Final Price = "+total_bf_d);
            }

        }
    }

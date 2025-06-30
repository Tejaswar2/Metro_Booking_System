package MetroBookingSystem;
import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reg_name = null, reg_pass1 = null, reg_pass2 = null;
        String log_name, log_pass;
        int s = 0,d = 0,tns ;
        int bal = 0; int pay=0;

        while (true) {
            System.out.println("1.Registration");
            System.out.println("2.Login");
            System.out.print("Enter your choice: ");
            int c1 = sc.nextInt();

            if (c1 == 1) {
                System.out.println("-----Registration Page-----");
                System.out.print("Enter username: ");
                reg_name = sc.next();
                System.out.print("Enter password: ");
                reg_pass1 = sc.next();
                System.out.print("Re-enter password: ");
                reg_pass2 = sc.next();

                if (reg_pass1.equals(reg_pass2)) {
                    System.out.println("Registration Successful!\n");
                } else {
                    System.out.println("Passwords do not match. Please register again.");
                    reg_name = null;
                    reg_pass1 = null;
                }

            } else if (c1 == 2) {
                if (reg_name == null || reg_pass1 == null) {
                    System.out.println("You must register before logging in!");
                    continue;
                }
                System.out.println("\n-----Login Page-----");

                while (true) {
                    System.out.print("Enter username: ");
                    log_name = sc.next();
                    System.out.print("Enter password: ");
                    log_pass = sc.next();

                    if (reg_name.equals(log_name) && reg_pass1.equals(log_pass)) {
                        System.out.println("Login Successful!");
                        while (true) {
                            System.out.println("\n1. Recharge Metro Card");
                            System.out.println("2. Book Tickets");
                            System.out.println("3. View Balance");
                            System.out.println("4. History");
                            System.out.println("5. Logout");
                            System.out.print("Enter your choice = ");
                            int ch = sc.nextInt();

                            if (ch == 1) {
                                System.out.print("Enter amount to deposit = ");
                                int amo = sc.nextInt();
                                bal += amo;
                                System.out.println("Your current balance = " + bal);
                            } else if (ch == 2) {
                                System.out.print("Enter number of passengers = ");
                                int q = sc.nextInt();
                                System.out.println("1. Red Line");
                                System.out.println("2. Blue Line");
                                System.out.println("3. Green Line");
                                System.out.print("Enter your Line choice = ");
                                int lc = sc.nextInt();

                                switch (lc) {
                                    case 1:
                                        System.out.print("Your choice is Red Line");
                                        System.out.println("1. Miyapur\n2. JNTU College\n3. KPHB Colony\n4. Kukatpally\n5. Balanagar\n6. Moosapet\n7. Bharat Nagar\n8. Erragadda\n9. ESI Hospital\n10. SR Nagar\n11. Ameerpet\n12. Panjagutta\n13. Irrum Manzil\n14. Khairatabad\n15. Lakdi-ka-Pul\n16. Assembly\n17. Nampally\n18. Gandhi Bhavan\n19. Osmania Medical College\n20. MG Bus Station (MGBS)\n21. Malakpet\n22. New Market\n23. Musarambagh\n24. Dilsukhnagar\n25. Chaitanyapuri\n26. Victoria Memorial\n27. LB Nagar");
                                        System.out.print("Enter Source station number  = ");
                                        s = sc.nextInt();
                                        System.out.print("Enter Destination station number  = ");
                                        d = sc.nextInt();
                                        if (s==d)System.out.println("Source and Destination must not same ");
                                        else if (s<d) {
                                        	tns = d-s;
                                        	if(tns<5) {
                                        		pay = (10+(tns*5)*q);	
                                        	}
                                        	else {
                                        		pay = 35*q;
                                        	}
                                        	
                                        	System.out.println("Total amount  = "+pay);
                                        }
//                                        Return journey
                                        if (bal <pay)System.out.println("Insuffienct Funds Do recharge ");
                                        else {
                                        	bal-=pay;
                                        	System.out.println("Available Balance = "+bal);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Your choice is Blue Line");
                                        System.out.println("1. Nagole\n2. Uppal\n3. Stadium\n4. NGRI\n5. Habsiguda\n6. Tarnaka\n7. Mettuguda\n8. Secunderabad East\n9. Parade Ground\n10. Paradise\n11. Rasoolpura\n12. Prakash Nagar\n13. Begumpet\n14. Ameerpet\n15. Madhura Nagar\n16. Yousufguda\n17. Jubilee Hills Road No. 5\n18. Jubilee Hills Check Post\n19. Peddamma Gudi\n20. Madhapur\n21. Durgam Cheruvu\n22. Hitec City\n23. Raidurg");
                                        
                                        System.out.print("Enter Source station number  = ");
                                        s = sc.nextInt();
                                        System.out.print("Enter Destination station number  = ");
                                        d = sc.nextInt();
                                        if (s==d)System.out.println("Source and Destination must not same ");
                                        else if (s<d) {
                                        	tns = d-s;
                                        	if(tns<5) {
                                        		pay = (10+(tns*5)*q);	
                                        	}
                                        	else {
                                        		pay = 35*q;
                                        	}
                                        	
                                        	System.out.println("Total amount  = "+pay);
                                        }
//                                        Return journey
                                        
                                        if (bal <pay)System.out.println("Insuffienct Funds Do recharge ");
                                        else {
                                        	bal-=pay;
                                        	System.out.println("Available Balance = "+bal);
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Your choice is Green Line");
                                        System.out.println("1. JBS Parade Ground\n2. Secunderabad West\n3. Gandhi Hospital\n4. Musheerabad\n5. RTC Cross Roads\n6. Chikkadpally\n7. Narayanaguda\n8. Sultan Bazaar\n9. MG Bus Station (MGBS)");
                                        System.out.println("Your choice is Blue Line");
                                        System.out.println("1. Nagole\n2. Uppal\n3. Stadium\n4. NGRI\n5. Habsiguda\n6. Tarnaka\n7. Mettuguda\n8. Secunderabad East\n9. Parade Ground\n10. Paradise\n11. Rasoolpura\n12. Prakash Nagar\n13. Begumpet\n14. Ameerpet\n15. Madhura Nagar\n16. Yousufguda\n17. Jubilee Hills Road No. 5\n18. Jubilee Hills Check Post\n19. Peddamma Gudi\n20. Madhapur\n21. Durgam Cheruvu\n22. Hitec City\n23. Raidurg");
                                        System.out.print("Enter Source station number  = ");
                                        s = sc.nextInt();
                                        System.out.print("Enter Destination station number  = ");
                                        d = sc.nextInt();
                                        if (s==d)System.out.println("Source and Destination must not same ");
                                        else if (s<d) {
                                        	tns = d-s;
                                        	if(tns<5) {
                                        		pay = (10+(tns*5)*q);	
                                        	}
                                        	else {
                                        		pay = 35*q;
                                        	}
                                        	
                                        	System.out.println("Total amount  = "+pay);
                                        }
//                                        Return journey
                                        if (bal <pay)System.out.println("Insuffienct Funds Do recharge ");
                                        else {
                                        	bal-=pay;
                                        	System.out.println("Available Balance = "+bal);
                                        }
                                        break;
                                    default:
                                        System.out.println("Invalid line choice.");
                                }

                            } else if (ch == 3) {
                                System.out.println("Your current balance is: " + bal);
                            } else if (ch == 4) {
                                System.out.println("-----Last Journey Details-----");
                                System.out.println("Source Station = "+s);
                                System.out.println("Destination Station = "+d);
                                System.out.println("Amount Paid = "+pay);
                                
                            } else if (ch == 5) {
                                System.out.println("Logging out...");
                                break; 
                            } else {
                                System.out.println("Invalid choice. Try again.");
                            }
                        }

                        break; 
                    } else {
                        System.out.println("Invalid credentials. Try again.\n");
                    }
                }
            } else {
                System.out.println("Invalid choice. Please select 1 or 2.");
            }
        }
    }
}

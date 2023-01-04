package gawedotcom;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    
    // client client = new client("dummyclient", "dummyclient", "dummyclient");
    // freelancer freelancer = new freelancer("dummyfreelancer", "dummyfreelancer", "dummyfreelancer");
    
    // Scanner sc = new Scanner(System.in);

    // void check(String username, String password){
    //     int flag = 0;

    //     if(username.equals(this.client.getusername()) && password.equals(this.client.getpassword())){
    //         flag = 1;
    //         clientmenu(client);
    //     }

    //     if(username.equals(this.freelancer.getusername()) && password.equals(this.freelancer.getpassword())){
    //         flag = 1;
    //         freelancermenu(freelancer);
    //     }

    //     if(flag == 0){
    //         System.out.println("Invalid user!");
    //     }
    // }

    // void clientmenu(client client){
    //     int ch;

    //     while(true){
    //         System.out.println("\tSelect Category:");
    //         System.out.println("1. Music & Audio\n");
    //         System.out.println("2. Video\n");
    //         System.out.println("3. Design\n");
    //         System.out.println("4. Code\n");
    //         System.out.println("Input menu:");
    //         ch = sc.nextInt();

    //         if(ch == 1){
    //             musicAudio(client);
    //             break;
    //         }else{
    //             System.out.println("Currently not available!");
    //         }
    //     }

    //     System.out.print("This is client menu!");
    // }

    // void musicAudio(client client){
    //     System.out.println("Select Freelancer:\n");
    //     System.out.println("Suga - Singer / Songwriter");
    //     System.out.println("Jooyeon - Bassist / Singer / Songwriter");
    //     System.out.println("Jae - Guitarist / Singer/ Songwriter");

    // }

    // void freelancermenu(freelancer freelancer){
    //     System.out.print("This is freelancer menu!");
    // }

    // public Main(){

    //     String usernameInput, passwordInput;

    //     while(true){
    //         System.out.println("Welcome");
    //         System.out.println("Login");
    //         System.out.println("Username: ");
    //         usernameInput = sc.next();
    //         System.out.println("Password: ");
    //         passwordInput = sc.next();

    //         if(usernameInput.equals("0")) System.exit(0);
    //             System.out.println("Password: ");
    //         if(passwordInput.equals("0")) System.exit(0);
    //             check(usernameInput, passwordInput);
    //     }
    // }

    public static void main(String[] args){
        landingPage tes = new landingPage();
    }
}
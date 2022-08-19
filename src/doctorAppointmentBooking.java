import java.util.*;
import java.io.*;
public class doctorAppointmentBooking {

    ArrayList<String> doctorName = new ArrayList<String>();
    ArrayList<String> doctorQualification = new ArrayList<String>();
    ArrayList<String> doctorGender = new ArrayList<String>();
    ArrayList<String> doctorPassword = new ArrayList<String>();
    ArrayList<Integer> doctorAge = new ArrayList<Integer>();
    ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
    ArrayList<String> doctorCity = new ArrayList<String>();

    ArrayList<Integer> patientAge=new ArrayList<Integer>();
    ArrayList<String> patientName=new ArrayList<String>();
    ArrayList<String> patientGender=new ArrayList<String>();
    ArrayList<String> patientPassword=new ArrayList<String>();
    ArrayList<String> patientConfirmPassword=new ArrayList<String>();
    ArrayList<Long> patientMobileNumber=new ArrayList<long>();

    ArrayList<Integer> patientAgeBooking=new ArrayList<Integer>();
    ArrayList<String> patientNameBooking=new ArrayList<String>();
    ArrayList<String> patientGenderBooking=new ArrayList<String>();
    ArrayList<Byte> doctorID=new ArrayList<Byte>();

    void dataAdd(){
        doctorName.add("Raj ");
        doctorName.add("Raj ");
        doctorName.add("Raj ");
        doctorName.add("Raj ");
        doctorName.add("Raj ");
        doctorName.add("Raj ");

        doctorQualification.add("MBBS");
        doctorQualification.add("Er, MBBS");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("BAMS");
        doctorQualification.add("MBBS, MD, Surgeon");

        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("M");

        doctorPassword.add("123");
        doctorPassword.add("345");
        doctorPassword.add("567");
        doctorPassword.add("789");
        doctorPassword.add("101");
        doctorPassword.add("102");

        doctorAge.add(25);
        doctorAge.add(24);
        doctorAge.add(29);
        doctorAge.add(29);
        doctorAge.add(30);
        doctorAge.add(25);

        doctorMobileNumber.add(79889193l);
        doctorMobileNumber.add(624322l);
        doctorMobileNumber.add(356736l);
        doctorMobileNumber.add(346247l);
        doctorMobileNumber.add(970666l);
        doctorMobileNumber.add(302689l);

        doctorCity.add("Mumbai");
        doctorCity.add("Delhi");
        doctorCity.add("Pune");
        doctorCity.add("Chennai");
        doctorCity.add("Uttrakhand");
        doctorCity.add("Jharkhand");

    }

    void admin() throws Exception {
        Scanner sc = new Scanner(System.in);
        byte choice;
        boolean flag = true;

        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t  _________________________");
            System.out.println("\t\t |                         |");
            System.out.println("\t\t |     Welcome Admin       |");
            System.out.println("\t\t  _________________________");
            System.out.print("\n\n 1. Doctor list \t 2. Registered patients \t 3. Patients with appointments \t 4. Back to main menu \n\n Enter your choice: ");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i <= doctorName.size() - 1; i++) {
                        System.out.println("Name : \t" + doctorName.get(i)+ "Qualification : "+ doctorQualification.get(i));
                    }
                    byte menuChoice;
                    System.out.println("\n\n\n 1. Main menu\t 2.Previous menu");
                    System.out.println("Please Enter your choice: ");
                    menuChoice = sc.nextByte();
                    if (menuChoice == 1) {
                        flag = false;
                    } else {
                        break;
                    }
                    break;
                case 2:
                    if (patientName.isEmpty()) {
                        System.out.println("No Registered Patients yet");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= patientName.size() - 1; i++) {
                            int j = i + 1;
                            System.out.println(j + "." + patientName.get(i)+"\t"+patientMobileNumber.get(i));

                        }
                        System.out.println("\n\n\n 1. Main menu \t 2. Previous menu");
                        System.out.println("Please Enter your choice: ");
                        menuChoice = sc.nextByte();
                        if (menuChoice == 1) {
                            flag = false;
                        } else {
                            break;
                        }
                        break;
                    }
                case 3:
                    if (patientNameBooking.isEmpty()) {
                        System.out.println("\n No Appointment yet.");
                        Thread.sleep(3000);
                        break;
                    } else {
                        for (int i = 0; i <= patientName.size() - 1; i++) {
                            int j = i + 1;
                            System.out.println(j + "." + patientName.get(i));
                        }
                        Thread.sleep(5000);
                        flag = false;
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    Thread.sleep(1000);
                    flag = true;
            }
        }
    }

    void  patient() throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("\t\t  __________________________________");
            System.out.println("\t\t |                                  |");
            System.out.println("\t\t |     Welcome to Patient Page      |");
            System.out.println("\t\t |__________________________________|");
            System.out.println(" ");
            System.out.println("1. Login \t 2. Registration  \t 3.Back to main menu\n");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    if(patientMobileNumber.isEmpty()){
                        System.out.println("Please first register yourself and then try to login");
                        Thread.sleep(500);
                        break;
                    }
                    else{
                        patientLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    patientRegistration();
                    flag = false;
                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("\n You entered a wrong choice. Please enter your choice again..!");
                    flag = true;
                    Thread.sleep(1000);
                    break;
            }
        }
    }


    void doctor() throws Exception{
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        boolean flag = true;
        while(flag){

            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("\t\t  ___________________________________");
            System.out.println("\t\t |                                   |");
            System.out.println("\t\t |     Welcome to Doctors Page       |");
            System.out.println("\t\t |___________________________________|");
            System.out.println(" ");

            System.out.println("1. Login \t 2. Registration \t 3.Back to main menu");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    if(doctorMobileNumber.isEmpty()){
                        System.out.println("Register first..!");
                        flag =false;
                        Thread.sleep(500);
                        break;
                    }
                    else{
                        doctorLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    doctorRegistration();
                    flag = false;
                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("Entered wrong choice..");
                    flag = true;
            }
        }
    }


    void patientLogin() throws Exception{

        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        long mobilenumber;
        byte choice;

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        System.out.println("\t\t  _________________________");
        System.out.println("\t\t |                         |");
        System.out.println("\t\t |          Login          |");
        System.out.println("\t\t |_________________________|");
        System.out.println(" ");

        System.out.println("Enter your Username(mobile number");
        mobilenumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();

        boolean flag1 = false;
        int j;
        for(j = 0 ; j<=patientMobileNumber.size()-1 ; j++){
            if((patientMobileNumber.get(j)).equals(mobilenumber) && (patientPassword.get(j)).equals(password)){
                flag1 = true;
                break;
            }
        }

        if(flag1 == true){
            Thread.sleep(1000);
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("\t\t  ______________________________");
            System.out.println("\t\t |                              |");
            System.out.println("\t\t |       Book Appointment       |");
            System.out.println("\t\t |______________________________|");
            System.out.println("\n Welcome "+patientName.get(j)+ ", to book appointment choose your doctor ");

            for(int i=0;i<=doctorName.size()-1;i++){
                System.out.println((i+1)+". "+doctorName.get(i));
            }
            choice = sc.nextByte();
            doctorID.add(choice);

            while(flag){
                Thread.sleep(1000);

                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                System.out.println("\t\t  __________________________________");
                System.out.println("\t\t |                                  |");
                System.out.println("\t\t |         Book Appointment         |");
                System.out.println("\t\t |__________________________________|");

                if(choice <= doctorName.size() && choice>0){
                    System.out.print("\n\n Name: \t "+ doctorName.get(choice-1)+"\nAge: \t"+doctorAge.get(choice-1)+"\nMoblie: "+doctorMobileNumber.get(choice-1)+"\nCity: "+doctorCity.get(choice-10));
                    System.out.println("\n Enter your name: \t");
                    sc.nextLine();
                    patientNameBooking.add(sc.nextLine());
                    System.out.println("Enter Your Age: \t");
                    patientAgeBooking.add(sc.nextInt());
                    System.out.println("Enter your gender: \t");
                    patientGenderBooking.add(sc.next());

                    System.out.println("\n booking Sucessfull..");
                    Thread.sleep(1000);
                    flag = false;
                    break;
                }
                else {
                    System.out.println("\n Enter correct input..");
                    flag = true;
                    Thread.sleep(1000);
                }
            }
        }
        else{
            System.out.println("login Succesfull..");
            Thread.sleep(900);
            flag = false;
        }
    }


    void patientRegistration() throws Exception{
        Scanner sc =new Scanner(System.in);
        int i=0;
        long mobileNumber;
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        System.out.println("\t\t  ______________________________________");
        System.out.println("\t\t |                                      |");
        System.out.println("\t\t |    Welcome to Registration Page..    |");
        System.out.println("\t\t |______________________________________|");

        System.out.println("\n");
        System.out.println("Please Enter your name: ");
        patientName.add(sc.nextLine());
        System.out.println("Enter your age: ");
        patientAge.add(sc.nextInt());
        System.out.println("Please Enter your Moblie Number");
        mobileNumber  = sc.nextLong();
        long mno;

        boolean flag =true, flag1 = true;

        if(patientMobileNumber.isEmpty()){
            patientMobileNumber.add(mobileNumber);
            System.out.println("Enter password:");
            patientPassword.add(sc.next());
            System.out.println("Registration is Sucessfull.");

            Thread.sleep(900);
            flag1=false;
        }
        else{
            for(i = 0 ;i<=patientMobileNumber.size()-1;i++){
                mno = patientMobileNumber.get(i);

                if(mno == mobileNumber){
                    flag1 = false;
                    break;
                }
            }
            if(flag1==true){
                patientMobileNumber.add(mobileNumber);
                System.out.println("Enter password");
                patientPassword.add(sc.next());
                System.out.println("Registration is sucessfull.");
                Thread.sleep(500);
            }
        }

    }


    void doctorRegistration() throws Exception{

        Scanner sc = new Scanner(System.in);
        int i=0;
        long mobileNumber;
        boolean flag=true,flag1 = true;

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        System.out.println("\t\t  __________________________________________");
        System.out.println("\t\t |                                          |");
        System.out.println("\t\t |        Doctors Registration page         |");
        System.out.println("\t\t |__________________________________________|");
        System.out.println("\n");

        System.out.println("Please enter your name:");
        doctorName.add(sc.nextLine());

        System.out.println("Please enter your Mobile number");
        mobileNumber = sc.nextLong();

        long mno;
        if(doctorMobileNumber.isEmpty()){
            doctorMobileNumber.add(mobileNumber);
            System.out.println("Enter password");
            doctorPassword.add(sc.next());
            System.out.println("Registration is Sucessfull");
            Thread.sleep(900);
            flag1 = false;
        }
        else{
            for(i=0;i<=doctorMobileNumber.size()-1;i++){
                mno = doctorMobileNumber.get(i);
                if(mno==mobileNumber){
                    flag1 = false;
                    break;
                }
            }
            if(flag1  == true){
                doctorMobileNumber.add(mobileNumber);
                System.out.println("Enter age:");
                doctorAge.add(sc.nextInt());
                System.out.println("Enter City: ");
                doctorCity.add(sc.next());
                System.out.println("Enter password");
                doctorPassword.add(sc.next());
                System.out.println("Registration sucessfull.");
                System.out.println("Detatils : \n Name:"+doctorName+"number:"+doctorMobileNumber);
                Thread.sleep(900);
            }
            else{
                System.out.println("Moblie number already present!!!\n");
                int index = doctorName.size()-1;
                doctorName.remove(index);
                Thread.sleep(500);
            }
        }
    }


    void doctorLogin() throws Exception{
        Scanner sc =new Scanner(System.in);
        Long mobileNumber;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t |This is doctor login page");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter your Mobile number)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your password:");
        String password =sc.next();
        int i=0;
        byte choice;

        boolean flag = false;
        boolean flag1 = true;
        for(i=0 ; i<=doctorMobileNumber.size()-1; i++){
            if((doctorMobileNumber.get(i)).equals(mobileNumber) && (doctorPassword.get(i).equals(password))){
                flag = true;
                break;
            }
            else{
                Thread.sleep(1000);
                System.out.println("Invalid details..");
                Thread.sleep(2000);
                doctor();
            }
            if(flag) {
                while (flag1) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                System.out.println("---------------------------------------------------------------------");
                System.out.println("\t\t |Welcome to Doctor " + doctorName.get(i) + "|");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("\n\n Press 1 to see your Appointments. \n");
                choice = sc.nextByte();
                byte j = 0;
                switch (choice) {
                    case 1:
                        if ((!doctorID.isEmpty())) {
                            while (j <= doctorID.size() - 1) {
                                if ((i + 1) == doctorID.get(j)) {
                                    System.out.println("patient name: " + patientNameBooking.get(j));
                                    j++;
                                }
                            }
                            Thread.sleep(4000);
                        } else {
                            System.out.println("No Appointment...!");
                            Thread.sleep(3000);
                            flag1 = true;
                        }
                        break;

                }
            }
        }
        else{
            System.out.println("Login unsucessfull..");
            Thread.sleep(900);
            break;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        doctorAppointmentBooking ap = new doctorAppointmentBooking();
        Scanner sc = new Scanner(System.in);
        ap.dataAdd();
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t\t\t\t---------------------------------------------------------------------");
            System.out.println("\t\t\t\t\tWelcome to Doctor Appointment booking");
            System.out.println("\t\t\t\t---------------------------------------------------------------------");
            System.out.println("\n\n\n 1. Doctor \t2.Patient \t 3.Admin \t 4.Exit");
            System.out.println("\n\n Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    ap.doctor();
                }
                case 2 -> {
                    ap.patient();
                }
                case 3 -> {
                    ap.admin();
                }
                default -> System.exit(0);
            }
        }
    }
}

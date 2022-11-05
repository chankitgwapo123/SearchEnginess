
package searchengine;
import java.util.*;


public class Searchmanagement extends Searchengine {
    public static Scanner in = new Scanner(System.in);
    private final ArrayList<user>useraccs= new ArrayList<>();
    public static String choice,again,NAME,LASTNAME,EMAIL,USERNAME,PASSWORD;
    static Searchmanagement sm = new Searchmanagement();
    public static char acc;
    public static int attempt = 3;
    public static boolean stat = true;
     public static void CHOICES()
    {
        while(stat)
        
        
        {
       
       
        System.out.println("----------------------------");
        System.out.println("        Welcome To Facabook          ");
        System.out.println(" Press '1' to Login\nPress '2' to Signup ");
        System.out.print("Enter Choice : ");
        acc=in.next().charAt(0);
        
       
        // FOR PAGES *******************************************************************
       switch(acc)
       {
           case '1':
               sm.Login();
               break;
           case '2':
               sm.Signup();
               break;
           default:
               System.out.println("Try Again");
       }
        }
    
    }
     
     public void Signup()
     {
          in.nextLine();
          System.out.println("Enter Name");
          NAME=in.nextLine();
          System.out.println("Enter Lastname");
          LASTNAME=in.nextLine();
          System.out.println("Enter Email");
          EMAIL=in.nextLine();
          System.out.println("Enter Username");
          USERNAME=in.nextLine();
          System.out.println("Enter Password");
          PASSWORD=in.nextLine();
          
          user users = new user(NAME,LASTNAME,EMAIL,USERNAME,PASSWORD);
          useraccs.add(users);
     }
     
     public void Login()
     {
        stat = true;
        while(attempt < 4){
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(attempt != 0){
                
                System.out.println("username: ");
                String user = in.next();
                System.out.println("password: ");
                String pass = in.next();
                
                if(user.equals(USERNAME) && pass.equals(PASSWORD))
                {
                    CHOICESES();
                    stat = true;
                }else{
                    System.out.println("Incorrect username or password. Please try again.");
                    System.out.println("Login attempt: " + attempt);
                    attempt--;
                    stat = true;
                }
            }else{
                System.out.println("Maximum reached attempt!");
            }
        }
     }
 public static void CHOICESES()
    {
        while(stat)
        {
           
           
       
         
        System.out.println("----------------------------");
        System.out.println("         Facabook          ");
        System.out.println("*******Search Engine*******");
        System.out.println("________________________________");
        System.out.println("FB User - FB Page - FB - Group");
        System.out.print("|SEARCH  : ");
        choice=in.next();
        // FOR PAGES *******************************************************************
       
     
     if(choice.equals("SHAPPY") || choice.equals("shappy") || choice.equals("Shappy"))
     {
         Pages.SHAPPY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes")|| again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CLARITY") || choice.equals("clarity") || choice.equals("Clarity"))
     {
         Pages.CLARITY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("AYALAMALLSCAPITOLCENTRAL") || choice.equals("ayalamallscapitolcentral") || choice.equals("AyalaMallsCapitolCentral"))
     {
         Pages.AYALAMALLSCAPITOLCENTRAL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SERENITYVIBE") || choice.equals("senerityvibe") || choice.equals("SerenityVibe"))
     {
         Pages.SERENITYVIBE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("KATIK") || choice.equals("katik") || choice.equals("Katik"))
     {
         Pages.KATIK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("PHINMA-CAGAYANDEOROCITY") || choice.equals("phinma-cagayandeorocity") || choice.equals("Phinma-CagayanDeOroCity"))
     {
         Pages.PHINMACOC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BEN&BEN") || choice.equals("ben&ben") || choice.equals("Ben&ben"))
     {
         Pages.BEN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("CERVANA") || choice.equals("cervana") || choice.equals("Cervana"))
     {
         Pages.CERVANA();
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("REHM") || choice.equals("rehm") || choice.equals("Rehm"))
     {
         Pages.REHM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("LEXERS") || choice.equals("lexers") || choice.equals("Lexers"))
     {
         Pages.LEXERS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("META") || choice.equals("meta") || choice.equals("Meta"))
     {
         Pages.META();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FILIPINOVINES") || choice.equals("filipinovines") || choice.equals("Filipinovines"))
     {
        Pages. FILIPINOVINES();
         
        System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("OREO") || choice.equals("oreo") || choice.equals("Oreo"))
     {
         Pages.OREO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STEEZYGADGETHUBCDO") || choice.equals("steezygadgethubcdo") || choice.equals("Steezygadgethubcdo"))
     {
         Pages.STEEZYGADGETHUBCDO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PRIMEVIDEOPH") || choice.equals("primevideoph") || choice.equals("Primevideoph"))
     {
         Pages.PRIMEVIDEOPH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SMARTCOMMUNICATIONINC") || choice.equals("smartcommunicationinc") || choice.equals("Smartcommunicationinc"))
     {
         Pages.SMARTCOM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SHOPZADA") || choice.equals("shopzada") || choice.equals("Shopzada"))
     {
         Pages.SHOPZADA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PALMOLIVENATURALS") || choice.equals("palmolivenaturals") || choice.equals("Palmolivenaturals"))
     {
         Pages.PANA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLLEGEOFINFORMATIONTECHNOLOGYSTUDENTBODYORGANIZATION") || choice.equals("collegeofinformationtechnologystudentbodyorganization") || choice.equals("Collegeofinformationtechnologystudentbodyorganization"))
     {
         Pages.CITSBD ();
     
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SEAOIL") || choice.equals("seaoil") || choice.equals("Seaoil"))
     {
         Pages.SEAOIL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NEUTROGENA") || choice.equals("neutrogena") || choice.equals("Neutrogena"))
     {
         Pages.NEUTROGEN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLUMBIASPORTSWAREPH") || choice.equals("columbiasportwareph") || choice.equals("Columbiasportwareph"))
     {
         Pages.COMSPOPH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TELMA") || choice.equals("telma") || choice.equals("Telma"))
     {
         Pages.TELMA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JONYY") || choice.equals("jonny") || choice.equals("Jonny"))
     {
         Pages.JONYY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BENEDEXRAMOS") || choice.equals("benedexramos") || choice.equals("Benedexramos"))
     {
         Pages.BERA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GREENWICHBARKADA") || choice.equals("greenwichbarkada") || choice.equals("Greenwichbarkada"))
     {
         Pages.GREENBAR();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JOIRA") || choice.equals("joira") || choice.equals("Joira"))
     {
         Pages.JOIRA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SANDKING") || choice.equals("sandking") || choice.equals("Sandking"))
     {
         Pages.SK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KUYAMEL") || choice.equals("kuyamel") || choice.equals("Kuyamel"))
     {
         Pages.KM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TAKETWOFILMS") || choice.equals("taketwofilms") || choice.equals("Taketwofilms"))
     {
         Pages.TTF();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DIONELA") || choice.equals("dionela") || choice.equals("Dionela"))
     {
         Pages.D();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TELEPERFORMANCEPHILIPPINES") || choice.equals("teleperformancephilippines") || choice.equals("Teleperformancephilippines"))
     {
         Pages.TP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TITAKIM") || choice.equals("titakim") || choice.equals("Titakim"))
     {
         Pages.TK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MCDONALDS") || choice.equals("mcdonalds") || choice.equals("Mcdonalds"))
     {
         Pages.MCDO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("APORTS") || choice.equals("aports") || choice.equals("Aports"))
     {
         Pages.A();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KHELTRISHTV") || choice.equals("kheltrishtv") || choice.equals("Kheltrishtv"))
     {
         Pages.KTT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PHCAREPHILIPPINES") || choice.equals("phcarephilippines") || choice.equals("Phcarephilippines"))
     {
         Pages.PCP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARCOLAVILLA") || choice.equals("marcolavilla") || choice.equals("Marcolavilla"))
     {
         Pages.ML();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BRYOFFICIAL") || choice.equals("bryofficial") || choice.equals("Bryofficial"))
     {
         Pages.BO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MYXGLOBAL") || choice.equals("myxglobal") || choice.equals("Myxglobal"))
     {
         Pages.MG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CALLSTREET") || choice.equals("callstreet") || choice.equals("Callstreet"))
     {
         Pages.CS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ITSSHOWTIME") || choice.equals("itsshowtime") || choice.equals("Itsshowtime"))
     {
         Pages.IS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("LAPISIANSOFFICIAL") || choice.equals("lapisiansofficial") || choice.equals("Lapisiansofficial"))
     {
         Pages.LO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ASAPOFFICIAL") || choice.equals("asapofficial") || choice.equals("Asapofficial"))
     {
         Pages.AO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BURGERKINGPHILIPPINES") || choice.equals("burgerkingphilippines") || choice.equals("Burgerkingphilippines"))
     {
         Pages.BKP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JEGGYJEG") || choice.equals("jeggyjeg") || choice.equals("Jeggyjeg"))
     {
         Pages.JJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SERENITYVIBE") || choice.equals("Serenityvibe") || choice.equals("Serenityvibe"))
     {
         Pages.SERENITYVIBE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ARTHURMIGUEL") || choice.equals("arthurmiguel") || choice.equals("Arthurmiguel"))
     {
         Pages.AM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ESMARK") || choice.equals("esmark") || choice.equals("Esmark"))
     {
         Pages.ESMARK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TROPANGLOL") || choice.equals("tropanglol") || choice.equals("Tropanglol"))
     {
         Pages.TL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DAPANEY") || choice.equals("dapaney") || choice.equals("Dapaney"))
     {
         Pages.DAPANEY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     
     //FOR PEOPLES *********************************************************************************************************
   
     else if(choice.equals("ADORAJAQUILMACDUMAOG") || choice.equals("adorajaquilmacdumaog") || choice.equals("Adorajaquilmacdumaog"))
     {
         account.AJD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SAMANTHAMARMERCADO") || choice.equals("samanthamarmercado") || choice.equals("Samanthamarmercado"))
     {
         account.SMM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SHERWINSALVOSELMA") || choice.equals("sherwinsalvoselma") || choice.equals("Sherwinsalvoselma"))
     {
         account.SSS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARKQUISTADIOPALMA") || choice.equals("markquistadiopalma") || choice.equals("Markquistadiopalma"))
     {
         account.MQP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RAFAELLOZANODUMAOG") || choice.equals("rafaellozanodumaog") || choice.equals("Rafaellozanodumaog"))
     {
         account.RLD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANECANTAYAYUBAN") || choice.equals("janecantayayuban") || choice.equals("Janecantayayuban"))
     {
         account.JCA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DAVIDJAQUILMACDUMAOG") || choice.equals("davidjaquilmacdumaog") || choice.equals("Davidjaquilmacdumaog"))
     {
         account.DJD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUSTINEMARVILGARA") || choice.equals("justinemarvilgara") || choice.equals("Justinemarvilgara"))
     {
         account.JMV();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ROSALYNINTONGJAQUILMAC") || choice.equals("rosalynintongjaquilmac") || choice.equals("Rosalynintongjaquilmac"))
     {
         account.RIJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANCRUZCAYONDA") || choice.equals("jancruzcayonda") || choice.equals("Jancruzcayonda"))
     {
         account.JCC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("VANISSAINTONGJAQUILMAC") || choice.equals("vanissaintongjaquilmac") || choice.equals("Vanissaintongjaquilmac"))
     {
         account.VIJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("LINDSAYMUITBALDONADO") || choice.equals("lindsaymuitbaldonado") || choice.equals("Lindsaymuitbaldonado"))
     {
         account.LMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CHRISTIANSAPONABACAHIN") || choice.equals("christiansaponabacahin") || choice.equals("Christiansaponabacahin"))
     {
         account.CSA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RECHELLEEBALARLUBERAS") || choice.equals("rechelleeballarluberas") || choice.equals("Rechelleeballarluberas"))
     {
         account.REL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DARIELLLAMISMUIT") || choice.equals("darielllamismuit") || choice.equals("Darielllamismuit"))
     {
         account.DLM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANEMILITARESSIBAY") || choice.equals("janemilitaressibay") || choice.equals("Janemilitaressibay"))
     {
         account.JMS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
         
     }
     else if(choice.equals("JUSTINEFABEMUIT") || choice.equals("justinefabemuit") || choice.equals("Justinefabemuit"))
     {
         account.JFM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ASHLIESTANOLDONGUINES") || choice.equals("ashliestanoldonguines") || choice.equals("Ashliestanoldonguines"))
     {
         account.SED();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DIANEBALABAOSING") || choice.equals("dianebalabaosing") || choice.equals("Dianebalabaosing"))
     {
         account.DBO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("DERRICKCULTURASAGRADO") || choice.equals("derrickculturasagrado") || choice.equals("Derrickculturasagrado"))
     {
         account.DCS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("TRIVYDELAPENACURAY") || choice.equals("trivydelapenacuray") || choice.equals("Trivydelapenacuray"))
     {
         account.TDC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("MICHELLEDACUPACON") || choice.equals("michelledacupacon") || choice.equals("Michelledacupacon"))
     {
         account.MDP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("LOUISEELARCOARABIANA") || choice.equals("louiseelarcoarabiana") || choice.equals("Louiseelarcoarabiana"))
     {
         account.LEA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("PHILLIPPEREZSALINGAY") || choice.equals("phillipperezsalingay") || choice.equals("Phillipperezsalingay"))
     {
         account.PPS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SHAIRAMADRIDANOBELTRAN") || choice.equals("shairamadridanobeltran") || choice.equals("Shairamadridanobeltran"))
     {
         account.SMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SANDRAGARCIACASAS") || choice.equals("sandragarciacasas") || choice.equals("Sandragarciacasas"))
     {
         account.SGC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALONAMONTECILLOBABANO") || choice.equals("alonamontecillobabano") || choice.equals("Alonamontecillobabano"))
     {
         account.AMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }else if(choice.equals("CHRISTIANCAHULOGANHAMO") || choice.equals("christycahuloganhamo") || choice.equals("Christycahuloganhamo"))
     {
         account.CCH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TRISHAJAQUILMACVALMORIDA") || choice.equals("trishajaquilmacvalmorida") || choice.equals("Trishajaquilmacvalmorida"))
     {
         account.TJV();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUNEGALASGERALDEZ") || choice.equals("junegalasgeraldez") || choice.equals("Junegalasgeraldez"))
     {
         account.JGG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALTHEABAINTOMAGAWAY") || choice.equals("altheabaintomagaway") || choice.equals("Altheabaintomagaway"))
     {
         account.ABM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARIAVALMORIDATION") || choice.equals("mariavalmoridation") || choice.equals("Mariavalmoridation"))
     {
         account.MVT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARKDABLOBADA") || choice.equals("markdablobada") || choice.equals("Markdablobada"))
     {
         account.MDB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NINAMAGADALESMEDINA") || choice.equals("ninamagdalesmedina") || choice.equals("Ninamagdalesmedina"))
     {
         account.NMM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GERMAINQUIDERGARRIDO") || choice.equals("germainquidergarrido") || choice.equals("Germainquidergarrido"))
     {
         account.GQG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JAZELUBSUBANENTERINA") || choice.equals("jazelubsubanenterina") || choice.equals("Jazelubsubanenterina"))
     {
         account.JUE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("REJEEDALUPEREDEDOMO") || choice.equals("rejeedaluperededomo") || choice.equals("Rejeedaluperededomo"))
     {
         account.RDD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DELMEGEANPORNESABAO") || choice.equals("delmegeanpornesabao") || choice.equals("Delmegeanpornesabao"))
     {
         account.DPA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CHARLYNAGULAYPAJARON") || choice.equals("charlynagulaypajaron") || choice.equals("Charlynagulaypajaron"))
     {
         account.CAP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JESSASABANTOACENAS") || choice.equals("jessasabantoacenas") || choice.equals("Jessasabantoacenas"))
     {
         account.JSA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SANDRAPASCONABALES") || choice.equals("sandrapasconabales") || choice.equals("Sandrapasconabales"))
     {
         account.SPN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JESONTAMBAGANTAGAL") || choice.equals("jesontambagantagal") || choice.equals("Jesontambagantagal"))
     {
         account.JTT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MECHAELLAHENSONASINO") || choice.equals("mechaellahensonasino") || choice.equals("Mechaellahensonasino"))
     {
         account.MHA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("EDNELLBUTALIDALABA") || choice.equals("ednellbutalidalaba") || choice.equals("Ednellbutalidalaba"))
     {
         account.EBA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DANIELADULANASSIN-INGAN") || choice.equals("danieladulanassin-ingan") || choice.equals("Danieladulanassin-ingan"))
     {
         account.DDS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUNMARGADOTSALALIMA") || choice.equals("junmargadotsalalima") || choice.equals("Junmargadotsalalima"))
     {
         account.JGS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ABEGUILMENDEZDUMAOG") || choice.equals("abeguilmendezdumaog") || choice.equals("Abeguilmendezdumaog"))
     {
         account.AMD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("AARONLAYAOENARELLANO") || choice.equals("aaronlayaoenarellano") || choice.equals("Aaronlayaoenarellano"))
     {
         account.AAA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALFONSOENTERAABANIL") || choice.equals("alfonsoenteraabanil") || choice.equals("Alfonsoenteraabanil"))
     {
         account.AEA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     
     //FOR GROUPS *********************************************************************************************************
     
     }
     else if(choice.equals("PROGRAMMINGFORBEGINNERSPHILIPPINES") || choice.equals("programmingforbeginnersphilippines") || choice.equals("Programmingforbeginnersphilippines"))
     {
         Groups.PFBP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENT") || choice.equals("student") || choice.equals("Student"))
     {
         Groups.STUDENT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENTGROUP") || choice.equals("studentgroup") || choice.equals("Studentgroup"))
     {
         Groups.ST();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NURSINGSTUDENTSGROUP") || choice.equals("nursingstudentsgroup") || choice.equals("Nursingstudentsgroup"))
     {
         Groups.NSG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLLEGESTUDENTS") || choice.equals("collegestudent") || choice.equals("Collegestudent"))
     {
         Groups.CS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENTOFPSYCHOLOGY") || choice.equals("studentofpsychology") || choice.equals("Studentofpsychology"))
     {
         Groups.SOP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ARCHITECTURESTUDENTSGROUP") || choice.equals("architecturestudentsgroup") || choice.equals("Architecturestudentsgroup"))
     {
         Groups. ASG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SCIENCESTUDENTS") || choice.equals("sciencestudents") || choice.equals("Sciencestudents"))
     {
         Groups.SS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GASSTUDENTS") || choice.equals("gasstudents") || choice.equals("Gasstudents"))
     {
         Groups.GS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("HUMMSSTUDENTS") || choice.equals("hummsstudents") || choice.equals("Hummsstudents"))
     {
         Groups.HS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MEDICALSTUDENTSANDDOCTORS") || choice.equals("medicalstudentsanddoctors") || choice.equals("Medicalstudentsanddoctors"))
     {
         Groups.MSAD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FUTUREWEBDEV") || choice.equals("futurewebdev") || choice.equals("Futurewebdev"))
     {
         Groups.FWD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PINAYWEBDEV") || choice.equals("pinoywebdev") || choice.equals("Pinoywebdev"))
     {
         Groups.PWD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DEVWEBMARCO") || choice.equals("devwebmaroc") || choice.equals("Devwebmaroc"))
     {
         Groups.DWM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WEBDEVCOMMUNITY") || choice.equals("webdevcommunity") || choice.equals("Webdevcommunity"))
     {
         Groups.WDC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WEBDEVCOURSES") || choice.equals("webdevcourses") || choice.equals("Webdevcourses"))
     {
         Groups.WD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGPHILIPPINES") || choice.equals("programmingphilippines") || choice.equals("Programmingphilippines"))
     {
         Groups.PP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGGROUP") || choice.equals("programminggroup") || choice.equals("Programminggroup"))
     {
         Groups.PG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGSOLUTIONHUB") || choice.equals("programmingsolutionhub") || choice.equals("Programmingsolutionhub"))
     {
         Groups.PSH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BASICCOMPUTERKNOWLEDGE") || choice.equals("basiccomBputerknowledge") || choice.equals("BasiccomBputerknowledge"))
     {
         Groups.BCK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERSCIENCEDEPARTMENT") || choice.equals("computersciencedepartment") || choice.equals("Computersciencedepartment"))
     {
         Groups.CSD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERKNOWLEDGE") || choice.equals("computerknowledge") || choice.equals("Computerknowledge"))
     {
         Groups.CK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERTECHNICIANGROUP") || choice.equals("computertechniciangroup") || choice.equals("Computertechniciangroup"))
     {
         Groups.CTG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERSCIENCECAREERS") || choice.equals("computersciencecareers") || choice.equals("Computersciencecareers"))
     {
         Groups.CSC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERENGINEERINGGROUP") || choice.equals("computerengineeringgroup") || choice.equals("Computerengineeringgroup"))
     {
         Groups.CEG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTER") || choice.equals("computer") || choice.equals("Computer"))
     {
         Groups.COMPUTER();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERPARTSSALE") || choice.equals("computerpartssale") || choice.equals("Computerpartssale"))
     {
         Groups.CPS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PARTCOMPUTERUSED") || choice.equals("partcomputerused") || choice.equals("Partcomputerused"))
     {
         Groups.PCU();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FB-GROUP") || choice.equals("fb - group") || choice.equals("Fb - group"))
     {
         Groups.CPM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("VINTAGECOMPUTERSALES") || choice.equals("vintagecomputersales") || choice.equals("Vintagecomputersales"))
     {
         Groups.VCS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERPARTS") || choice.equals("computerparts") || choice.equals("Computerparts"))
     {
         Groups.CP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODINGFORBEGGINERS") || choice.equals("codingforbegginers") || choice.equals("Codingforbegginers"))
     {
         Groups.CB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODINGANDPROGRAMMING") || choice.equals("codingandprogramming") || choice.equals("Codingandprogramming"))
     {
         Groups.C();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODE") || choice.equals("code") || choice.equals("Code"))
     {
         Groups.CODE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FEELART") || choice.equals("feelart") || choice.equals("Feelart"))
     {
         Groups.FA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KRAZY") || choice.equals("krazy") || choice.equals("Krazy"))
     {
         Groups.KRAZY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MANAGEMENTSINFORMATIONSYSTEM") || choice.equals("managementsinformationsystem") || choice.equals("Managementsinformationsystem"))
     {
         Groups.MIS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DATABASEMANAGEMENTSYSTEM") || choice.equals("databasemanagementsystem") || choice.equals("Databasemanagementsystem"))
     {
         Groups.DMS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEMENGINEERING") || choice.equals("systemengineering") || choice.equals("Systemengineering"))
     {
         Groups.SE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEM") || choice.equals("system") || choice.equals("System"))
     {
         Groups.SYSTEM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BACOLODBARBERSYSTEM") || choice.equals("bacolodbarbersystem") || choice.equals("Bacolodbarbersystem"))
     {
         Groups.BBS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CAMBODIAACCOUNTINGSYSTEM") || choice.equals("cambodiaaccountingsystem") || choice.equals("Cambodiaaccountingsystem"))
     {
         Groups.CAS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FIREALARMSYSTEM") || choice.equals("firealarmsystem") || choice.equals("Firealarmsystem"))
     {
         Groups.FAS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEMBASKETBALLCOACHES") || choice.equals("systembasketballcoaches") || choice.equals("Systembasketballcoaches"))
     {
         Groups.SBC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WORLDDOMMINATIONSYSTEM") || choice.equals("worlddomminationsystem") || choice.equals("Worlddomminationsystem"))
     {
         Groups.WDS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RUMORSYSTEM") || choice.equals("rumorsystem") || choice.equals("Rumorsystem"))
     {
         Groups.RS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ERROR") || choice.equals("error") || choice.equals("Error"))
     {
         Groups.ERROR();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ERRORCOINS") || choice.equals("errorcoins") || choice.equals("Errorcoins"))
     {
         Groups.EC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COINSANDERRORCOINS") || choice.equals("coinsanderrorcoins") || choice.equals("Coinsanderrorcoins"))
     {
         Groups.CEC();
         System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FORERRORONLY") || choice.equals("forerroronly") || choice.equals("Forerroronly"))
     {
         Groups.FEO();
         
               System.out.println("Do You Want Search Again??? Yes Or No");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     
             }
     else{
         System.out.println("User not found!");
     }
   
        }
            }
            }

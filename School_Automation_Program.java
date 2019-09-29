
 
import java.util.Scanner;
public class sof
{
    long ph;//ph-phone number;
    int n=0,dno;//n-to verify wether a grp is selectedd or not;dno-donation
    String pas="sallu";
    String gpp;
    String pass,rno,nme;//1.to enter password 2.to enter register no.
    int opt1,bde,opt2;//1.opt1-to enter first option in main menu. 2.bde-to enter 10th exam marks.3.opt2-to enter to go mian menu or exit if marks is entered worng 
    int syl,repas,grp;//to enter our syllabus. repas-option to reenter password 3.to enter the group
    double per;//1.per-to find percentage of the 10th exam marks
    int grs,re,ru,aru;//fees for the particular group; re-to continue or stop;ru-rules of school;aru-agree with the rules or not
    
    
    
     int ch1,i,a,ch2,c1,b,d;
    String passw,p,bn;
    char s;
    String cnme[]={"sallu","sameer","shradha","danish","abishek","salman","shruthi","venkat","vijay","anushka"};
    String fname[]={"A.sallu HUSSAIN","S.MOHAMMED SAMEER","E.SHRADHA KAPOOR","G.MOHAMMED DANISH","A.ABISHEK BACHAN","M.SALMAN KHAN","G.SHRUTHI HASAN","D.VENKAT KUMAR","K.VIJAY","L.ANUSHKA SHARMA"};
    String fath[]={"H.AFSAR HUSSAIN","A.MOHAMMED SULAIMAN ","G.ESHWARAN SWAMI","G.MOHAMMED GAYAZ","P.AMITAB BACHAN","D.MUSTAFA KHAN","Z.GANESH RAJ","A.DHARMESH KUMAR","M.KARTHICK","V.LOKESH RAJ"};
    char sex[]={'M','M','F','M','M','M','F','M','M','F',};
    String bdte[]={"4","6","4","4","25","18","14","29","1","22"};
    String bmth[]={"FEB","SEP","MARCH","APRIL","JAN","SEP","APRIL","OCT","NOV","FEB"};
    int byr[]={2001,2000,2004,2004,1999,2000,2009,2007,2004,2000};
    int age[]={14,15,11,11,16,15,6,8,11,15};
    int sclass[]={10,11,7,7,12,11,2,4,7,11};
    String bgp[]={"B+ve","O+ve","B+ve","B+ve","O+ve","B-ve","O+ve","B+ve","B+ve","B+ve"};
    String cmm[]={"BC","MBC","OC","BC","SC","BC","SC","ST","OC","SC"};
    String phno[]={"9176443199","9856445236","9565488745","9633542785","9564582157","9658753215","9856325698","9687465239","9524562118","9940124635"};
    public void main()
    {
        sof ob=new sof();
        ob.password();
    }
    public void password()
    {
            sof ob=new sof();
        Scanner sc=new Scanner(System.in);
        System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~");
        System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");    
        System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");
        System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");    
        
        System.out.println("\t\t\t\t\tWELCOME TO ");
        System.out.println("\t\t\tDr. A.P.J. ABDUL KALAM HR. SEC. SCHOOL OFFICE AUTOMATION");
        System.out.println("\n\t\t\tEnter the password");
        pass=sc.nextLine();
        
        ob.menu(pass);//passing the password
    }
    public void menu(String p)//p-to store the password
    {
             sof ob=new sof();
        Scanner sc=new Scanner(System.in);
 
        if(p.equals(pas))
        {
         System.out.println('\u000c');
        System.out.println("\n\n\n\t\t\t\t\t`~`~`Main Menu`~`~`");
        System.out.println("\n\t\t\t\t\t1.Student Admission");
        System.out.println("\n\t\t\t\t\t2.Student Information");
        System.out.println("\n\t\t\t\t\t3.Fees Structure");
        System.out.println("\n\nEnter your option:");
        opt1=sc.nextInt();
        switch(opt1)
        {
            case 1:
            ob.stad();
            break;
            
            case 2:
            ob.casee();
            
            case 3:
            System.out.println('\u000c');
            System.out.println("\n\t\t\t\t\tThe school Year is divided into Two terms");
            System.out.println("\n\t\t\t\t\tFirst Term:MARCH to SEPTEMBER");
            System.out.println("\n\t\t\t\t\tSecond Term:OCTOBER to MARCH");
            System.out.println("\n\n\n\t\tClass\t\t\tFirst Term fees\t\t\tSecond Term fees");
            System.out.println("\n\n\t\t1-5\t\t\t10,500\t\t\t\t10,500");
            System.out.println("\n\t\t6-8\t\t\t11,000\t\t\t\t11,000");
            System.out.println("\n\t\t9-10\t\t\t12,000\t\t\t\t12,000");
            System.out.println("\n\t\t11-12\t\t\t20,000-30,000\t\t\t20,000-30,000");
            System.out.println("\n\n\t\t\tEnter 1 to go to main menu"); 
    System.out.println("\n\t\t\tEnter 0 to exit"); 
    repas=sc.nextInt();
    if(repas==1)
    {
    System.out.println('\u000c');
    pass="sallu";
    ob.menu(pass);
}
    else
    {
    System.out.println('\u000c');
    System.exit(0);
}
            break;
            
            default:
            System.out.println("\n\n\n\t\t\t**********Wrong Input****************");
    System.out.println("\n\n\t\t\tEnter 1 to type again"); 
    System.out.println("\n\t\t\tEnter 0 to exit"); 
    repas=sc.nextInt();
    if(repas==1)
    {
    System.out.println('\u000c');
    pass="sallu";
    ob.menu(pass);
}
    else
    {
    System.out.println('\u000c');
    System.exit(0);
}
        } 
    }
    else
    {
    System.out.println('\u000c');
    System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");
    System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");    
    System.out.println("\n\n\n\t\t\t**********Wrong Password****************");
    System.out.println("\n\n\t\t\tEnter 1 to type again"); 
    System.out.println("\n\t\t\tEnter 0 to exit"); 
    repas=sc.nextInt();
    if(repas==1)
    {
    System.out.println('\u000c');
    ob.password();
}
    else
    {
    System.out.println('\u000c');
    System.exit(0);
}
}
    }
    public void stad()
    {
        sof ob=new sof();
    Scanner sc=new Scanner(System.in);    
    System.out.println('\u000c');
    System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");
    System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~~`~``~`~`~`~`~`~`~`~`~`~`~`~`~`~");    
    System.out.println("\n\n\t\t\t*********Admissions are open only for +1*********"); 
    System.out.println("\n\n\t\t:-:-:Enter your name:-:-:");
    nme=sc.nextLine();
    System.out.println("\n\n\t\t:-:-:Enter your 10th Board Exam marks out of 500:-:-:");
    bde=sc.nextInt();
    System.out.println("\n\n\t\t:-:-:Enter your register number:-:-:");
    rno=sc.next();
    System.out.println('\u000c');
    System.out.println("\n\n\t\t:-:-:We Have a different CUT OFF for different Board:-:-:");
    System.out.println("\n\t\t:-:-:Enter the Syllabus which you studied in 10th:-:-:");
    System.out.println("\n\n\t\t!!1.SAMECHER");
    System.out.println("\n\t\t!!2.ICSE");
    System.out.println("\n\t\t!!3.CBSE");
    syl=sc.nextInt();    
    System.out.println('\u000c');
   switch(syl)
    {
        case 1:
    if(bde<=500)
    {
        per=(bde*100.0)/500.0;
        if(per>=85.0)
        {
            
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\n\t\t1. GROUP 1-Maths,Physics,Chemistry,Biology");
            System.out.println("\n\t\t2. GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t3. GROUP 3-Botany,Zoolazy,Physics,Chemistry");
            System.out.println("\n\t\t4. GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
           while(n!=1){
            grp=sc.nextInt();
            if(grp==1||grp==2||grp==3||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("\n\t**********WRONG INPUT************");
            System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
    }
        }
        if(per>=50.0&&per<85.0)
        {
           
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\t\t GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
             while(n!=1){
            grp=sc.nextInt();
            if(grp==2||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("**********WRONG INPUT************");
             System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
        }
        }
        if(per>=40.0&&per<50.0)
        {
           
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\t\t GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
             while(n!=1){
            grp=sc.nextInt();
            if(grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("**********WRONG INPUT************");
             System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
        }
        }
        if(per<40.0)
        {
            System.out.println("\n\t\tSince You Have Got Less than 40% You Cannot Be Admitted To 11th");
            System.out.println("\n\t\t!!Enter 0 to exit");
            opt2=sc.nextInt();
            if(opt2>=0)
            {
                System.out.println('\u000c');
                System.exit(0);
            }
        }
    }
    else
    {
        System.out.println("\n\n\t\t\t:-:-:You have entered  marks more than 500:-:-:");
        System.out.println("\n\n\t\t\t!!!Enter '1' to go to main menu");
        System.out.println("\n\t\t\t!!!Enter '2' to EXIT");
        opt2=sc.nextInt();
        if(opt2==1)
        {
            ob.menu(pas);
        }
    }
        break;
        case 2:
        if(bde<=500)
    {
        per=(bde*100.0)/500.0;
        if(per>=65.0)
        {
            
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\n\t\t1. GROUP 1-Maths,Physics,Chemistry,Biology");
            System.out.println("\n\t\t2. GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t3. GROUP 3-Botany,Zoolazy,Physics,Chemistry");
            System.out.println("\n\t\t4. GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
           while(n!=1){
            grp=sc.nextInt();
            if(grp==1||grp==2||grp==3||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("\n\t**********WRONG INPUT************");
            System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
    }
        }
        if(per>=40.0&&per<65.0)
        {
           
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\n\t\t1. GROUP 1-Maths,Physics,Chemistry,Biology");
            System.out.println("\n\t\t GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
             while(n!=1){
            grp=sc.nextInt();
            if(grp==1||grp==2||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("**********WRONG INPUT************");
             System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
        }
        }
       
        if(per<40.0)
        {
            System.out.println("\n\t\tSince You Have Got Less than 40% You Cannot Be Admitted To 11th");
            System.out.println("\n\t\t!!Enter 0 to exit");
            opt2=sc.nextInt();
            if(opt2>=0)
            {
                System.out.println('\u000c');
                System.exit(0);
            }
        }
    }
    else
    {
        System.out.println("\n\n\t\t\t:-:-:You have entered  marks more than 500:-:-:");
        System.out.println("\n\n\t\t\t!!!Enter '1' to go to main menu");
        System.out.println("\n\t\t\t!!!Enter '2' to EXIT");
        opt2=sc.nextInt();
        if(opt2==1)
        {
            ob.menu(pas);
        }
    }
        break;
        case 3:
        if(bde<=500)
    {
        per=(bde*100.0)/500.0;
        if(per>=75.0)
        {
            
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\n\t\t1. GROUP 1-Maths,Physics,Chemistry,Biology");
            System.out.println("\n\t\t2. GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t3. GROUP 3-Botany,Zoolazy,Physics,Chemistry");
            System.out.println("\n\t\t4. GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
           while(n!=1){
            grp=sc.nextInt();
            if(grp==1||grp==2||grp==3||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("\n\t**********WRONG INPUT************");
            System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
    }
        }
        if(per>=45.0&&per<75.0)
        {
           
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\n\t\t1. GROUP 1-Maths,Physics,Chemistry,Biology");
            System.out.println("\n\t\t GROUP 2-Maths,Physics,Chemistry,Computer Science");
            System.out.println("\n\t\t GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
             while(n!=1){
            grp=sc.nextInt();
            if(grp==1||grp==2||grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("**********WRONG INPUT************");
             System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
        }
        }
        if(per>=40.0&&per<45.0)
        {
           
            System.out.println("\n\n\t\t!!Since you have got "+per+"% you can select a group from the given option's ");
            System.out.println("\n\t\t GROUP 4-Accounts,Business Maths,Commerce,Economics");
            System.out.println("\n\t!!Enter the group number which you want.....");
             while(n!=1){
            grp=sc.nextInt();
            if(grp==4)
            {
                n=1;
            ob.fees(grp,nme,rno);
        }
            else
            {
            System.out.println("**********WRONG INPUT************");
             System.out.println("\n\t!!!!!!!!!!TYPE AGAIN!!!!!!!!!!!!!");
        }
        }
        }
        if(per<40.0)
        {
            System.out.println("\n\t\tSince You Have Got Less than 40% You Cannot Be Admitted To 11th");
            System.out.println("\n\t\t!!Enter 0 to exit");
            opt2=sc.nextInt();
            if(opt2>=0)
            {
                System.out.println('\u000c');
                System.exit(0);
            }
        }
    }
    else
    {
        System.out.println("\n\n\t\t\t:-:-:You have entered  marks more than 500:-:-:");
        System.out.println("\n\n\t\t\t!!!Enter '1' to go to main menu");
        System.out.println("\n\t\t\t!!!Enter '2' to EXIT");
        opt2=sc.nextInt();
        if(opt2==1)
        {
            ob.menu(pas);
        }
    }
        break;
        default:
        System.out.println('\u000c');
        System.out.println("\n\n\t\tWrong Input");
        System.out.println("\n\n\t\tEnter 1 to go to main menu");
        System.out.println("\n\n\t\tEnter 0 to EXIT");
        int re=sc.nextInt();
    if(re==1)
    {
    System.out.println('\u000c');
    ob.menu(pas);
}
    else
    {
    System.out.println('\u000c');
    System.exit(0);
}
    }
}
public void fees(int gp,String nme,String rno)
{
    Scanner sc=new Scanner(System.in); 
    sof ob=new sof();
    if(gp==1)
    {
    gpp="Maths,Physics,Chemistry,Biology";
    grs=60000;
}
    if(gp==2)
    {
    gpp="Maths,Physics,Chemistry,Computer Science";
    grs=60000;
}
    if(gp==3)
    {
    gpp="Botany,Zoolazy,Physics,Chemistry";
    grs=70000;
}
    if(gp==4)
    {
    gpp="Accounts,Business Maths,Commerce,Economics";
    grs=40000;
}
    System.out.println('\u000c');
    System.out.println("\n\t\tYou Have Selected Group "+gp+"-"+gpp);
    System.out.println("\n\t\tDonation amount is Rs.20,000");
    System.out.println("\n\t\tFEES Amount for Group "+gp+" is Rs."+grs+" per Year (or) Rs."+(grs/2)+" per term ");
    System.out.println("\n\t\tEnter 0 to stop and quit");
    System.out.println("\t\tEnter 1 to continue the formality");   
    re=sc.nextInt();
    if(re==1)
    ob.rules(nme,rno);
    if(re==0)
    {
    System.out.println('\u000c');
    System.exit(0);
}
}
public void rules(String nme,String rno)
{
    Scanner sc=new Scanner(System.in); 
    sof ob=new sof();
    System.out.println('\u000c');
    System.out.println("\n\t\tEnter any number to know about the rules of the school");
    ru=sc.nextInt();
    if(ru>=1)
    {
     System.out.println('\u000c');
     System.out.println("\t\t\t\t`~`~`~`~`~RULES OF THE SCHOOL`~`~`~`~`~");
     System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~");
     System.out.println("`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~`~");
     System.out.println("\n\tDiscipline is the hallmark of Our School and for its attainment,these rules are framed."
     +"\n\tParents are equally responsible to ensure that the students follow,observe and uphold these rules."
     +"\n\n\t1.Abscence from School must be filled in the abscence record of the Hand Book and signed by the parent."
     +"\n\tStudents who avail leave for more than 2 days should prior permission of the principal."
     +"\n\n\t2.Bringing Cell-Phones to School is Banned.Cell-Phone brought to School by Children will be confiscated and a"
     +"\n\t fine of Rs.500/- will be imposed,payable within 3 days."
     +"\n\n\t3.Good behaviour and good manners are rxpected at all times.Use of bad language,reading obscene literature,unruly"
     +"\n\tbehaviour,anti-social activities,smoking etc. are strictly forbidden. Defaulters will be severely punished or"
     +"\n\texpelled from school without any notice."
     +"\n\n\t4.Rules are meant to be respected,adhered to and followed strictly in the interest of much desired dicipline and"
     +"\n\twelfare of the students.Should any of the rules be disregarded,disobyed and/or disrespected,a fine of Rs.500/-"
     +"\n\tand/or suspension will be awarded as punishment." 
     +"\n\n\tOther rules are given in students Hand Book....pls refer.");
                    }
    System.out.println("\n\t!Enter 1 to continue if you agree with the rules");
    System.out.println("\t!Enter 0 to QUIT");
    aru=sc.nextInt();
    if(aru==1)
    {
        ob.endadmission(nme,rno);
    }
}
public void endadmission(String nme,String rno)
{
        Scanner sc=new Scanner(System.in); 
    sof ob=new sof();
    System.out.println('\u000c');
    System.out.println("\n\n\t\tPlease give your Phone number");
    ph=sc.nextLong();
    System.out.println("\n\n\t\tWe will Verify about you "+nme+" using your register no. "+rno);
    System.out.println("\n\t\tWithin 2 days after Verification we will call you and you can pay the money\n\t\tin the office and join the school");
     System.out.println("\n\n\t\tEnter 1 to go to main menu");
        System.out.println("\n\n\t\tEnter 0 to EXIT");
        int re=sc.nextInt();
    if(re==1)
    {
    System.out.println('\u000c');
    ob.menu(pas);
}
    else
    {
    System.out.println('\u000c');
    System.exit(0);
}
}//end of Student admission..............

public void casee()
    {
               Scanner sc=new Scanner(System.in);
               sof ob=new sof();
               int f=0;
               System.out.println('\u000c');
               System.out.println("\n\n\t\t\t\t!!Student Information!!");
               System.out.println("\n\n\t\t\t\tEnter the name");
               bn=sc.next();
               for(i=0;i<10;i++)
               {
                   if(bn.equalsIgnoreCase(cnme[i]))
                   {
                       f=1;
                    }
                }
                for(i=0;i<10;i++)
                {
                if(f==1)
                {
                    if(bn.equalsIgnoreCase(cnme[i]))
                    {
                        System.out.println('\u000c');
                        System.out.println("\n\n\t\tStudents Name: "+fname[i]);
                        System.out.println("\n\t\tDate Of Birth: "+bmth[i]+" "+bdte[i]+","+byr[i]);
                        System.out.println("\n\t\tAge: "+age[i]);
                        System.out.println("\n\t\tSex: "+sex[i]);
                        System.out.println("\n\t\tClass: "+sclass[i]);
                        System.out.println("\n\t\tCommunity: "+cmm[i]);
                        System.out.println("\n\t\tBlood Group: "+bgp[i]);
                        System.out.println("\n\t\tPhone no.: "+phno[i]);
                    System.out.println("\n\n\n\t\tEnter 1 to go to main menu");
                   System.out.println("\n\n\n\t\tEnter 0 to exit");
                   int oo=sc.nextInt();
                   if(oo==1)
                   {
                       pass="sallu";
                   ob.menu(pass);
                }
                   else
                   {
                   System.out.println('\u000c');
                   System.exit(0);
                }
                    }
                        }
            }
                        
                if(f==0)
                {
                    System.out.println('\u000c');
                    System.out.println("\n\n\n\n\t  You must Have typed the name of a person who\n is not a student of our school");
                    System.out.println("\t\t(or)");
                    System.out.println("\tYou must Have made a spelling mistake");
                    System.out.println("\n\n\t\tEnter 1 to get help for SPELLING");
                    System.out.println("\n\t\tEnter 2 to EXIT");
                    ch2=sc.nextInt();
                if(ch2==1)
            {
                System.out.println('\u000c');
                System.out.println("\n\n\t\t*****Get help For Spelling Here");
                System.out.println("\n\n\t\tEnter the FIRST letter of the name");
                s=sc.next().charAt(0);
                ob.bspel(s);
            }
            if(ch2==2)
            {
               System.out.println('\u000c');
               System.exit(0);
            }
        }
            

            }
    public void bspel(char s1)
    {
        Scanner sc=new Scanner(System.in);
        sof ob=new sof();
        int m=0;
        if(s1=='a'||s1=='A')
        {
            m=1;
            System.out.println("\n\t1.Abishek\n\t2.Anushka");
            System.out.println("\n\n\t\tEnter 1 to continue");
        }
        
        if(s1=='S'||s1=='s')
        {
            m=1;
            System.out.println("\n\t1.sallu\n\t2.Sameer\n\t3.Shradha\n\t4.Salman\n\t5.Shruthi");
            System.out.println("\n\n\t\tEnter 1 to continue");
        }
        if(s1=='D'||s1=='d')
        {
            m=1;
            System.out.println("\n\t1.Danish");
            System.out.println("\n\n\t\tEnter 1 to continue");
        }
        if(s1=='V'||s1=='v')
        {
            m=1;
            System.out.println("\n\t1.venkat\n\t2.vijay");
            System.out.println("\n\n\t\tEnter 1 to continue");
        }
        if(m==0)
        {
            
             System.out.println("\n\n\t\t****No help available for this letter");
              System.out.println("\n\n\t\tEnter 1 to continue");
               System.out.println("\n\n\t\tEnter 0 to Exit");
        }
        b=sc.nextInt();
    
        if(b==1)
        {
            d=1;
          ob.casee();
        }
        if(b==0)
            {
               System.out.println('\u000c');
               System.exit(0);
            }
    }
}

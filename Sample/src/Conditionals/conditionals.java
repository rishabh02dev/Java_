package Conditionals;

public class conditionals {
    public static void main(String[] args) {
//        int salary = 2000;
//        if (salary == 2000){
//            salary+=2000;
//            System.out.println(salary);

//        multiple if else statements
          int salary = 10000;
        if(salary>1000){
            salary+=1000;
        } else if (salary>2000) {
            salary+=2000;
        } else if (salary>3000) {
            salary+=3000;
        }
        System.out.println(salary);
    }
}

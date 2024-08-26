
class ajay1 {
    public static void main(String[] args) {
        for(int a=1; a<=4; a++){
            for(int b=1; b<=3; b++){
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
}



class ajay2 {
    public static void main(String[] args) {
        int x=4;
        for(int a=0; a<x; a++){
            for(int b=x; b>a; b--){
                System.out.print('*'); 
            }
            System.out.println(' ');
        }
    }
}


class ajay3 {
    public static void main(String[] args) {
        int x=4;
        for(int a=0; a<x; a++){
            for(int b=0; b<a+1; b++){
                System.out.print('*'); //0/00/000
            }
            System.out.println(' ');
        }
    }
}


class ajay4 {
    public static void main(String[] args) {
        int x=4;
        for(int a=0; a<x; a++){
            for(int b=0; b<x-a; b++){
                System.out.print(' '); //0/00/000
            }
            for(int b=0; b<a+1; b++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }
}


class ajay5 {
    public static void main(String[] args) {
        int x=6;
        for(int a=1; a<x; a++){
            for(int b=1; b<a+1; b++){
                System.out.print(b); //0/00/000
            }
            System.out.println(' ');
        }    
    }
}



class ajay6 {
    public static void main(String[] args) {
        int x=5;
        for(int a=0; a<x; a++){
            for(int b=x; b>a; b--){
                System.out.print(b); //54321/5432
            }
            System.out.println(' ');
        }    
    }
}



class ajay7 {
    public static void main(String[] args) {
        int x=6;
        for(int a=1; a<x; a++){
            for(int b=1; b<=x-a; b++){
                System.out.print(b); //54321/5432
            }
            System.out.println(' ');
        }    
    }
}




class ajay8 {
    public static void main(String[] args) {
        int x=6;
        int number=1;
        for(int a=1; a<x; a++){
            for(int b=1; b<a+1; b++){
                System.out.print(number +" ");//54321/5432
                number=number+1;//1/23/456
            }
            System.out.println(' ');
        }    
    }
}



class ajay9 {
    public static void main(String[] args) {
        int x=4;
        int y=5;
        for(int a=1; a<=x; a++){
            for(int b=1; b<=y; b++){
                if(a==1 || b==1 || a==x || b==y){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            
            System.out.println();
        }
    }
}




class ajay10 {
    public static void main(String[] args) {
        for (int a=1; a<6; a++ ){
            for (int b=1; b<a+1; b++){
                int sum=a+b;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
            
        }
    }
}




class ajay11 {
    public static void main(String[] args) {
        for (int a=1; a<6; a++ ){
            for (int b=1; b<a+1; b++){
                int sum=a+b;
                if(sum%2==0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
            
        }
    }
}



class ajay12 {
    public static void main(String[] args) {
        for(int a=1; a<6; a++){
            for(int b=1; b<a+1; b++){
                System.out.print("*");
            }
            for(int b=5; b>a; b--){
                System.out.print(" ");
            }
            for(int b=5; b>a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<a+1; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=5; a>1; a--){
            for(int b=1; b<a+1; b++){
                System.out.print("*");
            }
            for(int b=5; b>a; b--){
                System.out.print(" ");
            }
            for(int b=5; b>a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<a+1; b++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}




class ajay13 {
    public static void main(String[] args) {
        for(int a=1; a<6; a++){
            for(int b=4; b>=a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<6; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



class ajay14 {
    public static void main(String[] args) {
        for(int a=1; a<6; a++){
            for(int b=4; b>=a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<a+1; b++){
                System.out.print(b+" "); //k
            }
            System.out.println();
        }
    }
}




class ajay15 {
    public static void main(String[] args) {
        for(int a=5; a>=1; a--){
            for(int b=4; b>=a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<a+1; b++){
                System.out.print("* "); //k
            }
            System.out.println();
        }
    }
}




class ajay16 {
    public static void main(String[] args) {
        for(int a=1; a<=6; a++){
            for(int b=6; b>=a; b--){
                System.out.print(" ");
            }
            for(int b=1; b<=6-5; b++){
                System.out.print("*"); 
            }
            for(int b=3; b<=a*2; b++){
                System.out.print(" ");
            }
            for(int b=1; b<=6-5; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



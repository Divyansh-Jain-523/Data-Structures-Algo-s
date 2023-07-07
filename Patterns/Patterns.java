public class Patterns {
    public static void main(String[] args) {
        p22.logic(9);
    }
}
class p1{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class p2{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            for (int j = 0 ; j <= i  ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class p3{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
class p4{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
class p5{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            for (int j = i ; j < n ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class p6{
    static void logic(int n){
        for (int i = 0 ; i < n ;i++){
            int k = 1;
            for (int j = i ; j < n ; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
class p7{
    static void logic(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            for(int j = 1 ; j < 2*i ; j++){
                System.out.print('*');
            }
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
class p8{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < 2*(n-i) - 1 ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
class p9{
    static void logic(int n){
        for (int i = 1 ; i <=  n ; i++){
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < 2 * i - 1 ; j++){
                System.out.print('*');
            }
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = 1 ; i < n  ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < 2*(n - i ) -1 ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
class p10{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
class p11{
    static void logic(int n ){
        int start;
        for (int i = 0; i < n; i++){
            if(i%2 == 0) start = 1;
            else start = 0;
            for (int j = 0 ; j <= i ; j++){
                System.out.print(start);
                start = 1 - start;  // very imp step
            }
            System.out.println();
        }
    }
}
class p12{
    static void logic(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print(j+1);
            }
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            for (int j = i ; j < n ; j++){
                System.out.print(' ');
            }
            for (int j = i ; j > 0 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class p13{
    static void logic(int n){
        int num = 1;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
class p14{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0  ; j <= i ; j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }
}
class p15{
    static void logic(int n) {
        for (int i = 0 ; i < n ; i++){
            for (int j = n-i ; j > 0 ; j--){
                System.out.print((char) (n+65-j-i));
            }
            System.out.println();
        }
    }
}
class p16{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print((char) (i+65));
            }
            System.out.println();
        }
    }
}
class p17{
    static void logic(int n) {
        for (int i = 1 ; i <= n ; i++){
            for (int j = i ; j < n; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print((char)(j+65));
            }
            for (int j = 1 ; j < i ; j++){
                System.out.print((char) (i+64-j));
            }
            for (int j = i ; j < n; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
class p18{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j<= i; j++){
                System.out.print((char) (69-i+j));
            }
            System.out.println();
        }
    }
}
class p19{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n - i ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < 2*i ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < n - i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < 2*(n-i-1) ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j <= i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class p20{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < 2*(n-i-1); j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j <= i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n-1 ; i > 0; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print('*');
            }
            for (int j = 0 ; j < 2*(n-i) ; j++){
                System.out.print(' ');
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class p21{
    static void logic(int n){
        for (int i = 0 ; i < n ; i++){
            if (i == 0){
                for (int j = 0 ; j < n ; j++){
                    System.out.print('*');
                }
                System.out.println();
            } else if (i == n-1) {
                for (int j = 0 ; j < n ; j++){
                    System.out.print('*');
                }
                System.out.println();
            }
            else {
                System.out.print('*');
                for (int j = 1 ; j < n-1; j++){
                    System.out.print(' ');
                }
                System.out.println('*');
            }
        }
    }
}
class p22{
    static void logic(int n){
        for (int i = 0 ; i < 2*n - 1 ; i++) {
            for (int j = 0 ; j < 2 * n - 1 ; j++){
                int top , down , left , right ;
                top = i;
                down = j;
                left = 2*n - 2 -i;
                right = 2*n - 2 - j;
//                System.out.print(((top < down) ? top : down) < ((left < right)? left: right) ? n-);
            }
        }
    }
}
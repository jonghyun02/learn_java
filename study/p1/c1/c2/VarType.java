package study.p1.c1.c2;

public class VarType {
    public static void main(String[] args) {
        //1. 자료형 크기
        byte b = 8; //1byte
        short s = 16; //2byte
        char c = 16; //2byte, Unicode 지원을 위해서 2byte임
        int i = 32; //4byte
        long l = 64; //8byte
        System.out.println("자료형 비트 크기");
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("char: "+c);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println();
        
        //2. 정수 리터럴(literal)
        int bin = 0b1010; //0b는 2진수
        int oct = 013; //0은 8진수
        int dec = 12; //그냥쓰면 10진수
        int hex = 0xa3; //0x는 16진수
        System.out.println("정수 리터럴");
        System.out.println("bin: "+bin);
        System.out.println("oct: "+oct);
        System.out.println("dec: "+dec);
        System.out.println("hex: "+hex);
    }
}

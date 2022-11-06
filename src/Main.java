import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2;
        char oper, i;
        int counter=1;
                String greeting;
        System.out.println("***나의 첫 계산기 V1.0***");
       do{
           switch (counter){
               case 1:
                   System.out.println("첫번째 사용입니다"); break;
               case 2:
                   System.out.println("두번째 사용입니다"); break;
               case 3:
                   System.out.println("세번째 사용입니다. 바쁘신가 보군요"); break;
              case 4:
                     System.out.println(String.format("%d 번째 사용중 이십니다.", counter)); }

           System.out.print("처음수 입력 : ");
        num1 = input.nextDouble();

        System.out.print("연산기호 입력 : ");
        oper = input.next().charAt(0);

        System.out.print("두번째 수 입력 : ");
        num2 = input.nextDouble();

            {
                if (oper == '+') {
                    System.out.print("결과는 ");
                    System.out.println(num1 + num2);
                   // if(i==n) {return i;}
                } else if (oper == '-') {
                    System.out.print("결과는 ");
                    System.out.println(num1 - num2);
                } else if (oper == '*') {
                    System.out.print("결과는 ");
                    System.out.println(num1 * num2);
                } else if (oper == '/') {
                    System.out.print("결과는 ");
                    System.out.println(num1 / num2);
                }
                else System.out.println("입력값이 잘못되었습니다. + - * / 만 입력 가능합니다.");
            }
            System.out.print("계속 하시겠습니까? (y or n) ");
           i = input.next().charAt(0);
           if(i=='n') {
               System.out.println("이용해 주셔서 감사합니다.");
           } else if (i=='y' || i=='Y'){counter = counter+1;}

      }while (i == 'y' || i=='Y');
    }

    }

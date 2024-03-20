/**
 * 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
 * cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
 * Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
 * que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print(" Digite o número de horas trabalhadas no mês: ");
		    int horasTrabalhadasMes = sc.nextInt();

		    System.out.print("Salário por hora: ");
		    double salarioHora = sc.nextDouble();

		    double salarioTotal = 0.0;

		    if (horasTrabalhadasMes > 160) {
		        int horasExtras = horasTrabalhadasMes - 160;
		        double salarioHoraExtra = salarioHora + (salarioHora * 0.5);
		        salarioTotal = (160 * salarioHora) + (horasExtras * salarioHoraExtra);
		    } else {
		        salarioTotal = horasTrabalhadasMes * salarioHora;
		    }

		    System.out.println("Salário total do funcionário é de: R$ " + salarioTotal);

		    sc.close();
		}
		
	}

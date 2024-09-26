package javaCurso2024;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random ran = new Random();

		System.out.println("Numeros aleatórios de 1 a 100: ");

		for (int number = 0; number < 5; number++)
			;
		{
			int random = ran.nextInt(100) + 1;
			System.out.println(random);

		}

	}

}

package Curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Hora {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// aqui vamos aprender a instanciar DATA E HORA 
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // aqui estou colocando para estabelecer o fuso horario do computador de uso
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // é uma data local, não tem fuso horario
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now(); // aqui sai só a data
		LocalDateTime d02 = LocalDateTime.now(); // aqui sai a data com horario e fração de segundos
		Instant d03 = Instant.now(); // aqui sai com o horario gmt z , ou seja, com o horario padrão de londes. Instant tbm não aceita formatação
		
		LocalDate d04 = LocalDate.parse("2024-07-17"); // aqui eu posso personaizar e colcoar a hora que eu quiser 
		LocalDateTime d05 = LocalDateTime.parse("2024-07-17T14:26:29");
		Instant d06 = Instant.parse("2024-07-17T14:26:29Z"); // Instant não acc formatação, logo tbm o z siguinifica que o horário é londres
		Instant d07 = Instant.parse("2024-07-17T14:26:29-03:00"); // aqui colouquei -03:00 horas, para ficar igual ao horario de londres
		
		LocalDate d08 = LocalDate.parse("20/07/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2024 14:32", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 07, 17);
		LocalDateTime d11 = LocalDateTime.of(2024, 07, 17, 14, 35);
		
		System.out.println("d01 = " + d01.toString()); // aqui o toString deixa formatado com o PADRÂO ISO 8601
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		
		System.out.println();
		System.out.println("d05 = " + d05.toString());
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt3));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println();
		
		System.out.println("d06 = " + d06.toString());
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println();
		
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}

}

package br.com.apadrinhamentocalouros.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

	public static LocalDate dateToLocalDate(Date data) {
		return data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
}

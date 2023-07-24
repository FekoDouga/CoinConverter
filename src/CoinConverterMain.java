
import java.text.*;
import javax.swing.JOptionPane;

public class CoinConverterMain {

	public static void main(String[] args) {

		Divisas monedaCambio = new Divisas();

		Object[] options = { "Convertir de pesos a otra moneda", "Convertir de otra moneda a pesos",
				"ConvertIr Temperatura", "salir" };
		int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer", "Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (elige == 3) {
			JOptionPane.showMessageDialog(null, "programa cerrado");
			System.exit(0);
		}
		if (elige == 0) {
			DecimalFormat formatCurrencies = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Pesos a Euros", "Pesos a Dolares", "Pesos a Libras Esterlinas", "Pesos a yen",
						"Pesos a Won sul-coreano" };
				String cambio = (String) JOptionPane.showInputDialog(null, "elija una opcion", "Conversor de Monedas",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Pesos: ");
				double mXN = 0;

				try {
					mXN = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "valor no valido");
				}

				switch (cambio) {
				case "Pesos a Euros":
					double euros = mXN / monedaCambio.eur;
					JOptionPane.showMessageDialog(null,
							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(euros) + " Euros ");
					break;

				case "Pesos a Dolares":
					double dolares = mXN / monedaCambio.dll;
					JOptionPane.showMessageDialog(null,
							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(dolares) + " Dolares ");
					break;

				case "Pesos a Libras esterlinas":
					double gbp = mXN / monedaCambio.gbp;
					JOptionPane.showMessageDialog(null,
							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(gbp) + " Libras esterlinas ");
					break;

				case "Pesos a yen":
					double yen = mXN / monedaCambio.jpy;
					JOptionPane.showMessageDialog(null,
							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(yen) + " yen ");
					break;

				case "Pesos a Won sul-coreano":
					double won = mXN / monedaCambio.won;
					JOptionPane.showMessageDialog(null,
							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(won) + " won");

					break;
				default:
					break;
				}
			}
		}
		if (elige == 2) {
			DecimalFormat formatTemp = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Celcius a Farenheit", "Farenheit a Celcius"};
				String cambio = (String) JOptionPane.showInputDialog(null, "elija una opcion", "Conversor de Temperatura",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad: ");
				double tempX = 0;
				
				try {
					tempX = Double.parseDouble(input);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}
				
				switch (cambio) {
				case "Celcius a Farenheit":
					double farenheit = (tempX  * 9/5) + 32;
					JOptionPane.showMessageDialog(null,formatTemp.format(farenheit) + "° Farenheit");
					break;
				case "Farenheit a Celcius":
					double celcius = (tempX - 32) * 5/9;
					JOptionPane.showMessageDialog(null,formatTemp.format(celcius) + "° Celcius");
					break;
					
					
					
				}
			}
		}
		if (elige == 1) {
			DecimalFormat formatCurrencies = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Euros a Pesos", "Dolares a Pesos", "Libras Esterlinas a Pesos", "yen a Pesos",
						"Won sul-coreano a Pesos" };
				String cambio = (String) JOptionPane.showInputDialog(null, "elija una opcion", "Conversor de Monedas",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input2 = JOptionPane.showInputDialog(null, "Ingrese Cantidad: ");
				double coinX = 0;

				try {
					coinX = Double.parseDouble(input2);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "valor no valido");
				}

				switch (cambio) {
				case "Euros a Pesos":
					double euros =  monedaCambio.eur * coinX;
					JOptionPane.showMessageDialog(null, formatCurrencies.format(coinX)  + " Euros igual a: " +   formatCurrencies.format(euros) + " MXN ");
					break;

				case "Dolares a Pesos":
					double dll = monedaCambio.dll * coinX;
					JOptionPane.showMessageDialog(null, formatCurrencies.format(coinX)  + " Dolares igual a: " + formatCurrencies.format(dll) + " MXN ");
					break;

				case "Libras Esterlinas a Pesos":
					double gbp = monedaCambio.gbp * coinX;
					JOptionPane.showMessageDialog(null, formatCurrencies.format(coinX)  + " Libras Esterlinas igual a: " + formatCurrencies.format(gbp) + " MXN ");
					break;

				case "yen a Pesos":
					double yen = monedaCambio.jpy * coinX;
					JOptionPane.showMessageDialog(null, formatCurrencies.format(coinX)  + " Yens igual a: " + formatCurrencies.format(yen) + " MXN ");
					break;

				case "Won sul-coreano a Pesos":
					double won = monedaCambio.won * coinX;
					JOptionPane.showMessageDialog(null, formatCurrencies.format(coinX)  + " Wons igual a: " + formatCurrencies.format(won) + " MXN ");
					break;
				default:
					break;
				}
			}

			int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar el programa?", "confirmar",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
				continuarPrograma = false;
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
		}
	}
}

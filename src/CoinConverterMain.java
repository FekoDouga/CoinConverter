
import javax.swing.JOptionPane;
import java.text.*;

public class CoinConverterMain {

	public static void main(String[] args) {

		Divisas monedaCambio = new Divisas();

		Object[] options = { "converter Divisas", "ConvertIr Temperatura", "salir" };
		int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer", "Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		// int convert = JOptionPane.showOptionDialog(null, "elige una moneda", null,
		// elige, elige, null, options, options);
		if (elige == 2) {
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
				
				switch(cambio) {
				case "Pesos a Euros":double euros = mXN / monedaCambio.eur;
				JOptionPane.showMessageDialog(null,	mXN + "Pesos Mexicanos son: " + formatCurrencies.format(euros) + " Euros ");
					break;
				
				case "Pesos a Dolares":double dolares = mXN / monedaCambio.dll;
				JOptionPane.showMessageDialog(null,	mXN + "Pesos Mexicanos son: " + formatCurrencies.format(dolares) + " Dolares ");
					break;
				
				case "Pesos a Libras esterlinas":double gbp = mXN / monedaCambio.gbp;
				JOptionPane.showMessageDialog(null,	mXN + "Pesos Mexicanos son: " + formatCurrencies.format(gbp) + " Libras esterlinas ");
					break;
					
				case "Pesos a yen":double yen = mXN / monedaCambio.jpy;
				JOptionPane.showMessageDialog(null, mXN + "Pesos Mexicanos son: " + formatCurrencies.format(yen) + " yen ");
					break;
					
				case "Pesos a Won sul-coreano":double won = mXN / monedaCambio.won;
				JOptionPane.showMessageDialog(null,	mXN + "Pesos Mexicanos son: " + formatCurrencies.format(won) + " won");
						
					break;
				default:
					break;
				}

//				if (cambio.equals("Pesos a Euros")) {
//					double euros = mXN / monedaCambio.eur;
//					JOptionPane.showMessageDialog(null,
//							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(euros) + "Euros ");
//
//				} else if (cambio.equals("Pesos a Dolares")) {
//					double dolares = mXN / monedaCambio.dll;
//					JOptionPane.showMessageDialog(null,
//							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(dolares) + "Dolares ");
//
//				} else if (cambio.equals("Pesos a Libras esterlinas")) {
//					double gbp = mXN / monedaCambio.gbp;
//					JOptionPane.showMessageDialog(null,
//							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(gbp) + "Libras esterlinas ");
//
//				} else if (cambio.equals("Pesos a yen")) {
//					double yen = mXN / monedaCambio.jpy;
//					JOptionPane.showMessageDialog(null,
//							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(yen) + "yen ");
//
//				 if (cambio.equals("Pesos a won")) {
//					double won = mXN / monedaCambio.won;
//					JOptionPane.showMessageDialog(null,
//							mXN + "Pesos Mexicanos son: " + formatCurrencies.format(won) + "Won ");
//
				//}

				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar el programa?", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
			}

		}

	}
}

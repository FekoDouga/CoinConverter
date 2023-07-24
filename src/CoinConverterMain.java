import javax.swing.JOptionPane;
import java.text.*;

public class CoinConverterMain {

	public static void main (String[] args) {
		
		Object[] options = {"converter Divisas", "ConvertIr Temperatura", "salir"};
		int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer", "Conversor",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
		//int convert = JOptionPane.showOptionDialog(null, "elige una moneda", null, elige, elige, null, options, options);
		if (elige ==2) {
			JOptionPane.showMessageDialog(null, "programa cerrado");
			System.exit(0);
		}
		if (elige == 0 ) {
			DecimalFormat formatearDivisas = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = {"Pesos a Euros","Pesos a Dolares","Pesos a Libras Esterlinas","Pesos a yen","Pesos a Won"};
				String  cambio = (String) JOptionPane.showInputDialog(null, "elija una opcion","Conversor de Monedas", 
						JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Pesos: ");
				double pesos = 0;
				
				try {
					pesos = Double.parseDouble(input);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "valor no valido");
				}
		
		if (cambio.equals("Pesos a Euros")){
			double euros = pesos / 20;
			JOptionPane.showMessageDialog(null, 
					pesos + "Pesos Mexicanos son: " + formatearDivisas.format(euros) + "Euros ");
			
		}else if(cambio.equals("Pesos a Dolares")){
			double dolares = pesos / 17;
			JOptionPane.showMessageDialog(null, 
					pesos + "Pesos Mexicanos son: " + formatearDivisas.format(dolares) + "Dolares ");
			
		}else if(cambio.equals("Pesos a Libras esterlinas")){
			double libras = pesos / 25;
			JOptionPane.showMessageDialog(null, 
					pesos + "Pesos Mexicanos son: " + formatearDivisas.format(libras) + "Libras esterlinas ");
			
		}else if(cambio.equals("Pesos a yen")){
			double yen = pesos / 50;
			JOptionPane.showMessageDialog(null, 
					pesos + "Pesos Mexicanos son: " + formatearDivisas.format(yen) + "yen ");
			
		}else if(cambio.equals("Pesos a won")){
			double won = pesos / 12;
			JOptionPane.showMessageDialog(null, 
					pesos + "Pesos Mexicanos son: " + formatearDivisas.format(won) + "Won ");
			
		}
		
		int confirma = JOptionPane.showConfirmDialog(null,"Desea continuar el programa?", "confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
		if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
			continuarPrograma = false;
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
			}
			
			
		}
		
		
		
		
		
	}
}

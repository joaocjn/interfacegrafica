import javax.swing.JOptionPane;
public class interfacegrafica {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira seu nome");
				
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
				
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
		JOptionPane.showMessageDialog(null,"Ol� "+nome+"\n"
		+"Voc� tem "+idade+" anos"+"\n"
		+"Voc� tem "+altura+" metro");
		
	}

}

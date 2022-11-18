
package dogs.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dogs.model.DogDTO;



public class DogCreateView extends JDialog implements IView, ActionListener {
	
	private static final String VIEW_TITLE = "Inscription d'un chien";
	private static final String ADD_DOG = "inscrire";
	private static final String ADD_DOG_ACTION = "incription faire";
	private static final String TEXT_NAME_DOG = "nom:";
	private static final String TEXT_RACE_DOG = "race:";
	private static final String TEXT_THANKS_CREATING_DOG = "Merci d'avoir inscrit votre chien";
	private static final String NAME_PANEL_THANKS = "Merci";
	private int a =0;
	private JLabel Type1 = new JLabel("Nom: ");
    private JLabel Type2 = new JLabel("Race: ");
	private JTextField name = new JTextField(20);
	private JTextField breed = new JTextField(20);

	private IDogController controller;


	public DogCreateView(IDogController controller) {
		super();
		
		this.controller = controller;
		
		this.initialize();
		this.setUpComponents();
		this.pack();
	}

	@Override
	public void display() {
		// compléter
		this.setVisible(true);
	}
	
	private void initialize() {
		this.setTitle(VIEW_TITLE);		
		this.setModalityType(DEFAULT_MODALITY_TYPE);
	}

	private void setUpComponents() {
		this.setUpInputDataPanel();
		this.setUpActionPanel();		
	}

	private void setUpInputDataPanel() {
		// container intermédiaire JPanel qui contient les étiquettes (JLabel) et les zones de textes (JTextField)
		// utiliser un GridLayout comme LayoutManager
		JPanel dogCreatePanel = new JPanel(new GridBagLayout());
		this.add(dogCreatePanel, BorderLayout.CENTER);
		addTextField(dogCreatePanel, "nom:", name, Type1);
		addTextField(dogCreatePanel, "race:", breed, Type2);
		
		GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        dogCreatePanel.add(Type1, constraints);
 
        constraints.gridx = 1;
        dogCreatePanel.add(name, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        dogCreatePanel.add(Type2, constraints);
         
        constraints.gridx = 1;
        dogCreatePanel.add(breed, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        dogCreatePanel.add(addButton(dogCreatePanel, ADD_DOG, ADD_DOG_ACTION), constraints);
         
        dogCreatePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));
         
        add(dogCreatePanel);
	}
	
	private void addTextField(JPanel panel, String labelText, JTextField textField, JLabel label) {
		// Pour ajouter successivement une étiquette et une zone de texte au panel
		label.setText(labelText);
		panel.add(textField);
	}

	private void setUpActionPanel() {
		// container intermédiaire JPanel qui contient le bouton pour inscrire le chien
	}

	// même méthode que dans WelcomeView
	// DRY -> méthode utilitaire à extraire dans une classe utilitaire util.view.ViewUtil 
	private JButton addButton(JPanel actionPanel, String buttonText, String buttonAction) {   
		// Pour ajouter un bouton au panel	
		JButton addDogButton = new JButton(buttonText);
		addDogButton.addActionListener(this);
		addDogButton.setActionCommand(buttonAction);
		actionPanel.add(addDogButton);
		return addDogButton;
	}
	
	private void createDog() {
		DogDTO dog = new DogDTO(name.getText(), breed.getText(), 0);
		this.controller.add(dog);
		JOptionPane.showMessageDialog(null, TEXT_THANKS_CREATING_DOG);
		this.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// intercepter l'événement sur le bouton Inscrire et appeler la méthode createDog
		if(e.getActionCommand() == ADD_DOG_ACTION) {
			createDog();
		}
	}

}

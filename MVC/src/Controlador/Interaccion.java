package Controlador;

import Modelo.Logica;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interaccion implements ActionListener {

    private Ventana view;
    private Logica model;

    public Interaccion(Ventana view, Logica model) {
        this.view = view;
        this.model = model;
        this.view.btn_suma.addActionListener(this);
        this.view.btn_resta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumero1(Integer.parseInt(view.num1.getText()));
        model.setNumero2(Integer.parseInt(view.num2.getText()));
        if (e.getSource() == view.btn_suma) {
            model.sumar();
            view.result.setText(String.valueOf(model.getResultado()));
        } else if (e.getSource() == view.btn_resta) {
            model.restar();
            view.result.setText(String.valueOf(model.getResultado()));
        }
    }

}

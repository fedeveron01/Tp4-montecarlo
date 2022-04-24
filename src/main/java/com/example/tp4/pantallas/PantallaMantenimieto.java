package com.example.tp4.pantallas;

import com.example.tp4.controladores.GestorMantenimiento;
import com.example.tp4.controladores.GestorMantenimientoCorrectivo;
import com.example.tp4.modelos.Linea;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class PantallaMantenimieto {
    @FXML
    private Button btnCorrectivo;
    @FXML
    private Button btnPreventivo;
    @FXML
    private TextField txtN;
    @FXML
    private TextField txtDesde;
    @FXML
    private TextField txtHasta;
    @FXML
    private TextField txt;
    @FXML
    private TextField txtCostoRevision;
    @FXML
    private TextField txtCostoArreglo;
    @FXML
    private TableView tblMantenimiento;
    @FXML
    private TableView tblVector;


    public void simularMantenimientoCorrectivo(){
        GestorMantenimiento gestorMantenimiento = new GestorMantenimientoCorrectivo(10000,0,200,2500,900,this);

    }


    public void limpiarTabla(){
        tblMantenimiento.getColumns().clear();
        tblMantenimiento.getItems().clear();

    }

    public void limpiarTablaVector(){
        tblVector.getColumns().clear();
        tblVector.getItems().clear();

    }
    public void graficar(ArrayList<Linea> lineas){
        this.limpiarTabla();
        TableColumn<Linea,Integer> colI = new TableColumn<>("i");
        TableColumn<Linea,Integer> colDia = new TableColumn<>("dia");
        TableColumn<Linea,Integer> colRND = new TableColumn<>("RNDDiaRotura");
        TableColumn<Linea,Integer> colDiaRotura = new TableColumn<>("diaRotura");
        TableColumn<Linea,Integer> colCosto = new TableColumn<>("costoDia");
        TableColumn<Linea,Integer> colCostoAcumulado = new TableColumn<>("costoAcumulado");


        colI.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("i"));
        colDia.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("dia"));
        colRND.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("RNDDiaRotura"));
        colDiaRotura.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("diaRotura"));
        colCosto.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("costoDia"));
        colCostoAcumulado.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("costoAcumulado"));

        tblMantenimiento.getColumns().addAll(colI,colDia,colRND,colDiaRotura,colCosto,colCostoAcumulado);

        tblMantenimiento.getItems().addAll(lineas);
    }


    public void graficarVector(ArrayList<Linea> ultimasLineas)
    {
        this.limpiarTablaVector();
        TableColumn<Linea,Integer> colI = new TableColumn<>("i");
        TableColumn<Linea,Integer> colDia = new TableColumn<>("dia");
        TableColumn<Linea,Integer> colRND = new TableColumn<>("RNDDiaRotura");
        TableColumn<Linea,Integer> colDiaRotura = new TableColumn<>("diaRotura");
        TableColumn<Linea,Integer> colCosto = new TableColumn<>("costoDia");
        TableColumn<Linea,Integer> colCostoAcumulado = new TableColumn<>("costoAcumulado");


        colI.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("i"));
        colDia.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("dia"));
        colRND.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("RNDDiaRotura"));
        colDiaRotura.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("diaRotura"));
        colCosto.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("costoDia"));
        colCostoAcumulado.setCellValueFactory(new PropertyValueFactory<Linea,Integer>("costoAcumulado"));

        tblVector.getColumns().addAll(colI,colDia,colRND,colDiaRotura,colCosto,colCostoAcumulado);

        tblVector.getItems().addAll(ultimasLineas);
    }
}

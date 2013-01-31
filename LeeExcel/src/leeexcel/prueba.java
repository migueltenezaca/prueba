/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package leeexcel;

/**
 *
 * @author MIGUEL TENEZACA
 */

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class prueba {


    public static void main(String[] args) throws IOException, BiffException {

        //Ubicación del archivo XLS
        String archivo1="C:/Users/MIGUEL TENEZACA/Documents/NetBeansProjects/archivo1.xls";
        //String archivo2="C:/Users/MIGUEL TENEZACA/Documents/NetBeansProjects/archivo2.xls";

        //Creamos un Workbook para cargar el XLS en memoria
        Workbook workbook = Workbook.getWorkbook(new File(archivo1));
        //Workbook workbook2 = Workbook.getWorkbook(new File(archivo2));
        Sheet sheet = workbook.getSheet(0);
        //inicializo el objeto que leerá el valor de la celda
        Cell celdaCurso = null;
        //Este String guardará el valor de la celda
        String valorCeldaCurso=null;

        //Obtengo el número de filas ocupadas en la hoja
        int rows=sheet.getRows();
        //Obtengo el número de columnas ocupadas en la hoja
        int cols=sheet.getColumns();

        //Para efectos de ejemplo recorremos las columnas de cada fila
        Vector todo=new Vector();
        for(int x=0;x<rows;x++){
            Vector fila=new Vector();
            for(int y=0; y<cols; y++){
                //Obtenemos el valor de la celda de la columna Y y fila X
                celdaCurso= sheet.getCell(y,x);
                //Obtenemos el valor de la celda
                 valorCeldaCurso= celdaCurso.getContents();
                 fila.addElement(valorCeldaCurso); 
                 //System.out.print(valorCeldaCurso+"|");
                 
            }
            todo.addElement(fila); 
            System.out.println("");
        }

        
       
        for(int x=0;x<todo.size();x++){
            Vector fila = (Vector) todo.elementAt(x); 
            for(int y=0; y<fila.size(); y++){
                //Obtenemos el valor de la celda de la columna Y y fila X
              String s= (String) fila.elementAt(y);
                 System.out.println(s+"    cccccc");
                 
            }            
            System.out.println("");
        }
        
        
        
        workbook.close();
    }
}
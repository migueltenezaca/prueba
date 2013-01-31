/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LeeExcel;

/**
 *
 * @author Kvcto
 */

import java.io.File;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class aa {



public Document document = null;

//public void generarXML(String tag, String operacion)
//throws Exception {
//if(operacion.equalsIgnoreCase("Crear")) {
//document = (((DocumentBuilderFactory.newInstance()).newDocumentBuilder()).getDOMImplementation()).createDocument(null, tag, null);
//this.transformerFactory(document);
//} else {
//
//}
//}

public void llenarXml(String tag, Vector datos)
throws Exception {
   document = (((DocumentBuilderFactory.newInstance()).newDocumentBuilder()).getDOMImplementation()).createDocument(null, tag, null);
   this.transformerFactory(document);

   Vector datos1=new Vector();
   for(int i=0;i<datos1.size();i++){
   datos1.elementAt(i);
   }
   
    
Element subRaizxmlPrin = document.createElement("PROYECTO_IIICC_0000_01");  // COD DEL PROYECTO... RAIZ PINCIPAL

document.getDocumentElement().appendChild(subRaizxmlPrin); //se le agrega a la raiz una subraiz.

    Element subRaizFaseInicio = document.createElement("Fase_Inicio"); // fases
        Attr id = document.createAttribute("id");
        subRaizFaseInicio.setAttributeNode(id);
        id.appendChild(document.createTextNode("Inicio_1"));

        subRaizxmlPrin.appendChild(subRaizFaseInicio); // Agregando campos.

        Element subRaizInteresados = document.createElement("Interesados_Proyecto"); // fases
            Attr idi = document.createAttribute("id");
            idi.appendChild(document.createTextNode("1"));
            subRaizInteresados.setAttributeNode(idi);
            subRaizInteresados.appendChild(document.createTextNode("Interesados Inicio"));

            Element subRaizDatosGenrales = document.createElement("Datos_Generales");
            subRaizInteresados.appendChild(subRaizDatosGenrales);
            subRaizDatosGenrales.appendChild(document.createTextNode("Datos Generales"));

            Element interesado = document.createElement("interesado");
            subRaizDatosGenrales.appendChild(interesado);
            interesado.appendChild(document.createTextNode("Nombre Interesado Inicio"));

            Attr telefono = document.createAttribute("telefono");
            telefono.appendChild(document.createTextNode(""));
            interesado.setAttributeNode(telefono);
            
            Attr email = document.createAttribute("email");
            email.appendChild(document.createTextNode(""));
            interesado.setAttributeNode(email);
            
            Attr ci = document.createAttribute("ci");
            ci.appendChild(document.createTextNode(""));
            interesado.setAttributeNode(ci);

            Attr idnombre = document.createAttribute("nombre");
            idnombre.appendChild(document.createTextNode(""));
            interesado.setAttributeNode(idnombre);

            // ........................................................
            Element posicion = document.createElement("posicion");
            subRaizDatosGenrales.appendChild(posicion);
            posicion.appendChild(document.createTextNode("posicion"));

             Element rol = document.createElement("rol");
            subRaizDatosGenrales.appendChild(rol);
            rol.appendChild(document.createTextNode("rol"));

             Element cargo = document.createElement("cargo");
            subRaizDatosGenrales.appendChild(cargo);
            cargo.appendChild(document.createTextNode("cargo"));

              Element influencia = document.createElement("influencia");
            subRaizDatosGenrales.appendChild(influencia);
            influencia.appendChild(document.createTextNode("influencia"));

                Element necesidad = document.createElement("necesidad");
            subRaizDatosGenrales.appendChild(necesidad);
            necesidad.appendChild(document.createTextNode("necesidad"));


            Element Citte = document.createElement("Citte1");
            subRaizInteresados.appendChild(Citte);
            Citte.appendChild(document.createTextNode("Citte1"));

            Element Entidad1 = document.createElement("Entidad1");
            subRaizInteresados.appendChild(Entidad1);
            Entidad1.appendChild(document.createTextNode("Entidad1"));

            Element Interna1 = document.createElement("Interna1");
            subRaizInteresados.appendChild(Interna1);
            Interna1.appendChild(document.createTextNode("Interna1"));

             Element Externa1 = document.createElement("Externa1");
            subRaizInteresados.appendChild(Externa1);
            Externa1.appendChild(document.createTextNode("Externa1"));

            Element Presupuesto1 = document.createElement("Presupuesto1");
            subRaizInteresados.appendChild(Presupuesto1);
            Presupuesto1.appendChild(document.createTextNode("Presupuesto1"));

            subRaizFaseInicio.appendChild(subRaizInteresados);
//........................  FASE DE PLANIFICACION ............... //

Element subRaizFasePlanificacion = document.createElement("fase_planificacion");  // fases
     Attr idp = document.createAttribute("id");
        subRaizFasePlanificacion.setAttributeNode(idp);
        idp.appendChild(document.createTextNode("planificacion_1"));

        subRaizxmlPrin.appendChild(subRaizFasePlanificacion); // Agregando campos.

        Element subRaizInteresadosp = document.createElement("Interesados_Proyecto"); // fases
            Attr idip = document.createAttribute("id");
            idip.appendChild(document.createTextNode("1"));
            subRaizInteresadosp.setAttributeNode(idip);
            subRaizInteresadosp.appendChild(document.createTextNode("Interesados PLanificacion 1"));

            Element subRaizDatosGenralesp = document.createElement("Datos_Generales");
            subRaizInteresadosp.appendChild(subRaizDatosGenralesp);
            subRaizDatosGenralesp.appendChild(document.createTextNode("Datos Generales"));

            Element interesadop = document.createElement("interesado");
            subRaizDatosGenralesp.appendChild(interesadop);
            interesadop.appendChild(document.createTextNode("Nombre Interesado PLanificado"));

            Attr telefonop = document.createAttribute("telefono");
            telefonop.appendChild(document.createTextNode(""));
            interesadop.setAttributeNode(telefonop);

            Attr emailp = document.createAttribute("email");
            emailp.appendChild(document.createTextNode(""));
            interesadop.setAttributeNode(emailp);

            Attr cip = document.createAttribute("ci");
            cip.appendChild(document.createTextNode(""));
            interesadop.setAttributeNode(cip);

            Attr idnombrep = document.createAttribute("nombre");
            idnombrep.appendChild(document.createTextNode(""));
            interesadop.setAttributeNode(idnombrep);

            // ........................................................
            Element posicionp = document.createElement("posicion");
            subRaizDatosGenralesp.appendChild(posicionp);
            posicionp.appendChild(document.createTextNode("posicion"));

             Element rolp = document.createElement("rol");
            subRaizDatosGenralesp.appendChild(rolp);
            rolp.appendChild(document.createTextNode("rol"));

             Element cargop = document.createElement("cargo");
            subRaizDatosGenralesp.appendChild(cargop);
            cargop.appendChild(document.createTextNode("cargo"));

              Element influenciap = document.createElement("influencia");
            subRaizDatosGenralesp.appendChild(influenciap);
            influenciap.appendChild(document.createTextNode("influencia"));

                Element necesidadp = document.createElement("necesidad");
            subRaizDatosGenralesp.appendChild(necesidadp);
            necesidadp.appendChild(document.createTextNode("necesidad"));

            /////...////

              Element entregable = document.createElement("entregable");
            subRaizInteresadosp.appendChild(entregable);

            Element entregableIII = document.createElement("entregable_IIICC_0000_01");
            entregable.appendChild(entregableIII);

            entregableIII.appendChild(document.createTextNode("Entregable1 Entregable2 Entregable3 EntregableN"));
          

            Element resultado = document.createElement("resultado");
            subRaizInteresadosp.appendChild(resultado);
            resultado.appendChild(document.createTextNode("resultado"));

              Element actividades = document.createElement("actividades");
            subRaizInteresadosp.appendChild(actividades);

            Element actividadesIII = document.createElement("actividades_IIICC_0000_01");
            actividades.appendChild(actividadesIII);

            actividadesIII.appendChild(document.createTextNode("Actividad1 Actividad2 Actividad3"));

              subRaizFasePlanificacion.appendChild(subRaizInteresadosp);

//........................  FASE DE EJECUCION............... //
    Element subRaizFaseEjecucion = document.createElement("fase_ejecucion");  // fases
Attr ide = document.createAttribute("id");
        subRaizFaseEjecucion.setAttributeNode(ide);
        ide.appendChild(document.createTextNode("planificacion_1"));

        subRaizxmlPrin.appendChild(subRaizFaseEjecucion); // Agregando campos.


        Element subRaizInteresadose = document.createElement("Interesados_Proyecto"); // fases
            Attr idie = document.createAttribute("id");
            idie.appendChild(document.createTextNode("3"));
            subRaizInteresadose.setAttributeNode(idie);


              Element metrica = document.createElement("metrica");
            subRaizInteresadose.appendChild(metrica);
            metrica.appendChild(document.createTextNode("metrica"));

              Element indicador = document.createElement("indicador");
            subRaizInteresadose.appendChild(indicador);
            indicador.appendChild(document.createTextNode("indicador"));

            subRaizFaseEjecucion.appendChild(subRaizInteresadose);

    
transformerFactory(document);
}


private void transformerFactory(Document doc)
throws TransformerConfigurationException, TransformerException {

Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.transform(new DOMSource(doc), new StreamResult(new java.io.File(doc.getDocumentElement().getNodeName()+".xml")));
}


 public static void main(String[] args) throws Exception{
  aa c=new aa();

  Vector datos=new Vector();

  datos.addElement("");


  c.llenarXml("PROYECTO_ICC2",datos);
 }
}


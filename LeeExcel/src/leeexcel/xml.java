//    /*
//     * To change this template, choose Tools | Templates
//     * and open the template in the editor.
//     */
//
//    package leeexcel;
//
//    import java.io.File;
//
//    import xml.analizador.dom.JespXML;
//    import xml.analizador.dom.modelo.Tag;
//
//    /**
//     *
//     * @author MIGUEL TENEZACA
//     */
//    public class xml {
//        public static void main(String[] args) {
//            Tag raiz = new Tag("Proyectos_ICC");
//            Tag hijo = new Tag ("PROYECTO_ICC_001");
//            Tag hijo2= new Tag ("Interesados");
//
//            hijo.addContenido("proyecto 1");
//            hijo2.addContenido("miguel");
//
//            hijo.addAtributo("Hijo", "2");
//
//            raiz.addTagHijo(hijo);
//            raiz.addTagHijo(hijo2);
//
//
//            //JespXML..escribirXml(raiz, new File("config.xml"));
//
//        }
//
//    }

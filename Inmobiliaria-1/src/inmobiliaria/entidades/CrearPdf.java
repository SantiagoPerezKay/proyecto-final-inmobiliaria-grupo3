/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package inmobiliaria.entidades;
//
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//import java.io.FileOutputStream;
//import javax.swing.JTable;
//
///**
// *
// * @author santy
// */
//public class CrearPdf {
//
//    public void crearPdfconTablaProp(JTable jtabla) {
//
//        Document documento = new Document(); //creamos un objeto de tipo Document
//
//        try {
////            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
////            System.out.println("rutaRaiz:"+rutaRaiz);
//            String rutaFinal = "propietarios.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo
//
//            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
//            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)
//
//            documento.open();//abro el archivo creado
//
//            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo
//
//            Font fuente = new Font();
//            fuente.setColor(BaseColor.BLACK);
//            fuente.setSize(40);
//            titulo.setFont(fuente);
//
//            titulo.add("PROPIETARIOS\n\n\n\n");//le agrego un contenido
//            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
//            documento.add(titulo);//lo agrego al documento
//
//            PdfPTable tabla = new PdfPTable(7);//creo la tabla e indico de cuanto va a ser sus columnas
//
//            tabla.addCell("IdPropietario");
//            tabla.addCell("Nombre");
//            tabla.addCell("Apellido");
//            tabla.addCell("Telefono");
//            tabla.addCell("DNI");
//            tabla.addCell("Domicilio");
//            tabla.addCell("Estado");
//
//            for (int i = 0; i < jtabla.getRowCount(); i++) {
//                //agrego registros a la tabla
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 0)));//agrego celdas
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 1)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 2)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 3)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 4)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 5)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 6)));
//
//            }
//            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
//        } catch (Exception e) {
//            System.out.println("ocurrio un error" + e.getMessage());
//        } finally {
//            documento.close(); //cierro docu mento
//        }
//    }
//
//    public void crearPdfconTablaInm(JTable jtabla) {
//
//        Document documento = new Document(); //creamos un objeto de tipo Document
//
//        try {
////            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
////            System.out.println("rutaRaiz:"+rutaRaiz);
//            String rutaFinal = "propietarios.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo
//
//            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
//            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)
//
//            documento.open();//abro el archivo creado
//
//            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo
//
//            Font fuente = new Font();
//            fuente.setColor(BaseColor.BLACK);
//            fuente.setSize(40);
//            titulo.setFont(fuente);
//
//            titulo.add("PROPIETARIOS\n\n\n\n");//le agrego un contenido
//            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
//            documento.add(titulo);//lo agrego al documento
//
//            PdfPTable tabla = new PdfPTable(7);//creo la tabla e indico de cuanto va a ser sus columnas
//
//            tabla.addCell("Idinmueble");
//            tabla.addCell("Direccion");
//            tabla.addCell("Altura");
//            tabla.addCell("Tipo");
//            tabla.addCell("Superficie");
//            tabla.addCell("Precio");
//            tabla.addCell("Disponibilidad");
//            tabla.addCell("IdPropietario");
//            tabla.addCell("Estado");
//
//            for (int i = 0; i < jtabla.getRowCount(); i++) {
//                //agrego registros a la tabla
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 0)));//agrego celdas
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 1)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 2)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 3)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 4)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 5)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 6)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 7)));
//                tabla.addCell(String.valueOf(jtabla.getValueAt(i, 8)));
//
//            }
//            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
//        } catch (Exception e) {
//            System.out.println("ocurrio un error" + e.getMessage());
//        } finally {
//            documento.close(); //cierro docu mento
//        }
//    }
//}

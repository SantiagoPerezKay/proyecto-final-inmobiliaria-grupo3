/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria.entidades;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JTable;
import static javax.swing.text.StyleConstants.Bold;

/**
 *
 * @author santy
 */
public class CrearPdf {

    public void crearPdfconTablaProp(JTable jtabla) {

        Document documento = new Document(); //creamos un objeto de tipo Document

        try {
//            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
//            System.out.println("rutaRaiz:"+rutaRaiz);
            String rutaFinal = "propietarios.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo

            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)

            documento.open();//abro el archivo creado

            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo

            Font fuente = new Font();
            fuente.setColor(BaseColor.BLACK);
            fuente.setSize(40);
            fuente.setStyle(Font.BOLD);

            Font ftitulotabla = new Font();
            ftitulotabla.setColor(BaseColor.BLACK);
            ftitulotabla.setSize(12);
            ftitulotabla.setStyle(Font.BOLD);

            Font ftabla = new Font();
            ftabla.setColor(BaseColor.BLACK);
            ftabla.setSize(8);

            titulo.add("PROPIETARIOS\n\n\n\n");//le agrego un contenido
            titulo.setFont(fuente);
            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
            documento.add(titulo);//lo agrego al documento

            PdfPTable tabla = new PdfPTable(7);//creo la tabla e indico de cuanto va a ser sus columnas
            tabla.setWidthPercentage(100);
            tabla.setWidths(new int[]{1, 2, 2, 2, 2, 2, 2});
            //agregar cabecera
            tabla.addCell(new Phrase(("Id"), ftitulotabla));
            tabla.addCell(new Phrase(("Nom"), ftitulotabla));
            tabla.addCell(new Phrase(("Ape"), ftitulotabla));
            tabla.addCell(new Phrase(("Telefono"), ftitulotabla));
            tabla.addCell(new Phrase(("DNI"), ftitulotabla));
            tabla.addCell(new Phrase(("Domicilio"), ftitulotabla));
            tabla.addCell(new Phrase(("Estado"), ftitulotabla));

            for (int i = 0; i < jtabla.getRowCount(); i++) {
                //agrego registros a la tabla

                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 0)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 1)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 2)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 3)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 4)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 5)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 6)), ftabla));

            }
            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e.getMessage());
        } finally {
            documento.close(); //cierro docu mento
        }
    }

    public void crearPdfconTablaInm(JTable jtabla) {

        Document documento = new Document(); //creamos un objeto de tipo Document

        try {
//            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
//            System.out.println("rutaRaiz:"+rutaRaiz);
            String rutaFinal = "inmuebles.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo

            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)

            documento.open();//abro el archivo creado

            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo

            //estableciendo estilo de fuentes
            Font fuente = new Font();
            fuente.setColor(BaseColor.BLACK);
            fuente.setSize(40);
            fuente.setStyle(Font.BOLD);

            Font ftitulotabla = new Font();
            ftitulotabla.setColor(BaseColor.BLACK);
            ftitulotabla.setSize(12);
            ftitulotabla.setStyle(Font.BOLD);

            Font ftabla = new Font();
            ftabla.setColor(BaseColor.BLACK);
            ftabla.setSize(8);

            titulo.add("Inmuebles\n\n\n\n");//le agrego un contenido
            titulo.setFont(fuente);
            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
            documento.add(titulo);//lo agrego al documento

            PdfPTable tabla = new PdfPTable(8);
            tabla.setWidthPercentage(100);
            tabla.setWidths(new int[]{1, 2, 2, 2, 2, 2, 2, 2});
            //agregar cabecera
            tabla.addCell(new Phrase(("Id"), ftitulotabla));
            tabla.addCell(new Phrase(("Dir"), ftitulotabla));
            tabla.addCell(new Phrase(("Altura"), ftitulotabla));
            tabla.addCell(new Phrase(("Tipo"), ftitulotabla));
            tabla.addCell(new Phrase(("Sup"), ftitulotabla));
            tabla.addCell(new Phrase(("Precio"), ftitulotabla));
            tabla.addCell(new Phrase(("Disponibilidad"), ftitulotabla));
            tabla.addCell(new Phrase(("NombreProp"), ftitulotabla));

            for (int i = 0; i < jtabla.getRowCount(); i++) {
                //agrego registros a la tabla

                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 0)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 1)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 2)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 3)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 4)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 5)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 6)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 7)), ftabla));

            }
            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e.getMessage());
        } finally {
            documento.close(); //cierro docu mento
        }
    }

    public void crearPdfconTablaInq(JTable jtabla) {

        Document documento = new Document(); //creamos un objeto de tipo Document

        try {
//            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
//            System.out.println("rutaRaiz:"+rutaRaiz);
            String rutaFinal = "inquilinos.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo

            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)

            documento.open();//abro el archivo creado

            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo

            //estableciendo estilo de fuentes
            Font fuente = new Font();
            fuente.setColor(BaseColor.BLACK);
            fuente.setSize(40);
            fuente.setStyle(Font.BOLD);

            Font ftitulotabla = new Font();
            ftitulotabla.setColor(BaseColor.BLACK);
            ftitulotabla.setSize(12);
            ftitulotabla.setStyle(Font.BOLD);

            Font ftabla = new Font();
            ftabla.setColor(BaseColor.BLACK);
            ftabla.setSize(8);

            titulo.add("inquilino\n\n\n\n");//le agrego un contenido
            titulo.setFont(fuente);
            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
            documento.add(titulo);//lo agrego al documento

            PdfPTable tabla = new PdfPTable(8);//creo la tabla e indico de cuanto va a ser sus columnas
            tabla.setWidthPercentage(100);
            tabla.setWidths(new int[]{1, 2, 2, 2, 2, 2, 2, 2});
            //agregar cabecera
            tabla.addCell(new Phrase(("Id"), ftitulotabla));
            tabla.addCell(new Phrase(("cuit"), ftitulotabla));
            tabla.addCell(new Phrase(("Nomb"), ftitulotabla));
            tabla.addCell(new Phrase(("Ape"), ftitulotabla));
            tabla.addCell(new Phrase(("LTrab"), ftitulotabla));
            tabla.addCell(new Phrase(("NomGar"), ftitulotabla));
            tabla.addCell(new Phrase(("DNIGar"), ftitulotabla));
            tabla.addCell(new Phrase(("estdo"), ftitulotabla));

            for (int i = 0; i < jtabla.getRowCount(); i++) {
                //agrego registros a la tabla

                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 0)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 1)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 2)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 3)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 4)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 5)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 6)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 7)), ftabla));
            }
            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e.getMessage());
        } finally {
            documento.close(); //cierro docu mento
        }
    }

    public void crearPdfconTablaCont(JTable jtabla) {

        Document documento = new Document(); //creamos un objeto de tipo Document

        try {
//            String rutaRaiz = System.getProperty("user.home");//obtengo mi ruta local, ejemplo en mi caso "C:\ users \ santy"
//            System.out.println("rutaRaiz:"+rutaRaiz);
            String rutaFinal = "contratos.pdf"; //mi ruta donde voy a crear los pdf y nombre del archivo

            PdfWriter.getInstance(documento, new FileOutputStream(rutaFinal));//metodo static de pdfWriter que va a escribir sobre el documento,
            //recibe un tipo Document y un FileOuputStream (esto es de la api de java para salida de archivo)

            documento.open();//abro el archivo creado

            Paragraph titulo = new Paragraph(); //creo objeto tipo parrafo

            //estableciendo estilo de fuentes
            Font fuente = new Font();
            fuente.setColor(BaseColor.BLACK);
            fuente.setSize(40);
            fuente.setStyle(Font.BOLD);

            Font ftitulotabla = new Font();
            ftitulotabla.setColor(BaseColor.BLACK);
            ftitulotabla.setSize(12);
            ftitulotabla.setStyle(Font.BOLD);

            Font ftabla = new Font();
            ftabla.setColor(BaseColor.BLACK);
            ftabla.setSize(8);

            titulo.setFont(fuente);
            titulo.add("Contrato\n\n\n\n");//le agrego un contenido
            titulo.setAlignment(Paragraph.ALIGN_CENTER);//lo centro
            documento.add(titulo);//lo agrego al documento

            PdfPTable tabla = new PdfPTable(7);//creo la tabla e indico de cuanto va a ser sus columnas
            tabla.setWidthPercentage(100);
            tabla.setWidths(new int[]{1, 2, 2,2, 2, 2, 2});
            //agregar cabecera
            tabla.addCell(new Phrase(("Id"), ftitulotabla));
            tabla.addCell(new Phrase(("FechaI"), ftitulotabla));
            tabla.addCell(new Phrase(("FechaF"), ftitulotabla));

            tabla.addCell(new Phrase(("Monto"), ftitulotabla));
            tabla.addCell(new Phrase(("Id Inmueble"), ftitulotabla));
            tabla.addCell(new Phrase(("Apellido Inquilino"), ftitulotabla));
            tabla.addCell(new Phrase(("Estado"), ftitulotabla));
            //agregar registros
            for (int i = 0; i < jtabla.getRowCount(); i++) {

                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 0)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 1)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 2)), ftabla));

                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 4)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 5)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 6)), ftabla));
                tabla.addCell(new Phrase(String.valueOf(jtabla.getValueAt(i, 3)), ftabla));
            }
            documento.add(tabla);//agrego el objeto "tabla" a el documento pdf.
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e.getMessage());
        } finally {
            documento.close(); //cierro docu mento
        }
    }
}

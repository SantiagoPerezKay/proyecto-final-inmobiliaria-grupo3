package inmobiliaria;

import acceso_a_datos.Conexion;
import acceso_a_datos.ContratoData;
import acceso_a_datos.InmuebleData;
import acceso_a_datos.InquilinoData;
import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Contrato;
import inmobiliaria.entidades.Inmueble;
import inmobiliaria.entidades.Inquilino;


import inmobiliaria.entidades.Propietario;
import java.sql.Date;


public class Inmobiliaria {

    public static void main(String[] args) {
        //*************ABM  PROPIETARIO***********
        //Propietario prop = new Propietario("pepito", "muñoz", "av Maria", "222", "22222");
       // PropietarioData propData = new PropietarioData();
       
       // propData.insertarPropietario(prop);
        //propData.borrarPropietario(3);
        //propData.actualizarPropietario(new Propietario(5,"josesito","muñoz","av Nuestra","222","33333"));
        // System.out.println(propData.obtenerPropietarioPorId(2));  //por id
        // System.out.println(propData.obtenerPropietarioPorDni("33333")); //por dni
        // System.out.println(propData.listarPropietarios());
        
       //******ABM INQUILINO ****** //
       
//       Inquilino inqui2 = new Inquilino("2767788", "Caimila", "Lopez", "PintureriaPro", "Marcos Remos", "444567543");
//       InquilinoData inquiData = new InquilinoData();
      // inquiData.insertarInquilino(inqui2);
//        inquiData.borrarInquilino(2);
      //  inquiData.actualizarInquilino(new Inquilino(3, "2767788", "Caimila", "Lopez", "PintureriaPre", "Marcos Remos", "444567543"));
      
       // System.out.println(inquiData.obtenerInquilinoPorId(1));
//        System.out.println(inquiData.obtenerInquilinoPorCuit("2767788"));
//        System.out.println(inquiData.listarInquilinos());

        //******ABM contrato ****** //
        
        ContratoData contData = new ContratoData();
        //PropietarioData propData = new PropietarioData();
        //InquilinoData inquiData = new InquilinoData();
        //InmuebleData inmData = new InmuebleData();
        
        Propietario prop = new Propietario(2,"pepito", "muñoz", "av Maria", "222", "22222");
        //propData.insertarPropietario(prop);
        //System.out.println( propData.listarPropietarios());
        
        Inquilino inqui2 = new Inquilino(3,"2767788", "Caimila", "Lopez", "PintureriaPro", "Marcos Remos", "444567543");
        //inquiData.insertarInquilino(inqui2);
        //System.out.println( inquiData.listarInquilinos());
        
        Inmueble imb = new Inmueble(2,"Carrasco", 255, "D", 52, 25000, true, prop);
        //inmData.agregarInmueble(imb);
        
        Contrato cont = new Contrato(new Date(2016,05,25), new Date(2018,05,25), 10000.500, true, inqui2, imb);
        
       System.out.println(contData.buscarInquilino(3));
        
    } 
    

}

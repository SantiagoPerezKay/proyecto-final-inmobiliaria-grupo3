package inmobiliaria;

import acceso_a_datos.Conexion;
import acceso_a_datos.PropietarioData;
import inmobiliaria.entidades.Propietario;

public class Inmobiliaria {

    public static void main(String[] args) {
        //*************ABM  PROPIETARIO***********
        Propietario prop = new Propietario("pepito", "muñoz", "av Maria", "222", "22222");
        PropietarioData propData = new PropietarioData();
        // propData.insertarPropietario(prop);
        //propData.borrarPropietario(3);
        //propData.actualizarPropietario(new Propietario(5,"josesito","muñoz","av Nuestra","222","33333"));
        // System.out.println(propData.obtenerPropietarioPorId(2));  //por id
        // System.out.println(propData.obtenerPropietarioPorDni("33333")); //por dni
        // System.out.println(propData.listarPropietarios());
        
    }

}

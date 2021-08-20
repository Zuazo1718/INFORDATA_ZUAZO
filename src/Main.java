import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //proveedores
        Provedores provedores = new Provedores(1276,"10 de septiembre","Av. Aroma","falla de encender","Robert","apaza","alcanzar","2467217");
        Provedores provedores1 = new Provedores(532837,"25 de octubre","Av America","Error en la red","juana","ramos","baltazar","428764");

        //Producto
        Producto producto = new Producto(12345,33221,"Samsung");
        Producto producto1 = new Producto(12341,231241,"Intel");

        //monitores
        Monitores monitores = new Monitores(88888,"Samsung",1024);
        Monitores monitores1 = new Monitores(675556,"Pavilion",1920);

        //Impresoras
        Impresoras impresoras = new Impresoras("FH21874","Canon",300);
        Impresoras impresoras1 = new Impresoras("gh23123","Canon",250);

        //CPU
        CPU cpu = new CPU(1234,"Venom",1024,"Taiwan","10 de octubre de 2019");
        CPU  cpu1= new CPU(24124,"HP",2084,"China","25 de abril de 2020");

        //DiscoDuro
        DiscoDuro discoDuro = new DiscoDuro(100920,1024,"203919fg");
        DiscoDuro discoDuro1 = new DiscoDuro(21314,1024,"qh214124");

        //Cliente
        Cliente ArielQuisbert = new Cliente(2312412,"Av. Cias",7126486,"10 de abril","ff21432","Ariel","Quisbert","Apaza","sa2134");
        Cliente JuanPerez = new Cliente(141231,"Av. porstes",2412423,"25 de enero","hhjg12442","Juan","Peres","Hawz","hj1243");

        //AlquileresMonitores
        AlquilerDeMonitores alquilerDeMonitores1 = new AlquilerDeMonitores(983662,"10bs*5hrs");
        AlquilerDeMonitores alquilerDeMonitores = new AlquilerDeMonitores(2386612,"10bs*5hrs");

        //AlquileresDiscos
        AlquilerDiscos alquilerDiscos = new AlquilerDiscos(23123,10,"2084Gb");
        AlquilerDiscos alquilerDiscos1 = new AlquilerDiscos(2341235,10,"2084Gb");

        //EmpresaFabricante
        EmpresaFabricante nombre = new EmpresaFabricante("ryzen","Av. loanza",98);
        List<EmpresaFabricante> empresaFabricantes = new ArrayList<>();
        empresaFabricantes.add(nombre);

        System.out.println(empresaFabricantes);
        System.out.println(provedores);
        System.out.println(provedores1);
        System.out.println(producto);
        System.out.println(producto1);



        System.out.println("Compra:  " + producto1.getCodProducto() + "fecha de compra:  " + ArielQuisbert.getFechaCompra());
    }
}

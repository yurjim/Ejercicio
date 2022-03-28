package view
import controller.PersonaController
import model.Persona

class PersonaView {
    val p3 = Persona() //obj x' defecto
    val c1 = PersonaController()

    fun menu() {

        //INICIO Obj p3 x' defecto con sets
       /* p3.nombreP= "Beliz"
        p3.cedulaP = "1234"
        p3.edadP= 14
        p3.sexoP = "F"
        p3.pesoPer = 40
        p3.altura = 1.30

        println(c1.toString(p3))
        c1.comprobarSexo(p3)
        println("Peso ideal: (-1 = Bajo, 0= Ideal, 1= SobrePeso)")
        println(c1.calcularIMC(p3))
        println("Es mayor de edad: ")
        println(c1.esMayorDeEdad(p3))
        //FIN*/

        //INICIO Obj con todas las variables
        println("Ingrese la información de la persona: ")
        print("Nombre : ")
        var nombre= readLine()!!.toString()
        print("Cedula : ")
        var cedula= readLine()!!.toString()
        print("Edad : ")
        var edad= readLine()!!.toInt()
        print("Sexo : ")
        var sexo= readLine()!!.toString()
        print("Peso : ")
        var peso= readLine()!!.toInt()
        print("Altura : ")
        var altura= readLine()!!.toDouble()

        //Objeto
        val p1 = Persona(nombre, edad, cedula, sexo, peso, altura) //obj 3 variables

        println(c1.toString(p1))
        c1.comprobarSexo(p1)
        println("Peso ideal: (-1 = Bajo, 0= Ideal, 1= SobrePeso)")
        println(c1.calcularIMC(p1))
        println("Es mayor de edad: ")
        println(c1.esMayorDeEdad(p1))
        //FIN

      /*  //INICIO Obj con 3 variables
        println("Ingrese la información de la persona: ")
        print("Nombre : ")
        var nombre= readLine()!!.toString()
        print("Edad : ")
        var edad= readLine()!!.toInt()
        print("Sexo : ")
        var sexo= readLine()!!.toString()

        val p2 = Persona(nombre, edad, sexo) //obj 3 variables

        println(c1.toString1(p2))
        c1.comprobarSexo(p2)
        println("Peso ideal: (-1 = Bajo, 0= Ideal, 1= SobrePeso)")
        println(c1.calcularIMC(p2))
        println("Es mayor de edad: ")
        println(c1.esMayorDeEdad(p2))
        //FIN*/





    }

}
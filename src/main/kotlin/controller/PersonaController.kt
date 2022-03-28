package controller
import model.Persona
import kotlin.math.pow


//metodos
class PersonaController {

    fun calcularIMC(per3 : Persona): Int {

       var calculo= per3.pesoPer/per3.altura.pow(2) //potencia

        if(calculo < 18.5 ) {
            return -1
        }else if( calculo >= 18.5 && calculo <= 24.9) {
            return 0
        }else{
            return 1
        }

    }

    fun esMayorDeEdad(per2 : Persona): Boolean {
            if (per2.edadP < 18) {
            return false
        }else{
            return true
        }
    }


    fun comprobarSexo(sexoPer: Persona){
        if(sexoPer.sexoP != "H" || sexoPer.sexoP != "F") {
            sexoPer.sexoP = "H"
        }
    }

    // toString todos los datos
    fun toString( per2: Persona) = "Datos de la persona: \n" +
            "Nombre: ${per2.nombreP} - " + "Cédula: ${per2.cedulaP} \n"+
            "Edad: ${per2.edadP} - " + "Sexo: ${per2.sexoP} \n" +
            "Peso: ${per2.pesoPer} - " + " Altura: ${per2.altura}"

    // toString solo 3 datos
    fun toString1(per1 : Persona) = "Datos de la persona: \n" +
            "Nombre: ${per1.nombreP} - " + "Edad: ${per1.edadP} - " + "Sexo: ${per1.sexoP} \n"

}
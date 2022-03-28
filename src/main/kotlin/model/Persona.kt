package model

class Persona {
    var nombreP: String
    var edadP: Int
    var cedulaP: String
    var sexoP: String
    var pesoPer: Int
    var altura: Double


    //Const defecto
    constructor(){
        this.nombreP = ""
        this.edadP = 0
        this.cedulaP = ""
        this.sexoP = "H"
        this.pesoPer = 0
        this.altura = 0.0
    }

    //Const todas las variables
    constructor(nomP: String, edP: Int, cedP: String, sexoP: String,
                pesoP: Int, altP: Double){
        this.nombreP = nomP
        this.edadP = edP
        this.cedulaP = cedP
        this.sexoP = sexoP
        this.pesoPer = pesoP
        this.altura = altP
    }

    //Const 3 variables, demás por defecto
    constructor(nomP: String, edP: Int, sexoP: String):
            this(nomP, edP, "", sexoP, 10, 1.50) {
        this.nombreP = nomP
        this.edadP = edP
        this.sexoP = sexoP
    }

}
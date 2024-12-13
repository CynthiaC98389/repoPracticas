/* POO

Clases: Se refiere a nuestro molde o plantilla para que podamos crear objetos. Utiliza la palabra reservada class
Constructurtor: Es una funcion obligatoria para crear objetos (chefsito) a traves de caracteristicas/atributos especificas
Objetos: Es lo que construimos a traves de la clase y el constructor
Atributo: Se refieren a las caracteristicas o propiedades de mi objeto
Metodo: Lo que hace nuestro objeto (saludar, brincar, correr)
Instanciación: Se refiere a cuando ya creamos la clase, el constructor y el objeto.



Herencia: Cuenta la palabra reservada extends; una herencia permite reutilizar el código de la clase padre en la clase hijo
Polimorfismo: El comportamiento de cada objeto de la mismsa clase a un metodo
Encapsulamiento: Se refiere a encerrar y/o ocultar el código
Abstraccion: Se refiere a ser muy especificos en los objetos (resumir)
Modularidad: Nos permite reutilizar codigo, hacer modificaciones, tener orden, entender y mantener el código


Metodos Esttaticos: Utiliza la palabra reservada static, nos permiet ejecutar una clase sin instanciar al objeto
Metodos accesores: (Pendiente)

PRINCIPIOS SOLID
Principio de responsabilidad Unica (SRP): Se refiere a que cada que asignamos una clase,principio, objeto, etc debe ser unica
Principio de objeto abierto y cerrado (OCP): Se refiere a que debemos poder extender el codigo ya existente de ser necesario
Principio de sustitucion de Liskov: Se refiere a que podemos tener cualquier tipo de objeto dentro de mi clase y no se ve afectado el comportamiento del mismo
Principio de segregacion de interfaces (ISP): Se refiere a tener distintas interfaces
Principio de investigación de dependencias (DIP): Trabaja a traves d ela abstraccion para que el codigo no dependa de detalles especificos 


Objetos Json
Javascript Object Notation
Se manejan a través de clave-valor y no tienen metodos

*/

class  ch47 { //Clase principal o clase padre
    constructor(nombre, apellido, email, edad){ // nos permite crear el objeto
        this.name = nombre; //this nos permite seleccionar el objeto que voy a crear
        this.lastName =apellido; 
        this.email = email;
        this.age= edad;
        this.info = `Holi soy ${this.name} ${this.lastName}, mi correo es ${this.email} y mi edad es ${this.age}` 
    }
infoIntegrantes (){
    console.log (this.info);
}

}

class instruccion extends ch47 {
    constructor (nombre, apellido, email, edad, escolaridad){
        super (nombre, apellido, email, edad);
        this.escolaridad= escolaridad; 
    }

    static darSesiones (){
        console.log ("Hoy no tienes sesion");
    }
}


class mentoria extends ch47 {
   constructor (nombre, apellido, email, edad, telefono){

   super (nombre, apellido, email, edad);
   this.tel=telefono;
   }
   static darMentoria () {
    console.log ("tienes muchos mentees");

   } 
}
class participantes extends ch47 {
    constructor (nombre, apellido, email, edad, telefono,){
 
 
    super (nombre, apellido, email, edad)
    this.tel=telefono;
    }
    static participo () {
     console.log ("Debes participar");
 
    } 
 }

//CREAR INSTANCIAS DE LAS CLASES
const inte1 = new ch47 ("xaxiry", "Gonzalez","xaxiry@gmail.com", 27);// los objetos se deben definir con const. NO LET NO VAR
const inte2= new instruccion ("liliana", "aguirre", "lili@gmail.com", 30, "Licenciatura");
const inte3= new mentoria ("Daniel", "Perez", "danperez@gmail.com", 22, "55109292");



inte2.infoIntegrantes ();
inte3.infoIntegrantes ();
instruccion.darSesiones ();
mentoria.darMentoria ();
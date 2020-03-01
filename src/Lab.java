import java.util.Scanner;
import java.util.Arrays;
public class Lab {
	//INDICA CADA OPCION COMO UN NUMERO PARA LEERLO COMO MENU//
	
		private final static int SEESTRING = 1;
		private final static int LONGISTRING = 2;
		private final static int CONCATSTRING = 3;
		private final static int UBISTRING = 4;
		private final static int NUMBERS = 5;
		private final static int NUMBERSDIVIDE = 6;
		private final static int NUMBERSDIVANDRESIDU = 7;
		private final static int ARRAY = 8;
		private final static int ARRAYPRINT = 9;
		private final static int ARRAYPROM = 10;
		private final static int ARRAYBIG = 11;
		private final static int ARRAYOPERA = 12;
		private final static int ARRAYUNION = 13;
		private final static int ARRAYNOREPEAT = 14;
		private final static int ARRAYINTER = 15;
		private final static int ARRAYGIRAR = 16;
		private final static int ARRAYORDEN = 17;
		private final static int OUT = 18;
		//declarar variables//
		private static String string1;
		private static String string2;
		private static String string3;
		private static Double number1;
		private static Double number2;
		private static int[] arrayOfNumbers1;
		private static int[] arrayOfNumbers2;
		private static int[] arrayOfNumbers3;
		private static int[] arrayOfNumbersTotal;
		private static int[] arrayOfNumbersDiff;
		private static int[] arrayOfNumbersIntersec;
		private static Scanner sc;
		private static int ArraySet = 0;
		private static int StringSet = 0;
		private static int NumberSet = 0;

	//ME MUESTRA EN PANTALLA CADA OPCION DEL MENU//
	
/**
* show on screen the options menu <br>
* <b> pre: </b> <br>
* <b> publication: </b> The user has been informed of the options he has.
*/
	public static void menu(){
		System.out.println("=============MENU============= \nIngresa el numero de la opcion que deseas seleccionar \n1) Ingresar tres cadenas de caracteres \n2)Mostrar la longitud de tres cadenas ingrsadas");
		System.out.println("3)Concatenar tres cadenas de caracteres ingresados\n4)Seleccionar que posicion deseas ver de una cadena ingresada \n5)ingresar dos numeros reales \n6)Hacer la division de dos numeros enteros \n7)Dividir dos numeros y mostrar su residuo");
		System.out.println("8)ingresar tres arreglos de enteros \n9) mostrar tres arreglos de enteros 	\n10) mostrar el promedio de un arrreglo \n11)mostrar el mayor valor de un arreglo");
		System.out.println("12)operar los elemntos de un arreglo (suma-resta-multiplicacion) \n13)unir los tres arreglos con elementos repetidos \n14)unir tres arreglos sin elementos repetidos \n15)mostrar los elemntos que interceptan tres arreglos");
		System.out.println("16)girar los elementos de un arreglo \n17) ordenar de menor a mayor los elemntos de un arreglo \n18)SALIR DEL PROGRAMA");
		
	}

/**
* Initialize all variables <br>
* <b> pre: </b> variables must be created in class <br>
* <b> post: </b> variables are initialized, numbers in 0 and empty strings.
*
*/
	//inicializo cada variable los enteros como 0 las cadenas como vacias y demas//
	public static void initialize(){
      number1=0.0;
	  number2=0.0;
	  string1="";
	  string2="";
	  string3="";
	  sc = new Scanner(System.in);
	}	
/**
* read the three chains on console <br>
* <b> pre: </b> String variables must already be initialized <br>
* <b> post: </b> The three strings are taken and stored in the memory of the String variables.
*/
		//metodo de tomar las cadenas//
	public static void getstrings(){
		System.out.println("introduce la primera cadena");
		string1 = sc.next();
		sc.nextLine();	
		System.out.println("introduce la segunda cadena");
		string2 = sc.next();
		sc.nextLine();	
		System.out.println("introduce la tercera cadena");
		string3 = sc.next();
		sc.nextLine();
		StringSet = 1;
	}
/**
* Shows the length of each string of the chains <br>
* <b> pre: </b> String variables and must be initialized and full <br>
* <b> post: </b> The length of each of the digital channels is shown.
*/
	//metodo para leer la longitud de la cadena//
	public static void lengthStrings(){
		System.out.println("La longitud de la primera cadena es "+string1.length());
		System.out.println("La longitud de la Segunda cadena es "+string2.length());
		System.out.println("La longitud de la tercera cadena es "+string3.length());
	}
/**
* Shows the chain resulting from concatenating the three chains <br>
* <b> pre: </b> String variables must already be initialized and full <br>
* <b> post: </b> show the three concatenated strings.
*/
//metodo de mostrar las tres cadenas concatenadas //
	public static void concatStrings(){
    String cadena1=string1.concat(string2);
	cadena1=cadena1.concat(string3);
	System.out.println(cadena1);
		
	}
/**
* Shows the character that is in the position that the user typs <br>
* <b> pre: </b> String variables must already be initialized and full <br>
* <b> post: </b> show the character of the selected position.
*/
	//metodo para mostrar la posicion escogida por el usuario el caracter//
	public static void characterposition(){
		System.out.println("que posicion de caracter desea seleccionar");
		int p = sc.nextInt();
		sc.nextLine();
		if (string1.length()>=p){
			System.out.println("El caracterde la primera cadena en la posicion que seleccionaste es "+string1.charAt(p -1));
		}else{
			System.out.println("La posicion seleccionada no es valida para la longitud de la cadena");
		}
		if (string2.length()>=p){
			System.out.println("El caracterde la segunda cadena en la posicion que seleccionaste es "+string2.charAt(p -1));
		}else{
			System.out.println("La posicion seleccionada no es valida para la longitud de la cadena");
		}
		if (string3.length()>=p){
			System.out.println("El caracterde la tercera cadena en la posicion que seleccionaste es "+string3.charAt(p -1));
		}else{
			System.out.println("La posicion seleccionada no es valida para la longitud de la cadena");
		}
	}	
	//metodo para leer los dos numeros reales mayores que 0//
/**
* takes the values of the numbers by console <br>
* <b> pre: </b> the numeric variables are initialized. <br>
* <b> post: </b> The values are stored in memory.
*/
	public static void numbers(){
	System.out.println("Digita dos numeros mayores a 0");
	System.out.println("Digita el primervalor");
	number1=sc.nextDouble();
	
	System.out.println("Digita el segundo valor");
	number2=sc.nextDouble();
	if (number1>0&&number2>0){
		System.out.println("el primer numero digitado fue "+number1);
		System.out.println("el segundo numero digitado fue "+number2);
	}else {
	System.out.println("Los numeros escogidos no son mayores a 0");
	
	
	}	
	NumberSet=1;
	}
/**
* divide two numbers <br>
* <b> pre: </b> the numeric variables are initialized. <br>
* <b> post: </b> the result of the operation is displayed.
*/	
	//metodo para dividir los dos numeros//
	public static void dividenumbers(){
	double result = number1/number2;
	System.out.println("el resultado de la division entre los dos numeros fue "+result);
	}
/**
* shows the entire division and the module of the two numbers <br>
* <b> pre: </b> the numeric variables are initialized. <br>
* <b> post: </b> shows the result of the two operations.
*/		
	//metodo para mostrar division modulo entero//
	public static void modulnumbers(){
	int result = (int)Math.round (number1) / (int)Math.round( number2);
	System.out.println("el resultado de la division entera entre los dos numeros fue "+result);
    int mod = (int)Math.round (number1) % (int)Math.round( number2);
	System.out.println("el residuo de la division entre los dos numeros fue "+mod);
	
	}
/**
* generates the elements of an array <br>
* <b> pre: </b> arrangements must be initialized and the length of each arrangement indicated. <br>
* <b> post: </b> the data that will go inside the array is generated.
* @param size fix size to fill. size! = null.
* @return: Returns the arrangement with the elements entered
*/
	//metodo que me lee un arreglo de enteros//
	public static int[] setArray( int size){
		int[] intArray = new int[size];
		int element;
		for (int i = 0; i < size; i++){
        System.out.println("Digite el elemento del index " + i +" : ");
			element = sc.nextInt();
			intArray[i] = element;
		}
		
		return intArray;
	
				
	}
/**
* generates the amount of elements that will have the three arrangements <br>
* <b> pre: </b> arrays must be initialized. <br>
* <b> post: </b> the length of the three arrangements.
*/
	//metodo que retoma el primer arreglo para crear los otrosm dos//
	public static void fillArray(){
	int inter = 0;
	System.out.println("cuantos elementosva a tener el arreglo #1 ");	
    inter = sc.nextInt();
	arrayOfNumbers1= setArray(inter);
	System.out.println("cuantos elementosva a tener el arreglo #2 ");	
    inter = sc.nextInt();
	arrayOfNumbers2= setArray(inter);
	System.out.println("cuantos elementosva a tener el arreglo #3 ");	
    inter = sc.nextInt();
	arrayOfNumbers3= setArray(inter);
	ArraySet=1;
	}	
/**
* Shows the elements of the three arrangements <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the three arrangements with all the elements.
*/
	//metodo de mostrar los arreglos ya generados//
	public static void printArray(){
		System.out.println("Elementos del arreglo #1 ");	
		System.out.println(Arrays.toString(arrayOfNumbers1));
		System.out.println("Elementos del arreglo #2 ");	
		System.out.println(Arrays.toString(arrayOfNumbers2));
		System.out.println("Elementos del arreglo #3 ");	
		System.out.println(Arrays.toString(arrayOfNumbers3));
	}	
/**
* Calculate the average of the elements of an array <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the average of the elements of an array.
* @param intArray arrangement with data entered by user. [] intArray! = null.
* @return: Returns the average of the numbers found within the array received by parameter
*/	
	//metodo Promedio de arreglos//
	public static double calcProm (int[]intArray){
		double result = 0;
		int size = 0;
		for (int i = 0; i< intArray.length; i++){
		result+=intArray[i];
		size++;
		
		}
		return result/size;
	}	
     public static void printProm(){
		 System.out.println("de que arreglo deseas calcular el promedio");
		 int option=sc.nextInt();
		 sc.nextLine();
		 double prom = 0;
		 
		 switch (option){
			 case 1:
					prom = calcProm(arrayOfNumbers1);
				break;
			 case 2:
					prom = calcProm(arrayOfNumbers2);
				break;
			 case 3:
					prom = calcProm(arrayOfNumbers3);
				break;
		 }		
		System.out.println("El promedio del Arreglo # " + option + " es : " + prom);	
	 }	 
/**
* Calculate the largest of the elements of an array <br>
* <b> pre: </b> the array must be full of data. <br>
* <b> post: </b> the major element of an array.
* @param intArray arrangement with data entered by user. [] intArray! = null.
* @return: Returns the largest number in the array with the elements entered
*/
	 //metodo que me muestra el numero mayor de un arregloseleccionado //

	public static int bignumberarray(int[] intArray){
		int max=Integer.MIN_VALUE;
		int maxim;
		int result = 0;
		for (int i=0; i < intArray.length; i++){
			if (intArray[i]>max){
			max = intArray[i];
			}
		}
		maxim = max;
		return maxim;
	}	
/**
* show the largest of the elements of an array <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> publication: </b> the major element of a selected array.
*/
	// metodo de seleccionar a que arreglo se le ubicara el mayor//
	public static void printMaxNumberArray(){
		System.out.println("de que arreglo deseas calcular el mayor valor");
		 int option=sc.nextInt();
		 sc.nextLine();
		 int max = 0;
		 
		 switch (option){
			 case 1:
					max = bignumberarray(arrayOfNumbers1);
				break;
			 case 2:
					max = bignumberarray(arrayOfNumbers2);
				break;
			 case 3:
					max = bignumberarray(arrayOfNumbers3);
				break;
		 }		
		System.out.println("El mayor valor del Arreglo # " + option + " es : " + max);
	}
/**
* Calculate the sum of the elements of an array <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the sum of the elements of an array.
* @param intArray arrangement with data entered by user. [] intArray! = null.
* @return: Returns the sum of the elements within the array
*/	
	//metodo que suma los elementos de un arreglo //
	public static int aditionArray (int[]intArray){
		int result = 0;
		for (int i = 0; i< intArray.length; i++){
		result+=intArray[i];
		
		
		}
		return result;
	}
/**
* Calculate the subtraction of the elements of an array <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the subtraction of the elements of an array.
* @param intArray arrangement with data entered by user. [] intArray! = null.
* @return: Returns the subtraction of the elements within the array
*/		
	// metodo que resta los elementos de un arreglo//
	public static int sustractionArray (int[]intArray){
		int result = 0;
		for (int i = 0; i< intArray.length; i++){
		result-=intArray[i];
		
		
		}
		return result;
	}
/**
* Calculate the multiplication of the elements of an array <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the multiplication of the elements of an array.
* @param intArray arrangement with data entered by user. [] intArray! = null.
* @return: Returns the multiplication of the elements within the array
*/	
	//metodo que multiplica los elementos de un arreglo//
	public static int multiArray (int[]intArray){
		int result = 1;
		for (int i = 0; i< intArray.length; i++){
		result= result*intArray[i];
		}
		return result;
	}
/**
* show the result of the selected operation with the selected arrangement <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the result of the operation according to the selected arrangement.	
*/	
	// metodo que selecciona que operacion y que arreglo van a operar//
	public static void operationArray(){
		 int option=0;
		 int result = 0;
		 int operationvalue = 0;
		 
		while (option < 1 || option > 3){
			System.out.println("Que arreglo deseas operar : (1, 2, 3) :");
			option=sc.nextInt();
			sc.nextLine();
		}
		while (operationvalue < 1 || operationvalue > 3){
			System.out.println("Que operacion deseas hacer con los elementos de ese arreglo");
			System.out.println("digita el numero que corresponde con tu opcion");
			System.out.println("1)Suma \n2)Resta \n3)Multiplicacion");
			operationvalue = sc.nextInt();
			sc.nextLine();
		}

		 switch (option){
			case 1:
			switch (operationvalue){
				case 1:
				result = aditionArray(arrayOfNumbers1);
				break;
				case 2 :
				result = sustractionArray(arrayOfNumbers1);
				break;
			    case 3:
				result = multiArray(arrayOfNumbers1);
				break;
			}
			break;	
			case 2:
				switch (operationvalue){
					case 1:
					result = aditionArray(arrayOfNumbers2);
					break;
					case 2 :
					result = sustractionArray(arrayOfNumbers2);
					break;
					case 3:
					result = multiArray(arrayOfNumbers2);
					break;
				}
			break;
			case 3:
				switch (operationvalue){
					case 1:
					result = aditionArray(arrayOfNumbers3);
					break;
					case 2 :
					result = sustractionArray(arrayOfNumbers3);
					break;
					case 3:
					result = multiArray(arrayOfNumbers3);
					break;
				}
			break;
		 }	 
		 System.out.println("la respuesta a la operacion del arreglo "+option+ " es :" +result);
	}
/**
* Show the union elements of all arrangements <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> concatenated arrangement.
* @return: Returns the resulting array of ALL the elements present in lso 3 arrays of integers
*/	
	//metodo que me concatena los tres arreglos//
	public static int[] concatArray(){
		int a[]= new int[arrayOfNumbers1.length+arrayOfNumbers2.length+arrayOfNumbers3.length];
		int element = 0;
		
		for (int i = 0; i< arrayOfNumbers1.length; i++){
			a[element] = arrayOfNumbers1[i];
			element++;
		}
		
		for (int i = 0; i< arrayOfNumbers2.length; i++){
			a[element] = arrayOfNumbers2[i];
			element++;
		}
		
		for (int i = 0; i< arrayOfNumbers3.length; i++){
			a[element] = arrayOfNumbers3[i];
			element++;
		}
		
		return a;
		
	}	
/**
* select which elements of the arrangements are repeated <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> The element within the data was found or not the array.
* @param intArray - arrangement with data entered by user. [] intArray! = null.
* @param element - is the integer value to look for in the array
* @return: Returns the resulting array of ALL the elements present in the 3 arrays of integers
*/		
	// Busca un elemento en un erreglo y retorna 1 si existe y 0 si no existe
	public static int searchInArray(int[]intArray, int element){
		int result = 0;
		for (int i = 0; i< intArray.length; i++){
			if (element == intArray [i]) {
				result = 1;
			}
		}
		return result;
	}
/**
* select which elements of the arrangements are repeated and return them <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> Repeated elements were found in the three arrangements.
* @return: Returns the resulting array of the elements that are repeated in the 3 integer arrays
*/
	// Retorna  el arreglo de los elementos diferentes en los 3 arreglos
	public static int[] concatDiffArray(){
		int a[]= new int[arrayOfNumbers1.length+arrayOfNumbers2.length+arrayOfNumbers3.length];
		
		int element = 0;
		
		for (int i = 0; i< arrayOfNumbers1.length; i++){
			if ( searchInArray (a, arrayOfNumbers1[i] ) == 0){
				a[element] = arrayOfNumbers1[i];
				element++;
			}
		}
		
		for (int i = 0; i< arrayOfNumbers2.length; i++){
			if ( searchInArray (a, arrayOfNumbers2[i] ) == 0){
				a[element] = arrayOfNumbers2[i];
				element++;
			}
		}
		
		for (int i = 0; i< arrayOfNumbers3.length; i++){
			if ( searchInArray (a, arrayOfNumbers3[i] ) == 0){
				a[element] = arrayOfNumbers3[i];
				element++;
			}
		}
		
		int ret[] = new int [element];
		for (int i = 0; i< element; i++){
			ret[i] = a[i];
		}		
		
		return ret;
	}	
/**
* returns which elements are repeated in the three arrangements <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> the elements that intersect the three arrangements.
* @return: Returns the resulting arrangement of all the elements that are repeated in the three arrangements
*/
	// Retorna  el arreglo de los elementos iguales en los 3 arreglos
	public static int[] concatIntersecArray(){
		int a[]= new int[arrayOfNumbers1.length+arrayOfNumbers2.length+arrayOfNumbers3.length];
		int element = 0;
		
		for (int i = 0; i< arrayOfNumbers1.length; i++){
			if (( searchInArray (arrayOfNumbers2, arrayOfNumbers1[i] ) == 1) && ( searchInArray (arrayOfNumbers3, arrayOfNumbers1[i] ) == 1) ){

				if ( searchInArray (a, arrayOfNumbers1[i] ) == 0){
					a[element] = arrayOfNumbers1[i];
					element++;
				}
			}
		}
				
		int ret[] = new int [element];
		for (int i = 0; i< element; i++){
			ret[i] = a[i];
		}		
		
		return ret;
		
	}	
/**
* Returns an arrangement with its elements rotated n times <br>
* <b> pre: </b> the arrangements must be full of data. <br>
* <b> post: </b> Erreglo rotated n times.
* @param intArray - arrangement with data entered by user. [] intArray! = null.
* @param position - number of times the arrangement will be rotated
* @return: Returns the arrangement resulting from rotating the original arrangement n times
*/
	// Retorna  el arreglo movido N posiciones
	public static int[] moveArray( int[]intArray, int position ){
		int a[]= new int[intArray.length];
		int element = 0;
		
		position = position % intArray.length;
		
		if (position != 0){
			for (int i = position; i < intArray.length; i++){
				a[element] = intArray[i];				
				element ++;
			}

			for (int i = 0; i < position; i++){
				a[element] = intArray[i];				
				element ++;
			}
		}
		else
			a = intArray;

		System.out.println("Arreglo Original");
		System.out.println(Arrays.toString(intArray));
		System.out.println("Arreglo Resultante");
		System.out.println(Arrays.toString(a));

		return a;		
	}	
/**
* Select which arrangement will be rotated and how many times <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> array to be rotated and the number of times.
*/	
	// metodo de seleccionar a que arreglo se le girara n pociciones //
	public static void twistArray(){
		System.out.println("Que arreglo deseas girar las posiciones:");
		 int option=sc.nextInt();
		 sc.nextLine();
		System.out.println("Cantidad de  posiciones a girar:");
		 int cant =sc.nextInt();
		 sc.nextLine();
		 
		 switch (option){
			 case 1:
					arrayOfNumbers1 = moveArray(arrayOfNumbers1, cant);
				break;
			 case 2:
					arrayOfNumbers2 = moveArray(arrayOfNumbers2, cant);
				break;
			 case 3:
					arrayOfNumbers3 = moveArray(arrayOfNumbers3, cant);
				break;
		 }		
	}
/**
* Order the arrangement from least to greatest <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> array with its elements organized from least to greatest.<br>
* @param intArray - arrangement with data entered by user. [] intArray! = null.
* @return: Returns the resulting array ordered from least to greatest
*/
	// Retorna  el arreglo Ordenado
	public static int[] bubbleSort( int[]intArray ){
		int temp = 0;
		
		System.out.println("Arreglo Original");
		System.out.println(Arrays.toString(intArray));

		for (int i = 0; i < intArray.length -1 ; i++){
			for (int j = 0; j < intArray.length -1; j++){
				if (intArray[j] > intArray[j +1]){
					temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}

		System.out.println("Arreglo Ordenado");
		System.out.println(Arrays.toString(intArray));

		return intArray;
	}	
/**
* Select which arrangement will be ordered <br>
* <b> pre: </b> the arrays must be full of data. <br>
* <b> post: </b> What arrangement will be ordered.
*/
	// metodo de seleccionar que arreglo se ordenara //
	public static void sortArray(){
		System.out.println("Que arreglo deseas ordenar:");
		 int option=sc.nextInt();
		 sc.nextLine();
		 
		 switch (option){
			 case 1:
					arrayOfNumbers1 = bubbleSort(arrayOfNumbers1);
				break;
			 case 2:
					arrayOfNumbers2 = bubbleSort(arrayOfNumbers2);
				break;
			 case 3:
					arrayOfNumbers3 = bubbleSort(arrayOfNumbers3);
				break;
		 }		
	}

	//metodo principal//
	public static void main(String[]args){
	initialize();	
	int x= 0;
	while(x !=18){
		menu();
		x = sc.nextInt();

		switch (x){
			case SEESTRING:
				getstrings();
				break;
			case LONGISTRING:
				if (StringSet == 1)
					lengthStrings();
				else
					System.out.println("Debes ir primero a la opcion de Llenar las cadenas");
					
				break;
			case CONCATSTRING:
				if (StringSet == 1)
					concatStrings();
				else
					System.out.println("Debes ir primero a la opcion de Llenar las cadenas");
				break;
			case UBISTRING:
				if (StringSet == 1)
				characterposition();
				else
					System.out.println("Debes ir primero a la opcion de Llenar las cadenas");
				break;
			case NUMBERS:
				numbers();
				break;
			case NUMBERSDIVIDE:
				if (NumberSet == 1)
				dividenumbers();
				else
					System.out.println("Primero debes dirigirte a la opcion de digitar los dos numeros");
				break;
			case NUMBERSDIVANDRESIDU:
				if (NumberSet == 1)
				modulnumbers();
				else
					System.out.println("Primero debes dirigirte a la opcion de digitar los dos numeros");
				break;
			case ARRAY:
				fillArray();
				break;
			case ARRAYPRINT:
				if (ArraySet == 1)
				printArray();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYPROM:
				if (ArraySet == 1)
				printProm();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYBIG:
				if (ArraySet == 1)
				printMaxNumberArray();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYOPERA:
				if (ArraySet == 1)
				operationArray();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYUNION:
				if (ArraySet == 1){
				arrayOfNumbersTotal = concatArray();
				System.out.println("El resultado de unir los 3 arreglos Es :");
				System.out.println(Arrays.toString(arrayOfNumbersTotal));
				}else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYNOREPEAT:
				if (ArraySet == 1){
				arrayOfNumbersDiff = concatDiffArray();
				System.out.println("El resultado de unir los elemento diferentes de 3 arreglos Es :");
				System.out.println(Arrays.toString(arrayOfNumbersDiff));
				}else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYINTER:
				if (ArraySet == 1){
				arrayOfNumbersIntersec = concatIntersecArray();
				System.out.println("El resultado de los elemento comunes de los 3 arreglos Es :");
				System.out.println(Arrays.toString(arrayOfNumbersIntersec));	
				}else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYGIRAR:
				if (ArraySet == 1)
				twistArray();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;
			case ARRAYORDEN:
				if (ArraySet == 1)
				sortArray();
				else
					System.out.println("Primero debes dirigirte a la opcion de llenar los arreglos");
				break;

		}	
		}
	}
}
				
		
		
	
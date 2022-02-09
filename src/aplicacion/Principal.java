/*
Copyright [2022] [Daniel Fernández López]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package aplicacion;

import dominio.Matematicas;

/**
 * Clase Principal que inicializa el programa.
 * @author Daniel Fernández López
 */
public class Principal {

    /**
     * Método main que lleva a cabo la ejecución del programa.
     * @param args array de argumentos que define la ejecución del programa (intentos a realizar).
     */
    public static void main(String[] args){
        long intentos = Long.parseLong(args[0]);
        System.out.println("El número Pi es " + Matematicas.generarNumeroPi(intentos));
    }
}


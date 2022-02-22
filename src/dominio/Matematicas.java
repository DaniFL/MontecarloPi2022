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

package dominio;

/**
 * La clase Matemáticas define las variables y métodos necesarios para llevar a
 * cabo la aproximación.
 * 
 * @author Daniel Fernández López
 */
public class Matematicas {

    /**
     * Método que realiza las operaciones aritméticas necesarias para representar la
     * aproximación a Pi.
     * 
     * @param intentos atributo que almacena el valor del número de intentos
     *                 reqlizados.
     * @return devuelve la solución de la aproximación a Pi.
     */
    public static double generarNumeroPi(long intentos) {
        double aciertos = 0.0;
        double areaCuadrado = 4.0;

        for (int i = 1; i <= intentos; i++) {
            double cordenadaX = Math.random() * 2 - 1;
            double cordenadaY = Math.random() * 2 - 1;
            if ((cordenadaX * cordenadaX) + (cordenadaY * cordenadaY) <= 1) {
                intentos++;
                aciertos++;
            }
        }
        double radio = 1.0;
        double areaCirculo = areaCuadrado * (aciertos / intentos);
        return areaCirculo / Math.pow(radio, 2);
    }
}

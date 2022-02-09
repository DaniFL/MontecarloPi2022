package dominio;

public class Matematicas {
    public static double generarNumeroPi(long intentos){
        double aciertos = 0.0;
        double areaCuadrado = 4.0;

        for(int i=1; i<=intentos; i++){
            double cordenadaX = Math.random()*2-1;
            double cordenadaY = Math.random()*2-1;
            if((cordenadaX*cordenadaX) + (cordenadaY*cordenadaY) <= 1){
                intentos++;
                aciertos++;
            }
        }
        double radio = 1.0;
        double areaCirculo = areaCuadrado * (aciertos/intentos);
        return areaCirculo/Math.pow(radio, 2);
    }

}

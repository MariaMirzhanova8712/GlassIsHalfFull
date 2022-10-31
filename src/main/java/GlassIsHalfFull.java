public class GlassIsHalfFull {

    public static void main(String args[]) {

        final int volumeOfGlassInMilliliters = 200; //неизменяемая переменная, стандартный размер стакана
        System.out.println("Oбъём стакана " + volumeOfGlassInMilliliters + " миллилитров");

        double percentageOfGlassFilling = 50.0; //задаем % заполненности стакана
        System.out.println("Стакан заполнен на " + percentageOfGlassFilling + " %");

        //вычисляем объем заполненного стакана
        double  volumeOfFilledGlassInMilliliters = (volumeOfGlassInMilliliters * percentageOfGlassFilling)/100;
        System.out.println("В стакане находится " + volumeOfFilledGlassInMilliliters + " миллилитров воды.");

    }
}

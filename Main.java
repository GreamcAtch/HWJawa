import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Wall longWall = new Wall();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину длинной стены: ");
        longWall.height = scanner.nextDouble();


        System.out.print("Введите ширену длинной стены: ");
        longWall.width = scanner.nextDouble();
        double longWallArea = Math.round(longWall.gerArea());

        System.out.print("Введите длину короткой стены: ");
        Wall shortWall = new Wall();
        shortWall.height = scanner.nextDouble();

        System.out.print("Введите ширену короткой стены: ");
        shortWall.width = scanner.nextDouble();
        double shortWallArea = Math.round(shortWall.gerArea());

        Room room = new Room();
        room.longWall = longWall;
        room.shortWall = shortWall;
        double roomArea = Math.round(room.gerArea());

        Wallpaper wallpaper = new Wallpaper();
        wallpaper.longWall = longWall;
        wallpaper.shortWall = shortWall;
        System.out.print("Введите длину руллонов обоев: ");
        wallpaper.wallPaper = scanner.nextInt();
        int wallArea = (int) wallpaper.gerArea();

        System.out.println("Площадь комнаты =" + " " + roomArea + " " + "m2");
        System.out.println("Колличество руллонов обоев =" + " " + wallArea + " " + "рулона по" + " " + wallpaper.wallPaper + " " + "m2");



    }
}
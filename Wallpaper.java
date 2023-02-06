public class Wallpaper
{
    Wall shortWall;

    Wall longWall;

    int wallPaper;
    double gerArea()
    {
        return (((shortWall.gerArea()+ longWall.gerArea()) * 2)*1.1)/wallPaper;
    }
    
}





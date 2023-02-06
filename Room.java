public class Room
{
    Wall shortWall;

    Wall longWall;
    double gerArea()
    {
        return (shortWall.gerArea()+ longWall.gerArea()) * 2;
    }
}

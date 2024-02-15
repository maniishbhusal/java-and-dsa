// Given a route containing 4 directions (E, W, N, S), find the shortest path to
// reach destination
public class ShortestPath {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // east
            if (direction == 'E') {
                x++;
            } else if (direction == 'W') { // west
                x--;
            } else if (direction == 'N') { // north
                y++;
            } else if (direction == 'S') { // south
                y--;
            } else {
                x += 0;
            }
        }

        int x2 = x * x; // formula - square root((x2 - x1)^2 + (y2 - y1)^2)
        int y2 = y * y; // here x1=0 and y1=0.

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest distance: " + getShortestPath(path));
    }
}
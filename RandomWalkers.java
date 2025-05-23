public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long totalSteps = 0;
        
        for (int t = 0; t < trials; t++) {
            int x = 0, y = 0;
            int steps = 0;
            
            while (Math.abs(x) + Math.abs(y) < r) {
                double random = Math.random();
                if (random < 0.25) {       // north
                    y++;
                } else if (random < 0.5) { // east
                    x++;
                } else if (random < 0.75) { // south
                    y--;
                } else {                   // west
                    x--;
                }
                steps++;
            }
            
            totalSteps += steps;
        }
        
        double average = (double) totalSteps / trials;
        System.out.println("average number of steps = " + average);
    }
}
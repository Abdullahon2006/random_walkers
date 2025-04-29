# Random Walk Statistics Analyzer

A Java program that estimates the average steps needed in a 2D [random_walkers](https://github.com/Abdullahon2006/random_walker) to reach a target distance from the origin.

## **Simulation Method**
1. Performs `trials` independent random walks
2. For each walk:
   - Starts at (0, 0)
   - Moves randomly (N/S/E/W) each step
   - Continues until Manhattan distance ≥ `r`
3. Calculates average steps across all trials

## **Usage**
1. **Compile** the program:
   ```bash
   javac RandomWalkers.java
   ```
2. **Run** with two integer arguments:
   ```bash
   java RandomWalkers r trials
   ```
   - `r`: Target Manhattan distance (positive integer)
   - `trials`: Number of experiments (positive integer)

## **Example Outputs**
```bash
$ java RandomWalkers 5 1000000
average number of steps = 14.98188

$ java RandomWalkers 20 100000
average number of steps = 235.6288
```

## **Implementation Details**
- Uses nested loops for trials and individual walks
- Tracks cumulative steps across all trials
- Computes Manhattan distance efficiently
- Outputs floating-point average

## **Observations**
- Average steps ∝ r² (empirical observation)
- Larger trial counts yield more precise estimates
- Demonstrates properties of random walks:
  ```
  Expected steps ≈ k × r²
  where k ≈ 0.6 (empirically determined)
  ```

## **Theoretical Background**
This Monte Carlo simulation:
- Estimates unknown statistical quantities
- Illustrates random walk properties
- Models real-world diffusion processes
- Provides foundation for more complex stochastic simulations

import java.util.ArrayList;
public class WeeklyData {
    
    public WeeklyData(double[] input) {
        int[0] sleepTimes = new int[7];
        for (int i = 0; i < 7; i++){
            int[i] inputSleepTimes = WeeklyData(double[i]);
        }
    }


    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        int total = 0;
        for (int i = 0; i < 7; i++){
            total += inputSleepTimes[i];
            }
        return total;
    }


    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        if (WeeklyData.getTotal() == 0){
            return 0.0;
        }
        else{
            int firstStep = WeeklyData.getTotal();
            firstStep = firstStep / WeeklyData.getLength();
            return firstStep;
        }
    }


    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        int max = WeeklyData[0];
        for (int i = 1; i < WeeklyData.getLength(); i++){
            if (WeeklyData[i] > max){
                max = WeeklyData[i];
            }
        }
        return max;
    }


    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        int min = WeeklyData[0];
        for (int i = i; i < WeeklyData.getLength(); i++){
            if (WeeklyData[i] < min){
                min = WeeklyData[i];
            }
        }       
    }


    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    /**
     * Returns a formatted, multi-line String showing each day’s data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week’s data
     */
    @Override
    public String toString() {
        // TODO: Create a StringBuilder
        // TODO: Loop through the data array
        // TODO: Append each value with a day label (Day 1, Day 2, etc.)
        // TODO: Return the completed String
        return ""; // replace with your formatted output
    }
}

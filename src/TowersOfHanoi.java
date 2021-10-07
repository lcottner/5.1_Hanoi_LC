/**
 * TowersOfHanoi represents the classic Towers of Hanoi puzzle.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class TowersOfHanoi
{
    private int totalDisks;
    private int count=0;

    /**
     * Sets up the puzzle with the specified number of disks.
     *
     * @param disks the number of disks 
     */
    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }

    /**
     * Performs the initial call to moveTower to solve the puzzle.
     * Moves the disks from tower 1 to tower 3 using tower 2.
     */
    public void solve()
    {
    	count++;
    	System.out.println("--Initial moveTower Call--" + " Int level: "+count);
        moveTower(totalDisks, 1, 3, 2);
    }		
    /**
     * Moves the specified number of disks from one tower to another
     * by moving a subtower of n-1 disks out of the way, moving one
     * disk, then moving the subtower back. Base case of 1 disk.
     *
     * @param numDisks  the number of disks to move
     * @param start     the starting tower
     * @param end       the ending tower
     * @param temp      the temporary tower
     */
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if (numDisks == 1) {
        	System.out.println("--BASE CASE moveOneDisk will be Called-- Currently:" +" start: " + start + " end: " + end + " temp: " + temp +" Int level: "+count);
            moveOneDisk(start, end);
        }
        else
        {
        	count++;
        	System.out.println("--moveTower will be Called-- Currently:" +" start: " + start + " end: " + end + " temp: " + temp + " Int level: "+count);
            moveTower(numDisks-1, start, temp, end);
            
            
            System.out.println("--moveOneDisk will be Called-- Currently:" +" start: " + start + " end: " + end + " temp: " + temp + " Int level: "+count);
            moveOneDisk(start, end);
            
            count++;
            System.out.println("--moveTower will be Called-- Currently:" +" start: " + start + " end: " + end + " temp: " + temp+ " Int level: "+count);
            moveTower(numDisks-1, temp, end, start);
        }
    }
    /**
     * Prints instructions to move one disk from the specified start
     * tower to the specified end tower.
     *
     * @param start  the starting tower
     * @param end    the ending tower
     */
    private void moveOneDisk(int start, int end)
    {
        System.out.println("\nMove one disk from " + start + " to " + end);
    }
}		

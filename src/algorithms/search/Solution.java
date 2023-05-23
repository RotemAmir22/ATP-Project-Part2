package algorithms.search;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Hold the solution solves by a searching algorithm of a searchable problem
 */
public class Solution implements Serializable {

    //variables
    private ArrayList<AState> solutionPath;

    //constructor
    public Solution()
    {
        this.solutionPath = new ArrayList<>();
    }

    //get method
    public ArrayList<AState> getSolutionPath()
    {
        return solutionPath;
    }

    //add state to path
    public void addToPath(AState state){solutionPath.add(0,state);}
}

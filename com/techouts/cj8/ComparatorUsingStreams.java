package com.techouts.cj8;

import corejava.assesment1.example.pack1.A;
import corejava.assessment2.TryWithResourcesDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUsingStreams {

    static void main(String[] args) {

        // Sorting an array based on third element in an array ;

        Triplet arr[] = {new Triplet(2,4,9),new Triplet(3,290,4),new Triplet(58,59,0)};

        Arrays.sort(arr);
        System.out.println("Sorting Based on Z in ascending Order : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorting Based on X in ascending Order : ");
        Arrays.sort(arr,new TripletComparator());
        System.out.println(Arrays.toString(arr));

    }

}

class Triplet implements Comparable<Triplet>{

    int x;
    int y;
    int z;

    Triplet(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public int compareTo(Triplet o) {

        return this.getZ() - o.getZ();
    }

    @Override
    public String toString() {
        return "[ x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.getZ() + " ]";
    }


}
class TripletComparator implements Comparator<Triplet> {

    @Override
    public int compare(Triplet o1, Triplet o2) {
        return o1.getX() - o2.getX();
    }
}



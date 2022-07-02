package DayThirteenAssignment;

public class MaximumTest<A extends Comparable<A>>{
    A x,y,z;
    public MaximumTest(A x,A y,A z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public  A maximum(){
        return MaximumTest.maximum(x,y,z);
    }
    public static <A extends Comparable<A>> A maximum(A x,A y,A z) {
        A max = x;
        if (y.compareTo(max) > 0) {
        max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static String testMaximum(String x,String y,String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <A> void printMax(A x,A y,A z,A max){
        System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
    }

    public static void main(String[] args) {
        Integer xInt = 5,yInt = 6,zInt = 7;
        Float xF1 = 7.6f,yF1 = 7.8f,zF1 = 8.7f;
        String xStr = "orange",yStr = "apple",zStr = "cherry";

        MaximumTest.testMaximum(xStr,yStr,zStr);
        new MaximumTest(xInt,yInt,zInt).maximum();
        new MaximumTest(xF1,yF1,zF1).maximum();
        new MaximumTest(xStr,yStr,zStr).maximum();
    }
    }


public class Float2Array {
    static float a[]={10.0f,32.8f,23.9f,4.8f,67.0f};
    static float largest()
    {
        float i;
        float max=a[4];
        for(i=1;i<a.length;i++)
            if(a[(int)i]>max)
                max=a[(int)i];
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("largest number in array:"+largest());
    }
}

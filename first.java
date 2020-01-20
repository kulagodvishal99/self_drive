import java.util.*;

public class first
{
static int i;
public static void main(String[] args)
{
//global integer i
i=3;
while(i-->0)
{
//local integer i
int i=100;
i--;
System.out.print(i+" ");
}
System.out.println();
}
}

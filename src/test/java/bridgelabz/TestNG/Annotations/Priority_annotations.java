package bridgelabz.TestNG.Annotations;

import org.testng.annotations.Test;

public class Priority_annotations {
	
	@Test(priority=3)
    public void c_method(){
    System.out.println("This is method C");
    }
	
    @Test(priority=1)
    public void b_method(){
    System.out.println("This is method B");
    }
    
    @Test(priority=0)
    public void a_method(){
    System.out.println("This is method A");
    }
    
    @Test(priority=5)
    public void e_method(){
    System.out.println("This is method E");
    }
    
    @Test(priority=4)
    public void d_method(){
    System.out.println("This is method D");
    }
}

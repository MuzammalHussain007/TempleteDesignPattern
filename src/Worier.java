public abstract class Worier {

    public final void getWorier()
    {
      dailyroutine();
      getUp();
      eatbreakfast();
      gotowork();
      returntohome();
      sleep();
    }
    private void dailyroutine()
    {
        System.out.println("Daily routine");
    }

    private void getUp()
    {
        System.out.println("User getUp Early");
    }

    private void eatbreakfast()
    {
        System.out.println("User breakFast");
    }

    private void gotowork()
    {
        System.out.println("User go to work");
    }

    public abstract void work();

    private void returntohome()
    {
        System.out.println("User return home");
    }

    public abstract void relax();

    private void sleep()
    {
        System.out.println("User Saleep Daily");
    }





}

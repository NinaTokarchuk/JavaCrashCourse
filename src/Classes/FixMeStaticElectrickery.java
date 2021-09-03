package Classes;

public class FixMeStaticElectrickery {
    public static final FixMeStaticElectrickery INST = new FixMeStaticElectrickery();

    private static int ONE_HUNDRED = 100;

    private static int value = 100;

    private FixMeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    /*// Initially, (i.e before the code change) The value of 'ONE_HUNDRED' Variable was being assigned after the constructor creation and hence the 'ONE_HUNDRED' variable was NOT Being assigned any value, thereby keeping the 'value' variable's value to be 0 as well and hence the resultant addition result was NOT Being achieved
  // Thus, now we would declare the value BEFORE Constructor creation so that, whenever the constructor is created, the 'value' variable declared in it gets the value of 'ONE_HUNDRED' Variable immediately i.e 100
  private static int ONE_HUNDRED = 100;

  static final Dinglemouse INST = new Dinglemouse();

  // private static int ONE_HUNDRED = 100;    (Older position of this statement, which was later shifted up to correct the code)

  private final int value;

  private Dinglemouse() {
    value = ONE_HUNDRED;
  }

  public int plus100(int n) {
    return value + n;
  }*/
}

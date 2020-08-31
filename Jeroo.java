/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
public void setupBowling() {
  firstRow();
  switchRowRTSD();
  secondRow();
  switchRowLTSD();
  thirdRow();
  switchRowRTSD();
  plant();
}
public void firstRow() {
  turn(RIGHT);
  hop();
  turn(LEFT);
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
}
public void switchRowRTSD() {
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hop();
}

public void secondRow() {
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
}
public void switchRowLTSD() {
  turn(LEFT);
  hop();
  turn(LEFT);
  hop();
}
public void thirdRow() {
  plant();
  hop();
  hop();
  plant();
}
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}

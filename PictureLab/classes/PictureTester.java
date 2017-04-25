/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
	Picture cat = new Picture("kitten2.jpg");
    cat.explore();
    cat.negate();
    cat.explore();
  }
  
  public static void testGrayscale()
  {
	Picture bird = new Picture("swan.jpg");
	bird.explore();
	bird.grayscale();
	bird.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	Picture bike = new Picture("blueMotorcycle.jpg");
	bike.explore();
	bike.mirrorVerticalRightToLeft();
	bike.explore();  
  }
  
  public static void testMirrorHorizontal()
  {
	Picture bike = new Picture("blueMotorcycle.jpg");
	bike.explore();
	bike.mirrorHorizontal();
	bike.explore();   
  }
  
 public static void testMirrorHorizontalBotToTop()
 {
	 Picture bike = new Picture("blueMotorcycle.jpg");
	 bike.explore();
	 bike.mirrorHorizontalBotToTop();
	 bike.explore();
 }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture gull = new Picture("seagull.jpg");
	gull.explore();
	gull.mirrorGull();
	gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
 
 public static void testMyCollage()
 {
	Picture canvas = new Picture("640x480.jpg");
	canvas.myCollage();
	canvas.explore();
 }
 
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testCopy1()
  {
	Picture flower = new Picture("flower1.jpg");
	flower.explore();
	flower.copy1(flower, 5, 10, 13, 50);
	flower.explore();
  }
  
  public static void testCopy()
  {
	Picture flower = new Picture("flower1.jpg");
	flower.explore();
	flower.copy(flower, 50, 23);
	flower.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
   //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testCopy1();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMyCollage();
  }
}
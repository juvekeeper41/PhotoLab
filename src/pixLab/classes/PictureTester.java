package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Jacob Osborne
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
  
  public static void testZeroGreen()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.zeroGreen();
	    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void  testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("jenny-red.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.explore();
	  koala.zeroBlue();
	  koala.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  //Picture temple = new Picture("temple.jpg");
	  //temple.explore();
	  //temple.mirrorDiagonal();
	  //temple.explore();
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testDiagonalTopLeftToBottomRight()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonalTopLeftToBottomRight();
	  koala.explore();
  }
		  
  public static void testMirrorBottomToTop()
  {
	  Picture caterpillar = new Picture("beach.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorBottomToTop();
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
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  public static void testMirrorSnowman()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorSnowman();
	  snowman.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.edgeDetection(10);
	  swan.explore();
	  swan.edgeDetection(20);
	  swan.explore();
  }
  
  public static void testFullRandom()
  {
	  Picture cumberlandIsland = new Picture("cumberlandIsland.jpg");
	  cumberlandIsland.explore();
	  cumberlandIsland.fullRandom();
	  cumberlandIsland.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture cumberlandIsland = new Picture("CumberlandIsland.jpg");
	  cumberlandIsland.explore();
	  cumberlandIsland.Grayscale();
	  cumberlandIsland.explore();
  }
  
  public static void testNegateColor()
  {
	  Picture jenny = new Picture("temple.jpg");
	  jenny.explore();
	  jenny.negateColor();
	  jenny.explore();
  }
  
  public static void testFiveFilters()
  {
	  Picture derpy = new Picture("derpy.jpg");
	  derpy.explore();
	  derpy.negateColor();
	  derpy.Grayscale();
	  derpy.mirrorBottomToTop();
	  derpy.mirrorDiagonal();
	  derpy.mirrorVertical();
	  derpy.explore();
  }
  
  public static void testCopy()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.copy(swan , 120, 120, 200, 200);
	  swan.explore();
	  
  }
  
  public static void testFullRed()
  {
	  Picture strawberries = new Picture("valentine.jpg");
	  strawberries.explore();
	  strawberries.zeroBlue();
	  strawberries.zeroGreen();
	  strawberries.drawString("If one thing were to vanish, it would be you or Swift 3.", 20, 50);
	  strawberries.drawString("After long contemplation, I'd choose to delete Swift 3.", 23, 250);
	  strawberries.explore();
	  strawberries.write("valentine.jpg");
  }
  
  public static void testGlitchArt()
  {
	  Picture glitchy = new Picture("GlitchArtModel.png");
	  glitchy.explore();
	  glitchy.negateColor();
	  glitchy.mirrorVertical();
	  glitchy.mirrorDiagonal();
	  glitchy.mirrorDiagonalTopLeftToBottomRight();
	  glitchy.mirrorBottomToTop();
	  glitchy.mirrorVerticalRightToLeft();
	  glitchy.fullRandomRed();
	  glitchy.zeroBlue();
	  glitchy.explore();
	  
  }
  
  /** Main method for testing. Every class can have a main
    * method in Java */
  public static void main(String [] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	//testFullRed();
	testGlitchArt();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
	//testFullRandom();
	//testGrayscale();
    //testMirrorGull();
	//testMirrorSnowman();
    //testMirrorDiagonal();
    //testCollage();
	//testFiveFilters();
	//testMirrorBottomToTop();
	//testMirrorDiagonal();
	//testDiagonalTopLeftToBottomRight();
    //testCopy();
	//testNegateColor();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testCopy();
  }
}
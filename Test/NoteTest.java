import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest
{
  @Test
  void testMostImportantNote()
  {
    Notebook myNotes = new Notebook(10);
    myNotes.addNote("Check Facebook");
    myNotes.addHighPriorityNote("Make PRO1 exercises");
    myNotes.addNote("Call my mother on the phone");
    assertEquals("Make PRO1 exercises", myNotes.getMostImportantNote());
    myNotes.removeNote(1);
    assertEquals("Check Facebook", myNotes.getMostImportantNote());
  }

  @Test
  void testIndexOfMostImportantNote()
  {
    Notebook myNotes = new Notebook(10);
    myNotes.addNote("Check Facebook");
    myNotes.addHighPriorityNote("Make PRO1 exercises");
    myNotes.addNote("Call my mother on the phone");
    assertEquals(1, myNotes.indexOfMostImportantNote());
    myNotes.removeNote(1);
    assertEquals(0, myNotes.indexOfMostImportantNote());
  }
}

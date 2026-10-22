public class Notebook
{
  private int size;
  private final PriorityNote[] notes;

  public Notebook(int capacity)
  {
    // throw exception for invalid input (not shown)
    this.size = 0;
    this.notes = new PriorityNote[capacity];
  }

  public int getSize()
  {
    return size;
  }

  public void addNote(PriorityNote note)
  {
    // throw exception for invalid input (not shown)
    notes[size] = note.copy();
    size++;
  }

  public void addNote(String note)
  {
    // throw exception for invalid input (not shown)
    notes[size] = new PriorityNote(note);
    size++;
  }

  public void addHighPriorityNote(String note)
  {
    // throw exception for invalid input (not shown)
    notes[size] = new PriorityNote(note);
    notes[size].setHighPriority();
    size++;
  }

  public String getNote(int index)
  {
    return notes[index].getNote();
  }

  public boolean isHighPriorityNote(int index)
  { // throw exception for invalid input (not shown)
    return notes[index].isHighPriorityNote();
  }

  public int indexOfMostImportantNote()
  {
    for (int i = 0; i < size; i++)
    {
      if (isHighPriorityNote(i))
      {
        return i; // return the index of the first high priority note
      }
    }
    if (size > 0)
    {
      return 0; // return the first note, if no notes are high priority
    }
    return -1; // return -1 to indicate that no notes found
  }

  public String getMostImportantNote()
  {
    int index = indexOfMostImportantNote();
    if (index > -1)
    {
      return notes[index].getNote();
    }
    return null;
  }

  public void removeNote(int index)
  {
    // throw exception for invalid input (not shown)
    for (int i = index; i < size - 1; i++)
    {
      notes[i] = notes[i + 1];
    }
    notes[size - 1] = null; // clean up
    size--;
  }

  @Override
  public String toString()
  {
    String s = "";
    for (int i = 0; i < size; i++)
    {
      s += "Note #" + (i + 1) + ": " + notes[i];
      if (i < size - 1)
      {
        s += "\n";
      }
    }
    return s;
  }
}
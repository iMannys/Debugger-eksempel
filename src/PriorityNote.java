public class PriorityNote
{
  private String note;
  private boolean highPriority;

  public PriorityNote(String note) // default is not a high priority
  {
    setNote(note);
    this.highPriority = false;
  }

  public String getNote()
  {
    return note;
  }

  public void setNote(String note)
  {
    if (note == null || note.isEmpty())
    {
      throw new IllegalStateException("Note cannot be null or empty");
    }
    this.note = note;
  }

  public boolean isHighPriorityNote()
  {
    return highPriority;
  }

  public void setHighPriority()
  {
    highPriority = true;
  }

  public void setLowPriority()
  {
    highPriority = false;
  }

  public PriorityNote copy()
  {
    PriorityNote copy = new PriorityNote(note);
    copy.highPriority = highPriority;
    return copy;
  }

  @Override
  public String toString()
  {
    String s = note;
    if (highPriority)
    {
      s += " (high priority)";
    }
    return s;
  }
}
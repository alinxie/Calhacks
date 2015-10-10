import java.util.*;
import java.text.*;

public class Task {
  private String name;
  private String description;
  private int urgency;
  private Date deadline;
  private String datePattern = "MM/DD/yyyy kk:mm";
  SimpleDateFormat converter = new SimpleDateFormat(datePattern);
  
  public Task() {
    name = "";
    description = "";
    urgency = 0;
    deadline = null;
  }
  public Task(String assignment, String details, int importance, String duedate) {
	  name = assignment;
	  description = details;
	  importance = urgency;
	  try {
		  Date deadline = converter.parse(duedate);
	  }
	  catch (ParseException a) {
		  a.printStackTrace();
	  }
  }
  public String getName() {
	  return name;
  }
  public String getDescription() {
	  return description;
  }
  public int getUrgency() {
	  return urgency;
  }
  public Date getDate() {
	  return deadline;
  }
  public void setName(String x) {
	  name = x;
  }
  public void setDescription(String x) {
	  description = x;
  }
  public void setUrgency(int x) {
	  urgency = x;
  }
  public void setDate(String x) {
	  try {
		  Date deadline = converter.parse(x);
	  }
	  catch (ParseException a) {
		  a.printStackTrace();
	  }
  }
}

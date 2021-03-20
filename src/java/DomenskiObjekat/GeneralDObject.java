package DomenskiObjekat;

import java.io.Serializable;
import java.sql.*;

/**
 *
 * @author aleks
 */
public abstract class GeneralDObject implements Serializable
{ abstract public String getAtrValue();//{return "";}
  abstract public String setAtrValue();//{return "";}
  abstract public String getClassName();//{return "";}
  abstract public String getWhereCondition();//{return "";}
  abstract public String getNameByColumn(int column);//{return "";}
  abstract public GeneralDObject getNewRecord(ResultSet rs) throws SQLException; //{return null;}
  abstract public int getPrimaryKey();
  abstract public void setID(int id);
  abstract public String poruka1();
  abstract public String poruka2();
  abstract public String poruka3();
  abstract public String poruka4();
  abstract public String poruka5();
  abstract public String poruka6();
  abstract public String poruka7();
  abstract public String poruka8();
  abstract public String poruka9();
  abstract public String poruka10();
}

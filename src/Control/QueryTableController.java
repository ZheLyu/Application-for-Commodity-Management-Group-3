package Control;

import model.QueryTable;
import java.util.*;

public class QueryTableController {
	/**
	 * return id, st_name, price, number, supplier of all stationery
	 * @throws Exception
	 */
	public void process1() throws Exception {
		QueryTable m = new QueryTable();
		m.query();		
	}

}

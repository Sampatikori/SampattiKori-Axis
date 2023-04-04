package CollectionList.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {


        public Map<String,String> getStudentDetails(){
            Map<String,String> studentMap = new HashMap<String, String>();
            studentMap.put("3","Sampatti");
            studentMap.put("1","Smita");
            studentMap.put("4","Somu");
            studentMap.put("2","Aishwarya");
            return studentMap;


        }
    }


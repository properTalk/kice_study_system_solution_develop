import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
     
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "{\"id\":1,\"students\":[\"Anna\",\"Jerry\"],\"subject\":{\"name\":\"Java\",\"professor\":\"Tony\"}}";

    
		  
			JsonElement   element = JsonParser.parseString(json);
			JsonObject object = element.getAsJsonObject();
			long id = object.get("id").getAsLong();
			JsonArray students = object.get("students").getAsJsonArray();
			for (JsonElement stu : students) {
			System.out.println(stu.getAsString());
			}
			JsonObject subject = object.get("subject").getAsJsonObject();
	}

}
	 
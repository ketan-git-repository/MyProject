package sapphire;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
public class UpdateAsset {
	
	public static void main(String args[]) throws IOException, JSONException{
		
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");
		
JSONObject parent = new JSONObject();
		
		
		JSONObject asset = new JSONObject();
		asset.put("assetId", 83405);
		
		parent.put("asset", asset);
		
		parent.put("requestType", "UPDATE_ASSET");
		parent.put("intigrationLogId", "de7b7bdb-4072-438f-8035-e88c20acca5a");
		
		JSONObject itemType = new JSONObject();
		itemType.put("id", 20016);		
		
		JSONObject additionalParams = new JSONObject();
		
		JSONObject attribute1 = new JSONObject();
		attribute1.put("updated", false);
		attribute1.put("data", "Defibrillator");
		attribute1.put("fieldDisplayName", "Description");
		
		JSONObject attribute2 = new JSONObject();
		attribute2.put("updated", false);
		attribute2.put("data", "30SUP002");
		attribute2.put("fieldDisplayName", "Department");
		
		JSONObject attribute3 = new JSONObject();
		attribute3.put("updated", false);
		attribute3.put("data", "DDF-B01-FL01-MAOT-OT05");
		attribute3.put("fieldDisplayName", "Location");
		
		
		
		additionalParams.put("updated", false);
		additionalParams.put("attribute1", attribute1);
		additionalParams.put("attribute2", attribute2);
		additionalParams.put("attribute3", attribute3);	
		
		
		
		asset.put("itemType", itemType);
		asset.put("additionalParams", additionalParams);
		
				
		System.out.println("requestJson.toString() "+parent.toString());
		
		RequestBody body = RequestBody.create(mediaType, parent.toString());
		//RequestBody body = RequestBody.create(mediaType, "{\r\n    \"requestType\": \"UPDATE_ASSET\",\r\n    \"intigrationLogId\": \"de7b7bdb-4072-438f-8035-e88c20acca5a\",\r\n    \"asset\": {  \r\n\t\t\"assetId\": 83408,\r\n        \"itemType\": {\r\n            \"id\": 20016\r\n        },        \r\n        \"additionalParams\": {\r\n            \"updated\": true,\r\n            \"attribute1\": {\r\n                \"updated\": true,              \r\n                \"data\": \"Testing purpose\",\r\n                \"fieldDisplayName\": \"Description1\"\r\n            },\r\n            \"attribute2\": {\r\n                \"updated\": true,               \r\n                \"data\": \"Testing purpose\",\r\n                \"fieldDisplayName\": \"Department1\"\r\n            },\r\n            \"attribute3\": {\r\n                \"updated\": false,              \r\n                \"data\": \"Testing purpose\",\r\n                \"fieldDisplayName\": \"Location1\"\r\n            }\r\n        }       \r\n    }\r\n}");
		okhttp3.Request request = new okhttp3.Request.Builder()
		  .url("http://172.30.0.12/ims-service/api/asset/update")
		  .post(body)
		  .addHeader("content-type", "application/json")
		  .addHeader("key", "f908b37a-ef73-4ca5-b49e-830f9f119b29")
		  .addHeader("token", "de7b7bdb-4072-438f-8035-e88c20acca5a")
		  .addHeader("int-log-id", "de7b7bdb-4072-438f-8035-e88c20acca5a")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "19ded42c-cdc6-e6a5-30c4-1ad419c05c74")
		  .build();

		okhttp3.Response response = client.newCall(request).execute();
		System.out.println("response.code() "+response.code());
		if(response.code() == 200){
			System.out.println(response.body().toString());			
		}else
			if(response.code() != 200){
				System.out.println(response.message());
			}
	}

}

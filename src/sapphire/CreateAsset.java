package sapphire;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class CreateAsset {
	
	public static void main(String args[]) throws IOException, JSONException{
		okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
		
		MediaType mediaType = MediaType.parse("application/json");
		
				
		JSONObject parent = new JSONObject();
		
		
		JSONObject asset = new JSONObject();
		asset.put("assetNumber", "BA00001-ketan507");
		
		parent.put("asset", asset);
		
		parent.put("requestType", "CREATE_ASSET");
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
		
		JSONObject attribute4 = new JSONObject();
		attribute4.put("updated", false);
		attribute4.put("data", "DDF-B01-FL01-MAOT-OT05");
		attribute4.put("fieldDisplayName", "Comment");
		
		JSONObject attribute5 = new JSONObject();
		attribute5.put("updated", false);
		attribute5.put("data", "Y");
		attribute5.put("fieldDisplayName", "Out Of Service");
		
		additionalParams.put("updated", false);
		additionalParams.put("attribute1", attribute1);
		additionalParams.put("attribute2", attribute2);
		additionalParams.put("attribute3", attribute3);	
		additionalParams.put("attribute4", attribute3);	
		additionalParams.put("attribute5", attribute3);	
		
		
		asset.put("itemType", itemType);
		asset.put("additionalParams", additionalParams);
		
				
		System.out.println("requestJson.toString() "+parent.toString());
		RequestBody body = RequestBody.create(mediaType, parent.toString());
		
		
		
		System.out.println("RequestBody initialized");
		okhttp3.Request request = new okhttp3.Request.Builder().url("http://172.30.0.12/ims-service/api/asset/create")
		  .post(body)
		  .addHeader("key", "f908b37a-ef73-4ca5-b49e-830f9f119b29")
		  .addHeader("token", "de7b7bdb-4072-438f-8035-e88c20acca5a")
		  .addHeader("int-log-id", "de7b7bdb-4072-438f-8035-e88c20acca5a")
		  .addHeader("content-type", "application/json")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "9e6db608-4e07-e91a-cd09-a7bc95fc0cc3")
		  .build();
		System.out.println("Header information added");
		okhttp3.Response response = client.newCall(request).execute();
		System.out.println("response.code() "+response.code());

		if(response.code() == 500){
			String resStr = response.body().string().toString();    
			JSONObject json = new JSONObject(resStr);
			System.out.println(json.getString("message"));
		}
			
		if(response.code() == 200){
		String resStr = response.body().string().toString();    
		JSONObject json = new JSONObject(resStr);
		System.out.println("assetId "+ json.getInt("assetId")); 
		System.out.println("assetId "+ json.getString("assetNumber"));
		
		}
	}
}

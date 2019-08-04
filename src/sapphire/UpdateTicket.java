package sapphire;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class UpdateTicket {
	
	public static void main(String args[]) throws IOException, JSONException{
		okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
		
		MediaType mediaType = MediaType.parse("application/json");
		/*
		{
			   "requestType":"GET_TICKET",
			   "intigrationLogId":"qwertyasdfg",
			   "ticket":{"requestId":"SR-BM--000074",
			               "project":{"projectName":"Assist-Services Management"},
			               "additionalParams":{"updated":true,
			                                   "attribute60":{"updated":true,
			                                                     "data":"Test Start Date",
			                                                     "fieldDisplayName":"EAM Start Date And Time"
			                                                  },
			                                   "attribute61":{"updated":true,
			                                                     "data":"Test End Date",
			                                                     "fieldDisplayName":"EAM End Date And Time"
			                                                 }
			                                   }
			                         }
		}
		*/
				
		JSONObject parent = new JSONObject();
		JSONObject additionalParams = new JSONObject();
		JSONObject ticket = new JSONObject();
		JSONObject project = new JSONObject();
		JSONObject currentState = new JSONObject();
		JSONObject ticketStateDTO = new JSONObject();
		JSONObject attribute60 = new JSONObject();
		JSONObject attribute61 = new JSONObject();

		
		parent.put("requestType", "GET_TICKET");
		parent.put("intigrationLogId", "qwertyasdfg");
		ticket.put("requestId", 7);
		
		project.put("projectName", "Assist-Services Management");
		
		currentState.put("stateName", "Work In Progress");
		
		ticketStateDTO.put("comment", "Working on ticket");
		
		attribute60.put("updated", false);
		attribute60.put("data", "getdate()");
		attribute60.put("fieldDisplayName", "Description");
		
		attribute61.put("updated", false);
		attribute61.put("data", "getdate()+1");
		attribute61.put("fieldDisplayName", "Description");
		
		additionalParams.put("updated", true);
		additionalParams.put("attribute60", attribute60);
		additionalParams.put("attribute61", attribute61);
		
		ticket.put("project", project);
		ticket.put("currentState", currentState);
		ticket.put("ticketStateDTO", ticketStateDTO);
		ticket.put("additionalParams", additionalParams);
		parent.put("ticket", ticket);
		
				
		System.out.println("requestJson.toString() "+parent.toString());
		RequestBody body = RequestBody.create(mediaType, parent.toString());
		
		System.out.println("RequestBody initialized");
		okhttp3.Request request = new okhttp3.Request.Builder().url("http://172.30.0.12/ims-service/api/ticket/stateChange")
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

		
			
		if(response.code() == 200){
		String resStr = response.body().string().toString();    
		JSONObject json = new JSONObject(resStr);
		System.out.println("Problem Id "+ json.getInt("problemId")); 
		System.out.println("requestNumber "+ json.getString("requestNumber"));
		}
		
			
		else
			if(response.code() != 200){
				System.out.println(response.message());
			}
	}
}

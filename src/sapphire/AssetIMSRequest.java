package sapphire;

import org.json.JSONObject;

public class AssetIMSRequest {
	
	
	JSONObject parent = null;
	JSONObject asset = null;
	JSONObject itemType = null;
	JSONObject additionalParams = null;
	JSONObject attribute1 = null;
	JSONObject attribute2 = null;
	JSONObject attribute3 = null;
	
	
	
	
	
	public JSONObject getParent() {
		return parent;
	}
	public void setParent(JSONObject parent) {
		this.parent = parent;
	}
	public JSONObject getAsset() {
		return asset;
	}
	public void setAsset(JSONObject asset) {
		this.asset = asset;
	}
	public JSONObject getItemType() {
		return itemType;
	}
	public void setItemType(JSONObject itemType) {
		this.itemType = itemType;
	}
	public JSONObject getAdditionalParams() {
		return additionalParams;
	}
	public void setAdditionalParams(JSONObject additionalParams) {
		this.additionalParams = additionalParams;
	}
	public JSONObject getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(JSONObject attribute1) {
		this.attribute1 = attribute1;
	}
	public JSONObject getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(JSONObject attribute2) {
		this.attribute2 = attribute2;
	}
	public JSONObject getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(JSONObject attribute3) {
		this.attribute3 = attribute3;
	}
	
	  
	
	

}

package com.macys.cd.camel.model;

import com.google.gson.annotations.SerializedName;

public class DeployStatus {

	@SerializedName("id")
	private transient int ID;

	@SerializedName("trackId")
	private String JOB_ID;

	@SerializedName("qName")
	private String QUEUE_NAME;

	@SerializedName("status")
	private String STATUS;

	@SerializedName("requester")
	private transient String REQUESTER;
	
	@SerializedName("envName")
	private String ENV_NAME;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public String getQUEUE_NAME() {
		return QUEUE_NAME;
	}

	public void setQUEUE_NAME(String qUEUE_NAME) {
		QUEUE_NAME = qUEUE_NAME;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getREQUESTER() {
		return REQUESTER;
	}

	public void setREQUESTER(String rEQUESTER) {
		REQUESTER = rEQUESTER;
	}

	public String getENV_NAME() {
		return ENV_NAME;
	}

	public void setENV_NAME(String eNV_NAME) {
		ENV_NAME = eNV_NAME;
	}

	@Override
	public String toString() {
		return "DeployStatus [" + (JOB_ID != null ? "JOB_ID=" + JOB_ID + ", " : "")
				+ (QUEUE_NAME != null ? "QUEUE_NAME=" + QUEUE_NAME + ", " : "")
				+ (STATUS != null ? "STATUS=" + STATUS + ", " : "") + (ENV_NAME != null ? "ENV_NAME=" + ENV_NAME : "")
				+ "]";
	}

}

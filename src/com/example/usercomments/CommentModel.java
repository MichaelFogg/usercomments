package com.example.usercomments;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class CommentModel {

	public String id;
	public String comment;
	public int term;

	public CommentModel(JSONObject jObject) {

		try {
			id = jObject.getString("id");
			
			comment = jObject.getString("title");
			term = Integer.parseInt(jObject.getString("term_eid"));
			Log.i ("myclasses",comment);
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}

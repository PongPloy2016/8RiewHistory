package com.codemobiles.cmjsonxmlfeeddemo;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.codemobiles.util.CMFeedXmlUtil;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.RequestBody;

import java.util.ArrayList;



public class FeedXMLFragment extends Fragment {

    private ListView mListView;


    public FeedXMLFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_feed_xml, container, false);
        mListView = (ListView) v.findViewById(R.id.listview);

           /*
                final String _url = "http://codemobiles.com/adhoc/feed/youtube_feed.php?type=xml";
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url(_url).build();

                    Response response = client.newCall(request).execute();
                    Log.i("codemobiles", response.body().string());
                }catch (Exception e){

                }*/


        new FeedAsynTask().execute("http://codemobiles.com/adhoc/feed/youtube_feed.php");
        return v;
    }


    public class FeedAsynTask extends AsyncTask<String, Void, ArrayList<Object>>{

        @Override
        protected ArrayList<Object> doInBackground(String... params) {
            // json feed
            // final String _url = "http://codemobiles.com/adhoc/youtube_feed.php?type=xml";

            // assign post data
            RequestBody postData = new FormEncodingBuilder()
                    .add("type", "xml")
                    .build();

            ArrayList<Object> feedDataList = CMFeedXmlUtil.feed(params[0], "youtube_item", postData);
            return feedDataList;
        }

        @Override
        protected void onPostExecute(ArrayList<Object> result) {
            super.onPostExecute(result);
            if (result != null) {
                mListView.setAdapter(new ListViewAdapter(getActivity(), new ArrayList<Object>(result)));
            }

        }
    }



}

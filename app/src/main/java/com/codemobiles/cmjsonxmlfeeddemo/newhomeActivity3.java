package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.paperdb.Paper;
import tcking.github.com.giraffeplayer.GiraffePlayer;
import tcking.github.com.giraffeplayer.GiraffePlayerActivity;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * Created by PC on 14/3/2560.
 */

public class newhomeActivity3 extends Activity {


    GiraffePlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpb3);
        player = new GiraffePlayer(this);
        player.onComplete(new Runnable() {
            @Override
            public void run() {
                //callback when video is finish
                Toast.makeText(getApplicationContext(), "video play completed", Toast.LENGTH_SHORT).show();
            }
        }).onInfo(new GiraffePlayer.OnInfoListener() {
            @Override
            public void onInfo(int what, int extra) {
                switch (what) {
                    case IMediaPlayer.MEDIA_INFO_BUFFERING_START:
                        //do something when buffering start
                        break;
                    case IMediaPlayer.MEDIA_INFO_BUFFERING_END:
                        //do something when buffering end
                        break;
                    case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH:
                        //download speed
                        //  ((TextView) findViewById(R.id.tv_speed)).setText(Formatter.formatFileSize(getApplicationContext(),extra)+"/s");
                        break;
                    case IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START:
                        //do something when video rendering
                        findViewById(R.id.tv_speed).setVisibility(View.GONE);
                        break;
                }
            }
        }).onError(new GiraffePlayer.OnErrorListener() {
            @Override
            public void onError(int what, int extra) {
                Toast.makeText(getApplicationContext(), "video play error", Toast.LENGTH_SHORT).show();
            }
        });
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_play) {
                    String url = "http://content.jwplatform.com/videos/ELqqeJFB-eRjqu5Ta.mp4";
                    player.play(url);
                    player.setTitle(url);

                } else if (v.getId() == R.id.btn_start) {
                    player.start();
                } else if (v.getId() == R.id.btn_pause) {
                    player.pause();
                } else if (v.getId() == R.id.btn_toggle) {
                    player.toggleFullScreen();
                }else if (v.getId() == R.id.btn_map) {

                    Paper.book().write("MapCheck", "2"); // Primitive
                    Intent q = new Intent(getApplicationContext(), MapActivity.class);
                    startActivity(q);
                }
                else if (v.getId() == R.id.btn_back) {
                    onBackPressed();
                }
            }
        };
        findViewById(R.id.btn_play).setOnClickListener(clickListener);
        findViewById(R.id.btn_pause).setOnClickListener(clickListener);
        findViewById(R.id.btn_start).setOnClickListener(clickListener);
        findViewById(R.id.btn_toggle).setOnClickListener(clickListener);
        findViewById(R.id.btn_back).setOnClickListener(clickListener);
        findViewById(R.id.btn_map).setOnClickListener(clickListener);

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}
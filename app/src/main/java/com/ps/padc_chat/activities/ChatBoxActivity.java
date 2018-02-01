package com.ps.padc_chat.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ps.padc_chat.R;
import com.ps.padc_chat.delegates.ChatBoxDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pyaesone on 2/1/18.
 */

public class ChatBoxActivity extends AppCompatActivity implements ChatBoxDelegate {

    @BindView(R.id.et_write_msg)
    EditText etWriteMsg;

    @BindView(R.id.tv_send_voice)
    TextView tvSendVoice;

    @BindView(R.id.tv_send_msg)
    TextView tvSendMsg;

    public static Intent intent(Context context) {
        Intent intent = new Intent(context, ChatBoxActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_box);
        ButterKnife.bind(this, this);

        onTextMessage();
        onSendVoice();
        onSendMessage();
    }

    @Override
    public void onTextMessage() {
        etWriteMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO tigger show/hide mic when texting
//                if(etWriteMsg.getText().length() > 0){
//                    tvSendVoice.setVisibility(View.GONE);
//                }else{
//                    tvSendVoice.setVisibility(View.VISIBLE);
//                }
            }
        });
    }

    @Override
    public void onSendMessage() {
        tvSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sent msg", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onSendVoice() {
        tvSendVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sent voice", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

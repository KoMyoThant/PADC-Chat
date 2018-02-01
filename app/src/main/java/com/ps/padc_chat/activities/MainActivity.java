package com.ps.padc_chat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ps.padc_chat.R;
import com.ps.padc_chat.adapters.ChatMateListAdapter;
import com.ps.padc_chat.delegates.ChatMateItemDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ChatMateItemDelegate {

    @BindView(R.id.rv_chat_mate_list)
    RecyclerView rvChatMateList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        rvChatMateList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        ChatMateListAdapter chatMateListAdapter = new ChatMateListAdapter(getApplicationContext(), this);
        rvChatMateList.setAdapter(chatMateListAdapter);


    }

    @Override
    public void onTapChatMate() {
        Intent intent = ChatBoxActivity.intent(getApplicationContext());
        startActivity(intent);
    }
}

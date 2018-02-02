package com.ps.padc_chat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.ps.padc_chat.R;
import com.ps.padc_chat.adapters.ChatMateListAdapter;
import com.ps.padc_chat.components.EmptyViewPod;
import com.ps.padc_chat.components.SmartRecyclerView;
import com.ps.padc_chat.components.SmartScrollListener;
import com.ps.padc_chat.delegates.ChatMateItemDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements ChatMateItemDelegate {

    @BindView(R.id.rv_chat_mate_list)
    SmartRecyclerView rvChatMateList;

    @BindView(R.id.vp_empty_chat_mate_list)
    EmptyViewPod vpEmptyChatMateList;

    private SmartScrollListener mSmartScrollListener;

    private ChatMateListAdapter chatMateListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        vpEmptyChatMateList.setEmptyData("Ha Ha No Data");
        rvChatMateList.setEmptyView(vpEmptyChatMateList);
        rvChatMateList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        chatMateListAdapter = new ChatMateListAdapter(getApplicationContext(), this);
        rvChatMateList.setAdapter(chatMateListAdapter);

        mSmartScrollListener = new SmartScrollListener(new SmartScrollListener.OnSmartScrollListener() {
            @Override
            public void onListEndReach() {

            }
        });
        rvChatMateList.addOnScrollListener(mSmartScrollListener);

    }

    @Override
    public void onTapChatMate() {
        Intent intent = ConversationActivity.intent(getApplicationContext());
        startActivity(intent);
    }
}

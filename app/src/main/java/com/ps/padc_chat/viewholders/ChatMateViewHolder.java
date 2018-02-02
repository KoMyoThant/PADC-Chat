package com.ps.padc_chat.viewholders;

import android.view.View;

import com.ps.padc_chat.delegates.ChatMateItemDelegate;

/**
 * Created by pyaesone on 2/1/18.
 */

public class ChatMateViewHolder extends BaseViewHolder {

    private ChatMateItemDelegate mChatMateItemDelegate;

    public ChatMateViewHolder(View itemView,ChatMateItemDelegate chatMateItemDelegate) {
        super(itemView);
        mChatMateItemDelegate = chatMateItemDelegate;
        itemView.setOnClickListener(this);

    }

    @Override
    public void setData(Object data) {

    }

    @Override
    public void onClick(View view) {
        mChatMateItemDelegate.onTapChatMate();
    }
}

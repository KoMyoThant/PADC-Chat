package com.ps.padc_chat.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ps.padc_chat.delegates.ChatMateItemDelegate;

/**
 * Created by pyaesone on 2/1/18.
 */

public class ChatMateViewHolder extends RecyclerView.ViewHolder {

    private ChatMateItemDelegate mChatMateItemDelegate;

    public ChatMateViewHolder(View itemView,ChatMateItemDelegate chatMateItemDelegate) {
        super(itemView);
        mChatMateItemDelegate = chatMateItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChatMateItemDelegate.onTapChatMate();
            }
        });

    }
}

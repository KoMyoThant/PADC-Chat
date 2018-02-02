package com.ps.padc_chat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ps.padc_chat.R;
import com.ps.padc_chat.data.vo.RegisterUserVO;
import com.ps.padc_chat.delegates.ChatMateItemDelegate;
import com.ps.padc_chat.viewholders.ChatMateViewHolder;

/**
 * Created by pyaesone on 2/1/18.
 */

public class ChatMateListAdapter extends BaseRecyclerAdapter<ChatMateViewHolder,RegisterUserVO>{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ChatMateItemDelegate mChatMateItemDelegate;

    public ChatMateListAdapter(Context context, ChatMateItemDelegate chatMateItemDelegate) {
        super(context);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mChatMateItemDelegate = chatMateItemDelegate;
    }

    @Override
    public ChatMateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_chat_mate, parent, false);

        return new ChatMateViewHolder(view, mChatMateItemDelegate);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

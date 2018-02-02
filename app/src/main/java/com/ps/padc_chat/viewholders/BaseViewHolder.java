package com.ps.padc_chat.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by pyaesone on 2/2/18.
 */

public abstract class BaseViewHolder<W> extends RecyclerView.ViewHolder implements View.OnClickListener {

    protected W mData;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(W data);
}

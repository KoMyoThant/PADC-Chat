package com.ps.padc_chat.delegates;

/**
 * Created by pyaesone on 2/1/18.
 */

public interface ConversationDelegate {

    void onTextMessage();

    void onSendMessage();

    void onSendVoice();
}

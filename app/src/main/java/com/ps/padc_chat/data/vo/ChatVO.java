package com.ps.padc_chat.data.vo;

import java.util.List;

/**
 * Created by pyaesone on 2/2/18.
 */

public class ChatVO {

    private long id;

    private long chatId;

    private String startedAt;

    private List<ConversationVO> conversations;

    private List<RegisterUserVO> userList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public List<ConversationVO> getConversations() {
        return conversations;
    }

    public void setConversations(List<ConversationVO> conversations) {
        this.conversations = conversations;
    }

    public List<RegisterUserVO> getUserList() {
        return userList;
    }

    public void setUserList(List<RegisterUserVO> userList) {
        this.userList = userList;
    }
}

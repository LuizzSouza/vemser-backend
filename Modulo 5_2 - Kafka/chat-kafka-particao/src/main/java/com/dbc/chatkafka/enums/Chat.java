package com.dbc.chatkafka.enums;

public enum Chat {
    GERAL("chat-geral"),        // 0
    ANA("chat-ana"),            // 1
    EZEQUIAS("chat-ezequias"),  // 2
    FLAVIO("chat-flavio"),
    FELIPE("chat-felipe"),
    GABRIEL("chat-gabriel"),
    GUILHERME("chat-guilherme"),
    GUSTAVO("chat-gustavo"),
    JOAO("chat-joao"),
    LUCAS("chat-lucas"),
    LUIZ("chat-luiz"), //10
    MAICON("chat-maicon"),      // 11
    NICOLAS("chat-nicolas"),
    PABLO("chat-pablo");


    private String chatName;

    Chat(String chatName) {
        this.chatName = chatName;
    }

    public String getChatName() {
        return chatName;
    }

}

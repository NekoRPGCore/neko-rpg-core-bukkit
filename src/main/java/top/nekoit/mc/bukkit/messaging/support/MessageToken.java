package top.nekoit.mc.bukkit.messaging.support;

import top.nekoit.mc.bukkit.messaging.NekoMessageBridge;
import top.nekoit.mc.bukkit.messaging.NekoMessageToken;

import javax.annotation.Nullable;

public class MessageToken implements NekoMessageToken {

    private final String token;

    private boolean valid;

    private final NekoMessageBridge bridge;

    protected MessageToken(String token, boolean valid, NekoMessageBridge bridge) {
        this.token = token;
        this.valid = valid;
        this.bridge = bridge;
    }

    @Override
    public String getTokenString() {
        return token;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Nullable
    @Override
    public NekoMessageBridge getBridge() {
        return bridge;
    }

    public static MessageToken of(String token, boolean valid, NekoMessageBridge bridge) {
        return new MessageToken(token, valid, bridge);
    }
}

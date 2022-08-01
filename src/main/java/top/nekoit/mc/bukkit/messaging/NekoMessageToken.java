package top.nekoit.mc.bukkit.messaging;

import javax.annotation.Nullable;

public interface NekoMessageToken {

    public String getTokenString();

    public boolean isValid();

    public @Nullable NekoMessageBridge getBridge();
}

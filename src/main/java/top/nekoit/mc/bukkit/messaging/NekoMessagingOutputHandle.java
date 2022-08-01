package top.nekoit.mc.bukkit.messaging;

import java.util.concurrent.CompletableFuture;

public interface NekoMessagingOutputHandle extends NekoMessagingHandle {

    public CompletableFuture<NekoMessage> send(NekoMessage message);

    public NekoMessageEncoder getEncoder();
}

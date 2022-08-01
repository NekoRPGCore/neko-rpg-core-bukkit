package top.nekoit.mc.bukkit.messaging;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentMap;

public interface NekoMessageBridge {

    public NekoMessageAdapter getAdapter();

    public NekoMessageSource getSource();

    public ConcurrentMap<UUID, NekoMessageToken> getConnected();

    public default NekoMessageToken getToken(OfflinePlayer player) {
        return getConnected().get(player.getUniqueId());
    }

    public CompletableFuture<Boolean> connect(Player player, @Nullable NekoMessageToken token);

    public CompletableFuture<Boolean> isConnected(Player player);

    public CompletableFuture<Void> disconnect(Player player);

    public CompletableFuture<Void> invalidate(NekoMessageToken token);

    public NekoMessagingOutputHandle getOutputHandle();

    public CompletableFuture<NekoMessage> send(Player player, NekoMessage message);

    public NekoMessageDecoder getDecoder();

    public NekoMessageEncoder getEncoder();

}

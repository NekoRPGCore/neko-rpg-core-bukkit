package top.nekoit.mc.bukkit.messaging;

import org.bukkit.entity.Player;
import top.nekoit.mc.bukkit.exception.NekoMessageSourceMissingException;
import top.nekoit.mc.bukkit.messaging.support.MessageToken;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public interface NekoMessageAdapter {

    public NekoMessager getMessager();

    public default CompletableFuture<Boolean> connect(Player player, String name, @Nullable String token) {
        NekoMessageBridge bridge = getMessageBridges().get(name);
        return Objects.requireNonNull(bridge, new NekoMessageSourceMissingException(this, name)).connect(player, MessageToken.of(token, true, bridge));
    }

    public default CompletableFuture<Boolean> isConnected(Player player, String name) {
        return Objects.requireNonNull(getMessageBridges().get(name), new NekoMessageSourceMissingException(this, name)).isConnected(player);
    }

    public default CompletableFuture<Void> disconnect(Player player, String name) {
        return Objects.requireNonNull(getMessageBridges().get(name), new NekoMessageSourceMissingException(this, name)).disconnect(player);
    }

    public default CompletableFuture<NekoMessage> send(Player player, String name, NekoMessage message) {
        return Objects.requireNonNull(getMessageBridges().get(name), new NekoMessageSourceMissingException(this, name)).send(player, message);
    }

    public Map<String, NekoMessageBridge> getMessageBridges();
}

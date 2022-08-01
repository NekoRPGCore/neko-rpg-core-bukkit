package top.nekoit.mc.bukkit.messaging;

public interface NekoMessagingInputHandle extends NekoMessagingHandle {

    public NekoMessage receive(Object sender, NekoMessage message);

    public NekoMessageDecoder getDecoder();
}

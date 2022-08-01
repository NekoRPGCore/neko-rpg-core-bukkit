package top.nekoit.mc.bukkit.messaging;

public interface NekoMessager {

    public NekoMessagerType getType();

    public NekoMessageAdapter getAdapter();

    public NekoMessagingInputHandle getInputHandle();

    public NekoMessagingOutputHandle getOutputHandle();
}

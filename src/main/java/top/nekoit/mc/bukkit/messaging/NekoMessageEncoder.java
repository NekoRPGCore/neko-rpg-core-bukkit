package top.nekoit.mc.bukkit.messaging;

public interface NekoMessageEncoder {

    public byte[] encode(NekoMessageToken token, NekoMessage message);
}

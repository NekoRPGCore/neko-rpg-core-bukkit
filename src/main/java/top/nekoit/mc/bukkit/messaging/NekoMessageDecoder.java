package top.nekoit.mc.bukkit.messaging;

public interface NekoMessageDecoder {

    public NekoMessage decode(NekoMessageToken token, byte[] message);
}

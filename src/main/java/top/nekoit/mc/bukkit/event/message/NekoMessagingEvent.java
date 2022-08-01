package top.nekoit.mc.bukkit.event.message;

import top.nekoit.mc.bukkit.messaging.NekoMessage;

public interface NekoMessagingEvent {

    public Object getSender();

    public NekoMessage getMessage();
}

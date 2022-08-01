package top.nekoit.mc.bukkit.exception;

import lombok.Getter;

@Getter
public class NekoMessageException extends NekoException {
    private final Object sender;

    public NekoMessageException(Object sender, String message) {
        super(message);
        this.sender = sender;
    }
}

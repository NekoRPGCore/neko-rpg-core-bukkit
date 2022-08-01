package top.nekoit.mc.bukkit.exception;

import lombok.Getter;

@Getter
public class NekoMessageSourceMissingException extends NekoMessageException {

    private final static String MESSAGE_SOURCE_MISSING = "Message source named '%s' is undefined.";

    private String name;

    public NekoMessageSourceMissingException(Object sender, String name) {
        super(sender, String.format(NekoMessageSourceMissingException.MESSAGE_SOURCE_MISSING, name));
    }
}

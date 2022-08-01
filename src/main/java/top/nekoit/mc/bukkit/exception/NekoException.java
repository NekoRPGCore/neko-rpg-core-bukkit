package top.nekoit.mc.bukkit.exception;

import java.util.function.Supplier;

public class NekoException extends Exception implements Supplier<String> {
    public NekoException(String message) {
        super(message);
    }

    @Override
    public String get() {
        return this.getMessage();
    }
}

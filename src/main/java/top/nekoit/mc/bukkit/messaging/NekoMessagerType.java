package top.nekoit.mc.bukkit.messaging;

import lombok.Getter;

@Getter
public enum NekoMessagerType {
    LOCAL(0),
    REMOTE(1);

    private final int id;

    private NekoMessagerType(int id) {
        this.id = id;
    }
}

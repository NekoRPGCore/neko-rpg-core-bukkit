package top.nekoit.mc.bukkit.resource;

import java.net.URL;

public interface NekoResource {

    public URL getURL();

    public boolean verify(String md5);
}

package top.nekoit.mc.bukkit.inventory;

import org.bukkit.inventory.ItemStack;
import top.nekoit.mc.bukkit.resource.NekoTexture;

public interface NekoItemMeta {

    public void setDisplayName(String name);

    public String getDisplayName();

    public NekoTexture getTexture();

    public Object getProperty(String name);

    public ItemStack getItem();
}

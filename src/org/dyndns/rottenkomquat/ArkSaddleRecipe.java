package org.dyndns.rottenkomquat;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ArkSaddleRecipe extends JavaPlugin {

	@Override
	public void onEnable() {
		ItemStack saddle = new ItemStack(Material.SADDLE);
		ShapedRecipe saddleRecipe = new ShapedRecipe(saddle);
		saddleRecipe.shape("SIS", "LLL", "LLL");
		saddleRecipe.setIngredient('I', Material.IRON_INGOT);
		saddleRecipe.setIngredient('L', Material.LEATHER);
		saddleRecipe.setIngredient('S', Material.STRING);
		Bukkit.addRecipe(saddleRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}

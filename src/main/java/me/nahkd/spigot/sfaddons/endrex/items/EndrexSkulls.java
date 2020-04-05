package me.nahkd.spigot.sfaddons.endrex.items;

import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;

public class EndrexSkulls {

	public static ItemStack	 PEARL_ORE;
	public static ItemStack	 RESONANT_ENDER_BUCKET;
	public static ItemStack	 RESONANT_ENDER;
	public static ItemStack	 ENHANCED_CRUCIBLE_EMPTY;
	public static String	 ENHANCED_CRUCIBLE_EMPTY_HASH;
	public static String	 ENHANCED_CRUCIBLE_RESONANT_WATER;
	public static String	 ENHANCED_CRUCIBLE_RESONANT_LAVA;
	public static String	 ENHANCED_CRUCIBLE_RESONANT_ENDER;
	
	public static void init() {
		PEARL_ORE = 							SkullItem.fromHash("bf20120cb26dfe8a92f83a6e842b5b44062932919bd404eed362ccfff5ca33db");
		RESONANT_ENDER_BUCKET = 				SkullItem.fromHash("29d2b425ff0012ab3d98a78384fedcba1a4c2971fbe078ea60c33a44ab5da076");
		RESONANT_ENDER = 						SkullItem.fromHash("92db9e7ebb60b27e9c016fbc13a7d4e76a4ec7b4b3af5cb7976952090ad4cbbd");
		ENHANCED_CRUCIBLE_EMPTY =		 		SkullItem.fromHash("6ff1e1b02ea22effb72f025f245871afc87d1e393bf1e42964ff768532bc0106");
		ENHANCED_CRUCIBLE_EMPTY_HASH = 			"6ff1e1b02ea22effb72f025f245871afc87d1e393bf1e42964ff768532bc0106";
		ENHANCED_CRUCIBLE_RESONANT_WATER = 		"8700a265fcf2ab50b1fc76f9a359543a3a3e0401d8694759f197f91638ea9499";
		ENHANCED_CRUCIBLE_RESONANT_LAVA = 		"64b233d12160ecf2ee293d44b79583c76d2210dedb94fb1faa0770359b340a16";
		ENHANCED_CRUCIBLE_RESONANT_ENDER =	 	"1cf53614ec58c68e1956294857ad0772b998aa607bdc53f73ce76540b99b0c4f";
	}
	
}
package me.nahkd.spigot.sfaddons.endrex.debug;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.nahkd.spigot.sfaddons.endrex.schem2.Region;
import me.nahkd.spigot.sfaddons.endrex.schem2.VectorInt;
import me.nahkd.spigot.sfaddons.endrex.schem2.nahkdSchematic2;

public class DebugCommand implements CommandExecutor {

	World spW;
	VectorInt sp1;
	VectorInt sp2;
	nahkdSchematic2 clip;
	
	public DebugCommand() {
		spW = null;
		sp1 = sp2 = null;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		if (sender instanceof Player && sender.hasPermission("endrex.debug")) {
			Player p = (Player) sender;
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage("sp1, sp2, savesp, loadsp, copy, paste");
			} else if (args[0].equalsIgnoreCase("sp1")) {
				Location f = p.getTargetBlock(null, 7).getLocation();
				sp1 = VectorInt.fromLocation(f);
				spW = f.getWorld();
			} else if (args[0].equalsIgnoreCase("sp2")) {
				Location f = p.getTargetBlock(null, 7).getLocation();
				sp2 = VectorInt.fromLocation(f);
				spW = f.getWorld();
			} else if (args[0].equalsIgnoreCase("savesp")) {
				try {
					FileOutputStream o = new FileOutputStream(new File("gay.nsm"));
					clip.writeToStream(o);
					o.close();
					sender.sendMessage("saved as /gay.nsm");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (args[0].equalsIgnoreCase("loadsp")) {
				try {
					FileInputStream i = new FileInputStream(new File("gay.nsm"));
					clip = new nahkdSchematic2().fromStream(i);
					i.close();
					sender.sendMessage("loaded from /gay.nsm");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (args[0].equalsIgnoreCase("copy")) {
				clip = new nahkdSchematic2().fromRegion(new Region(spW, sp1, sp2));
			} else if (args[0].equalsIgnoreCase("paste")) {
				clip.pasteSchematic(p.getWorld(), VectorInt.fromLocation(p.getLocation()));
			}
			return true;
		}
		return false;
	}

}
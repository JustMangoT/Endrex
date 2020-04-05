package me.nahkd.spigot.sfaddons.endrex.schem2.ext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bukkit.block.Block;

import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.nahkd.spigot.sfaddons.endrex.schem2.BinaryUtils;

/**
 * It's better to let TheBusyBiscuit improve this, rather than me.
 * @author nahkd123
 *
 */
public class SlimefunSchematicExtension extends SchematicExtension {

	public SlimefunSchematicExtension() {
		super(0x0001); // The ID will be saved as 16-bit integer
	}

	@Override
	public void serialize(OutputStream stream, Block block) throws IOException {
		BinaryUtils.write_utf8String(stream, BlockStorage.getBlockInfoAsJson(block));
	}

	@Override
	public void deserialize(InputStream stream, Block block) throws IOException {
		String json = BinaryUtils.read_utf8String(stream);
		BlockStorage.setBlockInfo(block, json, true);
	}

	@Override
	public boolean serializable(Block b) {return BlockStorage.hasBlockInfo(b);}

}
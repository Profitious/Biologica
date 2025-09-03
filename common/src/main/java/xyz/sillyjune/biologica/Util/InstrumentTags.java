package xyz.sillyjune.biologica.Util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;

public interface InstrumentTags {
    TagKey<Instrument> MARACAS = create("goat_horns");

    private static TagKey<Instrument> create(String string) {
        return TagKey.create(Registries.INSTRUMENT, new ResourceLocation(string));
    }
}

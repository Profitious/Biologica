package xyz.sillyjune.biologica.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;
import xyz.sillyjune.biologica.Biologica;

public interface BiologicaInstrumentTags {
    TagKey<Instrument> MARACAS = create("maracas");

    private static TagKey<Instrument> create(String id) {
        return TagKey.create(Registries.INSTRUMENT, new ResourceLocation(Biologica.MOD_ID, id));
    }
}

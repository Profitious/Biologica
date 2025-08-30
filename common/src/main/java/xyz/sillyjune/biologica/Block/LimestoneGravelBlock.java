package xyz.sillyjune.biologica.Block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class LimestoneGravelBlock extends FallingBlock {
    public LimestoneGravelBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public int getDustColor(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return -8356741;
    }
}

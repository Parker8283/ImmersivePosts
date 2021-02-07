package twistedgate.immersiveposts.client.model;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.util.Direction;
import net.minecraftforge.client.model.data.EmptyModelData;
import net.minecraftforge.client.model.data.IModelData;

public abstract class IPOBakedModel implements IBakedModel{
	
	@Nonnull
	@Override
	public abstract List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, @Nonnull Random rand, @Nonnull IModelData extraData);
	
	@Override
	public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand){
		return getQuads(state, side, rand, EmptyModelData.INSTANCE);
	}
	
	@Override
	public boolean isSideLit(){
		return true;
	}
	
}

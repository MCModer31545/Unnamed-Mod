package com.mcmoder31545.unnamedmod.block;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockUEUEnergyCellCluster extends BlockUnnamedMod
{
    @SideOnly(Side.CLIENT)
    private IIcon textureTop;

    public BlockUEUEnergyCellCluster()
    {
        super(Material.glass);
        this.setBlockName("ueuEnergyCellCluster");
        this.setBlockTextureName("ueuEnergyCellCluster");
        this.setLightLevel(1.0F);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        if (side == 1 || side == 0)
            return textureTop;
        else
            return blockIcon;

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_side");
        textureTop = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");
    }

}

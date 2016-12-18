package link1234gamer.fnafmod.client.sound;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SoundFNAF extends PositionedSound
{
    public static SoundFNAF makeSound(ResourceLocation resourceLocation, boolean loop)
    {
    	SoundFNAF sound = new SoundFNAF(resourceLocation, 1.0F, 1.0F, false, 0, ISound.AttenuationType.NONE, 0.0F, 0.0F, 0.0F);
    	sound.repeat = loop;
        return sound;
    }
    
    public static SoundFNAF makeSound(ResourceLocation resourceLocation, boolean loop, float volume, float pitch)
    {
    	SoundFNAF sound = new SoundFNAF(resourceLocation, volume, pitch, loop, 0, ISound.AttenuationType.NONE, 0.0F, 0.0F, 0.0F);
        return sound;
    }
    
    public static SoundFNAF makeSound(ResourceLocation resourceLocation, boolean loop, float x, float y, float z)
    {
    	SoundFNAF sound = new SoundFNAF(resourceLocation, 1.0F, 1.0F, loop, 0, ISound.AttenuationType.LINEAR, x, y, z);
        return sound;
    }
    
    public static SoundFNAF makeSound(ResourceLocation resourceLocation, boolean loop, float x, float y, float z, float volume, float pitch, ISound.AttenuationType attenuationType)
    {
    	SoundFNAF sound = new SoundFNAF(resourceLocation, volume, pitch, loop, 0, attenuationType, x, y, z);
        return sound;
    }

    private SoundFNAF(ResourceLocation location, float volume, float pitch, boolean repeat, int p_i45108_5_, ISound.AttenuationType p_i45108_6_, float x, float y, float z)
    {
        super(location);
        this.volume = volume;
        this.field_147663_c = pitch;
        this.xPosF = x;
        this.yPosF = y;
        this.zPosF = z;
        this.repeat = repeat;
        this.field_147665_h = p_i45108_5_;
        this.field_147666_i = p_i45108_6_;
    }
}
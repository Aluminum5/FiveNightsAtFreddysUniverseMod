package link1234gamer.fnafmod.client.gui;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;

public class GuiOverride extends GuiScreen
{
	public Minecraft mc = Minecraft.getMinecraft();
	public Random rand = new Random();
	public GuiScreen overriddenScreen;
	
	public void drawScreen(int mouseX, int mouseY, float partalTicks)
	{
		super.drawScreen(mouseX, mouseY, partalTicks);
        List buttonList = ObfuscationReflectionHelper.getPrivateValue(GuiScreen.class, overriddenScreen, "buttonList", "field_146292_n");
        List labelList = ObfuscationReflectionHelper.getPrivateValue(GuiScreen.class, overriddenScreen, "labelList", "field_146293_o");
        int k1;

        for (k1 = 0; k1 < buttonList.size(); ++k1)
        {
        	((GuiButton)buttonList.get(k1)).drawButton(mc, mouseX, mouseY);
        }

        for (k1 = 0; k1 < labelList.size(); ++k1)
        {
        	((GuiLabel)labelList.get(k1)).func_146159_a(mc, mouseX, mouseY);
        }
	}
}
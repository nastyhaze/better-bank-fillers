package com.nastyhaze.betterBankFillers;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BetterBankFillersPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BetterBankFillersPlugin.class);
		RuneLite.main(args);
	}
}
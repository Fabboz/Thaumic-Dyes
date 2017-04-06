package thaumicdyes.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import thaumicdyes.client.tab.TabTD;
import thaumicdyes.common.ThaumicDyes;
import thaumicdyes.common.items.CultistRobesDyed;
import thaumicdyes.common.items.ThaumiumFortressDyed;
import thaumicdyes.common.items.CultistPaladin;
import thaumicdyes.common.items.CultistPraetorDyed;
import thaumicdyes.common.items.CultistKnightDyed;
import thaumcraft.api.ThaumcraftApi;

public class ItemHandler {
   public static ToolMaterial Robes;
   public static ArmorMaterial RobesArmor;
   public static ArmorMaterial PraetorArmor;
   public static ArmorMaterial FortressArmor;
   public static ArmorMaterial KnightArmor;
   public static ArmorMaterial IronFortressArmor;
   

   public static Item itemHelmetCultistRobeDyed;
   public static Item itemChestCultistRobeDyed;
   public static Item itemLegsCultistRobeDyed;
   
   public static Item itemHelmetFortressDyed;
   public static Item itemChestFortressDyed;
   public static Item itemLegsFortressDyed;
   
   public static Item itemHelmetCultistLeaderDyed;
   public static Item itemChestCultistLeaderDyed;
   public static Item itemLegsCultistLeaderDyed;
   
   public static Item itemHelmetCultistKnightDyed;
   public static Item itemChestCultistKnightDyed;
   public static Item itemLegsCultistKnightDyed;
   
   public static Item itemHelmetInhabitedPlate;
   public static Item itemChestInhabitedPlate;
   public static Item itemLegsInhabitedPlate;
   
   public static Item itemHelmetIronFortress;
   public static Item itemChestIronFortress;
   public static Item itemLegsIronFortress;
   
   public static Item itemHelmetCultistRanger;
   public static Item itemChestCultistRanger;
   public static Item itemLegsCultistRanger;
   
   public static Item itemHelmetCultistRangerDyed;
   public static Item itemChestCultistRangerDyed;
   public static Item itemLegsCultistRangerDyed;
   
   public static Item itemHelmetVoidRobeDyed;
   public static Item itemChestVoidRobeDyed;
   public static Item itemLegsVoidRobeDyed;
   
   public static Item itemHelmetThaumiumRobeDyed;
   public static Item itemChestThaumiumRobeDyed;
   public static Item itemLegsThaumiumRobeDyed;
   
   public static Item itemBootsThaumiumTraveller;
   public static Item itemBootsVoidTraveller;
   
   public static Item itemHelmetCultistPaladin;
   
   public static Item itemHelmetCultistArcher;
   public static Item itemChestCultistArcher;
   public static Item itemLegsCultistArcher;
   
   public static Item itemHelmetCultistArcherDyed;
   public static Item itemChestCultistArcherDyed;
   public static Item itemLegsCultistArcherDyed;
   
   public static Item itemFabricResource;
   
   public static Item itemHelmetSunKnight;
   public static Item itemChestSunKnight;
   
   


   public static void registerItems() {
	   
      GameRegistry.registerItem(itemHelmetCultistRobeDyed, "CultistRobeHelm");
      GameRegistry.registerItem(itemChestCultistRobeDyed, "CultistRobeChest");
      GameRegistry.registerItem(itemLegsCultistRobeDyed, "CultistRobeLegs");
      
      GameRegistry.registerItem(itemHelmetFortressDyed, "FortressHelm");
      GameRegistry.registerItem(itemChestFortressDyed, "FortressChest");
      GameRegistry.registerItem(itemLegsFortressDyed, "FortressLegs");
      
      GameRegistry.registerItem(itemHelmetCultistLeaderDyed, "CultistLeaderHelm");
      GameRegistry.registerItem(itemChestCultistLeaderDyed, "CultistLeaderChest");
      GameRegistry.registerItem(itemLegsCultistLeaderDyed, "CultistLeaderLegs");
      
      GameRegistry.registerItem(itemHelmetCultistKnightDyed, "CultistPlateHelm");
      GameRegistry.registerItem(itemChestCultistKnightDyed, "CultistPlateChest");
      GameRegistry.registerItem(itemLegsCultistKnightDyed, "CultistPlateLegs");
      
      GameRegistry.registerItem(itemHelmetInhabitedPlate, "InhabitedPlateHelm");
      GameRegistry.registerItem(itemChestInhabitedPlate, "InhabitedPlateChest");
      GameRegistry.registerItem(itemLegsInhabitedPlate, "InhabitedPlateLegs");
      
      GameRegistry.registerItem(itemHelmetIronFortress, "IronFortressHelm");
      GameRegistry.registerItem(itemChestIronFortress, "IronFortressChest");
      GameRegistry.registerItem(itemLegsIronFortress, "IronFortressLegs");
      
      GameRegistry.registerItem(itemHelmetCultistRanger, "CultistRangerHelm");
      GameRegistry.registerItem(itemChestCultistRanger, "CultistRangerChest");
      GameRegistry.registerItem(itemLegsCultistRanger, "CultistRangerLegs");
      
      GameRegistry.registerItem(itemHelmetCultistRangerDyed, "CultistRangerHelmDyed");
      GameRegistry.registerItem(itemChestCultistRangerDyed, "CultistRangerChestDyed");
      GameRegistry.registerItem(itemLegsCultistRangerDyed, "CultistRangerLegsDyed");
      
      GameRegistry.registerItem(itemHelmetVoidRobeDyed, "VoidRobeHelm");
      GameRegistry.registerItem(itemChestVoidRobeDyed, "VoidRobeChest");
      GameRegistry.registerItem(itemLegsVoidRobeDyed, "VoidRobeLegs");
      
      GameRegistry.registerItem(itemHelmetThaumiumRobeDyed, "ThaumiumRobeHelm");
      GameRegistry.registerItem(itemChestThaumiumRobeDyed, "ThaumiumRobeChest");
      GameRegistry.registerItem(itemLegsThaumiumRobeDyed, "ThaumiumRobeLegs");
      
      GameRegistry.registerItem(itemBootsThaumiumTraveller, "BootsThaumiumTraveller");
      GameRegistry.registerItem(itemBootsVoidTraveller, "BootsVoidTraveller");
      
      GameRegistry.registerItem(itemHelmetCultistArcher, "CultistArcherHelm");
      GameRegistry.registerItem(itemChestCultistArcher, "CultistArcherChest");
      GameRegistry.registerItem(itemLegsCultistArcher, "CultistArcherLegs");
      
      GameRegistry.registerItem(itemHelmetCultistPaladin, "CultistPaladinHelm");
      
      GameRegistry.registerItem(itemHelmetCultistArcherDyed, "CultistArcherHelmDyed");
      GameRegistry.registerItem(itemChestCultistArcherDyed, "CultistArcherChestDyed");
      GameRegistry.registerItem(itemLegsCultistArcherDyed, "CultistArcherLegsDyed");
      
      
      GameRegistry.registerItem(itemFabricResource, "itemFabricResource");
      
      GameRegistry.registerItem(itemHelmetSunKnight, "SunKnightHelm");
      GameRegistry.registerItem(itemChestSunKnight, "SunKnightChest");
      
      
   }

   public static void defineItems() {
	   
	   itemHelmetCultistRobeDyed = (new CultistRobesDyed(RobesArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistRobeDyed = (new CultistRobesDyed(RobesArmor, 4, 1)).setUnlocalizedName("itemChestCultistRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistRobeDyed = (new CultistRobesDyed(RobesArmor, 4, 2)).setUnlocalizedName("itemLegsCultistRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
       //itemBootsCultist = (new CultistRobes(RobesArmor, CultistBootsID, 3)).setUnlocalizedName("CultistBoots").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetFortressDyed = (new ThaumiumFortressDyed(FortressArmor, 4, 0)).setUnlocalizedName("itemHelmetFortressDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestFortressDyed = (new ThaumiumFortressDyed(FortressArmor, 4, 1)).setUnlocalizedName("itemChestFortressDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsFortressDyed = (new ThaumiumFortressDyed(FortressArmor, 4, 2)).setUnlocalizedName("itemLegsFortressDyed").setCreativeTab(ThaumicDyes.tabTD);
      
	   itemHelmetCultistLeaderDyed = (new CultistPraetorDyed(PraetorArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistLeaderDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistLeaderDyed = (new CultistPraetorDyed(PraetorArmor, 4, 1)).setUnlocalizedName("itemChestCultistLeaderDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistLeaderDyed = (new CultistPraetorDyed(PraetorArmor, 4, 2)).setUnlocalizedName("itemLegsCultistLeaderDyed").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetCultistKnightDyed = (new CultistKnightDyed(KnightArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistKnightDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistKnightDyed = (new CultistKnightDyed(KnightArmor, 4, 1)).setUnlocalizedName("itemChestCultistKnightDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistKnightDyed = (new CultistKnightDyed(KnightArmor, 4, 2)).setUnlocalizedName("itemLegsCultistKnightDyed").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetInhabitedPlate = (new InhabitedKnightArmor(ArmorMaterial.IRON, 4, 0)).setUnlocalizedName("itemHelmetInhabitedPlate").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestInhabitedPlate = (new InhabitedKnightArmor(ArmorMaterial.IRON, 4, 1)).setUnlocalizedName("itemChestInhabitedPlate").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsInhabitedPlate = (new InhabitedKnightArmor(ArmorMaterial.IRON, 4, 2)).setUnlocalizedName("itemLegsInhabitedPlate").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetIronFortress = (new IronFortressArmor(IronFortressArmor, 4, 0)).setUnlocalizedName("itemHelmetIronFortress").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestIronFortress = (new IronFortressArmor(IronFortressArmor, 4, 1)).setUnlocalizedName("itemChestIronFortress").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsIronFortress = (new IronFortressArmor(IronFortressArmor, 4, 2)).setUnlocalizedName("itemLegsIronFortress").setCreativeTab(ThaumicDyes.tabTD);
      
	   itemHelmetCultistRanger = (new CultistRanger(ArmorMaterial.IRON, 4, 0)).setUnlocalizedName("itemHelmetCultistRanger").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistRanger = (new CultistRanger(ArmorMaterial.IRON, 4, 1)).setUnlocalizedName("itemChestCultistRanger").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistRanger = (new CultistRanger(ArmorMaterial.IRON, 4, 2)).setUnlocalizedName("itemLegsCultistRanger").setCreativeTab(ThaumicDyes.tabTD);
      
	   itemHelmetCultistRangerDyed = (new CultistRangerDyed(RobesArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistRangerDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistRangerDyed = (new CultistRangerDyed(RobesArmor, 4, 1)).setUnlocalizedName("itemChestCultistRangerDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistRangerDyed = (new CultistRangerDyed(RobesArmor, 4, 2)).setUnlocalizedName("itemLegsCultistRangerDyed").setCreativeTab(ThaumicDyes.tabTD);
      
	   itemHelmetVoidRobeDyed = (new VoidRobeDyed(ThaumcraftApi.armorMatVoid, 4, 0)).setUnlocalizedName("itemHelmetVoidRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestVoidRobeDyed = (new VoidRobeDyed(ThaumcraftApi.armorMatVoid, 4, 1)).setUnlocalizedName("itemChestVoidRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsVoidRobeDyed = (new VoidRobeDyed(ThaumcraftApi.armorMatVoid, 4, 2)).setUnlocalizedName("itemLegsVoidRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
       //boot
	   itemBootsVoidTraveller = (new VoidBoots(ThaumcraftApi.armorMatVoid, 4, 3)).setUnlocalizedName("itemBootsVoidTraveller").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetThaumiumRobeDyed = (new ThaumiumRobeDyed(ThaumcraftApi.armorMatThaumium, 4, 0)).setUnlocalizedName("itemHelmetThaumiumRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestThaumiumRobeDyed = (new ThaumiumRobeDyed(ThaumcraftApi.armorMatThaumium, 4, 1)).setUnlocalizedName("itemChestThaumiumRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsThaumiumRobeDyed = (new ThaumiumRobeDyed(ThaumcraftApi.armorMatThaumium, 4, 2)).setUnlocalizedName("itemLegsThaumiumRobeDyed").setCreativeTab(ThaumicDyes.tabTD);
       //boot
	   itemBootsThaumiumTraveller = (new ThaumiumBoots(ThaumcraftApi.armorMatThaumium, 4, 3)).setUnlocalizedName("itemBootsThaumiumTraveller").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetCultistPaladin = (new CultistPaladin(PraetorArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistPaladin").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetCultistArcher = (new CultistArcher(ArmorMaterial.IRON, 4, 0)).setUnlocalizedName("itemHelmetCultistArcher").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistArcher = (new CultistArcher(ArmorMaterial.IRON, 4, 1)).setUnlocalizedName("itemChestCultistArcher").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistArcher = (new CultistArcher(ArmorMaterial.IRON, 4, 2)).setUnlocalizedName("itemLegsCultistArcher").setCreativeTab(ThaumicDyes.tabTD);
	   
	   itemHelmetCultistArcherDyed = (new CultistArcherDyed(KnightArmor, 4, 0)).setUnlocalizedName("itemHelmetCultistArcherDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestCultistArcherDyed = (new CultistArcherDyed(KnightArmor, 4, 1)).setUnlocalizedName("itemChestCultistArcherDyed").setCreativeTab(ThaumicDyes.tabTD);
	   itemLegsCultistArcherDyed = (new CultistArcherDyed(KnightArmor, 4, 2)).setUnlocalizedName("itemLegsCultistArcherDyed").setCreativeTab(ThaumicDyes.tabTD);
	   
	   	   
	   itemFabricResource = (new ItemFabricResource()).setUnlocalizedName("itemFabricResource").setCreativeTab(ThaumicDyes.tabTD);
	   
	   
	   itemHelmetSunKnight = (new SunKnight(ArmorMaterial.IRON, 4, 0)).setUnlocalizedName("itemHelmetSunKnight").setCreativeTab(ThaumicDyes.tabTD);
	   itemChestSunKnight = (new SunKnight(ArmorMaterial.IRON, 4, 1)).setUnlocalizedName("itemChestSunKnight").setCreativeTab(ThaumicDyes.tabTD);
   }
   
   public static void addAspects() {
	   
   }

   public static void registerToolMaterial() {
      RobesArmor = EnumHelper.addArmorMaterial("TD_ROBE", 15, new int[]{2, 6, 5, 1}, 15);
      KnightArmor = EnumHelper.addArmorMaterial("TD_KNIGHT", 20, new int[]{2, 6, 5, 1}, 12); 
      PraetorArmor = EnumHelper.addArmorMaterial("TD_PRAE", 45, new int[]{3, 7, 6, 1}, 30);
      FortressArmor = EnumHelper.addArmorMaterial("TD_FORT", 45, new int[]{3, 7, 6, 1}, 30);
      IronFortressArmor = EnumHelper.addArmorMaterial("TD_IRONFORT", 25, new int[]{2, 6, 5, 2}, 12);
      
   }
}

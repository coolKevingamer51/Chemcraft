package chemcraft.items;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public enum ChemcraftElementalItems {
    
    elementalhydrogen(1000, "Elementalhydrogen", "Elemental Hydrogen"),
    elementalhelium(1001, "Elementalhelium", "Elemental Helium"),
    elementallithium(1002, "Elementallithium", "Elemental Lithium"),
    elementalberyllium(1003,"Elementalberyllium", "Elemental Beryllium"),
    elementalboron(1004, "Elementalboron", "Elemental Boron"),
    elementalcarbon(1005, "Elementalcarbon","Elemental Carbon"),
    elementalnitrogen(1006, "Elementalnitrogen","Elemental Nitrogen"),
    elementaloxygen(1007, "Elementaloxygen","Elemental Oxygen"),
    elementalfluorine(1008, "Elementalfluorine", "Elemental Fluorine"),
    elementalneon(1009, "Elementalneon", "Elemental Neon"),
    elementalsodium(1010, "Elementalsodium", "Elemental Sodium"),
    elementalmagnesium(1011, "Elementalmagnesium", "Elemental Magnesium"),
    elementalaluminum(1012, "Elementalaluminum", "Elemental Aluminum"),
    elementalsilicon(1013, "Elementalsilicon", "Elemental Silicon"),
    elementalphosphorus(1014, "Elementalphosphorus", "Elemental Phosphorus"),
    elementalsulfur(1015, "Elementalsulfur", "Elemental Sulfur"),
    elementalchlorine(1016, "Elementalchlorine", "Elemental Chlorine"),
    elementalargon(1017, "Elementalargon", "Elemental Argon"),
    elementalpotassium(1018, "Elementalpotassium", "Elemental Potassium"),
    elementalcalcium(1019, "Elementalcalcium", "Elemental Calcium"),
    elementalscandium(1020, "Elementalscandium", "Elemental Scandium"),
    elementaltitanium(1021, "Elementaltitanium", "Elemental Titanium"),
    elementalvanadium(1022, "Elementalvanadium", "Elemental Vanadium"),
    elementalchromium(1023, "Elementalchromium", "Elemental Chromium"),
    elementalmanganese(1024, "Elementalmanganese", "Elemental Manganese"),
    elementaliron(1025, "Elementaliron", "Elemental Iron"),
    elementalcobalt(1026, "Elementalcobalt", "Elemental Cobalt"),
    elementalnickel(1027, "Elementalnickel", "Elemental Nickel"),
    elementalcopper(1028, "Elementalcopper", "Elemental Copper"),
    elementalzinc(1029, "Elementalzinc", "Elemental Zinc"),
    elementalgallium(1030, "Elementalgallium", "Elemental Gallium"),
    elementalgermanium(1031, "Elementalgermanium", "Elemental Germanium"),
    elementalarsenic(1032, "Elementalarsenic", "Elemental Arsenic"),
    elementalselenium(1033, "Elementalselenium", "Elemental Selenium"),
    elementalbromine(1034, "Elementalbromine", "Elemental Bromine"),
    elementalkrypton(1035, "Elementalkrypton", "Elemental Krypton"),
    elementalrubidium(1036, "Elementalrubidium", "Elemental Rubidium"),
    elementalstrontium(1037, "Elementalstrontium", "Elemental Strontium"),
    elementalyttrium(1038, "Elementalyttrium", "Elemental Yttrium"),
    elementalzirconium(1039, "Elementalzirconium", "Elemental Zirconium"),
    elementalniobium(1040, "Elementalniobium", "Elemental Niobium"),
    elementalmolybdenum(1041, "Elementalmolybdenum", "Elemental Molybdenum"),
    elementaltechnetium(1042, "Elementaltechnetium", "Elemental Technetium"),
    elementalruthenium(1043, "Elementalruthenium", "Elemental Ruthenium"),
    elementalrhodium(1044, "Elementalrhodium", "Elemental Rhodium"),
    elementalpalladium(1045, "Elementalpalladium", "Elemental Palladium"),
    elementalsilver(1046, "Elementalsilver", "Elemental Silver"),
    elementalcadmium(1047, "Elementalcadmium", "Elemental Cadmium"),
    elementalindium(1048, "Elementalindium", "Elemental Indium"),
    elementaltin(1049, "Elementaltin", "Elemental Tin"),
    elementalantimony(1050, "Elementalantimony", "Elemental Antimony"),
    elementaltellurium(1051, "Elementaltellurium", "Elemental Tellurium"),
    elementaliodine(1052, "Elementaliodine", "Elemental Iodine"),
    elementalxenon(1053, "Elementalxenon", "Elemental Xenon");
    
    public final int id;
    public final String name;
    public final String descname;
    public ChemcraftItemElement item;
    
    ChemcraftElementalItems(int parid, String parname, String pardescname){
        id = parid;
        name = parname;
        descname = pardescname;
        
    }
    
    public ChemcraftItemElement testcall(Configuration cfg, int id){
        
        int itemId = cfg.getItem(name, id).getInt(id);
        item = new ChemcraftItemElement(itemId, this);
        GameRegistry.registerItem(item, name);
        return item;
          
    }
    public static void buildItems(Configuration cfg, int defaultId)
    {
        for (ChemcraftElementalItems type : values())
        {
            type.testcall(cfg, defaultId++);
        }
    }
    

    
    

}

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
    elementalxenon(1053, "Elementalxenon", "Elemental Xenon"),
    elementalcesium(1054, "Elementalcesium","Elemental Cesium"),
    elementalbarium(1055, "Elementalbarium","Elemental Barium"),
    elementallanthanum(1056, "Elementallanthanum","Elemental Lanthanum"),
    elementalcerium(1057, "Elementalcerium","Elemental Cerium"),
    elementalpraseodymium(1058, "Elementalpraseodymium","Elemental Praseodymium"),
    elementalneodymium(1059, "Elementalneodymium","Elemental Neodymium"),
    elementalpromethium(1060, "Elementalpromethium","Elemental Promethium"),
    elementalsamarium(1061, "Elementalsamarium","Elemental Samarium"),
    elementaleuropium(1062, "Elementaleuropium","Elemental Europium"),
    elementalgadolinium(1063, "Elementalgadolinium","Elemental Gadolinium"),
    elementalterbium(1064, "Elementalterbium","Elemental Terbium"),
    elementaldysprosium(1065, "Elementaldysprosium","Elemental Dysprosium"),
    elementalholmium(1066, "Elementalholmium","Elemental Holmium"),
    elementalerbium(1067, "Elementalerbium","Elemental Erbium"),
    elementalthulium(1068, "Elementalthulium","Elemental Thulium"),
    elementalytterbium(1069, "Elementalytterbium","Elemental Ytterbium"),
    elementallutetium(1070, "Elementallutetium","Elemental Lutetium"),
    elementalhafnium(1071, "Elementalhafnium","Elemental Hafnium"),
    elementaltantalum(1072, "Elementaltantalum","Elemental Tantalum"),
    elementaltungsten(1073, "Elementaltungsten","Elemental Tungsten"),
    elementalrhenium(1074, "Elementalrhenium","Elemental Rhenium"),
    elementalosmium(1075, "Elementalosmium","Elemental Osmium"),
    elementaliridium(1076, "Elementaliridium","Elemental Iridium"),
    elementalplatinum(1077, "Elementalplatinum","Elemental Platinum"),
    elementalgold(1078, "Elementalgold","Elemental Gold"),
    elementalmercury(1079, "Elementalmercury","Elemental Mercury"),
    elementalthallium(1080, "Elementalthallium","Elemental Thallium"),
    elementallead(1081, "Elementallead","Elemental Lead"),
    elementalbismuth(1082, "Elementalbismuth","Elemental Bismuth"),
    elementalpolonium(1083, "Elementalpolonium","Elemental Polonium"),
    elementalastatine(1084, "Elementalastatine","Elemental Astatine"),
    elementalradon(1085, "Elementalradon","Elemental Radon"),
    elementalfrancium(1086, "Elementalfrancium","Elemental Francium"),
    elementalradium(1087, "Elementalradium","Elemental Radium"),
    elementalactinium(1088, "Elementalactinium","Elemental Actinium"),
    elementalthorium(1089, "Elementalthorium","Elemental Thorium"),
    elementalprotactinium(1090, "Elementalprotactinium","Elemental Protactinium"),
    elementaluranium(1091, "Elementaluranium","Elemental Uranium"),
    elementalneptunium(1092, "Elementalneptunium","Elemental Neptunium"),
    elementalplutonium(1093, "Elementalplutonium","Elemental Plutonium"),
    elementalamericium(1094, "Elementalamericium","Elemental Americium"),
    elementalcurium(1095, "Elementalcurium","Elemental Curium"),
    elementalberkelium(1096, "Elementalberkelium","Elemental Berkelium"),
    elementalcalifornium(1097, "Elementalcalifornium","Elemental Californium"),
    elementaleinsteinium(1098, "Elementaleinsteinium","Elemental Einsteinium"),
    elementalfermium(1099, "Elementalfermium","Elemental Fermium"),
    elementalmendelevium(1100, "Elementalmendelevium","Elemental Mendelevium"),
    elementalnobelium(1101, "Elementalnobelium","Elemental Nobelium"),
    elementallawrencium(1102, "Elementallawrencium","Elemental Lawrencium"),
    elementalrutherfordium(1103, "Elementalrutherfordium","Elemental Rutherfordium"),
    elementaldubnium(1104, "Elementaldubnium","Elemental Dubnium"),
    elementalseaborgium(1105, "Elementalseaborgium","Elemental Seaborgium"),
    elementalbohrium(1106, "Elementalbohrium","Elemental Bohrium"),
    elementalhassium(1107, "Elementalhassium","Elemental Hassium"),
    elementalmeitnerium(1108, "Elementalmeitnerium","Elemental Meitnerium"),
    elementaldarmstadtium(1109, "Elementaldarmstadtium","Elemental Darmstadtium"),
    elementalroentgenium(1110, "Elementalroentgenium","Elemental Roentgenium"),
    elementalcopernicium(1111, "Elementalcopernicium","Elemental Copernicium"),
    elementalununtrium(1112, "Elementalununtrium","Elemental Ununtrium"),
    elementalflerovium(1113, "Elementalflerovium","Elemental Flerovium"),
    elementalununpentium(1114, "Elementalununpentium","Elemental Ununpentium"),
    elementallivermorium(1115, "Elementallivermorium","Elemental Livermorium"),
    elementalununseptium(1116, "Elementalununseptium","Elemental Ununseptium"),
    elementalununoctium(1117, "Elementalununoctium","Elemental Ununoctium");
    
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

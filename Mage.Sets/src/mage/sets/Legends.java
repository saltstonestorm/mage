/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public final class Legends extends ExpansionSet {

    private static final Legends instance = new Legends();

    public static Legends getInstance() {
        return instance;
    }

    private Legends() {
        super("Legends", "LEG", ExpansionSet.buildDate(1994, 6, 1), SetType.EXPANSION);
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abomination", 87, Rarity.UNCOMMON, mage.cards.a.Abomination.class));
        cards.add(new SetCardInfo("Acid Rain", 44, Rarity.RARE, mage.cards.a.AcidRain.class));
        cards.add(new SetCardInfo("Active Volcano", 130, Rarity.COMMON, mage.cards.a.ActiveVolcano.class));
        cards.add(new SetCardInfo("Adun Oakenshield", 216, Rarity.RARE, mage.cards.a.AdunOakenshield.class));
        cards.add(new SetCardInfo("Aerathi Berserker", 131, Rarity.UNCOMMON, mage.cards.a.AerathiBerserker.class));
        cards.add(new SetCardInfo("Aisling Leprechaun", 173, Rarity.COMMON, mage.cards.a.AislingLeprechaun.class));
        cards.add(new SetCardInfo("Akron Legionnaire", 1, Rarity.RARE, mage.cards.a.AkronLegionnaire.class));
        cards.add(new SetCardInfo("Al-abara's Carpet", 271, Rarity.RARE, mage.cards.a.AlAbarasCarpet.class));
        cards.add(new SetCardInfo("Alabaster Potion", 2, Rarity.COMMON, mage.cards.a.AlabasterPotion.class));
        cards.add(new SetCardInfo("Alchor's Tomb", 272, Rarity.RARE, mage.cards.a.AlchorsTomb.class));
        cards.add(new SetCardInfo("All Hallow's Eve", 88, Rarity.RARE, mage.cards.a.AllHallowsEve.class));
        cards.add(new SetCardInfo("Amrou Kithkin", 3, Rarity.COMMON, mage.cards.a.AmrouKithkin.class));
        cards.add(new SetCardInfo("Angelic Voices", 4, Rarity.RARE, mage.cards.a.AngelicVoices.class));
        cards.add(new SetCardInfo("Angus Mackenzie", 217, Rarity.RARE, mage.cards.a.AngusMackenzie.class));
        cards.add(new SetCardInfo("Anti-Magic Aura", 45, Rarity.COMMON, mage.cards.a.AntiMagicAura.class));
        cards.add(new SetCardInfo("Arboria", 174, Rarity.UNCOMMON, mage.cards.a.Arboria.class));
        cards.add(new SetCardInfo("Arcades Sabboth", 218, Rarity.RARE, mage.cards.a.ArcadesSabboth.class));
        cards.add(new SetCardInfo("Arena of the Ancients", 273, Rarity.RARE, mage.cards.a.ArenaOfTheAncients.class));
        cards.add(new SetCardInfo("Avoid Fate", 175, Rarity.COMMON, mage.cards.a.AvoidFate.class));
        cards.add(new SetCardInfo("Axelrod Gunnarson", 219, Rarity.RARE, mage.cards.a.AxelrodGunnarson.class));
        cards.add(new SetCardInfo("Ayesha Tanaka", 220, Rarity.RARE, mage.cards.a.AyeshaTanaka.class));
        cards.add(new SetCardInfo("Azure Drake", 46, Rarity.UNCOMMON, mage.cards.a.AzureDrake.class));
        cards.add(new SetCardInfo("Backfire", 47, Rarity.UNCOMMON, mage.cards.b.Backfire.class));
        cards.add(new SetCardInfo("Barbary Apes", 176, Rarity.COMMON, mage.cards.b.BarbaryApes.class));
        cards.add(new SetCardInfo("Barktooth Warbeard", 221, Rarity.UNCOMMON, mage.cards.b.BarktoothWarbeard.class));
        cards.add(new SetCardInfo("Bartel Runeaxe", 222, Rarity.RARE, mage.cards.b.BartelRuneaxe.class));
        cards.add(new SetCardInfo("Beasts of Bogardan", 133, Rarity.UNCOMMON, mage.cards.b.BeastsOfBogardan.class));
        cards.add(new SetCardInfo("Black Mana Battery", 274, Rarity.UNCOMMON, mage.cards.b.BlackManaBattery.class));
        cards.add(new SetCardInfo("Blight", 89, Rarity.UNCOMMON, mage.cards.b.Blight.class));
        cards.add(new SetCardInfo("Blood Lust", 135, Rarity.UNCOMMON, mage.cards.b.BloodLust.class));
        cards.add(new SetCardInfo("Blue Mana Battery", 275, Rarity.UNCOMMON, mage.cards.b.BlueManaBattery.class));
        cards.add(new SetCardInfo("Boomerang", 48, Rarity.COMMON, mage.cards.b.Boomerang.class));
        cards.add(new SetCardInfo("Boris Devilboon", 223, Rarity.RARE, mage.cards.b.BorisDevilboon.class));
        cards.add(new SetCardInfo("Carrion Ants", 90, Rarity.RARE, mage.cards.c.CarrionAnts.class));
        cards.add(new SetCardInfo("Cat Warriors", 177, Rarity.COMMON, mage.cards.c.CatWarriors.class));
        cards.add(new SetCardInfo("Caverns of Despair", 136, Rarity.RARE, mage.cards.c.CavernsOfDespair.class));
        cards.add(new SetCardInfo("Chain Lightning", 137, Rarity.COMMON, mage.cards.c.ChainLightning.class));
        cards.add(new SetCardInfo("Chains of Mephistopheles", 91, Rarity.RARE, mage.cards.c.ChainsOfMephistopheles.class));
        cards.add(new SetCardInfo("Chromium", 224, Rarity.RARE, mage.cards.c.Chromium.class));
        cards.add(new SetCardInfo("Cleanse", 5, Rarity.RARE, mage.cards.c.Cleanse.class));
        cards.add(new SetCardInfo("Clergy of the Holy Nimbus", 6, Rarity.COMMON, mage.cards.c.ClergyOfTheHolyNimbus.class));
        cards.add(new SetCardInfo("Concordant Crossroads", 179, Rarity.RARE, mage.cards.c.ConcordantCrossroads.class));
        cards.add(new SetCardInfo("Cosmic Horror", 92, Rarity.RARE, mage.cards.c.CosmicHorror.class));
        cards.add(new SetCardInfo("Craw Giant", 180, Rarity.UNCOMMON, mage.cards.c.CrawGiant.class));
        cards.add(new SetCardInfo("Crevasse", 138, Rarity.UNCOMMON, mage.cards.c.Crevasse.class));
        cards.add(new SetCardInfo("Crimson Kobolds", 139, Rarity.COMMON, mage.cards.c.CrimsonKobolds.class));
        cards.add(new SetCardInfo("Crimson Manticore", 140, Rarity.RARE, mage.cards.c.CrimsonManticore.class));
        cards.add(new SetCardInfo("Crookshank Kobolds", 141, Rarity.COMMON, mage.cards.c.CrookshankKobolds.class));
        cards.add(new SetCardInfo("Cyclopean Mummy", 93, Rarity.COMMON, mage.cards.c.CyclopeanMummy.class));
        cards.add(new SetCardInfo("D'Avenant Archer", 7, Rarity.COMMON, mage.cards.d.DAvenantArcher.class));
        cards.add(new SetCardInfo("Dakkon Blackblade", 225, Rarity.RARE, mage.cards.d.DakkonBlackblade.class));
        cards.add(new SetCardInfo("Darkness", 94, Rarity.COMMON, mage.cards.d.Darkness.class));
        cards.add(new SetCardInfo("Deadfall", 181, Rarity.UNCOMMON, mage.cards.d.Deadfall.class));
        cards.add(new SetCardInfo("Demonic Torment", 95, Rarity.UNCOMMON, mage.cards.d.DemonicTorment.class));
        cards.add(new SetCardInfo("Devouring Deep", 50, Rarity.COMMON, mage.cards.d.DevouringDeep.class));
        cards.add(new SetCardInfo("Disharmony", 142, Rarity.RARE, mage.cards.d.Disharmony.class));
        cards.add(new SetCardInfo("Divine Intervention", 8, Rarity.RARE, mage.cards.d.DivineIntervention.class));
        cards.add(new SetCardInfo("Divine Offering", 9, Rarity.COMMON, mage.cards.d.DivineOffering.class));
        cards.add(new SetCardInfo("Divine Transformation", 10, Rarity.RARE, mage.cards.d.DivineTransformation.class));
        cards.add(new SetCardInfo("Dream Coat", 51, Rarity.UNCOMMON, mage.cards.d.DreamCoat.class));
        cards.add(new SetCardInfo("Durkwood Boars", 182, Rarity.COMMON, mage.cards.d.DurkwoodBoars.class));
        cards.add(new SetCardInfo("Dwarven Song", 143, Rarity.UNCOMMON, mage.cards.d.DwarvenSong.class));
        cards.add(new SetCardInfo("Elder Land Wurm", 11, Rarity.RARE, mage.cards.e.ElderLandWurm.class));
        cards.add(new SetCardInfo("Elven Riders", 183, Rarity.RARE, mage.cards.e.ElvenRiders.class));
        cards.add(new SetCardInfo("Emerald Dragonfly", 184, Rarity.COMMON, mage.cards.e.EmeraldDragonfly.class));
        cards.add(new SetCardInfo("Energy Tap", 54, Rarity.COMMON, mage.cards.e.EnergyTap.class));
        cards.add(new SetCardInfo("Eternal Warrior", 144, Rarity.UNCOMMON, mage.cards.e.EternalWarrior.class));
        cards.add(new SetCardInfo("Eureka", 185, Rarity.RARE, mage.cards.e.Eureka.class));
        cards.add(new SetCardInfo("Evil Eye of Orms-by-Gore", 96, Rarity.UNCOMMON, mage.cards.e.EvilEyeOfOrmsByGore.class));
        cards.add(new SetCardInfo("Fallen Angel", 97, Rarity.UNCOMMON, mage.cards.f.FallenAngel.class));
        cards.add(new SetCardInfo("Field of Dreams", 55, Rarity.RARE, mage.cards.f.FieldOfDreams.class));
        cards.add(new SetCardInfo("Fire Sprites", 186, Rarity.COMMON, mage.cards.f.FireSprites.class));
        cards.add(new SetCardInfo("Flash Counter", 56, Rarity.COMMON, mage.cards.f.FlashCounter.class));
        cards.add(new SetCardInfo("Flash Flood", 57, Rarity.COMMON, mage.cards.f.FlashFlood.class));
        cards.add(new SetCardInfo("Floral Spuzzem", 187, Rarity.UNCOMMON, mage.cards.f.FloralSpuzzem.class));
        cards.add(new SetCardInfo("Force Spike", 58, Rarity.COMMON, mage.cards.f.ForceSpike.class));
        cards.add(new SetCardInfo("Fortified Area", 14, Rarity.UNCOMMON, mage.cards.f.FortifiedArea.class));
        cards.add(new SetCardInfo("Frost Giant", 148, Rarity.UNCOMMON, mage.cards.f.FrostGiant.class));
        cards.add(new SetCardInfo("Gabriel Angelfire", 226, Rarity.RARE, mage.cards.g.GabrielAngelfire.class));
        cards.add(new SetCardInfo("Gaseous Form", 59, Rarity.COMMON, mage.cards.g.GaseousForm.class));
        cards.add(new SetCardInfo("Gauntlets of Chaos", 278, Rarity.RARE, mage.cards.g.GauntletsOfChaos.class));
        cards.add(new SetCardInfo("Ghosts of the Damned", 98, Rarity.COMMON, mage.cards.g.GhostsOfTheDamned.class));
        cards.add(new SetCardInfo("Giant Strength", 149, Rarity.COMMON, mage.cards.g.GiantStrength.class));
        cards.add(new SetCardInfo("Giant Turtle", 188, Rarity.COMMON, mage.cards.g.GiantTurtle.class));
        cards.add(new SetCardInfo("Glyph of Destruction", 150, Rarity.COMMON, mage.cards.g.GlyphOfDestruction.class));
        cards.add(new SetCardInfo("Glyph of Doom", 100, Rarity.COMMON, mage.cards.g.GlyphOfDoom.class));
        cards.add(new SetCardInfo("Glyph of Life", 15, Rarity.COMMON, mage.cards.g.GlyphOfLife.class));
        cards.add(new SetCardInfo("Gosta Dirk", 227, Rarity.RARE, mage.cards.g.GostaDirk.class));
        cards.add(new SetCardInfo("Gravity Sphere", 151, Rarity.RARE, mage.cards.g.GravitySphere.class));
        cards.add(new SetCardInfo("Great Defender", 16, Rarity.UNCOMMON, mage.cards.g.GreatDefender.class));
        cards.add(new SetCardInfo("Great Wall", 17, Rarity.UNCOMMON, mage.cards.g.GreatWall.class));
        cards.add(new SetCardInfo("Greater Realm of Preservation", 18, Rarity.UNCOMMON, mage.cards.g.GreaterRealmOfPreservation.class));
        cards.add(new SetCardInfo("Greed", 101, Rarity.RARE, mage.cards.g.Greed.class));
        cards.add(new SetCardInfo("Green Mana Battery", 279, Rarity.UNCOMMON, mage.cards.g.GreenManaBattery.class));
        cards.add(new SetCardInfo("Gwendlyn Di Corci", 228, Rarity.RARE, mage.cards.g.GwendlynDiCorci.class));
        cards.add(new SetCardInfo("Halfdane", 229, Rarity.RARE, mage.cards.h.Halfdane.class));
        cards.add(new SetCardInfo("Hammerheim", 302, Rarity.UNCOMMON, mage.cards.h.Hammerheim.class));
        cards.add(new SetCardInfo("Hazezon Tamar", 230, Rarity.RARE, mage.cards.h.HazezonTamar.class));
        cards.add(new SetCardInfo("Headless Horseman", 102, Rarity.COMMON, mage.cards.h.HeadlessHorseman.class));
        cards.add(new SetCardInfo("Heaven's Gate", 19, Rarity.UNCOMMON, mage.cards.h.HeavensGate.class));
        cards.add(new SetCardInfo("Hell Swarm", 103, Rarity.COMMON, mage.cards.h.HellSwarm.class));
        cards.add(new SetCardInfo("Hell's Caretaker", 104, Rarity.RARE, mage.cards.h.HellsCaretaker.class));
        cards.add(new SetCardInfo("Hellfire", 105, Rarity.RARE, mage.cards.h.Hellfire.class));
        cards.add(new SetCardInfo("Holy Day", 20, Rarity.COMMON, mage.cards.h.HolyDay.class));
        cards.add(new SetCardInfo("Horn of Deafening", 280, Rarity.RARE, mage.cards.h.HornOfDeafening.class));
        cards.add(new SetCardInfo("Hornet Cobra", 190, Rarity.COMMON, mage.cards.h.HornetCobra.class));
        cards.add(new SetCardInfo("Horror of Horrors", 106, Rarity.UNCOMMON, mage.cards.h.HorrorOfHorrors.class));
        cards.add(new SetCardInfo("Hunding Gjornersen", 231, Rarity.UNCOMMON, mage.cards.h.HundingGjornersen.class));
        cards.add(new SetCardInfo("Hyperion Blacksmith", 152, Rarity.UNCOMMON, mage.cards.h.HyperionBlacksmith.class));
        cards.add(new SetCardInfo("Immolation", 153, Rarity.COMMON, mage.cards.i.Immolation.class));
        cards.add(new SetCardInfo("Imprison", 107, Rarity.RARE, mage.cards.i.Imprison.class));
        cards.add(new SetCardInfo("In the Eye of Chaos", 61, Rarity.RARE, mage.cards.i.InTheEyeOfChaos.class));
        cards.add(new SetCardInfo("Indestructible Aura", 21, Rarity.COMMON, mage.cards.i.IndestructibleAura.class));
        cards.add(new SetCardInfo("Infernal Medusa", 108, Rarity.UNCOMMON, mage.cards.i.InfernalMedusa.class));
        cards.add(new SetCardInfo("Invoke Prejudice", 62, Rarity.RARE, mage.cards.i.InvokePrejudice.class));
        cards.add(new SetCardInfo("Ivory Guardians", 23, Rarity.UNCOMMON, mage.cards.i.IvoryGuardians.class));
        cards.add(new SetCardInfo("Jacques le Vert", 232, Rarity.RARE, mage.cards.j.JacquesLeVert.class));
        cards.add(new SetCardInfo("Jasmine Boreal", 233, Rarity.UNCOMMON, mage.cards.j.JasmineBoreal.class));
        cards.add(new SetCardInfo("Jedit Ojanen", 234, Rarity.UNCOMMON, mage.cards.j.JeditOjanen.class));
        cards.add(new SetCardInfo("Jerrard of the Closed Fist", 235, Rarity.UNCOMMON, mage.cards.j.JerrardOfTheClosedFist.class));
        cards.add(new SetCardInfo("Johan", 236, Rarity.RARE, mage.cards.j.Johan.class));
        cards.add(new SetCardInfo("Jovial Evil", 109, Rarity.RARE, mage.cards.j.JovialEvil.class));
        cards.add(new SetCardInfo("Juxtapose", 63, Rarity.RARE, mage.cards.j.Juxtapose.class));
        cards.add(new SetCardInfo("Karakas", 303, Rarity.UNCOMMON, mage.cards.k.Karakas.class));
        cards.add(new SetCardInfo("Kasimir the Lone Wolf", 237, Rarity.UNCOMMON, mage.cards.k.KasimirTheLoneWolf.class));
        cards.add(new SetCardInfo("Keepers of the Faith", 24, Rarity.COMMON, mage.cards.k.KeepersOfTheFaith.class));
        cards.add(new SetCardInfo("Kei Takahashi", 238, Rarity.RARE, mage.cards.k.KeiTakahashi.class));
        cards.add(new SetCardInfo("Killer Bees", 192, Rarity.RARE, mage.cards.k.KillerBees.class));
        cards.add(new SetCardInfo("Kismet", 25, Rarity.UNCOMMON, mage.cards.k.Kismet.class));
        cards.add(new SetCardInfo("Kobold Drill Sergeant", 154, Rarity.UNCOMMON, mage.cards.k.KoboldDrillSergeant.class));
        cards.add(new SetCardInfo("Kobold Overlord", 155, Rarity.RARE, mage.cards.k.KoboldOverlord.class));
        cards.add(new SetCardInfo("Kobold Taskmaster", 156, Rarity.UNCOMMON, mage.cards.k.KoboldTaskmaster.class));
        cards.add(new SetCardInfo("Kobolds of Kher Keep", 157, Rarity.COMMON, mage.cards.k.KoboldsOfKherKeep.class));
        cards.add(new SetCardInfo("Lady Caleria", 239, Rarity.RARE, mage.cards.l.LadyCaleria.class));
        cards.add(new SetCardInfo("Lady Evangela", 240, Rarity.RARE, mage.cards.l.LadyEvangela.class));
        cards.add(new SetCardInfo("Lady Orca", 241, Rarity.UNCOMMON, mage.cards.l.LadyOrca.class));
        cards.add(new SetCardInfo("Land Equilibrium", 64, Rarity.RARE, mage.cards.l.LandEquilibrium.class));
        cards.add(new SetCardInfo("Land Tax", 26, Rarity.UNCOMMON, mage.cards.l.LandTax.class));
        cards.add(new SetCardInfo("Land's Edge", 158, Rarity.RARE, mage.cards.l.LandsEdge.class));
        cards.add(new SetCardInfo("Life Chisel", 283, Rarity.UNCOMMON, mage.cards.l.LifeChisel.class));
        cards.add(new SetCardInfo("Lifeblood", 27, Rarity.RARE, mage.cards.l.Lifeblood.class));
        cards.add(new SetCardInfo("Living Plane", 193, Rarity.RARE, mage.cards.l.LivingPlane.class));
        cards.add(new SetCardInfo("Livonya Silone", 242, Rarity.RARE, mage.cards.l.LivonyaSilone.class));
        cards.add(new SetCardInfo("Lord Magnus", 243, Rarity.UNCOMMON, mage.cards.l.LordMagnus.class));
        cards.add(new SetCardInfo("Lost Soul", 111, Rarity.COMMON, mage.cards.l.LostSoul.class));
        cards.add(new SetCardInfo("Mana Drain", 65, Rarity.UNCOMMON, mage.cards.m.ManaDrain.class));
        cards.add(new SetCardInfo("Mana Matrix", 285, Rarity.RARE, mage.cards.m.ManaMatrix.class));
        cards.add(new SetCardInfo("Marhault Elsdragon", 244, Rarity.UNCOMMON, mage.cards.m.MarhaultElsdragon.class));
        cards.add(new SetCardInfo("Mirror Universe", 287, Rarity.RARE, mage.cards.m.MirrorUniverse.class));
        cards.add(new SetCardInfo("Moat", 28, Rarity.RARE, mage.cards.m.Moat.class));
        cards.add(new SetCardInfo("Mold Demon", 112, Rarity.RARE, mage.cards.m.MoldDemon.class));
        cards.add(new SetCardInfo("Moss Monster", 195, Rarity.COMMON, mage.cards.m.MossMonster.class));
        cards.add(new SetCardInfo("Mountain Yeti", 159, Rarity.UNCOMMON, mage.cards.m.MountainYeti.class));
        cards.add(new SetCardInfo("Nebuchadnezzar", 245, Rarity.RARE, mage.cards.n.Nebuchadnezzar.class));
        cards.add(new SetCardInfo("Nether Void", 113, Rarity.RARE, mage.cards.n.NetherVoid.class));
        cards.add(new SetCardInfo("Nicol Bolas", 246, Rarity.RARE, mage.cards.n.NicolBolas.class));
        cards.add(new SetCardInfo("Nova Pentacle", 289, Rarity.RARE, mage.cards.n.NovaPentacle.class));
        cards.add(new SetCardInfo("Osai Vultures", 29, Rarity.COMMON, mage.cards.o.OsaiVultures.class));
        cards.add(new SetCardInfo("Palladia-Mors", 247, Rarity.RARE, mage.cards.p.PalladiaMors.class));
        cards.add(new SetCardInfo("Part Water", 66, Rarity.UNCOMMON, mage.cards.p.PartWater.class));
        cards.add(new SetCardInfo("Pavel Maliki", 248, Rarity.UNCOMMON, mage.cards.p.PavelMaliki.class));
        cards.add(new SetCardInfo("Pendelhaven", 305, Rarity.UNCOMMON, mage.cards.p.Pendelhaven.class));
        cards.add(new SetCardInfo("Petra Sphinx", 30, Rarity.RARE, mage.cards.p.PetraSphinx.class));
        cards.add(new SetCardInfo("Pit Scorpion", 114, Rarity.COMMON, mage.cards.p.PitScorpion.class));
        cards.add(new SetCardInfo("Pixie Queen", 196, Rarity.RARE, mage.cards.p.PixieQueen.class));
        cards.add(new SetCardInfo("Planar Gate", 290, Rarity.RARE, mage.cards.p.PlanarGate.class));
        cards.add(new SetCardInfo("Pradesh Gypsies", 197, Rarity.UNCOMMON, mage.cards.p.PradeshGypsies.class));
        cards.add(new SetCardInfo("Presence of the Master", 31, Rarity.UNCOMMON, mage.cards.p.PresenceOfTheMaster.class));
        cards.add(new SetCardInfo("Primordial Ooze", 160, Rarity.UNCOMMON, mage.cards.p.PrimordialOoze.class));
        cards.add(new SetCardInfo("Princess Lucrezia", 249, Rarity.UNCOMMON, mage.cards.p.PrincessLucrezia.class));
        cards.add(new SetCardInfo("Psionic Entity", 67, Rarity.RARE, mage.cards.p.PsionicEntity.class));
        cards.add(new SetCardInfo("Psychic Purge", 68, Rarity.COMMON, mage.cards.p.PsychicPurge.class));
        cards.add(new SetCardInfo("Pyrotechnics", 161, Rarity.COMMON, mage.cards.p.Pyrotechnics.class));
        cards.add(new SetCardInfo("Quagmire", 115, Rarity.UNCOMMON, mage.cards.q.Quagmire.class));
        cards.add(new SetCardInfo("Rabid Wombat", 198, Rarity.UNCOMMON, mage.cards.r.RabidWombat.class));
        cards.add(new SetCardInfo("Radjan Spirit", 199, Rarity.UNCOMMON, mage.cards.r.RadjanSpirit.class));
        cards.add(new SetCardInfo("Raging Bull", 163, Rarity.COMMON, mage.cards.r.RagingBull.class));
        cards.add(new SetCardInfo("Ragnar", 250, Rarity.RARE, mage.cards.r.Ragnar.class));
        cards.add(new SetCardInfo("Ramirez DePietro", 251, Rarity.UNCOMMON, mage.cards.r.RamirezDePietro.class));
        cards.add(new SetCardInfo("Ramses Overdark", 252, Rarity.RARE, mage.cards.r.RamsesOverdark.class));
        cards.add(new SetCardInfo("Rasputin Dreamweaver", 253, Rarity.RARE, mage.cards.r.RasputinDreamweaver.class));
        cards.add(new SetCardInfo("Recall", 70, Rarity.RARE, mage.cards.r.Recall.class));
        cards.add(new SetCardInfo("Red Mana Battery", 291, Rarity.UNCOMMON, mage.cards.r.RedManaBattery.class));
        cards.add(new SetCardInfo("Reincarnation", 201, Rarity.UNCOMMON, mage.cards.r.Reincarnation.class));
        cards.add(new SetCardInfo("Relic Barrier", 292, Rarity.UNCOMMON, mage.cards.r.RelicBarrier.class));
        cards.add(new SetCardInfo("Relic Bind", 71, Rarity.UNCOMMON, mage.cards.r.RelicBind.class));
        cards.add(new SetCardInfo("Remove Enchantments", 33, Rarity.COMMON, mage.cards.r.RemoveEnchantments.class));
        cards.add(new SetCardInfo("Remove Soul", 72, Rarity.COMMON, mage.cards.r.RemoveSoul.class));
        cards.add(new SetCardInfo("Reset", 73, Rarity.UNCOMMON, mage.cards.r.Reset.class));
        cards.add(new SetCardInfo("Revelation", 202, Rarity.RARE, mage.cards.r.Revelation.class));
        cards.add(new SetCardInfo("Righteous Avengers", 34, Rarity.UNCOMMON, mage.cards.r.RighteousAvengers.class));
        cards.add(new SetCardInfo("Ring of Immortals", 293, Rarity.RARE, mage.cards.r.RingOfImmortals.class));
        cards.add(new SetCardInfo("Riven Turnbull", 254, Rarity.UNCOMMON, mage.cards.r.RivenTurnbull.class));
        cards.add(new SetCardInfo("Rohgahh of Kher Keep", 255, Rarity.RARE, mage.cards.r.RohgahhOfKherKeep.class));
        cards.add(new SetCardInfo("Rubinia Soulsinger", 256, Rarity.RARE, mage.cards.r.RubiniaSoulsinger.class));
        cards.add(new SetCardInfo("Rust", 203, Rarity.COMMON, mage.cards.r.Rust.class));
        cards.add(new SetCardInfo("Sea Kings' Blessing", 75, Rarity.UNCOMMON, mage.cards.s.SeaKingsBlessing.class));
        cards.add(new SetCardInfo("Seeker", 35, Rarity.UNCOMMON, mage.cards.s.Seeker.class));
        cards.add(new SetCardInfo("Segovian Leviathan", 76, Rarity.UNCOMMON, mage.cards.s.SegovianLeviathan.class));
        cards.add(new SetCardInfo("Sentinel", 294, Rarity.RARE, mage.cards.s.Sentinel.class));
        cards.add(new SetCardInfo("Serpent Generator", 295, Rarity.RARE, mage.cards.s.SerpentGenerator.class));
        cards.add(new SetCardInfo("Shield Wall", 36, Rarity.UNCOMMON, mage.cards.s.ShieldWall.class));
        cards.add(new SetCardInfo("Shimian Night Stalker", 116, Rarity.UNCOMMON, mage.cards.s.ShimianNightStalker.class));
        cards.add(new SetCardInfo("Sir Shandlar of Eberyn", 257, Rarity.UNCOMMON, mage.cards.s.SirShandlarOfEberyn.class));
        cards.add(new SetCardInfo("Sivitri Scarzam", 258, Rarity.UNCOMMON, mage.cards.s.SivitriScarzam.class));
        cards.add(new SetCardInfo("Sol'kanar the Swamp King", 259, Rarity.RARE, mage.cards.s.SolkanarTheSwampKing.class));
        cards.add(new SetCardInfo("Spectral Cloak", 78, Rarity.UNCOMMON, mage.cards.s.SpectralCloak.class));
        cards.add(new SetCardInfo("Spinal Villain", 164, Rarity.RARE, mage.cards.s.SpinalVillain.class));
        cards.add(new SetCardInfo("Spirit Link", 37, Rarity.UNCOMMON, mage.cards.s.SpiritLink.class));
        cards.add(new SetCardInfo("Spirit Shackle", 117, Rarity.COMMON, mage.cards.s.SpiritShackle.class));
        cards.add(new SetCardInfo("Spiritual Sanctuary", 38, Rarity.RARE, mage.cards.s.SpiritualSanctuary.class));
        cards.add(new SetCardInfo("Stangg", 260, Rarity.RARE, mage.cards.s.Stangg.class));
        cards.add(new SetCardInfo("Storm Seeker", 205, Rarity.UNCOMMON, mage.cards.s.StormSeeker.class));
        cards.add(new SetCardInfo("Storm World", 165, Rarity.RARE, mage.cards.s.StormWorld.class));
        cards.add(new SetCardInfo("Sunastian Falconer", 261, Rarity.UNCOMMON, mage.cards.s.SunastianFalconer.class));
        cards.add(new SetCardInfo("Sword of the Ages", 296, Rarity.RARE, mage.cards.s.SwordOfTheAges.class));
        cards.add(new SetCardInfo("Sylvan Library", 207, Rarity.UNCOMMON, mage.cards.s.SylvanLibrary.class));
        cards.add(new SetCardInfo("Sylvan Paradise", 208, Rarity.UNCOMMON, mage.cards.s.SylvanParadise.class));
        cards.add(new SetCardInfo("Syphon Soul", 118, Rarity.COMMON, mage.cards.s.SyphonSoul.class));
        cards.add(new SetCardInfo("Telekinesis", 79, Rarity.RARE, mage.cards.t.Telekinesis.class));
        cards.add(new SetCardInfo("Teleport", 80, Rarity.RARE, mage.cards.t.Teleport.class));
        cards.add(new SetCardInfo("Tetsuo Umezawa", 262, Rarity.RARE, mage.cards.t.TetsuoUmezawa.class));
        cards.add(new SetCardInfo("The Abyss", 120, Rarity.RARE, mage.cards.t.TheAbyss.class));
        cards.add(new SetCardInfo("The Brute", 167, Rarity.COMMON, mage.cards.t.TheBrute.class));
        cards.add(new SetCardInfo("The Lady of the Mountain", 263, Rarity.UNCOMMON, mage.cards.t.TheLadyOfTheMountain.class));
        cards.add(new SetCardInfo("The Tabernacle at Pendrell Vale", 307, Rarity.RARE, mage.cards.t.TheTabernacleAtPendrellVale.class));
        cards.add(new SetCardInfo("The Wretched", 121, Rarity.RARE, mage.cards.t.TheWretched.class));
        cards.add(new SetCardInfo("Thunder Spirit", 39, Rarity.RARE, mage.cards.t.ThunderSpirit.class));
        cards.add(new SetCardInfo("Time Elemental", 81, Rarity.RARE, mage.cards.t.TimeElemental.class));
        cards.add(new SetCardInfo("Tobias Andrion", 264, Rarity.UNCOMMON, mage.cards.t.TobiasAndrion.class));
        cards.add(new SetCardInfo("Tor Wauki", 265, Rarity.UNCOMMON, mage.cards.t.TorWauki.class));
        cards.add(new SetCardInfo("Torsten Von Ursus", 266, Rarity.UNCOMMON, mage.cards.t.TorstenVonUrsus.class));
        cards.add(new SetCardInfo("Touch of Darkness", 122, Rarity.UNCOMMON, mage.cards.t.TouchOfDarkness.class));
        cards.add(new SetCardInfo("Transmutation", 123, Rarity.COMMON, mage.cards.t.Transmutation.class));
        cards.add(new SetCardInfo("Triassic Egg", 297, Rarity.RARE, mage.cards.t.TriassicEgg.class));
        cards.add(new SetCardInfo("Tuknir Deathlock", 267, Rarity.RARE, mage.cards.t.TuknirDeathlock.class));
        cards.add(new SetCardInfo("Tundra Wolves", 40, Rarity.COMMON, mage.cards.t.TundraWolves.class));
        cards.add(new SetCardInfo("Typhoon", 209, Rarity.RARE, mage.cards.t.Typhoon.class));
        cards.add(new SetCardInfo("Undertow", 82, Rarity.UNCOMMON, mage.cards.u.Undertow.class));
        cards.add(new SetCardInfo("Underworld Dreams", 124, Rarity.UNCOMMON, mage.cards.u.UnderworldDreams.class));
        cards.add(new SetCardInfo("Untamed Wilds", 210, Rarity.UNCOMMON, mage.cards.u.UntamedWilds.class));
        cards.add(new SetCardInfo("Ur-Drago", 268, Rarity.RARE, mage.cards.u.UrDrago.class));
        cards.add(new SetCardInfo("Urborg", 310, Rarity.UNCOMMON, mage.cards.u.Urborg.class));
        cards.add(new SetCardInfo("Vaevictis Asmadi", 269, Rarity.RARE, mage.cards.v.VaevictisAsmadi.class));
        cards.add(new SetCardInfo("Vampire Bats", 125, Rarity.COMMON, mage.cards.v.VampireBats.class));
        cards.add(new SetCardInfo("Visions", 41, Rarity.UNCOMMON, mage.cards.v.Visions.class));
        cards.add(new SetCardInfo("Walking Dead", 126, Rarity.COMMON, mage.cards.w.WalkingDead.class));
        cards.add(new SetCardInfo("Wall of Caltrops", 42, Rarity.COMMON, mage.cards.w.WallOfCaltrops.class));
        cards.add(new SetCardInfo("Wall of Dust", 168, Rarity.UNCOMMON, mage.cards.w.WallOfDust.class));
        cards.add(new SetCardInfo("Wall of Earth", 169, Rarity.COMMON, mage.cards.w.WallOfEarth.class));
        cards.add(new SetCardInfo("Wall of Heat", 170, Rarity.COMMON, mage.cards.w.WallOfHeat.class));
        cards.add(new SetCardInfo("Wall of Light", 43, Rarity.UNCOMMON, mage.cards.w.WallOfLight.class));
        cards.add(new SetCardInfo("Wall of Opposition", 171, Rarity.RARE, mage.cards.w.WallOfOpposition.class));
        cards.add(new SetCardInfo("Wall of Putrid Flesh", 127, Rarity.UNCOMMON, mage.cards.w.WallOfPutridFlesh.class));
        cards.add(new SetCardInfo("Wall of Vapor", 84, Rarity.COMMON, mage.cards.w.WallOfVapor.class));
        cards.add(new SetCardInfo("Wall of Wonder", 85, Rarity.UNCOMMON, mage.cards.w.WallOfWonder.class));
        cards.add(new SetCardInfo("Whirling Dervish", 211, Rarity.UNCOMMON, mage.cards.w.WhirlingDervish.class));
        cards.add(new SetCardInfo("White Mana Battery", 299, Rarity.UNCOMMON, mage.cards.w.WhiteManaBattery.class));
        cards.add(new SetCardInfo("Willow Satyr", 212, Rarity.RARE, mage.cards.w.WillowSatyr.class));
        cards.add(new SetCardInfo("Winds of Change", 172, Rarity.UNCOMMON, mage.cards.w.WindsOfChange.class));
        cards.add(new SetCardInfo("Winter Blast", 213, Rarity.RARE, mage.cards.w.WinterBlast.class));
        cards.add(new SetCardInfo("Wolverine Pack", 214, Rarity.COMMON, mage.cards.w.WolverinePack.class));
        cards.add(new SetCardInfo("Wood Elemental", 215, Rarity.RARE, mage.cards.w.WoodElemental.class));
        cards.add(new SetCardInfo("Xira Arien", 270, Rarity.RARE, mage.cards.x.XiraArien.class));
        cards.add(new SetCardInfo("Zephyr Falcon", 86, Rarity.COMMON, mage.cards.z.ZephyrFalcon.class));
    }
}

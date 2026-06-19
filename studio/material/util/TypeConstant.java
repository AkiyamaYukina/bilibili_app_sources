package com.bilibili.studio.material.util;

import com.bapis.bilibili.ad.v1.AdCardDto;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/util/TypeConstant.class */
public enum TypeConstant {
    Subtitles(0),
    Fonts(1),
    Filters(2),
    Bgms(3),
    ShootStickers(5),
    VideoupStickers(7),
    Trans(8),
    Cooperates(9),
    Themes(10),
    Makeups(11),
    Surgerys(12),
    Videofxs(13),
    Rhythms(14),
    BSticker(15),
    Particle(16),
    Effects(17),
    Backgrounds(18),
    Videos(19),
    Sounds(20),
    Flower(21),
    BcutHotWord(22),
    VUPerBG(25),
    CoverTemplates(26),
    TTS(27),
    Openings(28),
    Vupers(30),
    InstructBarrageTemplate(31),
    LovelySticker(32),
    LovelyStickerHotWord(33),
    QuickBeauty(34),
    MakeupBeauty(35),
    Textmotion(36),
    BcutAudioHotWord(37),
    VideoTemplatesFull(38),
    VideoTemplatesStart(39),
    HotTopicEffects(40),
    CoverTemplate(41),
    InteractiveBarrage(42),
    VideoHotWord(43),
    TextToVideoTemplate(44),
    OpeningTemplate(45),
    VideoTemplate(46),
    VupTemplate(47),
    RemixTemplate(49),
    GameTemplate(50),
    ProcessBar(51),
    VtuberProperty(52),
    VtuberBackground(53),
    DubbingTool(55),
    HotTopicVideos(60),
    ASR(61),
    WebCoverTemplate(62),
    CameraFilter(63),
    CameraEffect(64),
    VideoWave(66),
    VirtualBg(67),
    VirtualProp(68),
    VoiceChange(71),
    SmartTemplate(72),
    VideoGenMaterialUse(79),
    CustomizeCover(80),
    CLOUDDRAFT(81),
    UNRECOGNIZED(-1);

    public static final int ASR_VALUE = 61;
    public static final int BSticker_VALUE = 15;
    public static final int Backgrounds_VALUE = 18;
    public static final int BcutAudioHotWord_VALUE = 37;
    public static final int BcutHotWord_VALUE = 22;
    public static final int Bgms_VALUE = 3;
    public static final int CameraEffect_VALUE = 64;
    public static final int CameraFilter_VALUE = 63;
    public static final int Cooperates_VALUE = 9;
    public static final int CoverTemplate_VALUE = 41;
    public static final int CoverTemplates_VALUE = 26;
    public static final int CustomizeSticker_VALUE = 80;
    public static final int DigitalHuman_VALUE = 81;
    public static final int DubbingTool_VALUE = 55;
    public static final int Effects_VALUE = 17;
    public static final int Filters_VALUE = 2;
    public static final int Flower_VALUE = 21;
    public static final int Fonts_VALUE = 1;
    public static final int GameTemplate_VALUE = 50;
    public static final int HotTopicEffects_VALUE = 40;
    public static final int HotTopicVideos_VALUE = 60;
    public static final int InstructBarrageTemplate_VALUE = 31;
    public static final int InteractiveBarrage_VALUE = 42;
    public static final int LovelyStickerHotWord_VALUE = 33;
    public static final int LovelySticker_VALUE = 32;
    public static final int MakeupBeauty_VALUE = 35;
    public static final int Makeups_VALUE = 11;
    public static final int OpeningTemplate_VALUE = 45;
    public static final int Openings_VALUE = 28;
    public static final int Particle_VALUE = 16;
    public static final int ProcessBar_VALUE = 51;
    public static final int QuickBeauty_VALUE = 34;
    public static final int RemixTemplate_VALUE = 49;
    public static final int Rhythms_VALUE = 14;
    public static final int ShootStickers_VALUE = 5;
    public static final int SmartTemplate_VALUE = 72;
    public static final int Sounds_VALUE = 20;
    public static final int Subtitles_VALUE = 0;
    public static final int Surgerys_VALUE = 12;
    public static final int TTS_VALUE = 27;
    public static final int TextToVideoTemplate_VALUE = 44;
    public static final int Textmotion_VALUE = 36;
    public static final int Themes_VALUE = 10;
    public static final int Trans_VALUE = 8;
    public static final int VUPerBG_VALUE = 25;
    public static final int VideoGenMaterialUse_VALUE = 79;
    public static final int VideoHotWord_VALUE = 43;
    public static final int VideoTemplate_VALUE = 46;
    public static final int VideoTemplatesFull_VALUE = 38;
    public static final int VideoTemplatesStart_VALUE = 39;
    public static final int VideoWave_VALUE = 66;
    public static final int Videofxs_VALUE = 13;
    public static final int Videos_VALUE = 19;
    public static final int VideoupStickers_VALUE = 7;
    public static final int VirtualBg_VALUE = 67;
    public static final int VirtualProp_VALUE = 68;
    public static final int VoiceChange_VALUE = 71;
    public static final int VoiceClone_Value = 82;
    public static final int VtuberBackground_VALUE = 53;
    public static final int VtuberProperty_VALUE = 52;
    public static final int VupTemplate_VALUE = 47;
    public static final int Vupers_VALUE = 30;
    public static final int WebCoverTemplate_VALUE = 62;
    private final int value;

    TypeConstant(int i7) {
        this.value = i7;
    }

    public static TypeConstant forNumber(int i7) {
        switch (i7) {
            case 0:
                return Subtitles;
            case 1:
                return Fonts;
            case 2:
                return Filters;
            case 3:
                return Bgms;
            case 4:
            case 6:
            case 23:
            case 24:
            case 29:
            case 48:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 65:
            case 69:
            case 70:
            case 73:
            case 74:
            case 75:
            case 76:
            case AdCardDto.STORY_ANCHOR_FIELD_NUMBER /* 77 */:
            case AdCardDto.JUMP_INTERACTION_STYLE_FIELD_NUMBER /* 78 */:
            default:
                return null;
            case 5:
                return ShootStickers;
            case 7:
                return VideoupStickers;
            case 8:
                return Trans;
            case 9:
                return Cooperates;
            case 10:
                return Themes;
            case 11:
                return Makeups;
            case 12:
                return Surgerys;
            case 13:
                return Videofxs;
            case 14:
                return Rhythms;
            case 15:
                return BSticker;
            case 16:
                return Particle;
            case 17:
                return Effects;
            case 18:
                return Backgrounds;
            case 19:
                return Videos;
            case 20:
                return Sounds;
            case 21:
                return Flower;
            case 22:
                return BcutHotWord;
            case 25:
                return VUPerBG;
            case 26:
                return CoverTemplates;
            case 27:
                return TTS;
            case 28:
                return Openings;
            case 30:
                return Vupers;
            case 31:
                return InstructBarrageTemplate;
            case 32:
                return LovelySticker;
            case 33:
                return LovelyStickerHotWord;
            case 34:
                return QuickBeauty;
            case 35:
                return MakeupBeauty;
            case 36:
                return Textmotion;
            case 37:
                return BcutAudioHotWord;
            case 38:
                return VideoTemplatesFull;
            case 39:
                return VideoTemplatesStart;
            case 40:
                return HotTopicEffects;
            case 41:
                return CoverTemplate;
            case 42:
                return InteractiveBarrage;
            case 43:
                return VideoHotWord;
            case 44:
                return TextToVideoTemplate;
            case 45:
                return OpeningTemplate;
            case 46:
                return VideoTemplate;
            case 47:
                return VupTemplate;
            case 49:
                return RemixTemplate;
            case 50:
                return GameTemplate;
            case 51:
                return ProcessBar;
            case 52:
                return VtuberProperty;
            case 53:
                return VtuberBackground;
            case 55:
                return DubbingTool;
            case 60:
                return HotTopicVideos;
            case 61:
                return ASR;
            case 62:
                return WebCoverTemplate;
            case 63:
                return CameraFilter;
            case 64:
                return CameraEffect;
            case 66:
                return VideoWave;
            case 67:
                return VirtualBg;
            case 68:
                return VirtualProp;
            case 71:
                return VoiceChange;
            case 72:
                return SmartTemplate;
            case 79:
                return VideoGenMaterialUse;
            case 80:
                return CustomizeCover;
        }
    }

    @Deprecated
    public static TypeConstant valueOf(int i7) {
        return forNumber(i7);
    }
}

package com.bilibili.live.streaming.gl;

import androidx.constraintlayout.motion.widget.p;
import androidx.fragment.app.A;
import androidx.room.B;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/Shaders.class */
public final class Shaders {

    @NotNull
    private final String FullscreenVertexShader;

    @NotNull
    private final String RgbToP010YUVFragmentShader;

    @NotNull
    private final String RgbToSrgbNV12FragmentShader;

    @NotNull
    private final String alphamp4_frag_shader;

    @NotNull
    private final String common_frag_shader;

    @NotNull
    private final String common_functions;

    @NotNull
    private final String common_vertex_shader;

    @NotNull
    private final String doubletex_frag_shader;

    @NotNull
    private final String eetf_bt2390;

    @NotNull
    private final Primaries in_primaries;

    @NotNull
    private final Transfer in_transfer;

    @NotNull
    private final String mConvCode;

    @NotNull
    private final String oestex_frag_shader;

    @NotNull
    private final EETF out_eetf;

    @NotNull
    private final Primaries out_primaries;

    @NotNull
    private final Transfer out_transfer;

    @NotNull
    private final String p010_frag_shader;

    @NotNull
    private final String primaries_bt2020;

    @NotNull
    private final String primaries_bt601_ntsc;

    @NotNull
    private final String primaries_p3;

    @NotNull
    private final String solid_color_frag_shader;

    @NotNull
    private final String transfer_bt709;

    @NotNull
    private final String transfer_hlg;

    @NotNull
    private final String transfer_srgb;

    @NotNull
    private final String transfer_st2084;

    @NotNull
    private final String yuv_frag_shader;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/Shaders$EETF.class */
    public static final class EETF {
        private static final EnumEntries $ENTRIES;
        private static final EETF[] $VALUES;
        public static final EETF NO_CONV = new EETF("NO_CONV", 0);
        public static final EETF BT2390 = new EETF("BT2390", 1);

        private static final /* synthetic */ EETF[] $values() {
            return new EETF[]{NO_CONV, BT2390};
        }

        static {
            EETF[] eetfArr$values = $values();
            $VALUES = eetfArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eetfArr$values);
        }

        private EETF(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<EETF> getEntries() {
            return $ENTRIES;
        }

        public static EETF valueOf(String str) {
            return (EETF) Enum.valueOf(EETF.class, str);
        }

        public static EETF[] values() {
            return (EETF[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/Shaders$Primaries.class */
    public static final class Primaries {
        private static final EnumEntries $ENTRIES;
        private static final Primaries[] $VALUES;
        public static final Primaries NO_CONV = new Primaries("NO_CONV", 0);
        public static final Primaries BT601_NTSC = new Primaries("BT601_NTSC", 1);
        public static final Primaries SRGB = new Primaries("SRGB", 2);
        public static final Primaries DISPLAY_P3 = new Primaries("DISPLAY_P3", 3);
        public static final Primaries BT2020 = new Primaries("BT2020", 4);

        private static final /* synthetic */ Primaries[] $values() {
            return new Primaries[]{NO_CONV, BT601_NTSC, SRGB, DISPLAY_P3, BT2020};
        }

        static {
            Primaries[] primariesArr$values = $values();
            $VALUES = primariesArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(primariesArr$values);
        }

        private Primaries(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Primaries> getEntries() {
            return $ENTRIES;
        }

        public static Primaries valueOf(String str) {
            return (Primaries) Enum.valueOf(Primaries.class, str);
        }

        public static Primaries[] values() {
            return (Primaries[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/Shaders$Transfer.class */
    public static final class Transfer {
        private static final EnumEntries $ENTRIES;
        private static final Transfer[] $VALUES;
        public static final Transfer NO_CONV = new Transfer("NO_CONV", 0);
        public static final Transfer SRGB = new Transfer("SRGB", 1);
        public static final Transfer BT709 = new Transfer("BT709", 2);
        public static final Transfer HLG = new Transfer("HLG", 3);
        public static final Transfer PQ = new Transfer("PQ", 4);

        private static final /* synthetic */ Transfer[] $values() {
            return new Transfer[]{NO_CONV, SRGB, BT709, HLG, PQ};
        }

        static {
            Transfer[] transferArr$values = $values();
            $VALUES = transferArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(transferArr$values);
        }

        private Transfer(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Transfer> getEntries() {
            return $ENTRIES;
        }

        public static Transfer valueOf(String str) {
            return (Transfer) Enum.valueOf(Transfer.class, str);
        }

        public static Transfer[] values() {
            return (Transfer[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/Shaders$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Primaries.values().length];
            try {
                iArr[Primaries.NO_CONV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Primaries.SRGB.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Primaries.BT601_NTSC.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Primaries.BT2020.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[Primaries.DISPLAY_P3.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Transfer.values().length];
            try {
                iArr2[Transfer.NO_CONV.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[Transfer.SRGB.ordinal()] = 2;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[Transfer.BT709.ordinal()] = 3;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[Transfer.HLG.ordinal()] = 4;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr2[Transfer.PQ.ordinal()] = 5;
            } catch (NoSuchFieldError e16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EETF.values().length];
            try {
                iArr3[EETF.NO_CONV.ordinal()] = 1;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr3[EETF.BT2390.ordinal()] = 2;
            } catch (NoSuchFieldError e18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public Shaders(@NotNull Transfer transfer, @NotNull Primaries primaries, @NotNull EETF eetf, @NotNull Primaries primaries2, @NotNull Transfer transfer2) throws NoWhenBranchMatchedException {
        this.in_transfer = transfer;
        this.in_primaries = primaries;
        this.out_eetf = eetf;
        this.out_primaries = primaries2;
        this.out_transfer = transfer2;
        String convFunc = getConvFunc(transfer, primaries, eetf, primaries2, transfer2);
        this.mConvCode = convFunc;
        this.transfer_srgb = "\nfloat srgb_linear_to_nonlinear_channel(float u)\n{\n    return (u <= 0.0031308) ? (12.92 * u) : ((1.055 * pow(u, 1. / 2.4)) - 0.055);\n}\n\n// 0~1 -> 0~1\nvec3 srgb_linear_to_nonlinear(vec3 v)\n{\n    return vec3(srgb_linear_to_nonlinear_channel(v.r), srgb_linear_to_nonlinear_channel(v.g), srgb_linear_to_nonlinear_channel(v.b));\n}\n\nfloat srgb_nonlinear_to_linear_channel(float u)\n{\n    return (u <= 0.04045) ? (u / 12.92) : pow((u + 0.055) / 1.055, 2.4);\n}\n\n// 0~1 -> 0~1\nvec3 srgb_nonlinear_to_linear(vec3 v)\n{\n    return vec3(srgb_nonlinear_to_linear_channel(v.r), srgb_nonlinear_to_linear_channel(v.g), srgb_nonlinear_to_linear_channel(v.b));\n}\n";
        this.transfer_bt709 = "\nfloat bt709_linear_to_nonlinear_channel(float u)\n{\n    return (u < 0.0018) ? (4.5 * u) : ((1.099 * pow(u, 0.45)) - 0.099);\n}\n\nvec3 bt709_linear_to_nonlinear(vec3 v)\n{\n    return vec3(bt709_linear_to_nonlinear_channel(v.r), bt709_linear_to_nonlinear_channel(v.g), bt709_linear_to_nonlinear_channel(v.b));\n}\n\nfloat bt709_nonlinear_to_linear_channel(float u)\n{\n    return (u <= 0.081) ? (u / 4.5) : pow((u + 0.099) / 1.099, 1.0 / 0.45);\n}\n\nvec3 bt709_nonlinear_to_linear(vec3 v)\n{\n    return vec3(bt709_nonlinear_to_linear_channel(v.r), bt709_nonlinear_to_linear_channel(v.g), bt709_nonlinear_to_linear_channel(v.b));\n}\n";
        this.transfer_st2084 = "\nfloat linear_to_st2084_c(float x)\n{\n    float c = pow(abs(x), 0.1593017578);\n    return pow((0.8359375 + 18.8515625 * c) / (1. + 18.6875 * c), 78.84375);\n}\n\nvec3 linear_to_st2084(vec3 rgb)\n{\n    return vec3(linear_to_st2084_c(rgb.r), linear_to_st2084_c(rgb.g), linear_to_st2084_c(rgb.b));\n}\n\nfloat st2084_to_linear_c(float u)\n{\n    float c = pow(abs(u), 1. / 78.84375);\n    return pow(abs(max(c - 0.8359375, 0.) / (18.8515625 - 18.6875 * c)), 1. / 0.1593017578);\n}\n\nvec3 st2084_to_linear(vec3 rgb)\n{\n    return vec3(st2084_to_linear_c(rgb.r), st2084_to_linear_c(rgb.g), st2084_to_linear_c(rgb.b));\n}\n\nfloat st2084_eotf_c(float x)\n{\n    return st2084_to_linear_c(x);\n}\n\nvec3 st2084_eotf(vec3 rgb)\n{\n    return st2084_to_linear(rgb);\n}\n\nfloat st2084_inv_eotf_c(float x)\n{\n    return linear_to_st2084_c(x);\n}\n\nvec3 st2084_inv_eotf(vec3 rgb)\n{\n    return linear_to_st2084(rgb);\n}\n\n";
        this.transfer_hlg = "\nfloat hlg_to_linear_c(float u)\n{\n    float ln2_i = 1. / log(2.);\n    float m = ln2_i / 0.17883277;\n    float a = -ln2_i * 0.55991073 / 0.17883277;\n    return (u <= 0.5) ? ((u * u) / 3.) : ((exp2(u * m + a) + 0.28466892) / 12.);\n}\n\n// 0~1 -> 0~1\n// float y = 1.2 + (Lw > 1000. ? (0.42 * log10(Lw / 1000.)) : 0);\n// exponent = y;\nvec3 hlg_to_linear(vec3 v, float exponent)\n{\n    // OETF-1\n    vec3 rgb = vec3(hlg_to_linear_c(v.r), hlg_to_linear_c(v.g), hlg_to_linear_c(v.b));\n\n    // OOTF\n    float Ys = dot(rgb, vec3(0.2627, 0.678, 0.0593));\n    rgb *= pow(Ys, exponent - 1.);\n    return rgb;\n}\n\n\nfloat linear_to_hlg_channel(float u)\n{\n\tfloat ln2_i = 1. / log(2.);\n\tfloat m = 0.17883277 / ln2_i;\n\treturn (u <= (1. / 12.)) ? sqrt(3. * u) : ((log2((12. * u) - 0.28466892) * m) + 0.55991073);\n}\n\nvec3 linear_to_hlg(vec3 rgb, float Lw, float sdrwhite)\n{\n\tif (Lw > 1000.)\n\t{\n\t\trgb = bt2390_maxRGB_tm(rgb * sdrwhite, Lw, 1000.0, 1.0);\n\t}\n    else\n    {\n        rgb = rgb * sdrwhite;    \n    }\n    rgb /= 1000.0;\n\n\tfloat Yd = dot(rgb, vec3(0.2627, 0.678, 0.0593));\n\n\t// pow(0., exponent) can lead to NaN, use smallest positive normal number\n\tYd = max(6.10352e-5, Yd);\n\n\trgb *= pow(Yd, -1. / 6.);\n\treturn vec3(linear_to_hlg_channel(rgb.r), linear_to_hlg_channel(rgb.g), linear_to_hlg_channel(rgb.b));\n}\n\n";
        this.eetf_bt2390 = "\nfloat bt2390_KS(float maxLum, float KS_offset)\n{\n    return (1. + KS_offset) * maxLum - KS_offset;\n}\n\nfloat bt2390_T(float A, float KS)\n{\n    return (A - KS) / (1. - KS);\n}\n\nfloat bt2390_P(float B, float KS, float maxLum)\n{\n    float TB = bt2390_T(B, KS);\n    float TB_sq = pow(TB, 2.);\n    float TB_cu = pow(TB, 3.);\n\n    float res = (2. * TB_cu - 3. * TB_sq + 1.) * KS +\n                (TB_cu - 2. * TB_sq + TB) * (1. - KS) +\n                (-2. * TB_cu + 3. * TB_sq) * maxLum;\n    return res;\n}\n\nfloat bt2390_cal_Lum(float L, float Lb, float Lw)\n{\n    return (st2084_inv_eotf_c(L) - st2084_inv_eotf_c(Lb)) /\n           (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb));\n}\n\nfloat bt2390_cal_E1(float E_in, float Lb, float Lw)\n{\n    float E1 = (E_in - st2084_inv_eotf_c(Lb)) / (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb));\n    return clamp(E1, 0.0, 1.0);\n}\n\nfloat bt2390_cal_E2(float E1, float KS, float maxLum)\n{\n    float E2 = 0.;\n    if (E1 < KS)\n    {\n        E2 = E1;\n    }\n    else\n    {\n        E2 = bt2390_P(E1, KS, maxLum);\n    }\n    return E2;\n}\n\nfloat bt2390_cal_E3(float E2, float minLum)\n{\n    float b = minLum;\n    return E2 + b * pow(1. - E2, 4.);\n}\n\nfloat bt2390_cal_E4(float E3, float Lb, float Lw)\n{\n    return st2084_eotf_c(E3 * (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb)) + st2084_inv_eotf_c(Lb));\n}\n\nfloat bt2390_eetf(float E_in, float Lb, float Lw, float Lmin,\n                  float Lmax, float KS_offset)\n{\n    Lb /= 10000.;\n    Lw /= 10000.;\n    Lmin /= 10000.;\n    Lmax /= 10000.;\n    float minLum = bt2390_cal_Lum(Lmin, Lb, Lw);\n    float maxLum = bt2390_cal_Lum(Lmax, Lb, Lw);\n    float E1 = bt2390_cal_E1(E_in, Lb, Lw);\n    float E2 = bt2390_cal_E2(E1, bt2390_KS(maxLum, KS_offset), maxLum);\n    float E3 = bt2390_cal_E3(E2, minLum);\n    float E4 = bt2390_cal_E4(E3, Lb, Lw);\n    clamp(E4, Lmin, Lmax);\n    return E4 * 10000.;\n}\n\n// 0 ~ 10000 -> 0 ~ 10000\n// KS_offset: 服务端用的1\nvec3 bt2390_maxRGB_tm(vec3 rgb, float Lw, float Lmax, float KS_offset)\n{\n    float maxRGB_o = max(max(rgb.r, rgb.g), rgb.b);\n    float maxRGB_e = st2084_inv_eotf_c(clamp(maxRGB_o, 0., 10000.) / 10000.);\n    float maxRGB_o_1 = bt2390_eetf(maxRGB_e, 0., Lw, 0., Lmax, KS_offset);\n\n    maxRGB_o = max(maxRGB_o, 6.10352e-5);\n    return rgb * (maxRGB_o_1 / maxRGB_o);\n}\n";
        this.primaries_bt2020 = "\nvec3 bt709_to_bt2020(vec3 v)\n{\n    float r = dot(v, vec3(0.62740389593469903, 0.32928303837788370, 0.043313065687417225));\n    float g = dot(v, vec3(0.069097289358232075, 0.91954039507545871, 0.011362315566309178));\n    float b = dot(v, vec3(0.016391438875150280, 0.088013307877225749, 0.89559525324762401));\n    return vec3(r, g, b);\n}\n\nvec3 bt2020_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(1.6604910021084345, -0.58764113878854951, -0.072849863319884883));\n    float g = dot(v, vec3(-0.12455047452159074, 1.1328998971259603, -0.0083494226043694768));\n    float b = dot(v, vec3(-0.018150763354905303, -0.10057889800800739, 1.1187296613629127));\n    return vec3(r, g, b);\n}\n";
        this.primaries_bt601_ntsc = "\nvec3 bt601_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(0.93954213944307008, 0.050181304575707734, 0.010276555981221736));\n    float g = dot(v, vec3(0.017772209406134849, 0.96579286543744325, 0.016434925156422107));\n    float b = dot(v, vec3(-0.0016215976109225476, -0.0043697458643167930, 1.0059913434752392));\n    return vec3(r, g, b);\n}\n\nvec3 bt709_to_bt601(vec3 v)\n{\n    float r = dot(v, vec3(1.0653789460402330, -0.055400810269059048, -0.0099781357711726804));\n    float g = dot(v, vec3(-0.019632533021540617, 1.0363630894972797, -0.016730556475739101));\n    float b = dot(v, vec3(0.0016320486098591325, 0.0044123694815820375, 0.99395558190855882));\n    return vec3(r, g, b);\n}\n";
        this.primaries_p3 = "\nvec3 bt709_to_display_p3(vec3 v)\n{\n    float r = dot(v, vec3(0.82246210575103760, 0.17753839424896240, 0.00000000000000000));\n    float g = dot(v, vec3(0.033194005268688202, 0.96680599473131180, 0.00000000000000000));\n    float b = dot(v, vec3(0.017082198956967353, 0.072397825286516189, 0.91051997575651646));\n    return vec3(r, g, b);\n}\n\nvec3 display_p3_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(1.2249406810031892, -0.22494066020724487, 0.00000000000000000));\n    float g = dot(v, vec3(-0.042056959944943115, 1.0420569181442261, 0.00000000000000000));\n    float b = dot(v, vec3(-0.019637568250775337, -0.078635981308460236, 1.0982745885848999));\n    return vec3(r, g, b);\n}\n";
        StringBuilder sbA = G0.b.a("\n", "\nfloat linear_to_st2084_c(float x)\n{\n    float c = pow(abs(x), 0.1593017578);\n    return pow((0.8359375 + 18.8515625 * c) / (1. + 18.6875 * c), 78.84375);\n}\n\nvec3 linear_to_st2084(vec3 rgb)\n{\n    return vec3(linear_to_st2084_c(rgb.r), linear_to_st2084_c(rgb.g), linear_to_st2084_c(rgb.b));\n}\n\nfloat st2084_to_linear_c(float u)\n{\n    float c = pow(abs(u), 1. / 78.84375);\n    return pow(abs(max(c - 0.8359375, 0.) / (18.8515625 - 18.6875 * c)), 1. / 0.1593017578);\n}\n\nvec3 st2084_to_linear(vec3 rgb)\n{\n    return vec3(st2084_to_linear_c(rgb.r), st2084_to_linear_c(rgb.g), st2084_to_linear_c(rgb.b));\n}\n\nfloat st2084_eotf_c(float x)\n{\n    return st2084_to_linear_c(x);\n}\n\nvec3 st2084_eotf(vec3 rgb)\n{\n    return st2084_to_linear(rgb);\n}\n\nfloat st2084_inv_eotf_c(float x)\n{\n    return linear_to_st2084_c(x);\n}\n\nvec3 st2084_inv_eotf(vec3 rgb)\n{\n    return linear_to_st2084(rgb);\n}\n\n", "\n", "\nfloat srgb_linear_to_nonlinear_channel(float u)\n{\n    return (u <= 0.0031308) ? (12.92 * u) : ((1.055 * pow(u, 1. / 2.4)) - 0.055);\n}\n\n// 0~1 -> 0~1\nvec3 srgb_linear_to_nonlinear(vec3 v)\n{\n    return vec3(srgb_linear_to_nonlinear_channel(v.r), srgb_linear_to_nonlinear_channel(v.g), srgb_linear_to_nonlinear_channel(v.b));\n}\n\nfloat srgb_nonlinear_to_linear_channel(float u)\n{\n    return (u <= 0.04045) ? (u / 12.92) : pow((u + 0.055) / 1.055, 2.4);\n}\n\n// 0~1 -> 0~1\nvec3 srgb_nonlinear_to_linear(vec3 v)\n{\n    return vec3(srgb_nonlinear_to_linear_channel(v.r), srgb_nonlinear_to_linear_channel(v.g), srgb_nonlinear_to_linear_channel(v.b));\n}\n", "\n");
        B.a("\nfloat bt709_linear_to_nonlinear_channel(float u)\n{\n    return (u < 0.0018) ? (4.5 * u) : ((1.099 * pow(u, 0.45)) - 0.099);\n}\n\nvec3 bt709_linear_to_nonlinear(vec3 v)\n{\n    return vec3(bt709_linear_to_nonlinear_channel(v.r), bt709_linear_to_nonlinear_channel(v.g), bt709_linear_to_nonlinear_channel(v.b));\n}\n\nfloat bt709_nonlinear_to_linear_channel(float u)\n{\n    return (u <= 0.081) ? (u / 4.5) : pow((u + 0.099) / 1.099, 1.0 / 0.45);\n}\n\nvec3 bt709_nonlinear_to_linear(vec3 v)\n{\n    return vec3(bt709_nonlinear_to_linear_channel(v.r), bt709_nonlinear_to_linear_channel(v.g), bt709_nonlinear_to_linear_channel(v.b));\n}\n", "\n", "\nfloat bt2390_KS(float maxLum, float KS_offset)\n{\n    return (1. + KS_offset) * maxLum - KS_offset;\n}\n\nfloat bt2390_T(float A, float KS)\n{\n    return (A - KS) / (1. - KS);\n}\n\nfloat bt2390_P(float B, float KS, float maxLum)\n{\n    float TB = bt2390_T(B, KS);\n    float TB_sq = pow(TB, 2.);\n    float TB_cu = pow(TB, 3.);\n\n    float res = (2. * TB_cu - 3. * TB_sq + 1.) * KS +\n                (TB_cu - 2. * TB_sq + TB) * (1. - KS) +\n                (-2. * TB_cu + 3. * TB_sq) * maxLum;\n    return res;\n}\n\nfloat bt2390_cal_Lum(float L, float Lb, float Lw)\n{\n    return (st2084_inv_eotf_c(L) - st2084_inv_eotf_c(Lb)) /\n           (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb));\n}\n\nfloat bt2390_cal_E1(float E_in, float Lb, float Lw)\n{\n    float E1 = (E_in - st2084_inv_eotf_c(Lb)) / (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb));\n    return clamp(E1, 0.0, 1.0);\n}\n\nfloat bt2390_cal_E2(float E1, float KS, float maxLum)\n{\n    float E2 = 0.;\n    if (E1 < KS)\n    {\n        E2 = E1;\n    }\n    else\n    {\n        E2 = bt2390_P(E1, KS, maxLum);\n    }\n    return E2;\n}\n\nfloat bt2390_cal_E3(float E2, float minLum)\n{\n    float b = minLum;\n    return E2 + b * pow(1. - E2, 4.);\n}\n\nfloat bt2390_cal_E4(float E3, float Lb, float Lw)\n{\n    return st2084_eotf_c(E3 * (st2084_inv_eotf_c(Lw) - st2084_inv_eotf_c(Lb)) + st2084_inv_eotf_c(Lb));\n}\n\nfloat bt2390_eetf(float E_in, float Lb, float Lw, float Lmin,\n                  float Lmax, float KS_offset)\n{\n    Lb /= 10000.;\n    Lw /= 10000.;\n    Lmin /= 10000.;\n    Lmax /= 10000.;\n    float minLum = bt2390_cal_Lum(Lmin, Lb, Lw);\n    float maxLum = bt2390_cal_Lum(Lmax, Lb, Lw);\n    float E1 = bt2390_cal_E1(E_in, Lb, Lw);\n    float E2 = bt2390_cal_E2(E1, bt2390_KS(maxLum, KS_offset), maxLum);\n    float E3 = bt2390_cal_E3(E2, minLum);\n    float E4 = bt2390_cal_E4(E3, Lb, Lw);\n    clamp(E4, Lmin, Lmax);\n    return E4 * 10000.;\n}\n\n// 0 ~ 10000 -> 0 ~ 10000\n// KS_offset: 服务端用的1\nvec3 bt2390_maxRGB_tm(vec3 rgb, float Lw, float Lmax, float KS_offset)\n{\n    float maxRGB_o = max(max(rgb.r, rgb.g), rgb.b);\n    float maxRGB_e = st2084_inv_eotf_c(clamp(maxRGB_o, 0., 10000.) / 10000.);\n    float maxRGB_o_1 = bt2390_eetf(maxRGB_e, 0., Lw, 0., Lmax, KS_offset);\n\n    maxRGB_o = max(maxRGB_o, 6.10352e-5);\n    return rgb * (maxRGB_o_1 / maxRGB_o);\n}\n", "\n", sbA);
        B.a("\nfloat hlg_to_linear_c(float u)\n{\n    float ln2_i = 1. / log(2.);\n    float m = ln2_i / 0.17883277;\n    float a = -ln2_i * 0.55991073 / 0.17883277;\n    return (u <= 0.5) ? ((u * u) / 3.) : ((exp2(u * m + a) + 0.28466892) / 12.);\n}\n\n// 0~1 -> 0~1\n// float y = 1.2 + (Lw > 1000. ? (0.42 * log10(Lw / 1000.)) : 0);\n// exponent = y;\nvec3 hlg_to_linear(vec3 v, float exponent)\n{\n    // OETF-1\n    vec3 rgb = vec3(hlg_to_linear_c(v.r), hlg_to_linear_c(v.g), hlg_to_linear_c(v.b));\n\n    // OOTF\n    float Ys = dot(rgb, vec3(0.2627, 0.678, 0.0593));\n    rgb *= pow(Ys, exponent - 1.);\n    return rgb;\n}\n\n\nfloat linear_to_hlg_channel(float u)\n{\n\tfloat ln2_i = 1. / log(2.);\n\tfloat m = 0.17883277 / ln2_i;\n\treturn (u <= (1. / 12.)) ? sqrt(3. * u) : ((log2((12. * u) - 0.28466892) * m) + 0.55991073);\n}\n\nvec3 linear_to_hlg(vec3 rgb, float Lw, float sdrwhite)\n{\n\tif (Lw > 1000.)\n\t{\n\t\trgb = bt2390_maxRGB_tm(rgb * sdrwhite, Lw, 1000.0, 1.0);\n\t}\n    else\n    {\n        rgb = rgb * sdrwhite;    \n    }\n    rgb /= 1000.0;\n\n\tfloat Yd = dot(rgb, vec3(0.2627, 0.678, 0.0593));\n\n\t// pow(0., exponent) can lead to NaN, use smallest positive normal number\n\tYd = max(6.10352e-5, Yd);\n\n\trgb *= pow(Yd, -1. / 6.);\n\treturn vec3(linear_to_hlg_channel(rgb.r), linear_to_hlg_channel(rgb.g), linear_to_hlg_channel(rgb.b));\n}\n\n", "\n", "\nvec3 bt601_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(0.93954213944307008, 0.050181304575707734, 0.010276555981221736));\n    float g = dot(v, vec3(0.017772209406134849, 0.96579286543744325, 0.016434925156422107));\n    float b = dot(v, vec3(-0.0016215976109225476, -0.0043697458643167930, 1.0059913434752392));\n    return vec3(r, g, b);\n}\n\nvec3 bt709_to_bt601(vec3 v)\n{\n    float r = dot(v, vec3(1.0653789460402330, -0.055400810269059048, -0.0099781357711726804));\n    float g = dot(v, vec3(-0.019632533021540617, 1.0363630894972797, -0.016730556475739101));\n    float b = dot(v, vec3(0.0016320486098591325, 0.0044123694815820375, 0.99395558190855882));\n    return vec3(r, g, b);\n}\n", "\n", sbA);
        String strA = A.a("\nvec3 bt709_to_bt2020(vec3 v)\n{\n    float r = dot(v, vec3(0.62740389593469903, 0.32928303837788370, 0.043313065687417225));\n    float g = dot(v, vec3(0.069097289358232075, 0.91954039507545871, 0.011362315566309178));\n    float b = dot(v, vec3(0.016391438875150280, 0.088013307877225749, 0.89559525324762401));\n    return vec3(r, g, b);\n}\n\nvec3 bt2020_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(1.6604910021084345, -0.58764113878854951, -0.072849863319884883));\n    float g = dot(v, vec3(-0.12455047452159074, 1.1328998971259603, -0.0083494226043694768));\n    float b = dot(v, vec3(-0.018150763354905303, -0.10057889800800739, 1.1187296613629127));\n    return vec3(r, g, b);\n}\n", "\n", "\nvec3 bt709_to_display_p3(vec3 v)\n{\n    float r = dot(v, vec3(0.82246210575103760, 0.17753839424896240, 0.00000000000000000));\n    float g = dot(v, vec3(0.033194005268688202, 0.96680599473131180, 0.00000000000000000));\n    float b = dot(v, vec3(0.017082198956967353, 0.072397825286516189, 0.91051997575651646));\n    return vec3(r, g, b);\n}\n\nvec3 display_p3_to_bt709(vec3 v)\n{\n    float r = dot(v, vec3(1.2249406810031892, -0.22494066020724487, 0.00000000000000000));\n    float g = dot(v, vec3(-0.042056959944943115, 1.0420569181442261, 0.00000000000000000));\n    float b = dot(v, vec3(-0.019637568250775337, -0.078635981308460236, 1.0982745885848999));\n    return vec3(r, g, b);\n}\n", "\n\nconst float sdr_white = 240.0;\n\nvec3 pass_through(vec3 p) {\n    return p;\n}\n\nvec4 pass_through(vec4 p) {\n    return p;\n}\n\nvec3 tr_from_pq(vec3 c) {\n    return st2084_to_linear(c) * 10000.0 / sdr_white;\n}\n\nvec3 tr_to_pq(vec3 c) {\n    return linear_to_st2084(c * sdr_white / 10000.0);\n}\n\nvec3 tr_from_hlg(vec3 c) {\n    return hlg_to_linear(c, 1.2) * 1000.0 / sdr_white;\n}\n\nvec3 tr_to_hlg(vec3 c) {\n    // 转换到nit\n    return linear_to_hlg(c, 1000.0, sdr_white);\n}\n\nvec3 tr_from_srgb(vec3 c) {\n    return srgb_nonlinear_to_linear(c);\n}\n\nvec3 tr_to_srgb(vec3 c) {\n    return srgb_linear_to_nonlinear(c);\n}\n\nvec3 tr_from_bt709(vec3 c) {\n    return bt709_nonlinear_to_linear(c);\n}\n\nvec3 tr_to_bt709(vec3 c) {\n    return bt709_linear_to_nonlinear(c);\n}\n\nvec3 eetf_bt2390(vec3 c) {\n    return bt2390_maxRGB_tm(c * sdr_white, 1000.0, sdr_white, 1.0) / sdr_white;\n}\n\nvec3 pr_from_bt601ntsc(vec3 c) {\n    return bt601_to_bt709(c);\n}\n\nvec3 pr_to_bt601ntsc(vec3 c) {\n    return bt709_to_bt601(c);\n}\n\nvec3 pr_from_bt2020(vec3 c) {\n    return bt2020_to_bt709(c);\n}\n\nvec3 pr_to_bt2020(vec3 c) {\n    return bt709_to_bt2020(c);\n}\n\nvec3 pr_from_display_p3(vec3 c) {\n    return display_p3_to_bt709(c);\n}\n\nvec3 pr_to_display_p3(vec3 c) {\n    return bt709_to_display_p3(c);\n}\n", sbA);
        this.common_functions = strA;
        this.common_vertex_shader = "#version 300 es\nin vec4 a_pos;\nin vec4 a_uv;\nuniform mat4 u_vtrans;\nuniform mat4 u_uvtrans;\nout vec4 v_uv;\nvoid main() {\n   v_uv = a_uv * u_uvtrans;\n   gl_Position = a_pos * u_vtrans;\n}\n";
        this.common_frag_shader = p.a("#version 300 es\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform sampler2D u_tex;\nuniform float u_alpha;\nout vec4 fragColor;\nvoid main() {\n    fragColor = out_conv( \n        in_conv(\n            texture(u_tex, v_uv.xy)\n        ) * u_alpha\n    );\n}\n");
        this.yuv_frag_shader = p.a("#version 300 es\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform sampler2D u_tex;\nuniform sampler2D u_texu;\nuniform sampler2D u_texv;\nuniform mat4 u_colormatrix;\nuniform float u_alpha;\nout vec4 fragColor;\nvoid main() {\n    float y = texture(u_tex, v_uv.xy).r;\n    float u = texture(u_texu, v_uv.xy).r;\n    float v = texture(u_texv, v_uv.xy).r;\n    fragColor = out_conv(\n        in_conv(\n            clamp(\n                vec4(y, u, v, 1.0) * u_colormatrix,\n                0.0, 1.0\n            )\n        )\n    ) * u_alpha;\n}\n");
        this.p010_frag_shader = p.a("#version 300 es\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform mediump usampler2D u_tex;\nuniform mediump usampler2D u_texuv;\nuniform mat4 u_colormatrix;\nuniform float u_alpha;\nout vec4 fragColor;\nvoid main() {\n    uint y = texture(u_tex, v_uv.xy).r;\n    uvec2 uv = texture(u_texuv, v_uv.xy).rg;\n\n    float yf = float(y >> 6) / 1023.0;\n    float uf = float(uv.r >> 6) / 1023.0;\n    float vf = float(uv.g >> 6) / 1023.0;\n\n    fragColor = out_conv(\n        in_conv(\n            clamp(\n                vec4(yf, uf, vf, 1.0) * u_colormatrix,\n                0.0, 1.0\n            )\n        )\n    ) * u_alpha;\n}\n");
        this.doubletex_frag_shader = p.a("#version 300 es\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform sampler2D u_tex;\nuniform sampler2D u_tex2;\nuniform float u_alpha;\nuniform float u_alpha2;\nout vec4 fragColor;\nvoid main() {\n    fragColor = out_conv(\n        in_conv(texture(u_tex, v_uv.xy)) * u_alpha \n        + in_conv(texture(u_tex2, v_uv.xy)) * u_alpha2\n    );\n}\n");
        this.oestex_frag_shader = p.a("#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform samplerExternalOES u_tex;\nuniform float u_alpha;\nuniform float u_maxalpha;\nout vec4 fragColor;\nvoid main() {\n    vec4 clr = in_conv(texture(u_tex, v_uv.xy));\n    clr.a = max(clr.a, u_maxalpha);\n    clr = vec4(out_conv(clr).rgb, clr.a);\n    fragColor = clr * u_alpha;\n}\n");
        this.alphamp4_frag_shader = p.a("#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision highp float;\n", strA, "\n", convFunc, "\nin vec4 v_uv;\nuniform sampler2D u_tex;\nuniform float u_alpha;\nuniform vec2 rgb_xy;\nuniform vec2 rgb_scale;\nuniform vec2 alpha_xy;\nuniform vec2 alpha_scale;\nout vec4 fragColor;\nvoid main() {\n    vec3 rgb = in_conv(texture(u_tex, rgb_xy + vec2(rgb_scale.x * v_uv.x, rgb_scale.y * v_uv.y))).rgb;\n    float alpha = in_conv(texture(u_tex, alpha_xy + vec2(alpha_scale.x * v_uv.x, alpha_scale.y * v_uv.y))).g;\n    vec4 clr = vec4(rgb, alpha);\n    fragColor = out_conv(vec4((clr.rgb * clr.a), clr.a)) * u_alpha;\n}\n");
        this.solid_color_frag_shader = p.a("#version 300 es\nprecision highp float;\n", strA, "\n", convFunc, "\nuniform vec4 solid_color;\nout vec4 fragColor;\nvoid main() {\n    fragColor = out_conv(in_conv(vec4(solid_color.rgb * solid_color.a, solid_color.a)));\n}\n");
        this.RgbToP010YUVFragmentShader = android.support.v4.media.a.a("#version 310 es\nprecision highp float;\nprecision highp int;\n", strA, "\nlayout(binding = 1) uniform sampler2D u_input_texture;\nlayout(std430, binding = 2) buffer OutputYuvBuffer {\n    uint yuv[];\n};\nlayout(location = 3) uniform int stride; // 单位：4字节\nlayout(location = 4) uniform int sliceHeight;\n\nvec3 get_bt2020pq(ivec2 loc) {\n    // 从输入纹理采样（线性 RGB，BT.709 色域）\n    ivec2 texsize = textureSize(u_input_texture, 0);\n    // texture的坐标系和所需数据的坐标系Y轴方向正好相反，所以这里对输入数据上下颠倒\n    vec4 rgb_linear = texelFetch(u_input_texture, ivec2(loc.x, texsize.y - loc.y), 0);\n    vec3 rgb_pq = tr_to_pq(pr_to_bt2020(rgb_linear.rgb));\n    \n    return rgb_pq;\n}\n\nuvec2 rgb2p010_bt2020_pq_uv(ivec2 loc) {\n    vec3 rgb1_pq = get_bt2020pq(loc);\n    vec3 rgb2_pq = get_bt2020pq(loc + ivec2(1, 0));\n    vec3 rgb3_pq = get_bt2020pq(loc + ivec2(0, 1));\n    vec3 rgb4_pq = get_bt2020pq(loc + ivec2(1, 1));\n    vec3 rgb4_pq_avg = (rgb1_pq + rgb2_pq + rgb3_pq + rgb4_pq) * 0.25;\n    \n    // 使用矩阵将 RGB 转换为 UV\n    vec4 rgb_vec = vec4(rgb4_pq_avg, 1.0);\n    vec4 ufactor = vec4(-0.1227, -0.3166, 0.4392, 0.5000);\n    vec4 vfactor = vec4(0.4392, -0.4039, -0.0353, 0.5000);\n    float u = dot(ufactor, rgb_vec);\n    float v = dot(vfactor, rgb_vec);\n    \n    // 限制到有效范围\n    u = clamp(u, 0.0, 1.0);\n    v = clamp(v, 0.0, 1.0);\n    \n    // 转换为 10 位值（0-1023）并打包为 16 位（左移 6 位）\n    uint u_10bit = uint(u * 1023.0 + 0.5);\n    uint v_10bit = uint(v * 1023.0 + 0.5);\n    uint u_packed = u_10bit << 6;\n    uint v_packed = v_10bit << 6;\n    \n    return uvec2(u_packed, v_packed);\n}\n\nuint rgb2p010_bt2020_pq_y(ivec2 loc) {\n    vec3 rgb_pq = get_bt2020pq(loc);\n    \n    // 使用矩阵将 RGB 转换为 YUV\n    vec4 rgb_vec = vec4(rgb_pq, 1.0);\n    vec4 factor = vec4(0.2256, 0.5823, 0.0509, 0.0627);\n    float y = dot(factor, rgb_vec);\n    \n    // 限制到有效范围\n    y = clamp(y, 0.0, 1.0);\n    \n    // 转换为 10 位值（0-1023）并打包为 16 位（左移 6 位）\n    uint y_10bit = uint(y * 1023.0 + 0.5);\n    uint y_packed = y_10bit << 6;\n    \n    return y_packed;\n}\n\nvoid main() {\n    // mediump格式整数只有16bit精度，不足以支撑下标的精度\n    ivec2 texsize = textureSize(u_input_texture, 0);\n    ivec2 pos = ivec2(gl_FragCoord.xy);\n    uint y1 = rgb2p010_bt2020_pq_y(pos * 2);\n    uint y2 = rgb2p010_bt2020_pq_y(pos * 2 + ivec2(1, 0));\n    uint y3 = rgb2p010_bt2020_pq_y(pos * 2 + ivec2(0, 1));\n    uint y4 = rgb2p010_bt2020_pq_y(pos * 2 + ivec2(1, 1));\n    \n    uvec2 uv = rgb2p010_bt2020_pq_uv(pos * 2);\n    \n    // 输出 Y 通道（横向相邻两个像素pack在一起）\n    // pos是uv的坐标（x和y都是一半），texsize是输入的纹理大小\n    // 每个元素存两个像素的数据\n    yuv[pos.y * 2 * stride + pos.x] = y1 | (y2 << 16u);\n    yuv[(pos.y * 2 + 1) * stride + pos.x] = y3 | (y4 << 16u);\n    \n    // 输出 UV 通道数据（交错格式）\n    // 起始位置：stride * 4 * sliceHeight 字节\n    yuv[stride * (sliceHeight + pos.y) + pos.x] = uv.x | (uv.y << 16u);\n    // yuv[stride * (sliceHeight + pos.y) + pos.x] = 0x80008000u;\n    discard;\n}\n");
        this.RgbToSrgbNV12FragmentShader = android.support.v4.media.a.a("#version 310 es\nprecision highp float;\nprecision highp int;\n", strA, "\nlayout(binding = 1) uniform sampler2D u_input_texture;\nlayout(std430, binding = 2) buffer OutputYuvBuffer {\n    uint yuv[];\n};\nlayout(location = 3) uniform int stride; // 单位：4字节\nlayout(location = 4) uniform int sliceHeight;\n\nvec3 get_tv709(ivec2 loc) {\n    // 从输入纹理采样（线性 RGB，BT.709 色域）\n    ivec2 texsize = textureSize(u_input_texture, 0);\n    // texture的坐标系和所需数据的坐标系Y轴方向正好相反，所以这里对输入数据上下颠倒\n    vec4 rgb_linear = texelFetch(u_input_texture, ivec2(loc.x, texsize.y - loc.y), 0);\n    vec3 rgb_srgb = tr_to_bt709(rgb_linear.rgb); // !!!!! 解码端全都是按sRGB的光电转换来，这里用BT.709播放亮度就偏 !!!!!\n    \n    return rgb_srgb;\n}\n\nuvec2 rgb2yuv_tv709_uv(ivec2 loc) {\n    vec3 rgb1_bt709 = get_tv709(loc);\n    vec3 rgb2_bt709 = get_tv709(loc + ivec2(1, 0));\n    vec3 rgb3_bt709 = get_tv709(loc + ivec2(0, 1));\n    vec3 rgb4_bt709 = get_tv709(loc + ivec2(1, 1));\n    vec3 rgb4_bt709_avg = (rgb1_bt709 + rgb2_bt709 + rgb3_bt709 + rgb4_bt709) * 0.25;\n    \n    // 使用BT.709矩阵将 RGB 转换为 YUV (Limited Range)\n    vec4 rgb_vec = vec4(rgb4_bt709_avg, 1.0);\n    // vec4 yfactor = vec4(0.1826, 0.6142, 0.0620, 0.0627); // BT.709 Limited Range\n    vec4 ufactor = vec4(-0.1006, -0.3386, 0.4392, 0.5020); // 128/255 offset\n    vec4 vfactor = vec4(0.4392, -0.3989, -0.0403, 0.5020); // 128/255 offset\n    // float y = dot(yfactor, rgb_vec);\n    float u = dot(ufactor, rgb_vec);\n    float v = dot(vfactor, rgb_vec);\n    \n    // 限制到有效范围\n    // y = clamp(y, 0.0, 1.0);\n    u = clamp(u, 0.0, 1.0);\n    v = clamp(v, 0.0, 1.0);\n    \n    // 转换为 8 位值（0-255）\n    // uint y_8bit = uint(y * 255.0 + 0.5);\n    uint u_8bit = uint(u * 255.0 + 0.5);\n    uint v_8bit = uint(v * 255.0 + 0.5);\n    \n    // return uvec3(y_8bit, u_8bit, v_8bit);\n    return uvec2(u_8bit, v_8bit);\n}\n\nuint rgb2yuv_tv709_y(ivec2 loc) {\n    vec3 rgb_bt709 = get_tv709(loc);\n    \n    // 使用BT.709矩阵将 RGB 转换为 Y\n    vec4 rgb_vec = vec4(rgb_bt709, 1.0);\n    vec4 factor = vec4(0.1826, 0.6142, 0.0620, 0.0627);\n    float y = dot(factor, rgb_vec);\n    \n    // 限制到有效范围\n    y = clamp(y, 0.0, 1.0);\n    \n    // 转换为 8 位值（0-255）\n    uint y_8bit = uint(y * 255.0 + 0.5);\n    \n    return y_8bit;\n}\n\nvoid main() {\n    // mediump格式整数只有16bit精度，不足以支撑下标的精度\n    ivec2 texsize = textureSize(u_input_texture, 0);\n    ivec2 pos = ivec2(gl_FragCoord.xy);\n    \n    // 处理2x4像素块（8个像素）\n    // 第一行4个像素\n    uint y1 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2));                    // (0,0)\n    uint y2 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(1, 0));    // (1,0)\n    uint y3 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(2, 0));    // (2,0)\n    uint y4 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(3, 0));    // (3,0)\n    \n    uvec2 uv1 = rgb2yuv_tv709_uv(ivec2(pos.x * 4, pos.y * 2));\n    uvec2 uv3 = rgb2yuv_tv709_uv(ivec2(pos.x * 4, pos.y * 2) + ivec2(2, 0));\n\n    // 第二行4个像素\n    uint y5 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(0, 1));    // (0,1)\n    uint y6 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(1, 1));    // (1,1)\n    uint y7 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(2, 1));    // (2,1)\n    uint y8 = rgb2yuv_tv709_y(ivec2(pos.x * 4, pos.y * 2) + ivec2(3, 1));    // (3,1)\n\n    // 输出 Y 通道（每个32位整数存储4个8位Y值）\n    // pos是uv的坐标（x是1/4，y是1/2），texsize是输入的纹理大小\n    // 第一行4个像素的Y值，1个32位整数\n    yuv[pos.y * 2 * stride + pos.x] = y1 | (y2 << 8u) | (y3 << 16u) | (y4 << 24u);\n    \n    // 第二行4个像素的Y值，1个32位整数\n    yuv[(pos.y * 2 + 1) * stride + pos.x] = y5 | (y6 << 8u) | (y7 << 16u) | (y8 << 24u);\n    \n    // 输出 UV 通道数据（交错格式，NV12）\n    // 起始位置：stride * sliceHeight \n    // UV是4:2:0采样，每2x2块选择左上角的UV值\n    // 对于2x4像素块，我们需要2个UV值（每2x2块一个）\n    // 一个32位整数存储2对UV值，按照NV12格式放置在正确位置\n    // TODO 为什么是YVU不是YUV……？\n    // yuv[stride * (sliceHeight + pos.y) + pos.x] = (c3.y << 24u) | (c3.z << 16u) | (c1.y << 8u) | (c1.z);\n    yuv[stride * (sliceHeight + pos.y) + pos.x] = (uv3.x << 16u) | (uv3.y << 24u) | (uv1.x) | (uv1.y << 8u);\n    \n    discard;\n}\n");
        this.FullscreenVertexShader = "#version 310 es\nin vec2 a_position;\n\nvoid main() {\n    gl_Position = vec4(a_position, 0.0, 1.0);\n}\n";
    }

    @NotNull
    public final String getAlphamp4_frag_shader() {
        return this.alphamp4_frag_shader;
    }

    @NotNull
    public final String getCommon_frag_shader() {
        return this.common_frag_shader;
    }

    @NotNull
    public final String getCommon_functions() {
        return this.common_functions;
    }

    @NotNull
    public final String getCommon_vertex_shader() {
        return this.common_vertex_shader;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String getConvFunc(@NotNull Transfer transfer, @NotNull Primaries primaries, @NotNull EETF eetf, @NotNull Primaries primaries2, @NotNull Transfer transfer2) throws NoWhenBranchMatchedException {
        String str;
        String str2;
        String str3;
        String str4;
        Transfer transfer3;
        EETF eetf2 = EETF.NO_CONV;
        if (eetf == eetf2 && primaries == primaries2) {
            Primaries primaries3 = Primaries.NO_CONV;
            if (primaries != primaries3) {
                return getConvFunc(transfer, primaries3, eetf2, primaries3, transfer2);
            }
            if (transfer == transfer2 && transfer != (transfer3 = Transfer.NO_CONV)) {
                return getConvFunc(transfer3, primaries3, eetf2, primaries3, transfer3);
            }
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i7 = iArr[primaries.ordinal()];
        String str5 = "pass_through";
        if (i7 == 1 || i7 == 2) {
            str = "pass_through";
        } else if (i7 == 3) {
            str = "pr_from_bt601ntsc";
        } else if (i7 == 4) {
            str = "pr_from_bt2020";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "pr_from_display_p3";
        }
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
        int i8 = iArr2[transfer.ordinal()];
        if (i8 == 1) {
            str2 = "pass_through";
        } else if (i8 == 2) {
            str2 = "tr_from_srgb";
        } else if (i8 == 3) {
            str2 = "tr_from_bt709";
        } else if (i8 == 4) {
            str2 = "tr_from_hlg";
        } else {
            if (i8 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "tr_from_pq";
        }
        int i9 = WhenMappings.$EnumSwitchMapping$2[eetf.ordinal()];
        if (i9 == 1) {
            str3 = "pass_through";
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "eetf_bt2390";
        }
        int i10 = iArr[primaries2.ordinal()];
        if (i10 == 1 || i10 == 2) {
            str4 = "pass_through";
        } else if (i10 == 3) {
            str4 = "pr_to_bt601ntsc";
        } else if (i10 == 4) {
            str4 = "pr_to_bt2020";
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = "pr_to_display_p3";
        }
        int i11 = iArr2[transfer2.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                str5 = "tr_to_srgb";
            } else if (i11 == 3) {
                str5 = "tr_to_bt709";
            } else if (i11 == 4) {
                str5 = "tr_to_hlg";
            } else {
                if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                str5 = "tr_to_pq";
            }
        }
        StringBuilder sbA = G0.b.a("\nvec4 in_conv(vec4 p) {\n    return vec4(", str, "(", str2, "(p.rgb)), p.a);\n}\nvec4 out_conv(vec4 p) {\n    return vec4(");
        B.a(str5, "(", str4, "(", sbA);
        return C8770a.a(sbA, str3, "(p.rgb))), p.a);\n}\n");
    }

    @NotNull
    public final String getDoubletex_frag_shader() {
        return this.doubletex_frag_shader;
    }

    @NotNull
    public final String getEetf_bt2390() {
        return this.eetf_bt2390;
    }

    @NotNull
    public final String getFullscreenVertexShader() {
        return this.FullscreenVertexShader;
    }

    @NotNull
    public final Primaries getIn_primaries() {
        return this.in_primaries;
    }

    @NotNull
    public final Transfer getIn_transfer() {
        return this.in_transfer;
    }

    @NotNull
    public final String getMConvCode() {
        return this.mConvCode;
    }

    @NotNull
    public final String getOestex_frag_shader() {
        return this.oestex_frag_shader;
    }

    @NotNull
    public final EETF getOut_eetf() {
        return this.out_eetf;
    }

    @NotNull
    public final Primaries getOut_primaries() {
        return this.out_primaries;
    }

    @NotNull
    public final Transfer getOut_transfer() {
        return this.out_transfer;
    }

    @NotNull
    public final String getP010_frag_shader() {
        return this.p010_frag_shader;
    }

    @NotNull
    public final String getPrimaries_bt2020() {
        return this.primaries_bt2020;
    }

    @NotNull
    public final String getPrimaries_bt601_ntsc() {
        return this.primaries_bt601_ntsc;
    }

    @NotNull
    public final String getPrimaries_p3() {
        return this.primaries_p3;
    }

    @NotNull
    public final String getRgbToP010YUVFragmentShader() {
        return this.RgbToP010YUVFragmentShader;
    }

    @NotNull
    public final String getRgbToSrgbNV12FragmentShader() {
        return this.RgbToSrgbNV12FragmentShader;
    }

    @NotNull
    public final String getSolid_color_frag_shader() {
        return this.solid_color_frag_shader;
    }

    @NotNull
    public final String getTransfer_bt709() {
        return this.transfer_bt709;
    }

    @NotNull
    public final String getTransfer_hlg() {
        return this.transfer_hlg;
    }

    @NotNull
    public final String getTransfer_srgb() {
        return this.transfer_srgb;
    }

    @NotNull
    public final String getTransfer_st2084() {
        return this.transfer_st2084;
    }

    @NotNull
    public final String getYuv_frag_shader() {
        return this.yuv_frag_shader;
    }
}

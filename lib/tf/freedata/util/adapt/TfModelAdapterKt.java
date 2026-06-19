package com.bilibili.lib.tf.freedata.util.adapt;

import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.tf.TfProvider;
import com.bilibili.lib.tf.TfResource;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/adapt/TfModelAdapterKt.class */
public final class TfModelAdapterKt {

    @NotNull
    private static final String ISP_FLAG_CM = "cm";

    @NotNull
    private static final String ISP_FLAG_CT = "ct";

    @NotNull
    private static final String ISP_FLAG_CU = "cu";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/freedata/util/adapt/TfModelAdapterKt$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FreeDataManager.ResType.values().length];
            try {
                iArr[FreeDataManager.ResType.RES_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_VIDEO_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_RTMP.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_RTMP_PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_DANMAKU.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_DANMASK.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_MUSIC.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_FILE.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_IMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[FreeDataManager.ResType.RES_UNSPECIFIED.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TfResource.values().length];
            try {
                iArr2[TfResource.RES_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr2[TfResource.RES_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr2[TfResource.RES_VIDEO_UPLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr2[TfResource.RES_RTMP.ordinal()] = 4;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr2[TfResource.RES_RTMP_PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError e21) {
            }
            try {
                iArr2[TfResource.RES_DANMAKU.ordinal()] = 6;
            } catch (NoSuchFieldError e22) {
            }
            try {
                iArr2[TfResource.RES_DANMAKU_MASK.ordinal()] = 7;
            } catch (NoSuchFieldError e23) {
            }
            try {
                iArr2[TfResource.RES_MUSIC.ordinal()] = 8;
            } catch (NoSuchFieldError e24) {
            }
            try {
                iArr2[TfResource.RES_FILE.ordinal()] = 9;
            } catch (NoSuchFieldError e25) {
            }
            try {
                iArr2[TfResource.RES_IMAGE.ordinal()] = 10;
            } catch (NoSuchFieldError e26) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TfProvider.values().length];
            try {
                iArr3[TfProvider.UNICOM.ordinal()] = 1;
            } catch (NoSuchFieldError e27) {
            }
            try {
                iArr3[TfProvider.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError e28) {
            }
            try {
                iArr3[TfProvider.TELECOM.ordinal()] = 3;
            } catch (NoSuchFieldError e29) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final String providerToIspFlag(@NotNull TfProvider tfProvider) {
        int i7 = WhenMappings.$EnumSwitchMapping$2[tfProvider.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : ISP_FLAG_CT : ISP_FLAG_CM : ISP_FLAG_CU;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final TfResource resTypeConvert(@NotNull FreeDataManager.ResType resType) throws NoWhenBranchMatchedException {
        TfResource tfResource;
        switch (WhenMappings.$EnumSwitchMapping$0[resType.ordinal()]) {
            case 1:
                tfResource = TfResource.RES_VIDEO;
                break;
            case 2:
                tfResource = TfResource.RES_VIDEO_UPLOAD;
                break;
            case 3:
                tfResource = TfResource.RES_RTMP;
                break;
            case 4:
                tfResource = TfResource.RES_RTMP_PUSH;
                break;
            case 5:
                tfResource = TfResource.RES_DANMAKU;
                break;
            case 6:
                tfResource = TfResource.RES_DANMAKU_MASK;
                break;
            case 7:
                tfResource = TfResource.RES_MUSIC;
                break;
            case 8:
                tfResource = TfResource.RES_FILE;
                break;
            case 9:
                tfResource = TfResource.RES_IMAGE;
                break;
            case 10:
                tfResource = TfResource.RES_UNSPECIFIED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return tfResource;
    }

    @NotNull
    public static final FreeDataManager.ResType resourceConvert(@NotNull TfResource tfResource) {
        FreeDataManager.ResType resType;
        switch (WhenMappings.$EnumSwitchMapping$1[tfResource.ordinal()]) {
            case 1:
                resType = FreeDataManager.ResType.RES_UNSPECIFIED;
                break;
            case 2:
                resType = FreeDataManager.ResType.RES_VIDEO;
                break;
            case 3:
                resType = FreeDataManager.ResType.RES_VIDEO_UPLOAD;
                break;
            case 4:
                resType = FreeDataManager.ResType.RES_RTMP;
                break;
            case 5:
                resType = FreeDataManager.ResType.RES_RTMP_PUSH;
                break;
            case 6:
                resType = FreeDataManager.ResType.RES_DANMAKU;
                break;
            case 7:
                resType = FreeDataManager.ResType.RES_DANMASK;
                break;
            case 8:
                resType = FreeDataManager.ResType.RES_MUSIC;
                break;
            case 9:
                resType = FreeDataManager.ResType.RES_FILE;
                break;
            case 10:
                resType = FreeDataManager.ResType.RES_IMAGE;
                break;
            default:
                resType = FreeDataManager.ResType.RES_FILE;
                break;
        }
        return resType;
    }
}

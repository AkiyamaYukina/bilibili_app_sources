package com.bilibili.mediacore.mediacodec;

import G0.b;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.d;
import com.bilibili.mediacore.avutil.LogSinker;
import com.tencent.connect.common.Constants;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/mediacodec/MediaCodecInfoHelper.class */
@Keep
public class MediaCodecInfoHelper {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    private static final String TAG = "MediaCodecInfoHelper";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    private static Map<String, Integer> getKnownCodecList() {
        synchronized (MediaCodecInfoHelper.class) {
            try {
                Map<String, Integer> map = sKnownCodecList;
                if (map != null) {
                    return map;
                }
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                sKnownCodecList = treeMap;
                treeMap.put("OMX.Nvidia.h264.decode", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", 300);
                sKnownCodecList.put("OMX.Intel.hw_vd.h264", 801);
                sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.qcom.video.decoder.avc", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.ittiam.video.decoder.avc", 0);
                sKnownCodecList.put("OMX.SEC.avc.dec", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.SEC.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.SEC.avcdec", 798);
                sKnownCodecList.put("OMX.SEC.avc.sw.dec", 200);
                sKnownCodecList.put("OMX.SEC.hevc.sw.dec", 200);
                sKnownCodecList.put("OMX.Exynos.avc.dec", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.Exynos.AVC.Decoder", 799);
                sKnownCodecList.put("OMX.k3.video.decoder.avc", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.rk.video_decoder.avc", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(RANK_TESTED));
                sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", 200);
                sKnownCodecList.remove("OMX.Action.Video.Decoder");
                sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
                sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
                sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
                sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
                sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
                sKnownCodecList.remove("OMX.duos.h264.decoder");
                sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
                sKnownCodecList.remove("OMX.hantro.G1.video.decoder");
                sKnownCodecList.remove("OMX.hisi.video.decoder");
                sKnownCodecList.remove("OMX.LG.decoder.video.avc");
                sKnownCodecList.remove("OMX.MS.AVC.Decoder");
                sKnownCodecList.remove("OMX.RENESAS.VIDEO.DECODER.H264");
                sKnownCodecList.remove("OMX.RTK.video.decoder");
                sKnownCodecList.remove("OMX.sprd.h264.decoder");
                sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
                sKnownCodecList.remove("OMX.vpu.video_decoder.avc");
                sKnownCodecList.remove("OMX.WMT.decoder.avc");
                sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
                sKnownCodecList.put("OMX.google.h264.decoder", 200);
                sKnownCodecList.put("OMX.google.h264.lc.decoder", 200);
                sKnownCodecList.put("OMX.k3.ffmpeg.decoder", 200);
                sKnownCodecList.put("OMX.ffmpeg.video.decoder", 200);
                sKnownCodecList.put("OMX.sprd.soft.h264.decoder", 200);
                sKnownCodecList.put("OMX.qcom.video.decoder.hevcswvdec", 200);
                sKnownCodecList.put("OMX.qcom.video.decoder.hevchybrid", 200);
                return sKnownCodecList;
            } finally {
            }
        }
    }

    public static String getLevelName(int i7) {
        if (i7 == 1) {
            return "1";
        }
        if (i7 == 2) {
            return "1b";
        }
        switch (i7) {
            case 4:
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
            case 8:
                return Constants.VIA_REPORT_TYPE_SET_AVATAR;
            case 16:
                return Constants.VIA_REPORT_TYPE_JOININ_GROUP;
            case 32:
                return "2";
            case 64:
                return Constants.VIA_REPORT_TYPE_QQFAVORITES;
            case 128:
                return Constants.VIA_REPORT_TYPE_DATALINE;
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileLevelName(int i7, int i8) {
        Locale locale = Locale.US;
        return d.a(i7, i8, ",", ")", b.a(" ", getProfileName(i7), " Profile Level ", getLevelName(i8), " ("));
    }

    public static String getProfileName(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? i7 != 32 ? i7 != 64 ? "Unknown" : "High444" : "High422" : "High10" : "High" : "Extends" : "Main" : "Baseline";
    }

    private static boolean isCodecNameBlock(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            return Pattern.matches(str2, str);
        } catch (Exception e7) {
            return false;
        }
    }

    public static MediaCodecInfoHelper setupCandidate(MediaCodecInfo mediaCodecInfo, String str) {
        return setupCandidate(mediaCodecInfo, str, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.mediacore.mediacodec.MediaCodecInfoHelper setupCandidate(android.media.MediaCodecInfo r3, java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediacore.mediacodec.MediaCodecInfoHelper.setupCandidate(android.media.MediaCodecInfo, java.lang.String, java.lang.String):com.bilibili.mediacore.mediacodec.MediaCodecInfoHelper");
    }

    public void dumpProfileLevels(String str) {
        int iMax;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
            int iMax2 = 0;
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                iMax = 0;
            } else {
                iMax2 = 0;
                iMax = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel != null) {
                        iMax2 = Math.max(iMax2, codecProfileLevel.profile);
                        iMax = Math.max(iMax, codecProfileLevel.level);
                    }
                }
            }
            Locale locale = Locale.US;
            LogSinker.i(TAG, getProfileLevelName(iMax2, iMax));
        } catch (Throwable th) {
            LogSinker.i(TAG, "profile-level: exception");
        }
    }
}

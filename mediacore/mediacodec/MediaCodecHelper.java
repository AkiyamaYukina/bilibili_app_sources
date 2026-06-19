package com.bilibili.mediacore.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.mediacore.avutil.LogSinker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/mediacodec/MediaCodecHelper.class */
@Keep
public class MediaCodecHelper {
    public static final int CODEC_H265_BITRATE = 6000000;
    private static final int CODEC_UHD_HEIGHT = 2160;
    private static final int CODEC_UHD_WIDTH = 3840;
    private static final String TAG = "MediaCodecHelper";
    private static final HashMap<String, String> sCodecMimeToNameMap = new HashMap<>();
    private static final HashMap<String, Boolean> sUhdSupportMap = new HashMap<>();

    public static MediaCodecInfoHelper getBestCodec(String str) {
        return getBestCodec(str, "");
    }

    public static MediaCodecInfoHelper getBestCodec(String str, String str2) {
        String[] supportedTypes;
        MediaCodecInfoHelper mediaCodecInfoHelper;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            TreeMap treeMap = new TreeMap();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str3 : supportedTypes) {
                        if (!TextUtils.isEmpty(str3) && str3.equalsIgnoreCase(str) && (mediaCodecInfoHelper = MediaCodecInfoHelper.setupCandidate(codecInfoAt, str, str2)) != null) {
                            treeMap.put(Integer.valueOf(mediaCodecInfoHelper.mRank), mediaCodecInfoHelper);
                            mediaCodecInfoHelper.dumpProfileLevels(str);
                        }
                    }
                }
            }
            Map.Entry entryLastEntry = treeMap.lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return (MediaCodecInfoHelper) entryLastEntry.getValue();
        } catch (Exception e7) {
            LogSinker.e(TAG, "MediaCodec Error: " + e7);
            return null;
        }
    }

    public static String getBestCodecName(String str) {
        synchronized (MediaCodecHelper.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                HashMap<String, String> map = sCodecMimeToNameMap;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                String bestCodecName = getBestCodecName(str, "");
                map.put(str, bestCodecName);
                return bestCodecName;
            } finally {
            }
        }
    }

    public static String getBestCodecName(String str, String str2) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfoHelper bestCodec = getBestCodec(str, str2);
        if (bestCodec == null || (mediaCodecInfo = bestCodec.mCodecInfo) == null) {
            return null;
        }
        if (bestCodec.mRank < 600) {
            Locale locale = Locale.US;
            LogSinker.w(TAG, "unaccetable codec: " + mediaCodecInfo.getName());
            return null;
        }
        String name = mediaCodecInfo.getName();
        LogSinker.i(TAG, "bestCodec for " + str + " : " + name);
        return name;
    }

    public static boolean isCodecSupport(String str, String str2, int i7, int i8, int i9) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (!codecInfoAt.isEncoder() && !TextUtils.isEmpty(codecInfoAt.getName()) && codecInfoAt.getName().equals(str) && (capabilitiesForType = codecInfoAt.getCapabilitiesForType(str2)) != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                    LogSinker.i(TAG, "codecName: " + str + " width " + videoCapabilities.getSupportedWidths() + " height " + videoCapabilities.getSupportedHeights() + " bitrate " + videoCapabilities.getBitrateRange() + " framerate " + videoCapabilities.getSupportedFrameRates());
                    boolean z6 = false;
                    if (videoCapabilities.isSizeSupported(i7, i8)) {
                        z6 = false;
                        if (videoCapabilities.getBitrateRange().contains(Integer.valueOf(i9))) {
                            z6 = true;
                        }
                    }
                    return z6;
                }
            }
            return false;
        } catch (Exception e7) {
            LogSinker.e(TAG, "MediaCodec Error: " + e7);
            return false;
        }
    }

    public static boolean isUhdSupport(String str) {
        boolean z6 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashMap<String, Boolean> map = sUhdSupportMap;
        if (map.containsKey(str)) {
            if (map.get(str) == Boolean.TRUE) {
                z6 = true;
            }
            return z6;
        }
        boolean zIsUhdSupport = isUhdSupport(str, BiliPushAVCodecUtils.HEVC_MIME);
        map.put(str, Boolean.valueOf(zIsUhdSupport));
        return zIsUhdSupport;
    }

    public static boolean isUhdSupport(String str, String str2) {
        return isCodecSupport(str, str2, CODEC_UHD_WIDTH, CODEC_UHD_HEIGHT, CODEC_H265_BITRATE);
    }
}

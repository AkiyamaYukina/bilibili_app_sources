package com.bilibili.montage.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.montage.avutil.LogSinker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecUtils.class */
public class MediaCodecUtils {
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final int INVALID_VALUE = -1;
    private static final int PRIORITY_BEST_EFFORT = 1;
    private static final int PROFILE_H264_BASELINE = 1;
    private static final int PROFILE_H264_HIGH = 3;
    private static final int PROFILE_H264_MAIN = 2;
    private static final int SDK_INT = Build.VERSION.SDK_INT;
    private static final String TAG = "MediaCodecUtils";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/mediacodec/MediaCodecUtils$EncoderSupportInfo.class */
    public static class EncoderSupportInfo {
        public int level;
        public int maxFrameRate;
        public boolean supportCbr;
        public boolean supportVbr;

        public EncoderSupportInfo(boolean z6, boolean z7, int i7, int i8) {
            this.supportVbr = z6;
            this.supportCbr = z7;
            this.level = i7;
            this.maxFrameRate = i8;
        }
    }

    public static void adjustMediaFormatForEncoderPerformanceSettings(MediaFormat mediaFormat, int i7) {
        LogSinker.i(TAG, "info.maxFrameRate:" + i7);
        int i8 = SDK_INT;
        if (i8 < 25) {
            return;
        }
        int i9 = i7;
        if (i7 < 30) {
            i9 = Integer.MAX_VALUE;
        }
        mediaFormat.setInteger("priority", 1);
        if (i8 == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else {
            mediaFormat.setInteger("operating-rate", i9);
        }
    }

    public static MediaFormat createHDRMediaFormat(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(BiliPushAVCodecUtils.HEVC_MIME, i7, i8);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i9);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i10);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i11);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 6);
        mediaFormatCreateVideoFormat.setInteger("color-range", 2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 6);
        if (i12 > 0 && i13 > 0 && i12 < 50 && i13 < 50) {
            mediaFormatCreateVideoFormat.setInteger("video-qp-min", i12);
            mediaFormatCreateVideoFormat.setInteger("video-qp-max", i13);
        }
        return mediaFormatCreateVideoFormat;
    }

    public static MediaFormat createSDRMediaFormat(int i7, int i8, int i9, int i10, int i11, int i12, boolean z6, String str, int i13, int i14) {
        EncoderSupportInfo compatibleEncoderInfo;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i7, i8);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i9);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i10);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i11);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 1);
        mediaFormatCreateVideoFormat.setInteger("color-range", 2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 3);
        if (i13 > 0 && i14 > 0 && i13 < 50 && i14 < 50) {
            mediaFormatCreateVideoFormat.setInteger("video-qp-min", i13);
            mediaFormatCreateVideoFormat.setInteger("video-qp-max", i14);
        }
        int profile = getProfile(i12);
        try {
            compatibleEncoderInfo = getCompatibleEncoderInfo(str, profile, 65536, i7, i8);
        } catch (Error e7) {
            LogSinker.e(TAG, "getCompatibleEncoderInfo faild" + e7);
            compatibleEncoderInfo = null;
        } catch (Exception e8) {
            LogSinker.e(TAG, "getCompatibleEncoderInfo faild" + e8);
            compatibleEncoderInfo = null;
        }
        if (str == BiliPushAVCodecUtils.AVC_MIME && needSetProfile(i12) && compatibleEncoderInfo != null && -1 != compatibleEncoderInfo.level) {
            mediaFormatCreateVideoFormat.setInteger("profile", profile);
            mediaFormatCreateVideoFormat.setInteger("level", compatibleEncoderInfo.level);
        }
        if (compatibleEncoderInfo == null || !z6) {
            adjustMediaFormatForEncoderPerformanceSettings(mediaFormatCreateVideoFormat, Integer.MAX_VALUE);
        } else {
            adjustMediaFormatForEncoderPerformanceSettings(mediaFormatCreateVideoFormat, compatibleEncoderInfo.maxFrameRate);
            setBitrateMode(mediaFormatCreateVideoFormat, compatibleEncoderInfo);
        }
        return mediaFormatCreateVideoFormat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bilibili.montage.mediacodec.MediaCodecUtils.EncoderSupportInfo getCompatibleEncoderInfo(java.lang.String r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.montage.mediacodec.MediaCodecUtils.getCompatibleEncoderInfo(java.lang.String, int, int, int, int):com.bilibili.montage.mediacodec.MediaCodecUtils$EncoderSupportInfo");
    }

    private static EncoderSupportInfo getEncoderCapabilities(MediaCodecInfo mediaCodecInfo, String str, int i7, int i8, int i9) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        EncoderSupportInfo encoderSupportInfo = new EncoderSupportInfo(false, false, i7, 0);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        encoderSupportInfo.supportVbr = encoderCapabilities.isBitrateModeSupported(1);
        encoderSupportInfo.supportCbr = encoderCapabilities.isBitrateModeSupported(2);
        Double d7 = (Double) capabilitiesForType.getVideoCapabilities().getSupportedFrameRatesFor(i8, i9).getUpper();
        if (d7 != null) {
            encoderSupportInfo.maxFrameRate = d7.intValue();
        }
        return encoderSupportInfo;
    }

    public static int getProfile(int i7) {
        if (i7 != 2) {
            return i7 != 3 ? 1 : 8;
        }
        return 2;
    }

    private static boolean needSetProfile(int i7) {
        boolean z6 = false;
        if ((1 != i7 && 2 != i7 && 3 != i7) || i7 == 1) {
            return false;
        }
        if (SDK_INT >= 24) {
            z6 = true;
        }
        return z6;
    }

    public static void setBitrateMode(MediaFormat mediaFormat, EncoderSupportInfo encoderSupportInfo) {
        LogSinker.i(TAG, "info.supportVbr:" + encoderSupportInfo.supportVbr + " info.supportCbr:" + encoderSupportInfo.supportCbr);
        if (encoderSupportInfo.supportVbr) {
            mediaFormat.setInteger("bitrate-mode", 1);
        } else if (encoderSupportInfo.supportCbr) {
            mediaFormat.setInteger("bitrate-mode", 2);
        }
    }
}

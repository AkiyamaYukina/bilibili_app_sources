package com.bilibili.live.streaming.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.z;
import com.bilibili.live.streaming.LiveConstants;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.mediastreaming.BiliPushDevice;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/BiliPushAVCodecUtils.class */
public final class BiliPushAVCodecUtils {

    @NotNull
    public static final String AVC_MIME = "video/avc";

    @NotNull
    public static final String DOLBY_MIME = "video/dolby-vision";

    @NotNull
    public static final String HEVC_MIME = "video/hevc";

    @NotNull
    public static final BiliPushAVCodecUtils INSTANCE;

    @NotNull
    private static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES;

    @NotNull
    private static final String TAG = "BiliPushAVCodecUtils";

    @NotNull
    private static final HashMap<Integer, String> mAACProfiles;

    @NotNull
    private static final HashMap<Integer, String> mAVCLevels;

    @NotNull
    private static final HashMap<Integer, String> mAVCProfiles;

    @NotNull
    private static final HashMap<Integer, String> mDolbyLevels;

    @NotNull
    private static final HashMap<Integer, String> mDolbyProfiles;

    @NotNull
    private static final HashMap<Integer, String> mHEVCLevels;

    @NotNull
    private static final HashMap<Integer, String> mHEVCProfiles;

    static {
        BiliPushAVCodecUtils biliPushAVCodecUtils = new BiliPushAVCodecUtils();
        INSTANCE = biliPushAVCodecUtils;
        SOFTWARE_IMPLEMENTATION_PREFIXES = new String[]{"OMX.google.", "OMX.SEC.", "c2.android"};
        mAVCProfiles = new HashMap<>();
        mAVCLevels = new HashMap<>();
        mHEVCProfiles = new HashMap<>();
        mHEVCLevels = new HashMap<>();
        mDolbyProfiles = new HashMap<>();
        mDolbyLevels = new HashMap<>();
        mAACProfiles = new HashMap<>();
        biliPushAVCodecUtils.initProfileLevel();
    }

    private BiliPushAVCodecUtils() {
    }

    private final boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, String str) {
        Iterator it = ArrayIteratorKt.iterator(mediaCodecInfo.getSupportedTypes());
        while (it.hasNext()) {
            if (Intrinsics.areEqual(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final MediaCodecInfo findCodecForType(String str, boolean z6) {
        Iterator it = ArrayIteratorKt.iterator(new MediaCodecList(1).getCodecInfos());
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, str, z6)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.media.MediaCodecInfo findHEVCCodecForType() {
        /*
            r4 = this;
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r0)
            r6 = r0
        Lf:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L65
            r0 = r6
            java.lang.Object r0 = r0.next()
            android.media.MediaCodecInfo r0 = (android.media.MediaCodecInfo) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.isEncoder()
            if (r0 == 0) goto Lf
            r0 = r4
            r1 = r7
            java.lang.String r2 = "video/hevc"
            boolean r0 = r0.codecSupportsType(r1, r2)
            if (r0 == 0) goto Lf
            r0 = r7
            java.lang.String r1 = "video/hevc"
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r0)
            r5 = r0
        L40:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lf
            r0 = r5
            java.lang.Object r0 = r0.next()
            android.media.MediaCodecInfo$CodecProfileLevel r0 = (android.media.MediaCodecInfo.CodecProfileLevel) r0
            int r0 = r0.profile
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L40
            r0 = r4
            r1 = r7
            boolean r0 = r0.isHardwareSupportedInCurrentSdk(r1)
            if (r0 == 0) goto Lf
            r0 = r7
            return r0
        L65:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.findHEVCCodecForType():android.media.MediaCodecInfo");
    }

    public static /* synthetic */ MediaCodecInfo.CodecProfileLevel getSupportLatestAVCProfileLevel$default(BiliPushAVCodecUtils biliPushAVCodecUtils, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        return biliPushAVCodecUtils.getSupportLatestAVCProfileLevel(z6);
    }

    public static /* synthetic */ MediaCodecInfo.CodecProfileLevel getSupportLatestDolbyProfileLevel$default(BiliPushAVCodecUtils biliPushAVCodecUtils, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        return biliPushAVCodecUtils.getSupportLatestDolbyProfileLevel(z6);
    }

    public static /* synthetic */ MediaCodecInfo.CodecProfileLevel getSupportLatestHEVCProfileLevel$default(BiliPushAVCodecUtils biliPushAVCodecUtils, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return biliPushAVCodecUtils.getSupportLatestHEVCProfileLevel(z6, z7);
    }

    private static final List getSupportLatestHEVCProfileLevel$lambda$6(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 2) {
                arrayList.add(codecProfileLevel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getTargetString(java.util.HashMap<java.lang.Integer, java.lang.String> r4, int r5) {
        /*
            r3 = this;
            r0 = r4
            r1 = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1b
            r0 = r6
            r4 = r0
            r0 = r6
            java.lang.String r1 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L1e
        L1b:
            java.lang.String r0 = "unknown"
            r4 = r0
        L1e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.getTargetString(java.util.HashMap, int):java.lang.String");
    }

    private final void initProfileLevel() {
        Iterator it = ArrayIteratorKt.iterator(MediaCodecInfo.CodecProfileLevel.class.getFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if ((field.getModifiers() & 24) != 0) {
                String name = field.getName();
                HashMap<Integer, String> map = StringsKt.Z(name, "AVCProfile") ? mAVCProfiles : StringsKt.Z(name, "AVCLevel") ? mAVCLevels : StringsKt.Z(name, "HEVCProfile") ? mHEVCProfiles : StringsKt.n(name, "HEVC.+Level1") ? mHEVCLevels : StringsKt.Z(name, "DolbyVisionProfile") ? mDolbyProfiles : StringsKt.Z(name, "DolbyVisionLevel") ? mDolbyLevels : StringsKt.Z(name, "AACObject") ? mAACProfiles : null;
                if (map != null) {
                    try {
                        map.put(Integer.valueOf(field.getInt(null)), name);
                    } catch (Exception e7) {
                        LivePusherLog.e(TAG, "initProfileLevel exception: ", e7);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String name = mediaCodecInfo.getName();
        for (String str : SOFTWARE_IMPLEMENTATION_PREFIXES) {
            if (StringsKt.Z(name, str)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isSupportHEVC$default(BiliPushAVCodecUtils biliPushAVCodecUtils, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return biliPushAVCodecUtils.isSupportHEVC(z6);
    }

    private final boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, String str, boolean z6) {
        if (codecSupportsType(mediaCodecInfo, str) && selectColorFormat(mediaCodecInfo.getCapabilitiesForType(str), z6)) {
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String levelToString(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = r5
            int r0 = r0.hashCode()
            r6 = r0
            r0 = r6
            r1 = -1851077871(0xffffffff91aacb11, float:-2.694642E-28)
            if (r0 == r1) goto L47
            r0 = r6
            r1 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            if (r0 == r1) goto L32
            r0 = r6
            r1 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r0 == r1) goto L1d
            goto L50
        L1d:
            r0 = r5
            java.lang.String r1 = "video/avc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L50
        L29:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.avcLevelToString(r1)
            r5 = r0
            goto L5b
        L32:
            r0 = r5
            java.lang.String r1 = "video/hevc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L50
        L3e:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.hevcLevelToString(r1)
            r5 = r0
            goto L5b
        L47:
            r0 = r5
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
        L50:
            r0 = 0
            r5 = r0
            goto L5b
        L55:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.dolbyLevelToString(r1)
            r5 = r0
        L5b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.levelToString(int, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String profileToString(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = r5
            int r0 = r0.hashCode()
            r6 = r0
            r0 = r6
            r1 = -1851077871(0xffffffff91aacb11, float:-2.694642E-28)
            if (r0 == r1) goto L47
            r0 = r6
            r1 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            if (r0 == r1) goto L32
            r0 = r6
            r1 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r0 == r1) goto L1d
            goto L50
        L1d:
            r0 = r5
            java.lang.String r1 = "video/avc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L50
        L29:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.avcProfileToString(r1)
            r5 = r0
            goto L5b
        L32:
            r0 = r5
            java.lang.String r1 = "video/hevc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L50
        L3e:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.hevcProfileToString(r1)
            r5 = r0
            goto L5b
        L47:
            r0 = r5
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
        L50:
            r0 = 0
            r5 = r0
            goto L5b
        L55:
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.dolbyProfileToString(r1)
            r5 = r0
        L5b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.profileToString(int, java.lang.String):java.lang.String");
    }

    private final boolean selectColorFormat(MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6) {
        for (int i7 : codecCapabilities.colorFormats) {
            if (z6) {
                if (i7 == 54) {
                    return true;
                }
            } else if (i7 == 21 || i7 == 2130708361) {
                return true;
            }
        }
        return false;
    }

    private final boolean tryConfigHDREncoder(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        try {
            Iterator it = ArrayIteratorKt.iterator(mediaCodecInfo.getCapabilitiesForType(HEVC_MIME).profileLevels);
            while (true) {
                if (!it.hasNext()) {
                    codecProfileLevel = null;
                    break;
                }
                codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) it.next();
                if (codecProfileLevel.profile == 4096) {
                    break;
                }
            }
            if (Build.VERSION.SDK_INT < 33 || codecProfileLevel == null) {
                return false;
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(HEVC_MIME, 1920, 1080);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("bitrate", LiveConstants.VIDEO_BITRATE_3000);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 3);
            mediaFormatCreateVideoFormat.setInteger("max-input-size", 0);
            mediaFormatCreateVideoFormat.setInteger("profile", codecProfileLevel.profile);
            mediaFormatCreateVideoFormat.setInteger("level", codecProfileLevel.level);
            mediaFormatCreateVideoFormat.setInteger("color-standard", 6);
            mediaFormatCreateVideoFormat.setInteger("color-range", 2);
            mediaFormatCreateVideoFormat.setInteger("color-transfer", 6);
            mediaFormatCreateVideoFormat.setInteger("color-format", 54);
            mediaFormatCreateVideoFormat.setFeatureEnabled("hdr-editing", true);
            LivePusherLog.i$default(TAG, "createByCodecName:" + mediaCodecInfo.getName() + "....", null, 4, null);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfo.getName());
            LivePusherLog.i$default(TAG, "createByCodecName:" + mediaCodecInfo.getName() + " done!, and encode:" + mediaCodecCreateByCodecName + ", configure format:" + mediaFormatCreateVideoFormat, null, 4, null);
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            LivePusherLog.i$default(TAG, "createByCodecName:" + mediaCodecInfo.getName() + " done!, and encode:" + mediaCodecCreateByCodecName + ", configure format:" + mediaFormatCreateVideoFormat + ", done!", null, 4, null);
            mediaCodecCreateByCodecName.release();
            return true;
        } catch (Exception e7) {
            LivePusherLog.w(TAG, "has tryConfigHDREncode exception:" + e7.getMessage(), e7);
            return false;
        }
    }

    @Nullable
    public final String avcLevelToString(int i7) {
        String str;
        if (i7 == 1) {
            str = "AVCLevel1";
        } else if (i7 != 2) {
            switch (i7) {
                case 4:
                    str = "AVCLevel11";
                    break;
                case 8:
                    str = "AVCLevel12";
                    break;
                case 16:
                    str = "AVCLevel13";
                    break;
                case 32:
                    str = "AVCLevel2";
                    break;
                case 64:
                    str = "AVCLevel21";
                    break;
                case 128:
                    str = "AVCLevel22";
                    break;
                case 256:
                    str = "AVCLevel3";
                    break;
                case 512:
                    str = "AVCLevel31";
                    break;
                case 1024:
                    str = "AVCLevel32";
                    break;
                case 2048:
                    str = "AVCLevel4";
                    break;
                case 4096:
                    str = "AVCLevel41";
                    break;
                case 8192:
                    str = "AVCLevel42";
                    break;
                case 16384:
                    str = "AVCLevel5";
                    break;
                case 32768:
                    str = "AVCLevel51";
                    break;
                case 65536:
                    str = "AVCLevel52";
                    break;
                case 131072:
                    str = "AVCLevel6";
                    break;
                case 262144:
                    str = "AVCLevel61";
                    break;
                case AccessibilityNodeInfoCompat.ACTION_COLLAPSE /* 524288 */:
                    str = "AVCLevel62";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = "AVCLevel1b";
        }
        return str;
    }

    @Nullable
    public final String avcProfileToString(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 8 ? i7 != 65536 ? i7 != 524288 ? null : "AVCProfileConstrainedHigh" : "AVCProfileConstrainedBaseline" : "AVCProfileHigh" : "AVCProfileMain" : "AVCProfileBaseline";
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.live.streaming.encoder.MediaCodecPair createEncoder(@org.jetbrains.annotations.NotNull com.bilibili.live.streaming.encoder.EncoderConfig r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.createEncoder(com.bilibili.live.streaming.encoder.EncoderConfig):com.bilibili.live.streaming.encoder.MediaCodecPair");
    }

    @Nullable
    public final String dolbyLevelToString(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? i7 != 32 ? i7 != 64 ? i7 != 128 ? i7 != 256 ? null : "DolbyVisionLevelUhd60" : "DolbyVisionLevelUhd48" : "DolbyVisionLevelUhd30" : "DolbyVisionLevelUhd24" : "DolbyVisionLevelFhd60" : "DolbyVisionLevelFhd30" : "DolbyVisionLevelFhd24" : "DolbyVisionLevelHd30" : "DolbyVisionLevelHd24";
    }

    @Nullable
    public final String dolbyProfileToString(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? i7 != 16 ? i7 != 32 ? i7 != 64 ? i7 != 256 ? i7 != 512 ? i7 != 1024 ? null : "DolbyVisionProfileDvav110" : "DolbyVisionProfileDvavSe" : "DolbyVisionProfileDvheSt" : "DolbyVisionProfileDvheDth" : "DolbyVisionProfileDvheStn" : "DolbyVisionProfileDvheDtr" : "DolbyVisionProfileDvheDen" : "DolbyVisionProfileDvheDer" : "DolbyVisionProfileDvavPen" : "DolbyVisionProfileDvavPer";
    }

    @NotNull
    public final String getAACProfileString(int i7) {
        return getTargetString(mAACProfiles, i7);
    }

    @NotNull
    public final String getAVCLevelString(int i7) {
        return getTargetString(mAVCLevels, i7);
    }

    @NotNull
    public final String getAVCProfileString(int i7) {
        return getTargetString(mAVCProfiles, i7);
    }

    @NotNull
    public final String getDolbyLevelString(int i7) {
        return getTargetString(mDolbyLevels, i7);
    }

    @NotNull
    public final String getDolbyProfileString(int i7) {
        return getTargetString(mDolbyProfiles, i7);
    }

    @NotNull
    public final String getHevcLevelString(int i7) {
        return getTargetString(mHEVCLevels, i7);
    }

    @NotNull
    public final String getHevcProfileString(int i7) {
        return getTargetString(mHEVCProfiles, i7);
    }

    @Nullable
    public final MediaCodecInfo.CodecProfileLevel getSupportLatestAVCProfileLevel(boolean z6) {
        Object next;
        Object next2;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(AVC_MIME, false);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfoFindCodecForType.getCapabilitiesForType(AVC_MIME).profileLevels;
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile <= 8) {
                arrayList.add(codecProfileLevel);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i7 = ((MediaCodecInfo.CodecProfileLevel) next).profile;
                Object obj = next;
                do {
                    Object next3 = it.next();
                    int i8 = ((MediaCodecInfo.CodecProfileLevel) next3).profile;
                    next = obj;
                    int i9 = i7;
                    if (i7 < i8) {
                        next = next3;
                        i9 = i8;
                    }
                    obj = next;
                    i7 = i9;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = (MediaCodecInfo.CodecProfileLevel) next;
        if (codecProfileLevel2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((MediaCodecInfo.CodecProfileLevel) obj2).profile == codecProfileLevel2.profile) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i10 = ((MediaCodecInfo.CodecProfileLevel) next2).level;
                Object obj3 = next2;
                do {
                    Object next4 = it2.next();
                    int i11 = ((MediaCodecInfo.CodecProfileLevel) next4).level;
                    next2 = obj3;
                    int i12 = i10;
                    if (i10 < i11) {
                        next2 = next4;
                        i12 = i11;
                    }
                    obj3 = next2;
                    i10 = i12;
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = (MediaCodecInfo.CodecProfileLevel) next2;
        if (codecProfileLevel3 == null) {
            return null;
        }
        if (codecProfileLevel3.level > 32768 && z6) {
            codecProfileLevel3.level = 32768;
        }
        StringBuilder sbA = G0.b.a("latestAVCProfile:", profileToString(codecProfileLevel3.profile, AVC_MIME), ", level:", levelToString(codecProfileLevel3.level, AVC_MIME), " filterProfileLevel:");
        sbA.append(z6);
        LivePusherLog.i$default(TAG, sbA.toString(), null, 4, null);
        return codecProfileLevel3;
    }

    @Nullable
    public final MediaCodecInfo.CodecProfileLevel getSupportLatestDolbyProfileLevel(boolean z6) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        Object next;
        int i7 = 1;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(DOLBY_MIME, true);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfoFindCodecForType.getCapabilitiesForType(DOLBY_MIME).profileLevels;
        CollectionsKt.listOf(64);
        if (codecProfileLevelArr.length == 0) {
            return null;
        }
        if (codecProfileLevelArr.length == 0) {
            codecProfileLevel = null;
        } else {
            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[0];
            int lastIndex = ArraysKt.getLastIndex(codecProfileLevelArr);
            if (lastIndex == 0) {
                codecProfileLevel = codecProfileLevel2;
            } else {
                int i8 = codecProfileLevel2.profile;
                codecProfileLevel = codecProfileLevel2;
                if (1 <= lastIndex) {
                    while (true) {
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = codecProfileLevelArr[i7];
                        int i9 = codecProfileLevel3.profile;
                        int i10 = i8;
                        if (i8 < i9) {
                            codecProfileLevel2 = codecProfileLevel3;
                            i10 = i9;
                        }
                        codecProfileLevel = codecProfileLevel2;
                        if (i7 == lastIndex) {
                            break;
                        }
                        i7++;
                        i8 = i10;
                    }
                }
            }
        }
        if (codecProfileLevel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel4 : codecProfileLevelArr) {
            if (codecProfileLevel4.profile == codecProfileLevel.profile) {
                arrayList.add(codecProfileLevel4);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i11 = ((MediaCodecInfo.CodecProfileLevel) next).level;
                Object obj = next;
                do {
                    Object next2 = it.next();
                    int i12 = ((MediaCodecInfo.CodecProfileLevel) next2).level;
                    next = obj;
                    int i13 = i11;
                    if (i11 < i12) {
                        next = next2;
                        i13 = i12;
                    }
                    obj = next;
                    i11 = i13;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel5 = (MediaCodecInfo.CodecProfileLevel) next;
        if (codecProfileLevel5 == null) {
            return null;
        }
        StringBuilder sbA = G0.b.a("latestDolbyProfile:", profileToString(codecProfileLevel5.profile, DOLBY_MIME), ", level:", levelToString(codecProfileLevel5.level, DOLBY_MIME), " filterProfileLevel:");
        sbA.append(z6);
        LivePusherLog.i$default(TAG, sbA.toString(), null, 4, null);
        return codecProfileLevel5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Nullable
    public final MediaCodecInfo.CodecProfileLevel getSupportLatestHEVCProfileLevel(boolean z6, boolean z7) {
        ?? arrayList;
        Object next;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(HEVC_MIME, z7);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfoFindCodecForType.getCapabilitiesForType(HEVC_MIME).profileLevels;
        if (!z7) {
            ArrayList arrayList2 = new ArrayList();
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                arrayList = arrayList2;
                if (i7 >= length) {
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i7];
                if (codecProfileLevel.profile == 1) {
                    arrayList2.add(codecProfileLevel);
                }
                i7++;
            }
        } else {
            arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                if (codecProfileLevel2.profile == 4096) {
                    arrayList.add(codecProfileLevel2);
                }
            }
            if (arrayList.size() <= 0) {
                arrayList = getSupportLatestHEVCProfileLevel$lambda$6(codecProfileLevelArr);
            }
        }
        Iterator it = ((Iterable) arrayList).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i8 = ((MediaCodecInfo.CodecProfileLevel) next).level;
                Object obj = next;
                do {
                    Object next2 = it.next();
                    int i9 = ((MediaCodecInfo.CodecProfileLevel) next2).level;
                    next = obj;
                    int i10 = i8;
                    if (i8 < i9) {
                        next = next2;
                        i10 = i9;
                    }
                    obj = next;
                    i8 = i10;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = (MediaCodecInfo.CodecProfileLevel) next;
        if (codecProfileLevel3 == null) {
            return null;
        }
        if (codecProfileLevel3.level > 65536 && z6) {
            codecProfileLevel3.level = 65536;
        }
        StringBuilder sbA = G0.b.a("latestHEVCProfile:", profileToString(codecProfileLevel3.profile, HEVC_MIME), ", level:", levelToString(codecProfileLevel3.level, HEVC_MIME), " filterProfileLevel:");
        sbA.append(z6);
        LivePusherLog.i$default(TAG, sbA.toString(), null, 4, null);
        return codecProfileLevel3;
    }

    @Nullable
    public final String hevcLevelToString(int i7) {
        String str;
        if (i7 == 1) {
            str = "HEVCMainTierLevel1";
        } else if (i7 != 2) {
            switch (i7) {
                case 4:
                    str = "HEVCMainTierLevel2";
                    break;
                case 8:
                    str = "HEVCHighTierLevel2";
                    break;
                case 16:
                    str = "HEVCMainTierLevel21";
                    break;
                case 32:
                    str = "HEVCHighTierLevel21";
                    break;
                case 64:
                    str = "HEVCMainTierLevel3";
                    break;
                case 128:
                    str = "HEVCHighTierLevel3";
                    break;
                case 256:
                    str = "HEVCMainTierLevel31";
                    break;
                case 512:
                    str = "HEVCHighTierLevel31";
                    break;
                case 1024:
                    str = "HEVCMainTierLevel4";
                    break;
                case 2048:
                    str = "HEVCHighTierLevel4";
                    break;
                case 4096:
                    str = "HEVCMainTierLevel41";
                    break;
                case 8192:
                    str = "HEVCHighTierLevel41";
                    break;
                case 16384:
                    str = "HEVCMainTierLevel5";
                    break;
                case 32768:
                    str = "HEVCHighTierLevel5";
                    break;
                case 65536:
                    str = "HEVCMainTierLevel51";
                    break;
                case 131072:
                    str = "HEVCHighTierLevel51";
                    break;
                case 262144:
                    str = "HEVCMainTierLevel52";
                    break;
                case AccessibilityNodeInfoCompat.ACTION_COLLAPSE /* 524288 */:
                    str = "HEVCHighTierLevel52";
                    break;
                case AccessibilityNodeInfoCompat.ACTION_DISMISS /* 1048576 */:
                    str = "HEVCMainTierLevel6";
                    break;
                case AccessibilityNodeInfoCompat.ACTION_SET_TEXT /* 2097152 */:
                    str = "HEVCHighTierLevel6";
                    break;
                case 4194304:
                    str = "HEVCMainTierLevel61";
                    break;
                case GravityCompat.RELATIVE_LAYOUT_DIRECTION /* 8388608 */:
                    str = "HEVCHighTierLevel61";
                    break;
                case 16777216:
                    str = "HEVCMainTierLevel62";
                    break;
                case BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D /* 33554432 */:
                    str = "HEVCHighTierLevel62";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = "HEVCHighTierLevel1";
        }
        return str;
    }

    @Nullable
    public final String hevcProfileToString(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 4096 ? i7 != 8192 ? null : "HEVCProfileMain10HDR10Plus" : "HEVCProfileMain10HDR10" : "HEVCProfileMainStill" : "HEVCProfileMain10" : "HEVCProfileMain";
    }

    public final boolean isSupportAVC() throws Throwable {
        boolean z6;
        try {
            z6 = findCodecForType(AVC_MIME, false) != null;
            BiliPushDevice biliPushDevice = BiliPushDevice.INSTANCE;
            String sOCModel = biliPushDevice.getSOCModel();
            String cPUName = sOCModel;
            if (sOCModel == null) {
                cPUName = biliPushDevice.getCPUName();
            }
            LivePusherLog.i$default(TAG, "current CPU:" + cPUName + " is support AVC encoder?:" + z6, null, 4, null);
        } catch (Exception e7) {
            BiliPushDevice biliPushDevice2 = BiliPushDevice.INSTANCE;
            String sOCModel2 = biliPushDevice2.getSOCModel();
            String cPUName2 = sOCModel2;
            if (sOCModel2 == null) {
                cPUName2 = biliPushDevice2.getCPUName();
            }
            LivePusherLog.i(TAG, z.a("current CPU:", cPUName2, ", isSupportAVC exception:", e7.getMessage()), e7);
            z6 = false;
        }
        return z6;
    }

    public final boolean isSupportDolby() throws Throwable {
        boolean z6 = true;
        try {
            if (findCodecForType(DOLBY_MIME, true) == null) {
                z6 = false;
            }
            BiliPushDevice biliPushDevice = BiliPushDevice.INSTANCE;
            String sOCModel = biliPushDevice.getSOCModel();
            String cPUName = sOCModel;
            if (sOCModel == null) {
                cPUName = biliPushDevice.getCPUName();
            }
            LivePusherLog.i$default(TAG, "current CPU:" + cPUName + " is support Dolby Vision encoder?:" + z6, null, 4, null);
        } catch (Exception e7) {
            BiliPushDevice biliPushDevice2 = BiliPushDevice.INSTANCE;
            String sOCModel2 = biliPushDevice2.getSOCModel();
            String cPUName2 = sOCModel2;
            if (sOCModel2 == null) {
                cPUName2 = biliPushDevice2.getCPUName();
            }
            LivePusherLog.i(TAG, z.a("current CPU:", cPUName2, ", isSupportDolby exception:", e7.getMessage()), e7);
            z6 = false;
        }
        return z6;
    }

    public final boolean isSupportHDR() {
        boolean zTryConfigHDREncoder;
        try {
            MediaCodecInfo mediaCodecInfoFindHEVCCodecForType = findHEVCCodecForType();
            if (mediaCodecInfoFindHEVCCodecForType == null) {
                return false;
            }
            zTryConfigHDREncoder = tryConfigHDREncoder(mediaCodecInfoFindHEVCCodecForType);
        } catch (Exception e7) {
            zTryConfigHDREncoder = false;
        }
        return zTryConfigHDREncoder;
    }

    public final boolean isSupportHEVC(boolean z6) throws Throwable {
        boolean z7;
        try {
            z7 = findCodecForType(HEVC_MIME, z6) != null;
            BiliPushDevice biliPushDevice = BiliPushDevice.INSTANCE;
            String sOCModel = biliPushDevice.getSOCModel();
            String cPUName = sOCModel;
            if (sOCModel == null) {
                cPUName = biliPushDevice.getCPUName();
            }
            LivePusherLog.i$default(TAG, "current CPU:" + cPUName + " is support HEVC encoder?:" + z7, null, 4, null);
        } catch (Exception e7) {
            BiliPushDevice biliPushDevice2 = BiliPushDevice.INSTANCE;
            String sOCModel2 = biliPushDevice2.getSOCModel();
            String cPUName2 = sOCModel2;
            if (sOCModel2 == null) {
                cPUName2 = biliPushDevice2.getCPUName();
            }
            LivePusherLog.i(TAG, z.a("current CPU:", cPUName2, ", isSupportHEVC exception:", e7.getMessage()), e7);
            z7 = false;
        }
        return z7;
    }
}

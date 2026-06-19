package com.bilibili.studio.kaleidoscope.sdk.utils;

import com.bilibili.montage.MontageVersion;
import com.bilibili.montage.blcv.CvMattingMode;
import com.bilibili.montage.blcv.CvModelType;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/utils/MontageDefines.class */
public final class MontageDefines {

    @NotNull
    public static final String CV_FX_NAME_MATTING = "VT_CV_MATTING";

    @NotNull
    public static final String KEY_BUILTIN_AUDIO_FX_NAME_VOICE_CHANGE = "Voice Change";

    @NotNull
    public static final String KEY_BUILTIN_AUDIO_FX_PARAM_AUDIO_EFFECT_TYPE = "Audio Effect Type";

    @NotNull
    public static final MontageDefines INSTANCE = new MontageDefines();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f108423a = CvMattingMode.CV_MATTING_HEAD.getValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f108424b = CvMattingMode.CV_MATTING_HUMAN.getValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f108425c = CvModelType.BL_MOD_FACE_VIDEO.getValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f108426d = CvModelType.BL_MOD_IRIS.getValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f108427e = CvModelType.BL_MOD_HAND.getValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f108428f = CvModelType.BL_MOD_SEGMENT.getValue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f108429g = CvModelType.BL_MOD_AVATAR.getValue();
    public static final int h = CvModelType.BL_MOD_CAT_FACE.getValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f108430i = CvModelType.BL_MOD_HEAD_SEG.getValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f108431j = CvModelType.BL_MOD_SEGMENT_VIDEO.getValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f108432k = CvModelType.BL_MOD_LIP_SEG.getValue();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f108433l = CvModelType.BL_MOD_BODY.getValue();

    @JvmStatic
    @NotNull
    public static final String getVersion() {
        return MontageVersion.getVersion();
    }

    public final int getCV_BL_MOD_AVATAR() {
        return f108429g;
    }

    public final int getCV_BL_MOD_BODY() {
        return f108433l;
    }

    public final int getCV_BL_MOD_CAT_FACE() {
        return h;
    }

    public final int getCV_BL_MOD_FACE_VIDEO() {
        return f108425c;
    }

    public final int getCV_BL_MOD_HAND() {
        return f108427e;
    }

    public final int getCV_BL_MOD_HEAD_SEG() {
        return f108430i;
    }

    public final int getCV_BL_MOD_IRIS() {
        return f108426d;
    }

    public final int getCV_BL_MOD_LIP_SEG() {
        return f108432k;
    }

    public final int getCV_BL_MOD_SEGMENT() {
        return f108428f;
    }

    public final int getCV_BL_MOD_SEGMENT_VIDEO() {
        return f108431j;
    }

    public final int getCV_FX_NAME_MATTING_MODEL_HEADER() {
        return f108423a;
    }

    public final int getCV_FX_NAME_MATTING_MODEL_HUMAN() {
        return f108424b;
    }
}

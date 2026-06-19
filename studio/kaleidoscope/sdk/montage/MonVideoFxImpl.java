package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.montage.FX.MontageVideoFx;
import com.bilibili.studio.kaleidoscope.sdk.VideoFx;
import mA0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoFxImpl.class */
public final class MonVideoFxImpl extends MonFxImpl implements VideoFx {
    private static final String TAG = "Mon.VF.Impl";
    private MontageVideoFx mMonVideoFx;
    private final c mSupportVideoFx;

    private MonVideoFxImpl(@NonNull MontageVideoFx montageVideoFx) {
        super(montageVideoFx);
        this.mMonVideoFx = montageVideoFx;
        this.mSupportVideoFx = new mA0.a(montageVideoFx);
    }

    @Nullable
    public static VideoFx box(@Nullable MontageVideoFx montageVideoFx) {
        if (montageVideoFx == null) {
            return null;
        }
        return new MonVideoFxImpl(montageVideoFx);
    }

    @Nullable
    public static MontageVideoFx unbox(@Nullable VideoFx videoFx) {
        if (videoFx == null) {
            return null;
        }
        return (MontageVideoFx) videoFx.getVideoFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public void enableEffect(boolean z6) {
        this.mMonVideoFx.enableEffect(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public String getBuiltinVideoFxName() {
        return this.mMonVideoFx.getBuiltinVideoFxName();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public long getCvConfig() {
        return this.mMonVideoFx.getUInt64Val(MontageVideoFx.BUILTIN_VIDEO_FX_PARAM_CV_CONFIG);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public double getFloatVal(String str) {
        return this.mMonVideoFx.getFloatVal(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public int getIndex() {
        return this.mMonVideoFx.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public int getMattingMode() {
        return this.mMonVideoFx.getIntVal(MontageVideoFx.BUILTIN_VIDEO_FX_PARAM_CV_MATTING_MODE);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public Object getVideoFx() {
        return this.mMonVideoFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public String getVideoFxPackageId() {
        return this.mMonVideoFx.getVideoFxPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public int getVideoFxType() {
        return this.mMonVideoFx.getVideoFxType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public boolean isCV() {
        return this.mMonVideoFx.isCv();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeAllKeyframe(String str) {
        return this.mMonVideoFx.removeAllKeyframe(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return this.mMonVideoFx.removeKeyframeAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setBooleanVal(String str, boolean z6) {
        this.mMonVideoFx.setBooleanVal(str, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public void setDuration(long j7) {
        this.mMonVideoFx.changeInPoint(0L);
        this.mMonVideoFx.changeOutPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public void setExprVar(String str, double d7) {
        this.mMonVideoFx.setExprVar(str, d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setFloatVal(String str, double d7) {
        this.mMonVideoFx.setFloatVal(str, d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public void setMenuVal(String str, String str2) {
        this.mMonVideoFx.setMenuVal(str, str2);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setStringVal(String str, String str2) {
        int i7;
        int i8;
        String strSubstring;
        mA0.a aVar = this.mSupportVideoFx;
        aVar.getClass();
        boolean zEquals = "Description String".equals(str);
        MontageVideoFx montageVideoFx = aVar.a;
        if (!zEquals) {
            if ("Resource Dir".equals(str)) {
                return;
            }
            montageVideoFx.setStringVal(str, str2);
            return;
        }
        int iIndexOf = str2.trim().indexOf(GameCardButton.extraParamSource);
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i9 = iIndexOf + 6;
            int length = str2.length();
            int i10 = -1;
            while (true) {
                i7 = i10;
                i8 = -1;
                if (i9 < 0) {
                    break;
                }
                i8 = -1;
                if (i9 >= length) {
                    break;
                }
                int i11 = i7;
                if (str2.charAt(i9) == '\"') {
                    if (i7 != -1) {
                        i8 = i9;
                        break;
                    }
                    i11 = i9;
                }
                i9++;
                i10 = i11;
            }
            strSubstring = null;
            if (i7 >= 0) {
                strSubstring = null;
                if (i8 > i7) {
                    strSubstring = str2.substring(i7 + 1, i8);
                }
            }
        }
        if (strSubstring != null) {
            montageVideoFx.setStringVal("Resource Dir", strSubstring);
        }
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public void setSupportFloatVal(String str, double d7) {
        setFloatVal(str, d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoFx
    public void setVideoFx(Object obj) {
        this.mMonVideoFx = (MontageVideoFx) obj;
    }
}

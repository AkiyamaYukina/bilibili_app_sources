package com.bilibili.studio.videoeditor.capturev3.data;

import B0.a;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import com.bilibili.base.BiliContext;
import com.bilibili.xpref.Xpref;
import zB0.d;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureBeautyEntity.class */
@Keep
public class CaptureBeautyEntity {
    public String beautyType;

    @DrawableRes
    public int coverId;
    public float currentValue;
    public float defaultValue;
    public boolean isCollected;
    public boolean isDirection;
    public boolean isSelect;
    public boolean isTabFirstItem;
    public float maxValue;
    public String name;
    public String params;
    public int progress;

    public CaptureBeautyEntity(Context context, String str, String str2, int i7, boolean z6, float f7, float f8, String str3, boolean z7) {
        this(context, str, str2, i7, z6, false, f7, f8, str3, z7);
    }

    public CaptureBeautyEntity(Context context, String str, String str2, int i7, boolean z6, boolean z7, float f7, float f8, String str3, boolean z8) {
        this.isCollected = false;
        this.name = str;
        this.params = str2;
        this.coverId = i7;
        this.isSelect = z6;
        this.isDirection = z7;
        this.maxValue = f7;
        float f9 = Xpref.getSharedPreferences(context, "editor_config").getFloat(createBeautyParamsKey(str2, getBeautifyPostfix()), f8);
        this.currentValue = f9;
        this.defaultValue = f8;
        this.progress = getProgress(f9, 100, f7);
        this.beautyType = str3;
        this.isTabFirstItem = z8;
    }

    private String createBeautyParamsKey(String str, String str2) {
        return a.a(str, str2, " V4");
    }

    private String getBeautifyPostfix() {
        int iB;
        j jVarA = j.a(BiliContext.application());
        d dVarA = d.a();
        if (dVarA == null) {
            iB = jVarA.b("DeviceIndex", Integer.MIN_VALUE);
        } else if (dVarA.b) {
            iB = dVarA.a.getNowDeviceIndex();
        } else {
            iB = jVarA.b("DeviceIndex", dVarA.a.getNowDeviceIndex());
            dVarA.b(iB);
        }
        return iB == 1 ? " FRONT CAMERA" : " BACK CAMERA";
    }

    public static float getCurrentValue(int i7, int i8, float f7) {
        return (((i7 * f7) * 2.0f) / i8) - 1.0f;
    }

    public static int getProgress(float f7, int i7, float f8) {
        return Math.round(((f7 + 1.0f) * i7) / (f8 * 2.0f));
    }

    public void resetStatisticData() {
        this.isCollected = false;
    }
}

package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenerationRequestLocation.class */
@Keep
public final class MaterialServerGenerationRequestLocation {

    @SerializedName("latitude")
    private final float latitude;

    @SerializedName("longitude")
    private final float longitude;

    public MaterialServerGenerationRequestLocation(float f7, float f8) {
        this.longitude = f7;
        this.latitude = f8;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }
}

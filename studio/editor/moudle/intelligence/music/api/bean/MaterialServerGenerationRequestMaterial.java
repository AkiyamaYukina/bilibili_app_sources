package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import B0.b;
import G0.d;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.constraintlayout.widget.e;
import androidx.room.B;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MaterialServerGenerationRequestMaterial.class */
@Keep
public final class MaterialServerGenerationRequestMaterial {

    @SerializedName("Position")
    @NotNull
    private final String Position;

    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    private final long duration;

    @SerializedName(Constant.IN_KEY_LOCATION)
    @NotNull
    private final MaterialServerGenerationRequestLocation location;

    @SerializedName("material_id")
    @NotNull
    private final String materialId;

    @SerializedName("material_type")
    private final int materialType;

    @SerializedName("ratio")
    @NotNull
    private final String ratio;

    @SerializedName(GameCardButton.extraParamSource)
    @NotNull
    private final String source;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    @SerializedName("time")
    private final long time;

    public MaterialServerGenerationRequestMaterial(@NotNull String str, int i7, long j7, @NotNull String str2, @NotNull String str3, long j8, @NotNull MaterialServerGenerationRequestLocation materialServerGenerationRequestLocation, @NotNull String str4, @NotNull String str5) {
        this.materialId = str;
        this.materialType = i7;
        this.duration = j7;
        this.tag = str2;
        this.source = str3;
        this.time = j8;
        this.location = materialServerGenerationRequestLocation;
        this.Position = str4;
        this.ratio = str5;
    }

    public static /* synthetic */ MaterialServerGenerationRequestMaterial copy$default(MaterialServerGenerationRequestMaterial materialServerGenerationRequestMaterial, String str, int i7, long j7, String str2, String str3, long j8, MaterialServerGenerationRequestLocation materialServerGenerationRequestLocation, String str4, String str5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = materialServerGenerationRequestMaterial.materialId;
        }
        if ((i8 & 2) != 0) {
            i7 = materialServerGenerationRequestMaterial.materialType;
        }
        if ((i8 & 4) != 0) {
            j7 = materialServerGenerationRequestMaterial.duration;
        }
        if ((i8 & 8) != 0) {
            str2 = materialServerGenerationRequestMaterial.tag;
        }
        if ((i8 & 16) != 0) {
            str3 = materialServerGenerationRequestMaterial.source;
        }
        if ((i8 & 32) != 0) {
            j8 = materialServerGenerationRequestMaterial.time;
        }
        if ((i8 & 64) != 0) {
            materialServerGenerationRequestLocation = materialServerGenerationRequestMaterial.location;
        }
        if ((i8 & 128) != 0) {
            str4 = materialServerGenerationRequestMaterial.Position;
        }
        if ((i8 & 256) != 0) {
            str5 = materialServerGenerationRequestMaterial.ratio;
        }
        return materialServerGenerationRequestMaterial.copy(str, i7, j7, str2, str3, j8, materialServerGenerationRequestLocation, str4, str5);
    }

    @NotNull
    public final String component1() {
        return this.materialId;
    }

    public final int component2() {
        return this.materialType;
    }

    public final long component3() {
        return this.duration;
    }

    @NotNull
    public final String component4() {
        return this.tag;
    }

    @NotNull
    public final String component5() {
        return this.source;
    }

    public final long component6() {
        return this.time;
    }

    @NotNull
    public final MaterialServerGenerationRequestLocation component7() {
        return this.location;
    }

    @NotNull
    public final String component8() {
        return this.Position;
    }

    @NotNull
    public final String component9() {
        return this.ratio;
    }

    @NotNull
    public final MaterialServerGenerationRequestMaterial copy(@NotNull String str, int i7, long j7, @NotNull String str2, @NotNull String str3, long j8, @NotNull MaterialServerGenerationRequestLocation materialServerGenerationRequestLocation, @NotNull String str4, @NotNull String str5) {
        return new MaterialServerGenerationRequestMaterial(str, i7, j7, str2, str3, j8, materialServerGenerationRequestLocation, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialServerGenerationRequestMaterial)) {
            return false;
        }
        MaterialServerGenerationRequestMaterial materialServerGenerationRequestMaterial = (MaterialServerGenerationRequestMaterial) obj;
        return Intrinsics.areEqual(this.materialId, materialServerGenerationRequestMaterial.materialId) && this.materialType == materialServerGenerationRequestMaterial.materialType && this.duration == materialServerGenerationRequestMaterial.duration && Intrinsics.areEqual(this.tag, materialServerGenerationRequestMaterial.tag) && Intrinsics.areEqual(this.source, materialServerGenerationRequestMaterial.source) && this.time == materialServerGenerationRequestMaterial.time && Intrinsics.areEqual(this.location, materialServerGenerationRequestMaterial.location) && Intrinsics.areEqual(this.Position, materialServerGenerationRequestMaterial.Position) && Intrinsics.areEqual(this.ratio, materialServerGenerationRequestMaterial.ratio);
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final MaterialServerGenerationRequestLocation getLocation() {
        return this.location;
    }

    @NotNull
    public final String getMaterialId() {
        return this.materialId;
    }

    public final int getMaterialType() {
        return this.materialType;
    }

    @NotNull
    public final String getPosition() {
        return this.Position;
    }

    @NotNull
    public final String getRatio() {
        return this.ratio;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.ratio.hashCode() + E.a((this.location.hashCode() + C3554n0.a(E.a(E.a(C3554n0.a(I.a(this.materialType, this.materialId.hashCode() * 31, 31), 31, this.duration), 31, this.tag), 31, this.source), 31, this.time)) * 31, 31, this.Position);
    }

    @NotNull
    public String toString() {
        String str = this.materialId;
        int i7 = this.materialType;
        long j7 = this.duration;
        String str2 = this.tag;
        String str3 = this.source;
        long j8 = this.time;
        MaterialServerGenerationRequestLocation materialServerGenerationRequestLocation = this.location;
        String str4 = this.Position;
        String str5 = this.ratio;
        StringBuilder sbA = e.a(i7, "MaterialServerGenerationRequestMaterial(materialId=", str, ", materialType=", ", duration=");
        d.a(j7, ", tag=", str2, sbA);
        b.b(", source=", str3, ", time=", sbA);
        sbA.append(j8);
        sbA.append(", location=");
        sbA.append(materialServerGenerationRequestLocation);
        B.a(", Position=", str4, ", ratio=", str5, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}

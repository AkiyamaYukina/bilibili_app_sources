package com.bilibili.pegasus.data.component;

import G0.b;
import androidx.compose.runtime.C4277b;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/MultiplyDescData.class */
public final class MultiplyDescData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("author_name")
    @Nullable
    private final String f77357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(CaptureSchema.JUMP_PARAMS_EXTRA)
    @Nullable
    private final String f77358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    private final int f77359c;

    public MultiplyDescData() {
        this(null, null, 0, 7, null);
    }

    public MultiplyDescData(@Nullable String str, @Nullable String str2, int i7) {
        this.f77357a = str;
        this.f77358b = str2;
        this.f77359c = i7;
    }

    public /* synthetic */ MultiplyDescData(String str, String str2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 0 : i7);
    }

    public static /* synthetic */ MultiplyDescData copy$default(MultiplyDescData multiplyDescData, String str, String str2, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = multiplyDescData.f77357a;
        }
        if ((i8 & 2) != 0) {
            str2 = multiplyDescData.f77358b;
        }
        if ((i8 & 4) != 0) {
            i7 = multiplyDescData.f77359c;
        }
        return multiplyDescData.copy(str, str2, i7);
    }

    @Nullable
    public final String component1() {
        return this.f77357a;
    }

    @Nullable
    public final String component2() {
        return this.f77358b;
    }

    public final int component3() {
        return this.f77359c;
    }

    @NotNull
    public final MultiplyDescData copy(@Nullable String str, @Nullable String str2, int i7) {
        return new MultiplyDescData(str, str2, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiplyDescData)) {
            return false;
        }
        MultiplyDescData multiplyDescData = (MultiplyDescData) obj;
        return Intrinsics.areEqual(this.f77357a, multiplyDescData.f77357a) && Intrinsics.areEqual(this.f77358b, multiplyDescData.f77358b) && this.f77359c == multiplyDescData.f77359c;
    }

    @Nullable
    public final String getAuthorName() {
        return this.f77357a;
    }

    @Nullable
    public final String getExtra() {
        return this.f77358b;
    }

    public final int getType() {
        return this.f77359c;
    }

    public int hashCode() {
        String str = this.f77357a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77358b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Integer.hashCode(this.f77359c) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final boolean isNormal() {
        return this.f77359c == 0;
    }

    @NotNull
    public String toString() {
        return C4277b.a(this.f77359c, ")", b.a("MultiplyDescData(authorName=", this.f77357a, ", extra=", this.f77358b, ", type="));
    }
}

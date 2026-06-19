package com.bilibili.pegasus.promo.setting;

import androidx.compose.animation.z;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusStyleEnum f78549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final RecommendColumnSwitchData f78552d;

    public a() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i7) {
        PegasusStyle pegasusStyle = PegasusStyle.INSTANCE;
        this(pegasusStyle.getCurrentStyle(), pegasusStyle.currentIsUserStyle(), PegasusStyleKt.currentIsDoubleColumn(pegasusStyle), k.a());
    }

    public a(@NotNull PegasusStyleEnum pegasusStyleEnum, boolean z6, boolean z7, @Nullable RecommendColumnSwitchData recommendColumnSwitchData) {
        this.f78549a = pegasusStyleEnum;
        this.f78550b = z6;
        this.f78551c = z7;
        this.f78552d = recommendColumnSwitchData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f78549a == aVar.f78549a && this.f78550b == aVar.f78550b && this.f78551c == aVar.f78551c && Intrinsics.areEqual(this.f78552d, aVar.f78552d);
    }

    public final int hashCode() {
        int iA = z.a(z.a(this.f78549a.hashCode() * 31, 31, this.f78550b), 31, this.f78551c);
        RecommendColumnSwitchData recommendColumnSwitchData = this.f78552d;
        return iA + (recommendColumnSwitchData == null ? 0 : recommendColumnSwitchData.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ColumnSettingState(currentStyle=" + this.f78549a + ", isUserSettingStyle=" + this.f78550b + ", isDoubleColumn=" + this.f78551c + ", switchInfo=" + this.f78552d + ")";
    }
}

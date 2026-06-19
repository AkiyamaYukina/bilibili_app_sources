package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebRepository.class */
@StabilityInferred(parameters = 0)
public final class TheseusV3WebRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f104169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<b> f104170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f104171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f104172d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebRepository$DisplayMode.class */
    public static final class DisplayMode {
        private static final EnumEntries $ENTRIES;
        private static final DisplayMode[] $VALUES;
        public static final DisplayMode AUTO_HEIGHT = new DisplayMode("AUTO_HEIGHT", 0);
        public static final DisplayMode FIXED_HEIGHT = new DisplayMode("FIXED_HEIGHT", 1);

        private static final /* synthetic */ DisplayMode[] $values() {
            return new DisplayMode[]{AUTO_HEIGHT, FIXED_HEIGHT};
        }

        static {
            DisplayMode[] displayModeArr$values = $values();
            $VALUES = displayModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(displayModeArr$values);
        }

        private DisplayMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DisplayMode> getEntries() {
            return $ENTRIES;
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "CloseRequest(reason=null, source=null, logSummary=null)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebRepository$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f104173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final DisplayMode f104174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f104175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f104176d;

        public b(@NotNull String str, @NotNull DisplayMode displayMode, @Nullable Integer num, boolean z6) {
            this.f104173a = str;
            this.f104174b = displayMode;
            this.f104175c = num;
            this.f104176d = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f104173a, bVar.f104173a) && this.f104174b == bVar.f104174b && Intrinsics.areEqual(this.f104175c, bVar.f104175c) && this.f104176d == bVar.f104176d;
        }

        public final int hashCode() {
            int iHashCode = this.f104173a.hashCode();
            int iHashCode2 = this.f104174b.hashCode();
            Integer num = this.f104175c;
            return Boolean.hashCode(this.f104176d) + ((((iHashCode2 + (iHashCode * 31)) * 31) + (num == null ? 0 : num.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            return "Request(url=" + this.f104173a + ", displayMode=" + this.f104174b + ", heightDp=" + this.f104175c + ", pausePlayback=" + this.f104176d + ")";
        }
    }

    @Inject
    public TheseusV3WebRepository() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f104169a = mutableSharedFlowMutableSharedFlow$default;
        this.f104170b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f104171c = mutableSharedFlowMutableSharedFlow$default2;
        this.f104172d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public final void a(String str, DisplayMode displayMode, Integer num, boolean z6) {
        if (StringsKt.isBlank(str)) {
            BLog.w("TheseusV3WebRepo", "show skipped reason=blank_url mode=" + displayMode + " heightDp=" + num + " pausePlayback=" + z6);
            return;
        }
        boolean zTryEmit = this.f104169a.tryEmit(new b(str, displayMode, num, z6));
        String strA = G.f.a(str.hashCode(), str.length(), "urlHash=", " urlLength=");
        StringBuilder sb = new StringBuilder("show emit accepted=");
        sb.append(zTryEmit);
        sb.append(" mode=");
        sb.append(displayMode);
        sb.append(" heightDp=");
        sb.append(num);
        sb.append(" pausePlayback=");
        sb.append(z6);
        sb.append(" ");
        bilibili.live.app.service.resolver.b.a(sb, strA, "TheseusV3WebRepo");
    }
}

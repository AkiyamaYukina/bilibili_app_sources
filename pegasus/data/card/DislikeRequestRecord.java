package com.bilibili.pegasus.data.card;

import Cx0.n;
import androidx.compose.ui.graphics.e0;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.ui.RouteConstKt;
import fp0.e;
import h6.C7417v;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeRequestRecord.class */
public interface DislikeRequestRecord {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeRequestRecord$a.class */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DislikeReason f77321a;

        public a(@NotNull DislikeReason dislikeReason) {
            this.f77321a = dislikeReason;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f77321a, ((a) obj).f77321a);
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord.c
        @NotNull
        public final DislikeReason getReason() {
            return this.f77321a;
        }

        public final int hashCode() {
            return this.f77321a.hashCode();
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        public final void putDislikeRecord(@NotNull Map<String, String> map) {
            String strValueOf = String.valueOf(this.f77321a.id);
            if (Intrinsics.areEqual("0", strValueOf)) {
                return;
            }
            map.put("reason_id", strValueOf);
        }

        @NotNull
        public final String toString() {
            return "Dislike(reason=" + this.f77321a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeRequestRecord$b.class */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DislikeReason f77322a;

        public b(@NotNull DislikeReason dislikeReason) {
            this.f77322a = dislikeReason;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f77322a, ((b) obj).f77322a);
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord.c
        @NotNull
        public final DislikeReason getReason() {
            return this.f77322a;
        }

        public final int hashCode() {
            return this.f77322a.hashCode();
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        public final void putDislikeRecord(@NotNull Map<String, String> map) {
            String strValueOf = String.valueOf(this.f77322a.id);
            if (Intrinsics.areEqual("0", strValueOf)) {
                return;
            }
            map.put("feedback_id", strValueOf);
        }

        @NotNull
        public final String toString() {
            return "Feedback(reason=" + this.f77322a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeRequestRecord$c.class */
    public interface c extends DislikeRequestRecord {
        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        default String getExtend() {
            return getReason().extend;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        default String getName() {
            return getReason().name;
        }

        @NotNull
        DislikeReason getReason();

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        default String getToast() {
            return getReason().toast;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        default boolean isLightPanelRequiredOnCancel() {
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeRequestRecord$d.class */
    public static final class d implements DislikeRequestRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<e> f77323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<e> f77324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f77325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f77326d;

        public d(@NotNull List list, @NotNull List list2, @Nullable String str, @Nullable String str2) {
            this.f77323a = list;
            this.f77324b = list2;
            this.f77325c = str;
            this.f77326d = str2;
        }

        @NotNull
        public final d a(@NotNull d dVar) {
            return new d(CollectionsKt.plus(this.f77323a, dVar.f77323a), CollectionsKt.plus(this.f77324b, dVar.f77324b), dVar.f77325c, dVar.f77326d);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f77323a, dVar.f77323a) && Intrinsics.areEqual(this.f77324b, dVar.f77324b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f77325c, dVar.f77325c) && Intrinsics.areEqual(this.f77326d, dVar.f77326d);
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        public final String getExtend() {
            return this.f77326d;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        public final String getName() {
            return null;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        @Nullable
        public final String getToast() {
            return this.f77325c;
        }

        public final int hashCode() {
            int iA = e0.a(this.f77323a.hashCode() * 31, 961, this.f77324b);
            int iHashCode = 0;
            String str = this.f77325c;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f77326d;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return ((iA + iHashCode2) * 31) + iHashCode;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        public final boolean isLightPanelRequiredOnCancel() {
            return false;
        }

        @Override // com.bilibili.pegasus.data.card.DislikeRequestRecord
        public final void putDislikeRecord(@NotNull Map<String, String> map) {
            final int i7 = 0;
            String strP = CollectionsKt.p(this.f77323a, ",", (CharSequence) null, (CharSequence) null, new Function1(i7) { // from class: fp0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f118540a;

                {
                    this.f118540a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f118540a) {
                        case 0:
                            e eVar = (e) obj;
                            return eVar.f118538a + "#" + eVar.f118539b;
                        default:
                            ((MutableBundleLike) obj).put(RouteConstKt.PROPS_PAGE_FROM, "mweb");
                            return null;
                    }
                }
            }, 30);
            if (!StringsKt.isBlank(strP)) {
                map.put("reason_ids", strP);
            }
            String strP2 = CollectionsKt.p(this.f77324b, ",", (CharSequence) null, (CharSequence) null, new n(2), 30);
            if (StringsKt.isBlank(strP2)) {
                return;
            }
            map.put("feedback_ids", strP2);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbA = C7417v.a("V5(dislikeList=", ", feedbackList=", ", name=null, toast=", this.f77323a, this.f77324b);
            sbA.append(this.f77325c);
            sbA.append(", extend=");
            return C8770a.a(sbA, this.f77326d, ")");
        }
    }

    @Nullable
    String getExtend();

    @Nullable
    String getName();

    @Nullable
    String getToast();

    boolean isLightPanelRequiredOnCancel();

    void putDislikeRecord(@NotNull Map<String, String> map);
}

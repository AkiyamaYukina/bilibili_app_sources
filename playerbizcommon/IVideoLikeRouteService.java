package com.bilibili.playerbizcommon;

import I.E;
import androidx.compose.animation.core.I;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService.class */
public interface IVideoLikeRouteService {

    @NotNull
    public static final String ACTION_LIKE = "like";

    @NotNull
    public static final String ACTION_TRIPLE_LIKE = "triplelike";

    @NotNull
    public static final a Companion = a.f79539a;
    public static final int HAS_CANCEL_DISLIKE = 65005;
    public static final int HAS_CANCEL_LIKE = 65004;
    public static final int HAS_DISLIKE = 65007;
    public static final int HAS_LIKE = 65006;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionDislikePolymer.class */
    public static final class ActionDislikePolymer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f79473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f79475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f79476f;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionDislikePolymer$Builder.class */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Long f79477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Integer f79478b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f79479c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public String f79480d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public String f79481e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f79482f;

            @NotNull
            public final ActionDislikePolymer build() {
                return new ActionDislikePolymer(this.f79477a.longValue(), this.f79478b.intValue(), this.f79479c, this.f79480d, this.f79481e, this.f79482f);
            }

            @Nullable
            public final String getActionId() {
                return this.f79482f;
            }

            @Nullable
            public final Long getAid() {
                return this.f79477a;
            }

            @Nullable
            public final Integer getDislike() {
                return this.f79478b;
            }

            @Nullable
            public final String getFrom() {
                return this.f79480d;
            }

            @Nullable
            public final String getFromSpmid() {
                return this.f79479c;
            }

            @Nullable
            public final String getSpmid() {
                return this.f79481e;
            }

            public final void setActionId(@Nullable String str) {
                this.f79482f = str;
            }

            public final void setAid(@Nullable Long l7) {
                this.f79477a = l7;
            }

            public final void setDislike(@Nullable Integer num) {
                this.f79478b = num;
            }

            public final void setFrom(@Nullable String str) {
                this.f79480d = str;
            }

            public final void setFromSpmid(@Nullable String str) {
                this.f79479c = str;
            }

            public final void setSpmid(@Nullable String str) {
                this.f79481e = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionDislikePolymer$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionDislikePolymer build(@NotNull Function1<? super Builder, Unit> function1) {
                Builder builder = new Builder();
                function1.invoke(builder);
                return builder.build();
            }
        }

        public ActionDislikePolymer(long j7, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f79471a = j7;
            this.f79472b = i7;
            this.f79473c = str;
            this.f79474d = str2;
            this.f79475e = str3;
            this.f79476f = str4;
        }

        public /* synthetic */ ActionDislikePolymer(long j7, int i7, String str, String str2, String str3, String str4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, i7, str, str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : str4);
        }

        public static /* synthetic */ ActionDislikePolymer copy$default(ActionDislikePolymer actionDislikePolymer, long j7, int i7, String str, String str2, String str3, String str4, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j7 = actionDislikePolymer.f79471a;
            }
            if ((i8 & 2) != 0) {
                i7 = actionDislikePolymer.f79472b;
            }
            if ((i8 & 4) != 0) {
                str = actionDislikePolymer.f79473c;
            }
            if ((i8 & 8) != 0) {
                str2 = actionDislikePolymer.f79474d;
            }
            if ((i8 & 16) != 0) {
                str3 = actionDislikePolymer.f79475e;
            }
            if ((i8 & 32) != 0) {
                str4 = actionDislikePolymer.f79476f;
            }
            return actionDislikePolymer.copy(j7, i7, str, str2, str3, str4);
        }

        public final long component1() {
            return this.f79471a;
        }

        public final int component2() {
            return this.f79472b;
        }

        @Nullable
        public final String component3() {
            return this.f79473c;
        }

        @Nullable
        public final String component4() {
            return this.f79474d;
        }

        @Nullable
        public final String component5() {
            return this.f79475e;
        }

        @Nullable
        public final String component6() {
            return this.f79476f;
        }

        @NotNull
        public final ActionDislikePolymer copy(long j7, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            return new ActionDislikePolymer(j7, i7, str, str2, str3, str4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionDislikePolymer)) {
                return false;
            }
            ActionDislikePolymer actionDislikePolymer = (ActionDislikePolymer) obj;
            return this.f79471a == actionDislikePolymer.f79471a && this.f79472b == actionDislikePolymer.f79472b && Intrinsics.areEqual(this.f79473c, actionDislikePolymer.f79473c) && Intrinsics.areEqual(this.f79474d, actionDislikePolymer.f79474d) && Intrinsics.areEqual(this.f79475e, actionDislikePolymer.f79475e) && Intrinsics.areEqual(this.f79476f, actionDislikePolymer.f79476f);
        }

        @Nullable
        public final String getActionId() {
            return this.f79476f;
        }

        public final long getAid() {
            return this.f79471a;
        }

        public final int getDislike() {
            return this.f79472b;
        }

        @Nullable
        public final String getFrom() {
            return this.f79474d;
        }

        @Nullable
        public final String getFromSpmid() {
            return this.f79473c;
        }

        @Nullable
        public final String getSpmid() {
            return this.f79475e;
        }

        public int hashCode() {
            int iA = I.a(this.f79472b, Long.hashCode(this.f79471a) * 31, 31);
            int iHashCode = 0;
            String str = this.f79473c;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f79474d;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f79475e;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f79476f;
            if (str4 != null) {
                iHashCode = str4.hashCode();
            }
            return ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ActionDislikePolymer(aid=");
            sb.append(this.f79471a);
            sb.append(", dislike=");
            sb.append(this.f79472b);
            sb.append(", fromSpmid=");
            sb.append(this.f79473c);
            sb.append(", from=");
            sb.append(this.f79474d);
            sb.append(", spmid=");
            sb.append(this.f79475e);
            sb.append(", actionId=");
            return C8770a.a(sb, this.f79476f, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeCallback.class */
    public interface ActionLikeCallback {
        static /* synthetic */ void onRequestSuccess$default(ActionLikeCallback actionLikeCallback, String str, String str2, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestSuccess");
            }
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            actionLikeCallback.onRequestSuccess(str, str2);
        }

        default boolean isCancel() {
            return false;
        }

        default void onRequestFailed(@Nullable Throwable th) {
        }

        default void onRequestSuccess(@Nullable String str, @Nullable String str2) {
        }

        default void onResponseIllegal() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeNologinCallback.class */
    public interface ActionLikeNologinCallback {
        static /* synthetic */ void onRequestSuccess$default(ActionLikeNologinCallback actionLikeNologinCallback, String str, int i7, String str2, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestSuccess");
            }
            if ((i8 & 4) != 0) {
                str2 = null;
            }
            actionLikeNologinCallback.onRequestSuccess(str, i7, str2);
        }

        default boolean isCancel() {
            return false;
        }

        default void onRequestFailed(@Nullable Throwable th) {
        }

        default void onRequestSuccess(@NotNull String str, int i7, @Nullable String str2) {
        }

        default void onResponseIllegal() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeNologinPolymer.class */
    public static final class ActionLikeNologinPolymer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f79485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f79487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f79488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f79489g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f79490i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f79491j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f79492k;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeNologinPolymer$Builder.class */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Long f79493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Integer f79494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f79495c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public String f79496d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public String f79497e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f79498f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f79499g;

            @Nullable
            public String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            @Nullable
            public String f79500i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            @Nullable
            public String f79501j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            @Nullable
            public String f79502k;

            @NotNull
            public final ActionLikeNologinPolymer build() {
                return new ActionLikeNologinPolymer(this.f79493a.longValue(), this.f79494b.intValue(), this.f79495c, this.f79496d, this.f79497e, this.f79498f, this.f79499g, this.h, this.f79500i, this.f79501j, this.f79502k);
            }

            @Nullable
            public final String getAction() {
                return this.f79495c;
            }

            @Nullable
            public final String getActionId() {
                return this.f79502k;
            }

            @Nullable
            public final Long getAid() {
                return this.f79493a;
            }

            @Nullable
            public final String getFrom() {
                return this.f79497e;
            }

            @Nullable
            public final String getFromSpmid() {
                return this.f79496d;
            }

            @Nullable
            public final String getGoTo() {
                return this.h;
            }

            @Nullable
            public final Integer getLike() {
                return this.f79494b;
            }

            @Nullable
            public final String getSource() {
                return this.f79500i;
            }

            @Nullable
            public final String getSpmid() {
                return this.f79498f;
            }

            @Nullable
            public final String getToken() {
                return this.f79501j;
            }

            @Nullable
            public final String getTrackId() {
                return this.f79499g;
            }

            public final void setAction(@Nullable String str) {
                this.f79495c = str;
            }

            public final void setActionId(@Nullable String str) {
                this.f79502k = str;
            }

            public final void setAid(@Nullable Long l7) {
                this.f79493a = l7;
            }

            public final void setFrom(@Nullable String str) {
                this.f79497e = str;
            }

            public final void setFromSpmid(@Nullable String str) {
                this.f79496d = str;
            }

            public final void setGoTo(@Nullable String str) {
                this.h = str;
            }

            public final void setLike(@Nullable Integer num) {
                this.f79494b = num;
            }

            public final void setSource(@Nullable String str) {
                this.f79500i = str;
            }

            public final void setSpmid(@Nullable String str) {
                this.f79498f = str;
            }

            public final void setToken(@Nullable String str) {
                this.f79501j = str;
            }

            public final void setTrackId(@Nullable String str) {
                this.f79499g = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeNologinPolymer$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionLikeNologinPolymer build(@NotNull Function1<? super Builder, Unit> function1) {
                Builder builder = new Builder();
                function1.invoke(builder);
                return builder.build();
            }
        }

        public ActionLikeNologinPolymer(long j7, int i7, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
            this.f79483a = j7;
            this.f79484b = i7;
            this.f79485c = str;
            this.f79486d = str2;
            this.f79487e = str3;
            this.f79488f = str4;
            this.f79489g = str5;
            this.h = str6;
            this.f79490i = str7;
            this.f79491j = str8;
            this.f79492k = str9;
        }

        public /* synthetic */ ActionLikeNologinPolymer(long j7, int i7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, i7, str, str2, str3, str4, str5, str6, str7, str8, (i8 & 1024) != 0 ? null : str9);
        }

        public static /* synthetic */ ActionLikeNologinPolymer copy$default(ActionLikeNologinPolymer actionLikeNologinPolymer, long j7, int i7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j7 = actionLikeNologinPolymer.f79483a;
            }
            if ((i8 & 2) != 0) {
                i7 = actionLikeNologinPolymer.f79484b;
            }
            if ((i8 & 4) != 0) {
                str = actionLikeNologinPolymer.f79485c;
            }
            if ((i8 & 8) != 0) {
                str2 = actionLikeNologinPolymer.f79486d;
            }
            if ((i8 & 16) != 0) {
                str3 = actionLikeNologinPolymer.f79487e;
            }
            if ((i8 & 32) != 0) {
                str4 = actionLikeNologinPolymer.f79488f;
            }
            if ((i8 & 64) != 0) {
                str5 = actionLikeNologinPolymer.f79489g;
            }
            if ((i8 & 128) != 0) {
                str6 = actionLikeNologinPolymer.h;
            }
            if ((i8 & 256) != 0) {
                str7 = actionLikeNologinPolymer.f79490i;
            }
            if ((i8 & 512) != 0) {
                str8 = actionLikeNologinPolymer.f79491j;
            }
            if ((i8 & 1024) != 0) {
                str9 = actionLikeNologinPolymer.f79492k;
            }
            return actionLikeNologinPolymer.copy(j7, i7, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }

        public final long component1() {
            return this.f79483a;
        }

        @Nullable
        public final String component10() {
            return this.f79491j;
        }

        @Nullable
        public final String component11() {
            return this.f79492k;
        }

        public final int component2() {
            return this.f79484b;
        }

        @NotNull
        public final String component3() {
            return this.f79485c;
        }

        @Nullable
        public final String component4() {
            return this.f79486d;
        }

        @Nullable
        public final String component5() {
            return this.f79487e;
        }

        @Nullable
        public final String component6() {
            return this.f79488f;
        }

        @Nullable
        public final String component7() {
            return this.f79489g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @Nullable
        public final String component9() {
            return this.f79490i;
        }

        @NotNull
        public final ActionLikeNologinPolymer copy(long j7, int i7, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
            return new ActionLikeNologinPolymer(j7, i7, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionLikeNologinPolymer)) {
                return false;
            }
            ActionLikeNologinPolymer actionLikeNologinPolymer = (ActionLikeNologinPolymer) obj;
            return this.f79483a == actionLikeNologinPolymer.f79483a && this.f79484b == actionLikeNologinPolymer.f79484b && Intrinsics.areEqual(this.f79485c, actionLikeNologinPolymer.f79485c) && Intrinsics.areEqual(this.f79486d, actionLikeNologinPolymer.f79486d) && Intrinsics.areEqual(this.f79487e, actionLikeNologinPolymer.f79487e) && Intrinsics.areEqual(this.f79488f, actionLikeNologinPolymer.f79488f) && Intrinsics.areEqual(this.f79489g, actionLikeNologinPolymer.f79489g) && Intrinsics.areEqual(this.h, actionLikeNologinPolymer.h) && Intrinsics.areEqual(this.f79490i, actionLikeNologinPolymer.f79490i) && Intrinsics.areEqual(this.f79491j, actionLikeNologinPolymer.f79491j) && Intrinsics.areEqual(this.f79492k, actionLikeNologinPolymer.f79492k);
        }

        @NotNull
        public final String getAction() {
            return this.f79485c;
        }

        @Nullable
        public final String getActionId() {
            return this.f79492k;
        }

        public final long getAid() {
            return this.f79483a;
        }

        @Nullable
        public final String getFrom() {
            return this.f79487e;
        }

        @Nullable
        public final String getFromSpmid() {
            return this.f79486d;
        }

        @Nullable
        public final String getGoTo() {
            return this.h;
        }

        public final int getLike() {
            return this.f79484b;
        }

        @Nullable
        public final String getSource() {
            return this.f79490i;
        }

        @Nullable
        public final String getSpmid() {
            return this.f79488f;
        }

        @Nullable
        public final String getToken() {
            return this.f79491j;
        }

        @Nullable
        public final String getTrackId() {
            return this.f79489g;
        }

        public int hashCode() {
            int iA = E.a(I.a(this.f79484b, Long.hashCode(this.f79483a) * 31, 31), 31, this.f79485c);
            int iHashCode = 0;
            String str = this.f79486d;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f79487e;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f79488f;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f79489g;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.h;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.f79490i;
            int iHashCode7 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.f79491j;
            int iHashCode8 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.f79492k;
            if (str8 != null) {
                iHashCode = str8.hashCode();
            }
            return ((((((((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ActionLikeNologinPolymer(aid=");
            sb.append(this.f79483a);
            sb.append(", like=");
            sb.append(this.f79484b);
            sb.append(", action=");
            sb.append(this.f79485c);
            sb.append(", fromSpmid=");
            sb.append(this.f79486d);
            sb.append(", from=");
            sb.append(this.f79487e);
            sb.append(", spmid=");
            sb.append(this.f79488f);
            sb.append(", trackId=");
            sb.append(this.f79489g);
            sb.append(", goTo=");
            sb.append(this.h);
            sb.append(", source=");
            sb.append(this.f79490i);
            sb.append(", token=");
            sb.append(this.f79491j);
            sb.append(", actionId=");
            return C8770a.a(sb, this.f79492k, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikePolymer.class */
    public static final class ActionLikePolymer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f79505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f79507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f79508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f79509g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f79510i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f79511j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f79512k;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikePolymer$Builder.class */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Long f79513a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Integer f79514b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Integer f79515c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public String f79516d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public String f79517e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f79518f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f79519g;

            @Nullable
            public String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            @Nullable
            public String f79520i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            @Nullable
            public String f79521j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            @Nullable
            public String f79522k;

            @NotNull
            public final ActionLikePolymer build() {
                return new ActionLikePolymer(this.f79513a.longValue(), this.f79514b.intValue(), this.f79515c, this.f79516d, this.f79517e, this.f79518f, this.f79519g, this.h, this.f79520i, this.f79521j, this.f79522k);
            }

            @Nullable
            public final String getActionId() {
                return this.f79522k;
            }

            @Nullable
            public final Long getAid() {
                return this.f79513a;
            }

            @Nullable
            public final String getFrom() {
                return this.f79517e;
            }

            @Nullable
            public final String getFromSpmid() {
                return this.f79516d;
            }

            @Nullable
            public final String getGoTo() {
                return this.h;
            }

            @Nullable
            public final Integer getLike() {
                return this.f79514b;
            }

            @Nullable
            public final String getSource() {
                return this.f79520i;
            }

            @Nullable
            public final String getSpmid() {
                return this.f79518f;
            }

            @Nullable
            public final String getToken() {
                return this.f79521j;
            }

            @Nullable
            public final String getTrackId() {
                return this.f79519g;
            }

            @Nullable
            public final Integer getType() {
                return this.f79515c;
            }

            public final void setActionId(@Nullable String str) {
                this.f79522k = str;
            }

            public final void setAid(@Nullable Long l7) {
                this.f79513a = l7;
            }

            public final void setFrom(@Nullable String str) {
                this.f79517e = str;
            }

            public final void setFromSpmid(@Nullable String str) {
                this.f79516d = str;
            }

            public final void setGoTo(@Nullable String str) {
                this.h = str;
            }

            public final void setLike(@Nullable Integer num) {
                this.f79514b = num;
            }

            public final void setSource(@Nullable String str) {
                this.f79520i = str;
            }

            public final void setSpmid(@Nullable String str) {
                this.f79518f = str;
            }

            public final void setToken(@Nullable String str) {
                this.f79521j = str;
            }

            public final void setTrackId(@Nullable String str) {
                this.f79519g = str;
            }

            public final void setType(@Nullable Integer num) {
                this.f79515c = num;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikePolymer$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionLikePolymer build(@NotNull Function1<? super Builder, Unit> function1) {
                Builder builder = new Builder();
                function1.invoke(builder);
                return builder.build();
            }
        }

        public ActionLikePolymer(long j7, int i7, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.f79503a = j7;
            this.f79504b = i7;
            this.f79505c = num;
            this.f79506d = str;
            this.f79507e = str2;
            this.f79508f = str3;
            this.f79509g = str4;
            this.h = str5;
            this.f79510i = str6;
            this.f79511j = str7;
            this.f79512k = str8;
        }

        public /* synthetic */ ActionLikePolymer(long j7, int i7, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, i7, num, str, str2, str3, str4, str5, str6, str7, (i8 & 1024) != 0 ? null : str8);
        }

        public static /* synthetic */ ActionLikePolymer copy$default(ActionLikePolymer actionLikePolymer, long j7, int i7, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j7 = actionLikePolymer.f79503a;
            }
            if ((i8 & 2) != 0) {
                i7 = actionLikePolymer.f79504b;
            }
            if ((i8 & 4) != 0) {
                num = actionLikePolymer.f79505c;
            }
            if ((i8 & 8) != 0) {
                str = actionLikePolymer.f79506d;
            }
            if ((i8 & 16) != 0) {
                str2 = actionLikePolymer.f79507e;
            }
            if ((i8 & 32) != 0) {
                str3 = actionLikePolymer.f79508f;
            }
            if ((i8 & 64) != 0) {
                str4 = actionLikePolymer.f79509g;
            }
            if ((i8 & 128) != 0) {
                str5 = actionLikePolymer.h;
            }
            if ((i8 & 256) != 0) {
                str6 = actionLikePolymer.f79510i;
            }
            if ((i8 & 512) != 0) {
                str7 = actionLikePolymer.f79511j;
            }
            if ((i8 & 1024) != 0) {
                str8 = actionLikePolymer.f79512k;
            }
            return actionLikePolymer.copy(j7, i7, num, str, str2, str3, str4, str5, str6, str7, str8);
        }

        public final long component1() {
            return this.f79503a;
        }

        @Nullable
        public final String component10() {
            return this.f79511j;
        }

        @Nullable
        public final String component11() {
            return this.f79512k;
        }

        public final int component2() {
            return this.f79504b;
        }

        @Nullable
        public final Integer component3() {
            return this.f79505c;
        }

        @Nullable
        public final String component4() {
            return this.f79506d;
        }

        @Nullable
        public final String component5() {
            return this.f79507e;
        }

        @Nullable
        public final String component6() {
            return this.f79508f;
        }

        @Nullable
        public final String component7() {
            return this.f79509g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @Nullable
        public final String component9() {
            return this.f79510i;
        }

        @NotNull
        public final ActionLikePolymer copy(long j7, int i7, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            return new ActionLikePolymer(j7, i7, num, str, str2, str3, str4, str5, str6, str7, str8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionLikePolymer)) {
                return false;
            }
            ActionLikePolymer actionLikePolymer = (ActionLikePolymer) obj;
            return this.f79503a == actionLikePolymer.f79503a && this.f79504b == actionLikePolymer.f79504b && Intrinsics.areEqual(this.f79505c, actionLikePolymer.f79505c) && Intrinsics.areEqual(this.f79506d, actionLikePolymer.f79506d) && Intrinsics.areEqual(this.f79507e, actionLikePolymer.f79507e) && Intrinsics.areEqual(this.f79508f, actionLikePolymer.f79508f) && Intrinsics.areEqual(this.f79509g, actionLikePolymer.f79509g) && Intrinsics.areEqual(this.h, actionLikePolymer.h) && Intrinsics.areEqual(this.f79510i, actionLikePolymer.f79510i) && Intrinsics.areEqual(this.f79511j, actionLikePolymer.f79511j) && Intrinsics.areEqual(this.f79512k, actionLikePolymer.f79512k);
        }

        @Nullable
        public final String getActionId() {
            return this.f79512k;
        }

        public final long getAid() {
            return this.f79503a;
        }

        @Nullable
        public final String getFrom() {
            return this.f79507e;
        }

        @Nullable
        public final String getFromSpmid() {
            return this.f79506d;
        }

        @Nullable
        public final String getGoTo() {
            return this.h;
        }

        public final int getLike() {
            return this.f79504b;
        }

        @Nullable
        public final String getSource() {
            return this.f79510i;
        }

        @Nullable
        public final String getSpmid() {
            return this.f79508f;
        }

        @Nullable
        public final String getToken() {
            return this.f79511j;
        }

        @Nullable
        public final String getTrackId() {
            return this.f79509g;
        }

        @Nullable
        public final Integer getType() {
            return this.f79505c;
        }

        public int hashCode() {
            int iA = I.a(this.f79504b, Long.hashCode(this.f79503a) * 31, 31);
            int iHashCode = 0;
            Integer num = this.f79505c;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str = this.f79506d;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f79507e;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f79508f;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f79509g;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.h;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.f79510i;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.f79511j;
            int iHashCode9 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.f79512k;
            if (str8 != null) {
                iHashCode = str8.hashCode();
            }
            return ((((((((((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ActionLikePolymer(aid=");
            sb.append(this.f79503a);
            sb.append(", like=");
            sb.append(this.f79504b);
            sb.append(", type=");
            sb.append(this.f79505c);
            sb.append(", fromSpmid=");
            sb.append(this.f79506d);
            sb.append(", from=");
            sb.append(this.f79507e);
            sb.append(", spmid=");
            sb.append(this.f79508f);
            sb.append(", trackId=");
            sb.append(this.f79509g);
            sb.append(", goTo=");
            sb.append(this.h);
            sb.append(", source=");
            sb.append(this.f79510i);
            sb.append(", token=");
            sb.append(this.f79511j);
            sb.append(", actionId=");
            return C8770a.a(sb, this.f79512k, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeTripleCallback.class */
    public interface ActionLikeTripleCallback {
        static /* synthetic */ void onRequestSuccess$default(ActionLikeTripleCallback actionLikeTripleCallback, boolean z6, boolean z7, boolean z8, boolean z9, int i7, String str, String str2, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestSuccess");
            }
            if ((i8 & 32) != 0) {
                str = "";
            }
            actionLikeTripleCallback.onRequestSuccess(z6, z7, z8, z9, i7, str, str2);
        }

        default boolean isCancel() {
            return false;
        }

        default void onRequestFailed(@Nullable Throwable th) {
        }

        default void onRequestSuccess(boolean z6, boolean z7, boolean z8, boolean z9, int i7, @NotNull String str, @NotNull String str2) {
        }

        default void onResponseIllegal() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeTriplePolymer.class */
    public static final class ActionLikeTriplePolymer {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f79524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f79525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f79527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f79528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f79529g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f79530i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeTriplePolymer$Builder.class */
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Long f79531a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f79532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f79533c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public String f79534d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public String f79535e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f79536f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f79537g;

            @Nullable
            public String h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            @Nullable
            public String f79538i;

            @NotNull
            public final ActionLikeTriplePolymer build() {
                return new ActionLikeTriplePolymer(this.f79531a.longValue(), this.f79532b, this.f79533c, this.f79534d, this.f79535e, this.f79536f, this.f79537g, this.h, this.f79538i);
            }

            @Nullable
            public final String getActionId() {
                return this.f79538i;
            }

            @Nullable
            public final Long getAid() {
                return this.f79531a;
            }

            @Nullable
            public final String getFrom() {
                return this.f79532b;
            }

            @Nullable
            public final String getFromSpmid() {
                return this.f79533c;
            }

            @Nullable
            public final String getGoTo() {
                return this.f79536f;
            }

            @Nullable
            public final String getSource() {
                return this.f79537g;
            }

            @Nullable
            public final String getSpmid() {
                return this.f79534d;
            }

            @Nullable
            public final String getToken() {
                return this.h;
            }

            @Nullable
            public final String getTrackId() {
                return this.f79535e;
            }

            public final void setActionId(@Nullable String str) {
                this.f79538i = str;
            }

            public final void setAid(@Nullable Long l7) {
                this.f79531a = l7;
            }

            public final void setFrom(@Nullable String str) {
                this.f79532b = str;
            }

            public final void setFromSpmid(@Nullable String str) {
                this.f79533c = str;
            }

            public final void setGoTo(@Nullable String str) {
                this.f79536f = str;
            }

            public final void setSource(@Nullable String str) {
                this.f79537g = str;
            }

            public final void setSpmid(@Nullable String str) {
                this.f79534d = str;
            }

            public final void setToken(@Nullable String str) {
                this.h = str;
            }

            public final void setTrackId(@Nullable String str) {
                this.f79535e = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$ActionLikeTriplePolymer$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionLikeTriplePolymer build(@NotNull Function1<? super Builder, Unit> function1) {
                Builder builder = new Builder();
                function1.invoke(builder);
                return builder.build();
            }
        }

        public ActionLikeTriplePolymer(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.f79523a = j7;
            this.f79524b = str;
            this.f79525c = str2;
            this.f79526d = str3;
            this.f79527e = str4;
            this.f79528f = str5;
            this.f79529g = str6;
            this.h = str7;
            this.f79530i = str8;
        }

        public /* synthetic */ ActionLikeTriplePolymer(long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, str, str2, str3, str4, str5, str6, str7, (i7 & 256) != 0 ? null : str8);
        }

        public static /* synthetic */ ActionLikeTriplePolymer copy$default(ActionLikeTriplePolymer actionLikeTriplePolymer, long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = actionLikeTriplePolymer.f79523a;
            }
            if ((i7 & 2) != 0) {
                str = actionLikeTriplePolymer.f79524b;
            }
            if ((i7 & 4) != 0) {
                str2 = actionLikeTriplePolymer.f79525c;
            }
            if ((i7 & 8) != 0) {
                str3 = actionLikeTriplePolymer.f79526d;
            }
            if ((i7 & 16) != 0) {
                str4 = actionLikeTriplePolymer.f79527e;
            }
            if ((i7 & 32) != 0) {
                str5 = actionLikeTriplePolymer.f79528f;
            }
            if ((i7 & 64) != 0) {
                str6 = actionLikeTriplePolymer.f79529g;
            }
            if ((i7 & 128) != 0) {
                str7 = actionLikeTriplePolymer.h;
            }
            if ((i7 & 256) != 0) {
                str8 = actionLikeTriplePolymer.f79530i;
            }
            return actionLikeTriplePolymer.copy(j7, str, str2, str3, str4, str5, str6, str7, str8);
        }

        public final long component1() {
            return this.f79523a;
        }

        @Nullable
        public final String component2() {
            return this.f79524b;
        }

        @Nullable
        public final String component3() {
            return this.f79525c;
        }

        @Nullable
        public final String component4() {
            return this.f79526d;
        }

        @Nullable
        public final String component5() {
            return this.f79527e;
        }

        @Nullable
        public final String component6() {
            return this.f79528f;
        }

        @Nullable
        public final String component7() {
            return this.f79529g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @Nullable
        public final String component9() {
            return this.f79530i;
        }

        @NotNull
        public final ActionLikeTriplePolymer copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            return new ActionLikeTriplePolymer(j7, str, str2, str3, str4, str5, str6, str7, str8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionLikeTriplePolymer)) {
                return false;
            }
            ActionLikeTriplePolymer actionLikeTriplePolymer = (ActionLikeTriplePolymer) obj;
            return this.f79523a == actionLikeTriplePolymer.f79523a && Intrinsics.areEqual(this.f79524b, actionLikeTriplePolymer.f79524b) && Intrinsics.areEqual(this.f79525c, actionLikeTriplePolymer.f79525c) && Intrinsics.areEqual(this.f79526d, actionLikeTriplePolymer.f79526d) && Intrinsics.areEqual(this.f79527e, actionLikeTriplePolymer.f79527e) && Intrinsics.areEqual(this.f79528f, actionLikeTriplePolymer.f79528f) && Intrinsics.areEqual(this.f79529g, actionLikeTriplePolymer.f79529g) && Intrinsics.areEqual(this.h, actionLikeTriplePolymer.h) && Intrinsics.areEqual(this.f79530i, actionLikeTriplePolymer.f79530i);
        }

        @Nullable
        public final String getActionId() {
            return this.f79530i;
        }

        public final long getAid() {
            return this.f79523a;
        }

        @Nullable
        public final String getFrom() {
            return this.f79524b;
        }

        @Nullable
        public final String getFromSpmid() {
            return this.f79525c;
        }

        @Nullable
        public final String getGoTo() {
            return this.f79528f;
        }

        @Nullable
        public final String getSource() {
            return this.f79529g;
        }

        @Nullable
        public final String getSpmid() {
            return this.f79526d;
        }

        @Nullable
        public final String getToken() {
            return this.h;
        }

        @Nullable
        public final String getTrackId() {
            return this.f79527e;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f79523a);
            int iHashCode2 = 0;
            String str = this.f79524b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f79525c;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f79526d;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f79527e;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.f79528f;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.f79529g;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.h;
            int iHashCode9 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.f79530i;
            if (str8 != null) {
                iHashCode2 = str8.hashCode();
            }
            return (((((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ActionLikeTriplePolymer(aid=");
            sb.append(this.f79523a);
            sb.append(", from=");
            sb.append(this.f79524b);
            sb.append(", fromSpmid=");
            sb.append(this.f79525c);
            sb.append(", spmid=");
            sb.append(this.f79526d);
            sb.append(", trackId=");
            sb.append(this.f79527e);
            sb.append(", goTo=");
            sb.append(this.f79528f);
            sb.append(", source=");
            sb.append(this.f79529g);
            sb.append(", token=");
            sb.append(this.h);
            sb.append(", actionId=");
            return C8770a.a(sb, this.f79530i, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoLikeRouteService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79539a = new Object();
    }

    void reportActionDislike(@NotNull ActionDislikePolymer actionDislikePolymer, @NotNull ActionLikeCallback actionLikeCallback);

    void reportActionLike(@NotNull ActionLikePolymer actionLikePolymer, @NotNull ActionLikeCallback actionLikeCallback);

    void reportActionLikeNologin(@NotNull ActionLikeNologinPolymer actionLikeNologinPolymer, @NotNull ActionLikeNologinCallback actionLikeNologinCallback);

    void reportActionLikeTriple(@NotNull ActionLikeTriplePolymer actionLikeTriplePolymer, @NotNull ActionLikeTripleCallback actionLikeTripleCallback);
}

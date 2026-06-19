package com.bilibili.ship.theseus.ugc.endpage.qoe;

import I.E;
import Vu0.C2964c;
import Vu0.C2966e;
import Vu0.C2967f;
import Vu0.M;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.O;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.app.gemini.ugc.view.ReviewRatingBar;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent.class */
@StabilityInferred(parameters = 0)
public final class UgcDmQoeComponent implements UIComponent<com.bilibili.app.gemini.ui.n<C2967f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<State> f96610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c.a f96611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f96612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f96613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f96614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f96616g;
    public List<State.a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f96617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f96618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f96619k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$State.class */
    @StabilityInferred(parameters = 0)
    public static final class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f96621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f96622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final c.a f96624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final List<a> f96625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final AnimType f96626g;
        public final long h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f96627i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$State$AnimType.class */
        public static final class AnimType {
            private static final EnumEntries $ENTRIES;
            private static final AnimType[] $VALUES;
            public static final AnimType NONE = new AnimType("NONE", 0);
            public static final AnimType ENTER = new AnimType("ENTER", 1);
            public static final AnimType DISMISS = new AnimType("DISMISS", 2);
            public static final AnimType RESUME = new AnimType("RESUME", 3);

            private static final /* synthetic */ AnimType[] $values() {
                return new AnimType[]{NONE, ENTER, DISMISS, RESUME};
            }

            static {
                AnimType[] animTypeArr$values = $values();
                $VALUES = animTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(animTypeArr$values);
            }

            private AnimType(String str, int i7) {
            }

            @NotNull
            public static EnumEntries<AnimType> getEntries() {
                return $ENTRIES;
            }

            public static AnimType valueOf(String str) {
                return (AnimType) Enum.valueOf(AnimType.class, str);
            }

            public static AnimType[] values() {
                return (AnimType[]) $VALUES.clone();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$State$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f96629b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final String f96630c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Float f96631d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public final List<String> f96632e;

            public a(int i7, @NotNull String str, @Nullable String str2, @Nullable Float f7, @Nullable List<String> list) {
                this.f96628a = i7;
                this.f96629b = str;
                this.f96630c = str2;
                this.f96631d = f7;
                this.f96632e = list;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f96628a == aVar.f96628a && Intrinsics.areEqual(this.f96629b, aVar.f96629b) && Intrinsics.areEqual(this.f96630c, aVar.f96630c) && Intrinsics.areEqual(this.f96631d, aVar.f96631d) && Intrinsics.areEqual(this.f96632e, aVar.f96632e);
            }

            public final int hashCode() {
                int iA = E.a(Integer.hashCode(this.f96628a) * 31, 31, this.f96629b);
                int iHashCode = 0;
                String str = this.f96630c;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                Float f7 = this.f96631d;
                int iHashCode3 = f7 == null ? 0 : f7.hashCode();
                List<String> list = this.f96632e;
                if (list != null) {
                    iHashCode = list.hashCode();
                }
                return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
            }

            @NotNull
            public final String toString() {
                return "ViewItem(type=" + this.f96628a + ", title=" + this.f96629b + ", url=" + this.f96630c + ", score=" + this.f96631d + ", desc=" + this.f96632e + ")";
            }
        }

        public State(@NotNull String str, long j7, long j8, int i7, @NotNull c.a aVar, @NotNull List<a> list, @NotNull AnimType animType, long j9, int i8) {
            this.f96620a = str;
            this.f96621b = j7;
            this.f96622c = j8;
            this.f96623d = i7;
            this.f96624e = aVar;
            this.f96625f = list;
            this.f96626g = animType;
            this.h = j9;
            this.f96627i = i8;
        }

        public static State a(State state, String str, long j7, long j8, int i7, c.a aVar, List list, AnimType animType, long j9, int i8, int i9) {
            if ((i9 & 1) != 0) {
                str = state.f96620a;
            }
            if ((i9 & 2) != 0) {
                j7 = state.f96621b;
            }
            if ((i9 & 8) != 0) {
                i7 = state.f96623d;
            }
            if ((i9 & 16) != 0) {
                aVar = state.f96624e;
            }
            if ((i9 & 32) != 0) {
                list = state.f96625f;
            }
            if ((i9 & 128) != 0) {
                j9 = state.h;
            }
            if ((i9 & 256) != 0) {
                i8 = state.f96627i;
            }
            state.getClass();
            return new State(str, j7, j8, i7, aVar, list, animType, j9, i8);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.f96620a, state.f96620a) && this.f96621b == state.f96621b && this.f96622c == state.f96622c && this.f96623d == state.f96623d && Intrinsics.areEqual(this.f96624e, state.f96624e) && Intrinsics.areEqual(this.f96625f, state.f96625f) && this.f96626g == state.f96626g && this.h == state.h && this.f96627i == state.f96627i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f96627i) + C3554n0.a((this.f96626g.hashCode() + e0.a((this.f96624e.hashCode() + I.a(this.f96623d, C3554n0.a(C3554n0.a(this.f96620a.hashCode() * 31, 31, this.f96621b), 31, this.f96622c), 31)) * 31, 31, this.f96625f)) * 31, 31, this.h);
        }

        @NotNull
        public final String toString() {
            List<a> list = this.f96625f;
            StringBuilder sb = new StringBuilder("State(title=");
            sb.append(this.f96620a);
            sb.append(", total=");
            sb.append(this.f96621b);
            sb.append(", rest=");
            sb.append(this.f96622c);
            sb.append(", selectedIndex=");
            sb.append(this.f96623d);
            sb.append(", screenState=");
            sb.append(this.f96624e);
            sb.append(", viewItems=");
            sb.append(list);
            sb.append(", animType=");
            sb.append(this.f96626g);
            sb.append(", animDelay=");
            sb.append(this.h);
            sb.append(", type=");
            return C4277b.a(this.f96627i, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0823a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f96634b;

            public C0823a(int i7, @NotNull String str) {
                this.f96633a = i7;
                this.f96634b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0823a)) {
                    return false;
                }
                C0823a c0823a = (C0823a) obj;
                return this.f96633a == c0823a.f96633a && Intrinsics.areEqual(this.f96634b, c0823a.f96634b);
            }

            public final int hashCode() {
                return this.f96634b.hashCode() + (Integer.hashCode(this.f96633a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("OnClickButton(position=");
                sb.append(this.f96633a);
                sb.append(", clickDesc=");
                return C8770a.a(sb, this.f96634b, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f96635a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1426012503;
            }

            @NotNull
            public final String toString() {
                return "OnClickClose";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f96636a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1202810833;
            }

            @NotNull
            public final String toString() {
                return "OnDismiss";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f96637a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 719153312;
            }

            @NotNull
            public final String toString() {
                return "OnExposure";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f96638a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -763017229;
            }

            @NotNull
            public final String toString() {
                return "OnExposureOnSecond";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$f.class */
        @StabilityInferred(parameters = 0)
        public static final class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final State.a f96640b;

            public f(int i7, @NotNull State.a aVar) {
                this.f96639a = i7;
                this.f96640b = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f96639a == fVar.f96639a && Intrinsics.areEqual(this.f96640b, fVar.f96640b);
            }

            public final int hashCode() {
                return this.f96640b.hashCode() + (Integer.hashCode(this.f96639a) * 31);
            }

            @NotNull
            public final String toString() {
                return "OnItemSelected(position=" + this.f96639a + ", item=" + this.f96640b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$g.class */
        @StabilityInferred(parameters = 1)
        public static final class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f96641a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1002355403;
            }

            @NotNull
            public final String toString() {
                return "OnProgressEnd";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$a$h.class */
        @StabilityInferred(parameters = 0)
        public static final class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f96642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f96643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final List<State.a> f96644c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final List<String> f96645d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f96646e;

            public h(@NotNull String str, int i7, @NotNull List<State.a> list, @NotNull List<String> list2, int i8) {
                this.f96642a = str;
                this.f96643b = i7;
                this.f96644c = list;
                this.f96645d = list2;
                this.f96646e = i8;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.f96642a, hVar.f96642a) && this.f96643b == hVar.f96643b && Intrinsics.areEqual(this.f96644c, hVar.f96644c) && Intrinsics.areEqual(this.f96645d, hVar.f96645d) && this.f96646e == hVar.f96646e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f96646e) + e0.a(e0.a(I.a(this.f96643b, this.f96642a.hashCode() * 31, 31), 31, this.f96644c), 31, this.f96645d);
            }

            @NotNull
            public final String toString() {
                List<State.a> list = this.f96644c;
                List<String> list2 = this.f96645d;
                StringBuilder sb = new StringBuilder("OnShowQoeDialog(title=");
                sb.append(this.f96642a);
                sb.append(", position=");
                O.b(sb, this.f96643b, ", viewItems=", list, ", desc=");
                sb.append(list2);
                sb.append(", type=");
                return C4277b.a(this.f96646e, ")", sb);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final i f96647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f96648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f96649c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList<State.a> f96650d = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.a f96651e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$b$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final C2964c f96652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<State.a> f96653b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final TintTextView f96654c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final Context f96655d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final b f96656e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, @NotNull C2964c c2964c, List<State.a> list) {
                super(c2964c.f25884b);
                this.f96656e = bVar;
                this.f96652a = c2964c;
                this.f96653b = list;
                TintTextView tintTextView = c2964c.f25885c;
                this.f96654c = tintTextView;
                Context context = c2964c.f25884b.getContext();
                this.f96655d = context;
                int size = list.size();
                ViewGroup.LayoutParams layoutParams = tintTextView.getLayoutParams();
                layoutParams.width = (NewPlayerUtilsKt.toPx(318) - (NewPlayerUtilsKt.toPx(8) * (size - 1))) / size;
                tintTextView.setLayoutParams(layoutParams);
                tintTextView.setTextColor(ContextCompat.getColor(context, R$color.Ga10_u));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$b$b.class */
        public final class C0824b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BiliImageView f96657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final TintTextView f96658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final Context f96659c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final b f96660d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0824b(@NotNull b bVar, C2966e c2966e) {
                super(c2966e.f25891c);
                this.f96660d = bVar;
                this.f96657a = c2966e.f25890b;
                this.f96658b = c2966e.f25892d;
                this.f96659c = c2966e.f25891c.getContext();
            }
        }

        public b(@Nullable i iVar) {
            this.f96647a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f96650d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            int i8 = this.f96648b;
            int i9 = 1;
            if (i8 != 1) {
                i9 = 3;
                if (i8 != 3) {
                    return super.getItemViewType(i7);
                }
            }
            return i9;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x024e  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r9, final int r10) {
            /*
                Method dump skipped, instruction units count: 666
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            return i7 == 1 ? new C0824b(this, C2966e.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false)) : new a(this, C2964c.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f96650d);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final C2967f $binding;
        final FrameLayout $closeLayout;
        final ConstraintLayout $content;
        final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
        final Ref.ObjectRef<AnimatorSet> $enterAnimator;
        final Ref.ObjectRef<ValueAnimator> $progressAnimator;
        final Ref.IntRef $progressAnimatorValue;
        final ConstraintLayout $root;
        private Object L$0;
        int label;
        final UgcDmQoeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final C2967f $binding;
            int label;
            final UgcDmQoeComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$1$1.class */
            public static final class C08251 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                int label;
                final UgcDmQoeComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08251(UgcDmQoeComponent ugcDmQoeComponent, Continuation<? super C08251> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcDmQoeComponent;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C08251(this.this$0, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f96612c.tryEmit(a.b.f96635a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2967f c2967f, UgcDmQoeComponent ugcDmQoeComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c2967f;
                this.this$0 = ugcDmQoeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$binding, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f25897e);
                    C08251 c08251 = new C08251(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowA, c08251, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final C2967f $binding;
            final FrameLayout $closeLayout;
            final ConstraintLayout $content;
            final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
            final Ref.ObjectRef<AnimatorSet> $enterAnimator;
            final Ref.ObjectRef<ValueAnimator> $progressAnimator;
            final Ref.IntRef $progressAnimatorValue;
            final ConstraintLayout $root;
            int label;
            final UgcDmQoeComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<State, Continuation<? super Unit>, Object> {
                final C2967f $binding;
                final FrameLayout $closeLayout;
                final ConstraintLayout $content;
                final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
                final Ref.ObjectRef<AnimatorSet> $enterAnimator;
                final Ref.ObjectRef<ValueAnimator> $progressAnimator;
                final Ref.IntRef $progressAnimatorValue;
                final ConstraintLayout $root;
                Object L$0;
                int label;
                final UgcDmQoeComponent this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$2$1$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$2$1$a.class */
                public static final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final int[] f96661a;

                    static {
                        int[] iArr = new int[State.AnimType.values().length];
                        try {
                            iArr[State.AnimType.ENTER.ordinal()] = 1;
                        } catch (NoSuchFieldError e7) {
                        }
                        try {
                            iArr[State.AnimType.DISMISS.ordinal()] = 2;
                        } catch (NoSuchFieldError e8) {
                        }
                        try {
                            iArr[State.AnimType.RESUME.ordinal()] = 3;
                        } catch (NoSuchFieldError e9) {
                        }
                        f96661a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C2967f c2967f, UgcDmQoeComponent ugcDmQoeComponent, Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<ValueAnimator> objectRef2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, Ref.IntRef intRef, Ref.ObjectRef<AnimatorSet> objectRef3, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$binding = c2967f;
                    this.this$0 = ugcDmQoeComponent;
                    this.$progressAnimator = objectRef;
                    this.$dismissAnimator = objectRef2;
                    this.$root = constraintLayout;
                    this.$closeLayout = frameLayout;
                    this.$content = constraintLayout2;
                    this.$progressAnimatorValue = intRef;
                    this.$enterAnimator = objectRef3;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, this.$progressAnimator, this.$dismissAnimator, this.$root, this.$closeLayout, this.$content, this.$progressAnimatorValue, this.$enterAnimator, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(State state, Continuation<? super Unit> continuation) {
                    return create(state, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    ValueAnimator valueAnimatorOfInt;
                    AnimatorSet animatorSet;
                    ValueAnimator valueAnimator;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    State state = (State) this.L$0;
                    defpackage.a.b("[theseus-ugc-UgcDmQoeComponent$bindToView$3$2$1-invokeSuspend] ", "state -> " + state, "UgcDmQoeComponent$bindToView$3$2$1-invokeSuspend");
                    this.$binding.f25904m.setText(state.f96620a);
                    this.this$0.f96616g = state.f96620a;
                    ConstraintLayout constraintLayout = this.$root;
                    C2967f c2967f = this.$binding;
                    FrameLayout frameLayout = this.$closeLayout;
                    ConstraintLayout constraintLayout2 = this.$content;
                    boolean zIsLaidOut = constraintLayout.isLaidOut();
                    c.a aVar = state.f96624e;
                    if (!zIsLaidOut || constraintLayout.isLayoutRequested()) {
                        constraintLayout.addOnLayoutChangeListener(new j(constraintLayout, frameLayout, aVar, constraintLayout2));
                    } else {
                        constraintLayout.setPivotX(constraintLayout.getMeasuredWidth() / 2.0f);
                        constraintLayout.setPivotY(constraintLayout.getMeasuredHeight() / 2.0f);
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) frameLayout.getLayoutParams();
                        if (aVar.f102987a) {
                            constraintLayout.setScaleX(1.0f);
                            constraintLayout.setScaleY(1.0f);
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = sh1.c.b(50);
                            layoutParams.setMarginEnd(sh1.c.b(24));
                        } else {
                            constraintLayout2.setScaleX(1.3f);
                            constraintLayout2.setScaleY(1.3f);
                            frameLayout.setScaleX(1.3f);
                            frameLayout.setScaleY(1.3f);
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = sh1.c.b(24);
                            layoutParams.setMarginEnd(sh1.c.b(68));
                        }
                        frameLayout.setLayoutParams(layoutParams);
                        constraintLayout.setAlpha(1.0f);
                    }
                    ViewGroup.LayoutParams layoutParams2 = c2967f.f25899g.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams3 = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.verticalBias = (aVar.f102987a && aVar.f102988b) ? 0.62f : 0.5f;
                        c2967f.f25899g.setLayoutParams(layoutParams3);
                    }
                    if (!aVar.f102987a) {
                        FrameLayout frameLayout2 = c2967f.f25897e;
                        frameLayout2.setLayoutParams((ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams());
                    }
                    Ref.ObjectRef<ValueAnimator> objectRef = this.$progressAnimator;
                    final C2967f c2967f2 = this.$binding;
                    Ref.IntRef intRef = this.$progressAnimatorValue;
                    final UgcDmQoeComponent ugcDmQoeComponent = this.this$0;
                    StringBuilder sb = new StringBuilder("total: ");
                    final long j7 = state.f96621b;
                    sb.append(j7);
                    sb.append(", rest: ");
                    long j8 = state.f96622c;
                    sb.append(j8);
                    sb.append(", animType: ");
                    State.AnimType animType = state.f96626g;
                    sb.append(animType);
                    defpackage.a.b("[theseus-ugc-UgcDmQoeComponent-bindToView$configProgressBar] ", sb.toString(), "UgcDmQoeComponent-bindToView$configProgressBar");
                    ValueAnimator valueAnimator2 = (ValueAnimator) objectRef.element;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    c2967f2.f25900i.setClockwise(true);
                    c2967f2.f25900i.setRingProgressColor(ThemeUtils.getColorById(c2967f2.f25902k.getContext(), 2131100122));
                    if (j8 <= 0) {
                        valueAnimatorOfInt = null;
                    } else {
                        if (animType == State.AnimType.RESUME) {
                            valueAnimatorOfInt = ValueAnimator.ofInt(intRef.element, 0);
                            valueAnimatorOfInt.setDuration(intRef.element);
                        } else {
                            valueAnimatorOfInt = ValueAnimator.ofInt((int) j8, 0);
                            valueAnimatorOfInt.setDuration(j8);
                        }
                        if (animType == State.AnimType.ENTER) {
                            valueAnimatorOfInt.setStartDelay(400L);
                        }
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(j7, c2967f2, ugcDmQoeComponent) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final long f96697a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final C2967f f96698b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final UgcDmQoeComponent f96699c;

                            {
                                this.f96697a = j7;
                                this.f96698b = c2967f2;
                                this.f96699c = ugcDmQoeComponent;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                long j9 = this.f96697a;
                                C2967f c2967f3 = this.f96698b;
                                UgcDmQoeComponent ugcDmQoeComponent2 = this.f96699c;
                                Object animatedValue = valueAnimator3.getAnimatedValue();
                                if ((animatedValue instanceof Integer ? (Integer) animatedValue : null) != null) {
                                    int iIntValue = (int) ((r5.intValue() * 100.0f) / j9);
                                    c2967f3.f25900i.setProgress(iIntValue);
                                    if (iIntValue <= 0) {
                                        ugcDmQoeComponent2.f96612c.tryEmit(UgcDmQoeComponent.a.g.f96641a);
                                    }
                                }
                            }
                        });
                        valueAnimatorOfInt.start();
                    }
                    objectRef.element = valueAnimatorOfInt;
                    UgcDmQoeComponent ugcDmQoeComponent2 = this.this$0;
                    ugcDmQoeComponent2.h = state.f96625f;
                    int i7 = state.f96627i;
                    ugcDmQoeComponent2.f96615f = i7;
                    b bVar = ugcDmQoeComponent2.f96618j;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
                        bVar = null;
                    }
                    List<State.a> list = state.f96625f;
                    bVar.f96649c = state.f96623d;
                    bVar.f96650d.clear();
                    bVar.f96650d.addAll(list);
                    bVar.f96648b = i7;
                    bVar.f96651e = aVar;
                    bVar.notifyDataSetChanged();
                    int i8 = a.f96661a[animType.ordinal()];
                    if (i8 == 1) {
                        final C2967f c2967f3 = this.$binding;
                        Ref.ObjectRef<AnimatorSet> objectRef2 = this.$enterAnimator;
                        final UgcDmQoeComponent ugcDmQoeComponent3 = this.this$0;
                        final Ref.ObjectRef<ValueAnimator> objectRef3 = this.$progressAnimator;
                        Ref.IntRef intRef2 = this.$progressAnimatorValue;
                        c2967f3.f25902k.setAlpha(0.0f);
                        RecyclerView recyclerView = c2967f3.f25899g;
                        recyclerView.setAlpha(0.0f);
                        TintImageView tintImageView = c2967f3.f25896d;
                        tintImageView.setAlpha(0.0f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2967f3.f25902k, "alpha", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(recyclerView, "alpha", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tintImageView, "alpha", 0.0f, 1.0f);
                        objectAnimatorOfFloat.setDuration(200L);
                        objectAnimatorOfFloat2.setDuration(200L);
                        objectAnimatorOfFloat3.setDuration(200L);
                        objectAnimatorOfFloat2.setStartDelay(200L);
                        objectAnimatorOfFloat3.setStartDelay(200L);
                        ReviewRatingBar reviewRatingBar = c2967f3.f25901j;
                        if (i7 == 2) {
                            recyclerView.setVisibility(8);
                            View view = c2967f3.h;
                            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) view.getLayoutParams();
                            layoutParams4.topToBottom = reviewRatingBar.getId();
                            view.setLayoutParams(layoutParams4);
                            TintTextView tintTextView = c2967f3.f25904m;
                            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) tintTextView.getLayoutParams();
                            layoutParams5.bottomToTop = reviewRatingBar.getId();
                            tintTextView.setLayoutParams(layoutParams5);
                            reviewRatingBar.setVisibility(0);
                            reviewRatingBar.setAlpha(0.0f);
                            reviewRatingBar.setRating(0.0f);
                            reviewRatingBar.setMode(1);
                            reviewRatingBar.setOnRatingChangeListenerWithScore(!ugcDmQoeComponent3.f96611b.f102987a ? new ReviewRatingBar.b(ugcDmQoeComponent3, objectRef3, c2967f3) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.a

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final UgcDmQoeComponent f96694a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Ref.ObjectRef f96695b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final C2967f f96696c;

                                {
                                    this.f96694a = ugcDmQoeComponent3;
                                    this.f96695b = objectRef3;
                                    this.f96696c = c2967f3;
                                }

                                public final void a(final int i9, boolean z6) {
                                    final UgcDmQoeComponent ugcDmQoeComponent4 = this.f96694a;
                                    List<UgcDmQoeComponent.State.a> list2 = ugcDmQoeComponent4.h;
                                    List<UgcDmQoeComponent.State.a> list3 = list2;
                                    if (list2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewItems");
                                        list3 = null;
                                    }
                                    int i10 = i9 - 1;
                                    if (list3.get(i10).f96632e == null || !(!r0.isEmpty())) {
                                        List<UgcDmQoeComponent.State.a> list4 = ugcDmQoeComponent4.h;
                                        if (list4 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
                                            list4 = null;
                                        }
                                        ugcDmQoeComponent4.f96612c.tryEmit(new UgcDmQoeComponent.a.f(i10, list4.get(i10)));
                                        return;
                                    }
                                    ValueAnimator valueAnimator3 = (ValueAnimator) this.f96695b.element;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.pause();
                                    }
                                    C2967f c2967f4 = this.f96696c;
                                    c2967f4.h.setVisibility(0);
                                    c2967f4.f25895c.setVisibility(0);
                                    c2967f4.f25895c.setOnClickListener(new View.OnClickListener(ugcDmQoeComponent4, i9) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.c

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final UgcDmQoeComponent f96700a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final int f96701b;

                                        {
                                            this.f96700a = ugcDmQoeComponent4;
                                            this.f96701b = i9;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            UgcDmQoeComponent ugcDmQoeComponent5 = this.f96700a;
                                            int i11 = this.f96701b;
                                            ugcDmQoeComponent5.f96612c.tryEmit(new UgcDmQoeComponent.a.C0823a(i11 - 1, String.valueOf(i11)));
                                        }
                                    });
                                    c2967f4.f25903l.setVisibility(0);
                                    TintImageView tintImageView2 = c2967f4.f25894b;
                                    tintImageView2.setVisibility(0);
                                    ugcDmQoeComponent4.a(tintImageView2, i10);
                                    RecyclerView recyclerView2 = ugcDmQoeComponent4.f96617i;
                                    RecyclerView recyclerView3 = recyclerView2;
                                    if (recyclerView2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("secondLevelRv");
                                        recyclerView3 = null;
                                    }
                                    UgcDmQoeComponent.c cVar = ugcDmQoeComponent4.f96619k;
                                    UgcDmQoeComponent.c cVar2 = cVar;
                                    if (cVar == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                                        cVar2 = null;
                                    }
                                    recyclerView3.setAdapter(cVar2);
                                    List<UgcDmQoeComponent.State.a> list5 = ugcDmQoeComponent4.h;
                                    List<UgcDmQoeComponent.State.a> list6 = list5;
                                    if (list5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewItems");
                                        list6 = null;
                                    }
                                    List<String> list7 = list6.get(i10).f96632e;
                                    if (list7 != null) {
                                        UgcDmQoeComponent.c cVar3 = ugcDmQoeComponent4.f96619k;
                                        if (cVar3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                                            cVar3 = null;
                                        }
                                        cVar3.f96663b.clear();
                                        cVar3.f96662a.clear();
                                        cVar3.f96662a.addAll(list7);
                                        cVar3.notifyDataSetChanged();
                                    }
                                    ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(c2967f4.f25902k, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.biligame.ui.home.e(ugcDmQoeComponent4, 3)));
                                }
                            } : new k(ugcDmQoeComponent3, objectRef3, intRef2));
                            objectAnimatorOfFloat2.setTarget(reviewRatingBar);
                        } else {
                            recyclerView.setVisibility(0);
                            reviewRatingBar.setVisibility(8);
                        }
                        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                        animatorSet2.start();
                        objectRef2.element = animatorSet2;
                    } else if (i8 == 2) {
                        Ref.ObjectRef<ValueAnimator> objectRef4 = this.$dismissAnimator;
                        UgcDmQoeComponent ugcDmQoeComponent4 = this.this$0;
                        Ref.ObjectRef<ValueAnimator> objectRef5 = this.$progressAnimator;
                        Ref.ObjectRef<AnimatorSet> objectRef6 = this.$enterAnimator;
                        ConstraintLayout constraintLayout3 = this.$root;
                        ugcDmQoeComponent4.f96612c.tryEmit(a.c.f96636a);
                        ValueAnimator valueAnimator3 = (ValueAnimator) objectRef5.element;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        ValueAnimator valueAnimator4 = (ValueAnimator) objectRef4.element;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                        AnimatorSet animatorSet3 = (AnimatorSet) objectRef6.element;
                        if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet = (AnimatorSet) objectRef6.element) != null) {
                            animatorSet.cancel();
                        }
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(constraintLayout3, "alpha", 1.0f, 0.0f);
                        objectAnimatorOfFloat4.setDuration(350L);
                        objectAnimatorOfFloat4.setStartDelay(state.h);
                        objectAnimatorOfFloat4.addListener(new l(constraintLayout3));
                        objectAnimatorOfFloat4.start();
                        objectRef4.element = objectAnimatorOfFloat4;
                    } else if (i8 == 3 && (valueAnimator = (ValueAnimator) this.$progressAnimator.element) != null) {
                        valueAnimator.resume();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcDmQoeComponent ugcDmQoeComponent, C2967f c2967f, Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<ValueAnimator> objectRef2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, Ref.IntRef intRef, Ref.ObjectRef<AnimatorSet> objectRef3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcDmQoeComponent;
                this.$binding = c2967f;
                this.$progressAnimator = objectRef;
                this.$dismissAnimator = objectRef2;
                this.$root = constraintLayout;
                this.$closeLayout = frameLayout;
                this.$content = constraintLayout2;
                this.$progressAnimatorValue = intRef;
                this.$enterAnimator = objectRef3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$binding, this.$progressAnimator, this.$dismissAnimator, this.$root, this.$closeLayout, this.$content, this.$progressAnimatorValue, this.$enterAnimator, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcDmQoeComponent ugcDmQoeComponent = this.this$0;
                    StateFlow<State> stateFlow = ugcDmQoeComponent.f96610a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, ugcDmQoeComponent, this.$progressAnimator, this.$dismissAnimator, this.$root, this.$closeLayout, this.$content, this.$progressAnimatorValue, this.$enterAnimator, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$bindToView$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$bindToView$3$3.class */
        public static final class C08263 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<ValueAnimator> $dismissAnimator;
            final Ref.ObjectRef<AnimatorSet> $enterAnimator;
            final Ref.ObjectRef<ValueAnimator> $progressAnimator;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08263(Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<ValueAnimator> objectRef2, Ref.ObjectRef<AnimatorSet> objectRef3, Continuation<? super C08263> continuation) {
                super(2, continuation);
                this.$progressAnimator = objectRef;
                this.$dismissAnimator = objectRef2;
                this.$enterAnimator = objectRef3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08263(this.$progressAnimator, this.$dismissAnimator, this.$enterAnimator, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    ValueAnimator valueAnimator = (ValueAnimator) this.$progressAnimator.element;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.$dismissAnimator.element;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    AnimatorSet animatorSet = (AnimatorSet) this.$enterAnimator.element;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C2967f c2967f, UgcDmQoeComponent ugcDmQoeComponent, Ref.ObjectRef<ValueAnimator> objectRef, Ref.ObjectRef<ValueAnimator> objectRef2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, Ref.IntRef intRef, Ref.ObjectRef<AnimatorSet> objectRef3, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = c2967f;
            this.this$0 = ugcDmQoeComponent;
            this.$progressAnimator = objectRef;
            this.$dismissAnimator = objectRef2;
            this.$root = constraintLayout;
            this.$closeLayout = frameLayout;
            this.$content = constraintLayout2;
            this.$progressAnimatorValue = intRef;
            this.$enterAnimator = objectRef3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$binding, this.this$0, this.$progressAnimator, this.$dismissAnimator, this.$root, this.$closeLayout, this.$content, this.$progressAnimatorValue, this.$enterAnimator, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, this.$progressAnimator, this.$dismissAnimator, this.$root, this.$closeLayout, this.$content, this.$progressAnimatorValue, this.$enterAnimator, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08263(this.$progressAnimator, this.$dismissAnimator, this.$enterAnimator, null), 3, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$c.class */
    public final class c extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<String> f96662a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Set<Integer> f96663b = new LinkedHashSet();

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeComponent$c$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final TextView f96664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Context f96665b;

            public a(@NotNull c cVar, M m7) {
                super(m7.f25861a);
                this.f96664a = m7.f25862b;
                this.f96665b = m7.f25861a.getContext();
                this.itemView.setOnClickListener(new com.bilibili.app.comm.comment2.comments.view.v(1, this, cVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f96662a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            a aVar = (a) viewHolder;
            String str = this.f96662a.get(i7);
            Context context = aVar.f96665b;
            int px = (NewPlayerUtilsKt.toPx(318) - NewPlayerUtilsKt.toPx(10)) / 2;
            ViewGroup.LayoutParams layoutParams = aVar.f96664a.getLayoutParams();
            layoutParams.width = px;
            aVar.f96664a.setLayoutParams(layoutParams);
            aVar.f96664a.setText(str);
            aVar.f96664a.setSelected(this.f96663b.contains(Integer.valueOf(i7)));
            aVar.f96664a.setTextColor(this.f96663b.contains(Integer.valueOf(i7)) ? ContextCompat.getColor(context, R$color.Brand_pink) : ContextCompat.getColor(context, R$color.Text_white));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(this, M.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    @Inject
    public UgcDmQoeComponent(@NotNull StateFlow<State> stateFlow, @NotNull c.a aVar) {
        this.f96610a = stateFlow;
        this.f96611b = aVar;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f96612c = mutableSharedFlowMutableSharedFlow$default;
        this.f96613d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f96614e = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new AJ0.u(this, 4));
        this.f96616g = "";
    }

    public final void a(TintImageView tintImageView, int i7) {
        int i8 = this.f96615f;
        if (i8 == 1) {
            int px = (int) ((((double) i7) + 0.5d) * ((double) (NewPlayerUtilsKt.toPx(ErrorCode.E_VOS_UPDATE_TRUSTTIME) / 5)));
            int px2 = NewPlayerUtilsKt.toPx(7);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) tintImageView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = px - px2;
            tintImageView.setLayoutParams(layoutParams);
            return;
        }
        if (i8 == 2) {
            int px3 = NewPlayerUtilsKt.toPx(48);
            int px4 = NewPlayerUtilsKt.toPx(52);
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) tintImageView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (px4 * i7) + px3;
            tintImageView.setLayoutParams(layoutParams2);
            return;
        }
        if (i8 != 3) {
            return;
        }
        List<State.a> list = this.h;
        List<State.a> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list2 = null;
        }
        int size = list2.size();
        double px5 = (NewPlayerUtilsKt.toPx(318) - ((size - 1) * NewPlayerUtilsKt.toPx(10))) / size;
        double px6 = NewPlayerUtilsKt.toPx(8) * i7;
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) tintImageView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) (((((double) i7) + 0.5d) * px5) + px6);
        tintImageView.setLayoutParams(layoutParams3);
    }

    public final void b(@NotNull C2967f c2967f, final int i7, @NotNull State.a aVar) {
        TintImageView tintImageView = c2967f.f25894b;
        tintImageView.setVisibility(0);
        a(tintImageView, i7);
        c2967f.h.setVisibility(0);
        c2967f.f25895c.setVisibility(0);
        c2967f.f25895c.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcDmQoeComponent f96702a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f96703b;

            {
                this.f96702a = this;
                this.f96703b = i7;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r10) {
                /*
                    r9 = this;
                    r0 = r9
                    com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent r0 = r0.f96702a
                    r10 = r0
                    r0 = r9
                    int r0 = r0.f96703b
                    r11 = r0
                    r0 = r10
                    kotlinx.coroutines.flow.MutableSharedFlow<com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$a> r0 = r0.f96612c
                    r14 = r0
                    r0 = r10
                    com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$c r0 = r0.f96619k
                    r13 = r0
                    r0 = 0
                    r12 = r0
                    r0 = r13
                    r10 = r0
                    r0 = r13
                    if (r0 != 0) goto L27
                    java.lang.String r0 = "ugcQoeSecondItemsAdapter"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r0 = 0
                    r10 = r0
                L27:
                    r0 = r10
                    java.util.Set<java.lang.Integer> r0 = r0.f96663b
                    r13 = r0
                    r0 = r13
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L3a
                    r0 = r13
                    r12 = r0
                L3a:
                    r0 = r12
                    if (r0 == 0) goto L90
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = r0
                    r1.<init>()
                    r13 = r0
                    r0 = r12
                    java.util.Iterator r0 = r0.iterator()
                    r12 = r0
                L4e:
                    r0 = r12
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L75
                    r0 = r12
                    java.lang.Object r0 = r0.next()
                    r15 = r0
                    r0 = r15
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    if (r0 <= 0) goto L4e
                    r0 = r13
                    r1 = r15
                    boolean r0 = r0.add(r1)
                    goto L4e
                L75:
                    r0 = r13
                    java.lang.String r1 = ","
                    r2 = 0
                    r3 = 0
                    com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.banner.items.h r4 = new com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.banner.items.h
                    r5 = r4
                    r6 = r10
                    r7 = 2
                    r5.<init>(r6, r7)
                    r5 = 30
                    java.lang.String r0 = kotlin.collections.CollectionsKt.p(r0, r1, r2, r3, r4, r5)
                    r12 = r0
                    r0 = r12
                    r10 = r0
                    r0 = r12
                    if (r0 != 0) goto L93
                L90:
                    java.lang.String r0 = ""
                    r10 = r0
                L93:
                    r0 = r14
                    com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$a$a r1 = new com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent$a$a
                    r2 = r1
                    r3 = r11
                    r4 = r10
                    r2.<init>(r3, r4)
                    boolean r0 = r0.tryEmit(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.d.onClick(android.view.View):void");
            }
        });
        c2967f.f25903l.setVisibility(0);
        RecyclerView recyclerView = this.f96617i;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secondLevelRv");
            recyclerView2 = null;
        }
        c cVar = this.f96619k;
        c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
            cVar2 = null;
        }
        recyclerView2.setAdapter(cVar2);
        b bVar = this.f96618j;
        b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
            bVar2 = null;
        }
        List<State.a> list = this.h;
        List<State.a> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list2 = null;
        }
        int i8 = this.f96615f;
        bVar2.f96649c = i7;
        bVar2.f96650d.clear();
        bVar2.f96650d.addAll(list2);
        bVar2.f96648b = i8;
        bVar2.f96651e = this.f96611b;
        bVar2.notifyDataSetChanged();
        List<String> list3 = aVar.f96632e;
        if (list3 != null) {
            c cVar3 = this.f96619k;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                cVar3 = null;
            }
            cVar3.f96663b.clear();
            cVar3.f96662a.clear();
            cVar3.f96662a.addAll(list3);
            cVar3.notifyDataSetChanged();
        }
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(c2967f.f25902k, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new com.bilibili.bililive.room.ui.matchcard.c(this, 1)));
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        C2967f c2967f = (C2967f) ((com.bilibili.app.gemini.ui.n) viewEntry).a;
        ConstraintLayout constraintLayout = c2967f.f25902k;
        FrameLayout frameLayout = c2967f.f25897e;
        ExposureEntry exposureEntry = this.f96614e;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, exposureEntry);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.IntRef intRef = new Ref.IntRef();
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(c2967f.f25902k, exposureEntry);
        b bVar = new b(new i(this, objectRef2, c2967f, intRef));
        this.f96618j = bVar;
        c2967f.f25899g.setAdapter(bVar);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass3(c2967f, this, objectRef2, objectRef, constraintLayout, frameLayout, c2967f.f25898f, intRef, objectRef3, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        C2967f c2967fInflate = C2967f.inflate(LayoutInflater.from(context), viewGroup, false);
        RecyclerView recyclerView = c2967fInflate.f25899g;
        ConstraintLayout constraintLayout = c2967fInflate.f25902k;
        recyclerView.setLayoutManager(new LinearLayoutManager(constraintLayout.getContext(), 0, false));
        this.f96619k = new c();
        RecyclerView recyclerView2 = c2967fInflate.f25903l;
        this.f96617i = recyclerView2;
        recyclerView2.setLayoutManager(new GridLayoutManager(constraintLayout.getContext(), 2));
        recyclerView2.addItemDecoration(new m());
        return new com.bilibili.app.gemini.ui.n(c2967fInflate);
    }
}

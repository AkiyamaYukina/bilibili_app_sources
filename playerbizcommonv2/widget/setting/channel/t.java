package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/t.class */
@StabilityInferred(parameters = 0)
public final class t extends com.bilibili.app.gemini.ui.m<Dr0.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f83281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f83282b = new a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/t$a.class */
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83286d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f83288f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<C0555a> f83283a = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public Function1<? super Integer, Unit> f83287e = new Object();

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/t$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0555a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f83289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f83290b;

            public C0555a(@NotNull String str, boolean z6) {
                this.f83289a = str;
                this.f83290b = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0555a)) {
                    return false;
                }
                C0555a c0555a = (C0555a) obj;
                return Intrinsics.areEqual(this.f83289a, c0555a.f83289a) && this.f83290b == c0555a.f83290b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f83290b) + (this.f83289a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("SelectItem(title=");
                sb.append(this.f83289a);
                sb.append(", select=");
                return androidx.appcompat.app.i.a(sb, this.f83290b, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/t$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final AppCompatTextView f83291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f83292b;

            public b(@NotNull Dr0.q qVar) {
                super(qVar.f3132a);
                this.f83291a = qVar.f3134c;
                this.f83292b = qVar.f3133b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f83283a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            b bVar = (b) viewHolder;
            C0555a c0555a = (C0555a) ((ArrayList) this.f83283a).get(i7);
            if (this.f83288f == 0) {
                View view = bVar.itemView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -2;
                view.setLayoutParams(layoutParams);
            } else {
                View view2 = bVar.itemView;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = this.f83288f;
                view2.setLayoutParams(layoutParams2);
            }
            bVar.f83291a.setText(c0555a.f83289a);
            bVar.f83291a.setTextColor(c0555a.f83290b ? this.f83285c : this.f83284b);
            bVar.f83292b.setBackgroundColor(this.f83286d);
            bVar.f83292b.setVisibility(i7 != 0 ? 0 : 8);
            bVar.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final t.a f83279a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f83280b;

                {
                    this.f83279a = this;
                    this.f83280b = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f83279a.f83287e.invoke(Integer.valueOf(this.f83280b));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(Dr0.q.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/t$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f83295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f83296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f83297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f83298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<String> f83299g;

        @NotNull
        public final StateFlow<Integer> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f83300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final Function1<Integer, Unit> f83301j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f83302k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f83303l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f83304m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f83305n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f83306o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f83307p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f83308q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final VideoSettingType f83309r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f83310s;

        public b(String str, String str2, String str3, int i7, int i8, List list, StateFlow stateFlow, int i9, Function1 function1, int i10, int i11, int i12, int i13, int i14, int i15, int i16, VideoSettingType videoSettingType, boolean z6, int i17) {
            str2 = (i17 & 2) != 0 ? "" : str2;
            str3 = (i17 & 4) != 0 ? "" : str3;
            boolean z7 = (i17 & 8) != 0;
            i9 = (i17 & 256) != 0 ? 0 : i9;
            i10 = (i17 & 1024) != 0 ? R$color.Text1 : i10;
            i11 = (i17 & 2048) != 0 ? R$color.Bg1_float : i11;
            i12 = (i17 & 4096) != 0 ? R$color.Line_regular : i12;
            i13 = (i17 & 8192) != 0 ? R$color.Text2 : i13;
            i14 = (i17 & 16384) != 0 ? R$color.Pi5 : i14;
            i15 = (32768 & i17) != 0 ? R$color.Line_regular : i15;
            i16 = (65536 & i17) != 0 ? R$color.Graph_bg_thin_float : i16;
            z6 = (i17 & 262144) != 0 ? false : z6;
            this.f83293a = str;
            this.f83294b = str2;
            this.f83295c = str3;
            this.f83296d = z7;
            this.f83297e = i7;
            this.f83298f = i8;
            this.f83299g = list;
            this.h = stateFlow;
            this.f83300i = i9;
            this.f83301j = function1;
            this.f83302k = i10;
            this.f83303l = i11;
            this.f83304m = i12;
            this.f83305n = i13;
            this.f83306o = i14;
            this.f83307p = i15;
            this.f83308q = i16;
            this.f83309r = videoSettingType;
            this.f83310s = z6;
        }
    }

    public t(@NotNull b bVar) {
        this.f83281a = bVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSettingSelectComponent$bind$2((Dr0.p) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.p.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}

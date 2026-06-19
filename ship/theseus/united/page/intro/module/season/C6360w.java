package com.bilibili.ship.theseus.united.page.intro.module.season;

import Yt0.C3168w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import dv0.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/w.class */
@StabilityInferred(parameters = 0)
public final class C6360w extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<o0> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f101708A = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f101709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f101711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ET.k f101712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final G f101713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comment.ext.compose.w f101714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final H f101715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Jq.g f101716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C3168w f101717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final I f101718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final J f101719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final K f101720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f101721x = DimenUtilsKt.dpToPx(44.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f101722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f101723z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.w$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/w$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f101724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f101725b;

        public a(@NotNull String str, @NotNull String str2) {
            this.f101724a = str;
            this.f101725b = str2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f101724a, aVar.f101724a) && Intrinsics.areEqual(this.f101725b, aVar.f101725b);
        }

        public final int hashCode() {
            return this.f101725b.hashCode() + (this.f101724a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("UnitedSeasonPanelHeadData(info=");
            sb.append(this.f101724a);
            sb.append(", intro=");
            return C8770a.a(sb, this.f101725b, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.w$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/w$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f101727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f101728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f101729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f101730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f101731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final a f101732g;

        @NotNull
        public final MutableStateFlow h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f101733i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f101734j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f101735k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f101736l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f101737m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final AbstractC6342d f101738n;

        public b(long j7, long j8, @NotNull String str, @NotNull String str2, boolean z6, boolean z7, @Nullable a aVar, @NotNull MutableStateFlow mutableStateFlow, @NotNull MutableStateFlow mutableStateFlow2, @NotNull MutableStateFlow mutableStateFlow3, @NotNull MutableStateFlow mutableStateFlow4, @NotNull StateFlow stateFlow, @NotNull MutableStateFlow mutableStateFlow5, @NotNull AbstractC6342d abstractC6342d) {
            this.f101726a = j7;
            this.f101727b = j8;
            this.f101728c = str;
            this.f101729d = str2;
            this.f101730e = z6;
            this.f101731f = z7;
            this.f101732g = aVar;
            this.h = mutableStateFlow;
            this.f101733i = mutableStateFlow2;
            this.f101734j = mutableStateFlow3;
            this.f101735k = mutableStateFlow4;
            this.f101736l = stateFlow;
            this.f101737m = mutableStateFlow5;
            this.f101738n = abstractC6342d;
        }
    }

    public C6360w(@NotNull b bVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull StateFlow stateFlow, @NotNull ET.k kVar, @NotNull G g7, @NotNull com.bilibili.app.comment.ext.compose.w wVar, @NotNull H h, @NotNull Jq.g gVar, @NotNull C3168w c3168w, @NotNull I i7, @NotNull J j7, @NotNull K k7) {
        this.f101709l = bVar;
        this.f101710m = aVar;
        this.f101711n = stateFlow;
        this.f101712o = kVar;
        this.f101713p = g7;
        this.f101714q = wVar;
        this.f101715r = h;
        this.f101716s = gVar;
        this.f101717t = c3168w;
        this.f101718u = i7;
        this.f101719v = j7;
        this.f101720w = k7;
        l(0.0f);
        this.f101722y = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        o0 o0Var = (o0) viewBinding;
        ConstraintLayout constraintLayout = o0Var.f117071a;
        Context context = constraintLayout.getContext();
        TextView textView = o0Var.f117087r;
        TextView textView2 = o0Var.f117077g;
        TextView textView3 = o0Var.f117074d;
        TextView textView4 = o0Var.f117075e;
        LinearLayout linearLayout = o0Var.f117083n;
        ImageView imageView = o0Var.f117084o;
        TextView textView5 = o0Var.f117082m;
        TextView textView6 = o0Var.f117086q;
        TextView textView7 = o0Var.f117079j;
        LinearLayout linearLayout2 = o0Var.f117081l;
        constraintLayout.setOnClickListener(new Object());
        o0Var.f117088s.setOnClickListener(new Object());
        View.OnClickListener aVar = new GL.a(this, 2);
        AppCompatImageView appCompatImageView = o0Var.f117073c;
        appCompatImageView.setOnClickListener(aVar);
        b bVar = this.f101709l;
        a aVar2 = bVar.f101732g;
        ConstraintLayout constraintLayout2 = o0Var.f117076f;
        if (aVar2 != null) {
            textView2.setText(aVar2.f101724a);
            textView3.setText(aVar2.f101725b);
            constraintLayout2.setVisibility(0);
        } else {
            constraintLayout2.setVisibility(8);
        }
        textView.setText(bVar.f101729d);
        linearLayout.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.a(this, 1));
        o0Var.f117078i.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.b(this, 1));
        RecyclerView recyclerView = o0Var.h;
        linearLayout2.setOnClickListener(new ViewOnClickListenerC6358u(0, this, recyclerView));
        linearLayout2.setVisibility(bVar.f101730e ? 0 : 8);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UnitedSeasonPanelComponent2$bindContent$8(this, textView2, linearLayout, o0Var.f117072b, textView6, linearLayout2, textView, appCompatImageView, recyclerView, o0Var.f117085p, new com.bilibili.ship.theseus.united.page.videolist.b(ContextCompat.getColor(context, R$color.Text1), ContextCompat.getColor(context, R$color.Pi5), ContextCompat.getColor(context, R$color.Text3), ContextCompat.getColor(context, R$color.Text2), ContextCompat.getColor(context, R$color.Pi5), ContextCompat.getColor(context, R$color.Graph_bg_thin), ContextCompat.getColor(context, R$color.Line_regular)), constraintLayout2, o0Var.f117080k, context, textView7, textView5, imageView, textView3, textView4, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o0.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f101722y;
    }

    public final void m(int i7, View view) {
        float height = view.getHeight() - this.f101721x;
        float translationY = view.getTranslationY() - i7;
        float f7 = translationY;
        if (translationY < 0.0f) {
            f7 = translationY;
            if (Math.abs(translationY) > height) {
                f7 = -height;
            }
        }
        if (f7 > 0.0f) {
            f7 = 0.0f;
        }
        view.setTranslationY(f7);
    }
}

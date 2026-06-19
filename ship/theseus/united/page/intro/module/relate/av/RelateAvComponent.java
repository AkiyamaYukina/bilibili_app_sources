package com.bilibili.ship.theseus.united.page.intro.module.relate.av;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6306c;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import dv0.C6854a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/av/RelateAvComponent.class */
@StabilityInferred(parameters = 0)
public final class RelateAvComponent extends m<C6854a0> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f101102a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/av/RelateAvComponent$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/av/RelateAvComponent$a$a.class */
        public interface InterfaceC1039a {
            void a();

            void b();
        }

        boolean a();

        @NotNull
        String b();

        @NotNull
        ExposureEntryV c();

        @NotNull
        ActivityColorRepository d();

        @NotNull
        String duration();

        @NotNull
        StatInfoData e();

        void f(@NotNull Rect rect, boolean z6);

        @NotNull
        String g();

        boolean h();

        @NotNull
        C6306c i();

        @NotNull
        String j();

        void k();

        @NotNull
        String l();

        @Nullable
        C6302a m();

        boolean n();

        @NotNull
        String o();

        void p(@Nullable b bVar);

        boolean q();

        @Nullable
        String r();

        @NotNull
        String s();

        boolean t();

        boolean u();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/av/RelateAvComponent$b.class */
    public static final class b implements a.InterfaceC1039a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RelateAvComponent f101103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintFixedLineSpacingTextView f101104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f101105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final VectorTextView f101106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final VectorTextView f101107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final VectorTextView f101108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final VectorTextView f101109g;
        public final TintImageView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TintImageView f101110i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final StatInfoData f101111j;

        public b(RelateAvComponent relateAvComponent, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, VectorTextView vectorTextView3, VectorTextView vectorTextView4, TintImageView tintImageView, TintImageView tintImageView2, StatInfoData statInfoData) {
            this.f101103a = relateAvComponent;
            this.f101104b = tintFixedLineSpacingTextView;
            this.f101105c = context;
            this.f101106d = vectorTextView;
            this.f101107e = vectorTextView2;
            this.f101108f = vectorTextView3;
            this.f101109g = vectorTextView4;
            this.h = tintImageView;
            this.f101110i = tintImageView2;
            this.f101111j = statInfoData;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a.InterfaceC1039a
        public final void a() {
            this.f101104b.setText(this.f101103a.f101102a.b());
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a.InterfaceC1039a
        public final void b() {
            RelateAvComponent.d(this.f101103a, this.f101104b, this.f101105c, this.f101106d, this.f101107e, this.f101108f, this.f101109g, this.h, this.f101110i, this.f101111j);
        }
    }

    public RelateAvComponent(@NotNull a aVar) {
        this.f101102a = aVar;
    }

    public static final void d(RelateAvComponent relateAvComponent, TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, VectorTextView vectorTextView, VectorTextView vectorTextView2, VectorTextView vectorTextView3, VectorTextView vectorTextView4, TintImageView tintImageView, TintImageView tintImageView2, StatInfoData statInfoData) {
        ActivityColorRepository activityColorRepositoryD = relateAvComponent.f101102a.d();
        Integer numH = activityColorRepositoryD.h();
        tintFixedLineSpacingTextView.setTextColor(numH != null ? numH.intValue() : relateAvComponent.f101102a.n() ? ContextCompat.getColor(context, 2131100812) : ContextCompat.getColor(context, R$color.Ga10));
        Integer numE = activityColorRepositoryD.e();
        int iIntValue = numE != null ? numE.intValue() : ContextCompat.getColor(context, R$color.Ga5);
        vectorTextView.setTextColor(iIntValue);
        vectorTextView2.setTextColor(iIntValue);
        vectorTextView3.setTextColor(iIntValue);
        vectorTextView4.setTextColor(iIntValue);
        tintImageView.setColorFilter(iIntValue);
        tintImageView2.setColorFilter(iIntValue);
        Drawable drawable = statInfoData.a() ? AppCompatResources.getDrawable(context, 2131235257) : AppCompatResources.getDrawable(context, 2131235038);
        int iDip2px = ScreenUtil.dip2px(context, 16.0f);
        rh1.a.a(vectorTextView, iDip2px, drawable, iIntValue);
        rh1.a.a(vectorTextView2, iDip2px, AppCompatResources.getDrawable(context, 2131235033), iIntValue);
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6854a0.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.C6854a0 r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a(dv0.a0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

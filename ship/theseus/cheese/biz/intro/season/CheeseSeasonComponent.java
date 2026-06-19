package com.bilibili.ship.theseus.cheese.biz.intro.season;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.biligame.compose.widget.B;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonService;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import fu0.M;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonComponent.class */
@StabilityInferred(parameters = 0)
public final class CheeseSeasonComponent extends m<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CheeseSeasonService.a f90025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<Integer> f90026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<List<C6353o>> f90027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f90028d = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new B(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonComponent$a.class */
    public static final class a implements com.bilibili.ship.theseus.cheese.biz.intro.season.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintTextView f90029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheeseSeasonComponent f90030b;

        public a(TintTextView tintTextView, CheeseSeasonComponent cheeseSeasonComponent) {
            this.f90029a = tintTextView;
            this.f90030b = cheeseSeasonComponent;
        }

        @Override // com.bilibili.ship.theseus.cheese.biz.intro.season.a
        public final void a() {
            this.f90029a.setText(this.f90030b.f90025a.a());
        }
    }

    public CheeseSeasonComponent(@NotNull CheeseSeasonService.a aVar, @NotNull Flow flow, @NotNull Flow flow2) {
        this.f90025a = aVar;
        this.f90026b = flow;
        this.f90027c = flow2;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return M.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull fu0.M r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseSeasonComponent.a(fu0.M, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

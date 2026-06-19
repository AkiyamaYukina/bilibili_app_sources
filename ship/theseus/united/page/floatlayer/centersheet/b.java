package com.bilibili.ship.theseus.united.page.floatlayer.centersheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.bplus.following.home.ui.e;
import dv0.C6859d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/centersheet/b.class */
@StabilityInferred(parameters = 0)
public final class b<T extends Fragment> extends m<C6859d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99734e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentManager f99735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<T> f99736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Animation f99737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animation f99738d;

    public b(@NotNull FragmentManager fragmentManager, @NotNull Class<T> cls) {
        this.f99735a = fragmentManager;
        this.f99736b = cls;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusCenterSheetComponent$bind$2((C6859d) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C6859d c6859dInflate = C6859d.inflate(layoutInflater, viewGroup, false);
        c6859dInflate.f116934a.setOnClickListener(new e(1));
        ConstraintLayout constraintLayout = c6859dInflate.f116934a;
        this.f99737c = AnimationUtils.loadAnimation(constraintLayout.getContext(), 2130772366);
        this.f99738d = AnimationUtils.loadAnimation(constraintLayout.getContext(), 2130772071);
        return c6859dInflate;
    }
}

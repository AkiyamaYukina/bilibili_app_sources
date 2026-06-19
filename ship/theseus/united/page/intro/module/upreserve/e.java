package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import dv0.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/e.class */
@StabilityInferred(parameters = 0)
public final class e extends m<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<d> f101989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f101990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f101991c;

    public e(@NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull f fVar) {
        this.f101989a = stateFlow;
        this.f101990b = stateFlow2;
        this.f101991c = fVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        p0 p0Var = (p0) viewBinding;
        ConstraintLayout constraintLayout = p0Var.f117099a;
        Context context = constraintLayout.getContext();
        ImageView imageView = p0Var.f117102d;
        TextView textView = p0Var.f117103e;
        TextView textView2 = p0Var.f117100b;
        View.OnClickListener dVar = new Bu.d(this, 4);
        ConstraintLayout constraintLayout2 = p0Var.f117101c;
        constraintLayout2.setOnClickListener(dVar);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UpReserveManageComponent$bind$3(this, constraintLayout, imageView, textView, context, textView2, constraintLayout2, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p0.inflate(layoutInflater, viewGroup, false);
    }
}

package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import bF0.C5047t;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import com.bilibili.upper.module.manuscript.model.AggregatedAuditProblemShowViewModel;
import gI0.C7251a;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ArchiveAggregatedProblemActivity.class */
@StabilityInferred(parameters = 0)
public final class ArchiveAggregatedProblemActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f113395G = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public C5047t f113396D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f113397E = LazyKt.lazy(new QD0.f(this, 3));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final C7251a f113398F = new C7251a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ArchiveAggregatedProblemActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113399a;

        public a(Function1 function1) {
            this.f113399a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f113399a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113399a.invoke(obj);
        }
    }

    @NotNull
    public final AggregatedAuditProblemShowViewModel Q6() {
        return (AggregatedAuditProblemShowViewModel) this.f113397E.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        ProblemDetailBean problemDetailBean = Q6().f113658i;
        return problemDetailBean == null ? "creation.only-return-detial-page.0.0.pv" : (problemDetailBean.statePanel == 2 && problemDetailBean.isLimit()) ? "creation.return-limit-detial-page.0.0.pv" : problemDetailBean.statePanel == 3 ? "creation.lock-detial-page.0.0.pv" : "creation.only-return-detial-page.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        ProblemDetailBean problemDetailBean = Q6().f113658i;
        bundle.putString(GameCardButton.extraAvid, String.valueOf(problemDetailBean != null ? problemDetailBean.aid : 0L));
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            Q6().f113657g = i7;
            if (Q6().h == 0) {
                Q6().h = i8;
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Q6().f113657g == 1) {
            setResult(Q6().h);
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.ArchiveAggregatedProblemActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        Q6().J0();
        ProblemDetailBean problemDetailBean = Q6().f113658i;
        if (problemDetailBean == null) {
            return;
        }
        int i7 = (!problemDetailBean.isLimit() || ((int) problemDetailBean.state) == 0) ? problemDetailBean.isLimit() ? 1 : problemDetailBean.statePanel : 4;
        TE0.b bVar = TE0.b.f24088a;
        long j7 = problemDetailBean.aid;
        HashMap mapA = VF0.b.a(bVar);
        mapA.put("problem", pf.h.a(i7, j7, GameCardButton.extraAvid, mapA));
        Neurons.reportExposure$default(false, "creation.question-details-page.0.0.show", mapA, (List) null, 8, (Object) null);
    }
}

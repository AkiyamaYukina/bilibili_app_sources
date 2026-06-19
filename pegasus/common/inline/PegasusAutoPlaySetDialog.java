package com.bilibili.pegasus.common.inline;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.InternalScreenAdjustDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.lib.theme.R$color;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusAutoPlaySetDialog.class */
@StabilityInferred(parameters = 0)
public final class PegasusAutoPlaySetDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Fragment f75544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<n> f75545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rp0.b f75546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f75547d;

    public PegasusAutoPlaySetDialog(Fragment fragment, List list, rp0.b bVar) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f75544a = fragment;
        this.f75545b = list;
        this.f75546c = bVar;
        this.f75547d = MutableStateFlow;
    }

    public final void a() {
        FragmentActivity fragmentActivityP3;
        LifecycleCoroutineScope lifecycleScope;
        Fragment fragment = this.f75544a;
        if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) {
            return;
        }
        ComposeView composeView = new ComposeView(fragmentActivityP3, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1401588408, true, new Function2(this) { // from class: com.bilibili.pegasus.common.inline.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PegasusAutoPlaySetDialog f75585a;

            {
                this.f75585a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
                /*
                    r5 = this;
                    r0 = r6
                    androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                    r10 = r0
                    r0 = r7
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r0 = r0.intValue()
                    r8 = r0
                    r0 = r8
                    r1 = 3
                    r0 = r0 & r1
                    r1 = 2
                    if (r0 == r1) goto L1b
                    r0 = 1
                    r9 = r0
                    goto L1e
                L1b:
                    r0 = 0
                    r9 = r0
                L1e:
                    r0 = r10
                    r1 = r9
                    r2 = r8
                    r3 = 1
                    r2 = r2 & r3
                    boolean r0 = r0.shouldExecute(r1, r2)
                    if (r0 == 0) goto L97
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L3c
                    r0 = 1401588408(0x538a8ab8, float:1.1900656E12)
                    r1 = r8
                    r2 = -1
                    java.lang.String r3 = "com.bilibili.pegasus.common.inline.PegasusAutoPlaySetDialog.show.<anonymous>.<anonymous>.<anonymous> (PegasusAutoPlaySetDialog.kt:56)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                L3c:
                    r0 = r5
                    com.bilibili.pegasus.common.inline.PegasusAutoPlaySetDialog r0 = r0.f75585a
                    r12 = r0
                    r0 = r12
                    java.util.List<com.bilibili.pegasus.common.inline.n> r0 = r0.f75545b
                    r11 = r0
                    r0 = r10
                    r1 = r12
                    boolean r0 = r0.changedInstance(r1)
                    r9 = r0
                    r0 = r10
                    java.lang.Object r0 = r0.rememberedValue()
                    r7 = r0
                    r0 = r9
                    if (r0 != 0) goto L6d
                    r0 = r7
                    r6 = r0
                    r0 = r7
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L7f
                L6d:
                    com.bilibili.pegasus.common.inline.p r0 = new com.bilibili.pegasus.common.inline.p
                    r1 = r0
                    r2 = r12
                    r1.<init>(r2)
                    r6 = r0
                    r0 = r10
                    r1 = r6
                    r0.updateRememberedValue(r1)
                L7f:
                    r0 = r11
                    r1 = r6
                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                    r2 = r10
                    r3 = 0
                    com.bilibili.pegasus.common.inline.t.b(r0, r1, r2, r3)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L9e
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto L9e
                L97:
                    r0 = r10
                    r0.skipToGroupEnd()
                L9e:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.common.inline.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        new InternalScreenAdjustDialog(fragmentActivityP3, composeView, G.b.a, "", 0.5f, 0, true, true, false, 3, a.b.a, this.f75547d, R$color.f64616Wh0, true).show();
        LifecycleOwner lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(fragmentActivityP3);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new PegasusAutoPlaySetDialog$show$1$2(fragmentActivityP3, this, null), 3, (Object) null);
    }
}

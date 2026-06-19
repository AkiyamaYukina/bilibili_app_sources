package com.bilibili.pegasus.components.graduation;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/z.class */
@StabilityInferred(parameters = 0)
public final class C5624z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ComposeView f76261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Job f76262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76263c;

    public final void a(@NotNull FragmentActivity fragmentActivity, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull final com.bilibili.pegasus.page.F f7) {
        if (this.f76261a != null) {
            return;
        }
        this.f76263c = false;
        View decorView = fragmentActivity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            f7.invoke();
            return;
        }
        ComposeView composeView = new ComposeView(fragmentActivity, null, 0, 6, null);
        composeView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        composeView.setClickable(true);
        composeView.setImportantForAccessibility(2);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1855189849, true, new Function2(this, f7) { // from class: com.bilibili.pegasus.components.graduation.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5624z f76257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.pegasus.page.F f76258b;

            {
                this.f76257a = this;
                this.f76258b = f7;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
                /*
                    r5 = this;
                    r0 = r6
                    androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                    r11 = r0
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
                    r0 = r11
                    r1 = r9
                    r2 = r8
                    r3 = 1
                    r2 = r2 & r3
                    boolean r0 = r0.shouldExecute(r1, r2)
                    if (r0 == 0) goto La4
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto L3c
                    r0 = 1855189849(0x6e93f359, float:2.2894243E28)
                    r1 = r8
                    r2 = -1
                    java.lang.String r3 = "com.bilibili.pegasus.components.graduation.GraduationSeasonFlipEnterOverlayController.show.<anonymous>.<anonymous> (GraduationSeasonFlipEnterOverlayController.kt:66)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                L3c:
                    r0 = r5
                    com.bilibili.pegasus.components.graduation.z r0 = r0.f76257a
                    r13 = r0
                    r0 = r11
                    r1 = r13
                    boolean r0 = r0.changedInstance(r1)
                    r10 = r0
                    r0 = r5
                    com.bilibili.pegasus.page.F r0 = r0.f76258b
                    r12 = r0
                    r0 = r11
                    r1 = r12
                    boolean r0 = r0.changed(r1)
                    r9 = r0
                    r0 = r11
                    java.lang.Object r0 = r0.rememberedValue()
                    r7 = r0
                    r0 = r10
                    r1 = r9
                    r0 = r0 | r1
                    if (r0 != 0) goto L7a
                    r0 = r7
                    r6 = r0
                    r0 = r7
                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                    java.lang.Object r1 = r1.getEmpty()
                    if (r0 != r1) goto L8e
                L7a:
                    com.bilibili.pegasus.components.graduation.y r0 = new com.bilibili.pegasus.components.graduation.y
                    r1 = r0
                    r2 = r13
                    r3 = r12
                    r1.<init>(r2, r3)
                    r6 = r0
                    r0 = r11
                    r1 = r6
                    r0.updateRememberedValue(r1)
                L8e:
                    r0 = r6
                    kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                    r1 = r11
                    r2 = 0
                    com.bilibili.pegasus.components.graduation.D.b(r0, r1, r2)
                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r0 == 0) goto Lab
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto Lab
                La4:
                    r0 = r11
                    r0.skipToGroupEnd()
                Lab:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.C5622x.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        this.f76261a = composeView;
        viewGroup.addView(composeView, new ViewGroup.LayoutParams(-1, -1));
        this.f76262b = BuildersKt.launch$default(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new GraduationSeasonFlipEnterOverlayController$show$1(this, f7, null), 3, (Object) null);
    }
}

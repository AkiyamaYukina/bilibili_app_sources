package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import dagger.assisted.AssistedInject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/E.class */
@StabilityInferred(parameters = 0)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerVipQualityTrialService f103702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f103703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f103704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f103705d = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new com.bilibili.bplus.im.conversation.add.h(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final State<Object> f103706e;

    @AssistedInject
    public E(@NotNull TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, @NotNull Context context, @NotNull Function0<Unit> function0) {
        this.f103702a = theseusPlayerVipQualityTrialService;
        this.f103703b = context;
        this.f103704c = function0;
        final int i7 = 0;
        this.f103706e = SnapshotStateKt.derivedStateOf(new Function0(this, i7) { // from class: com.bilibili.ship.theseus.united.page.videoquality.B

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f103695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f103696b;

            {
                this.f103695a = i7;
                this.f103696b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    r10 = this;
                    r0 = 0
                    r13 = r0
                    r0 = 0
                    r12 = r0
                    r0 = r10
                    java.lang.Object r0 = r0.f103696b
                    r14 = r0
                    r0 = r10
                    int r0 = r0.f103695a
                    switch(r0) {
                        case 0: goto L42;
                        default: goto L20;
                    }
                L20:
                    r0 = r14
                    android.content.Context r0 = (android.content.Context) r0
                    r13 = r0
                    int r0 = com.bilibili.video.story.action.widget.StoryCommentInputWidget.e
                    r11 = r0
                    r0 = r13
                    androidx.fragment.app.FragmentActivity r0 = com.bilibili.app.provider.UtilKt.findFragmentActivityOrNull(r0)
                    r13 = r0
                    r0 = r13
                    if (r0 != 0) goto L36
                    goto L40
                L36:
                    r0 = r13
                    java.lang.Class<com.bilibili.video.story.f0> r1 = com.bilibili.video.story.f0.class
                    androidx.lifecycle.ViewModel r0 = R0.k.a(r0, r1)
                    com.bilibili.video.story.f0 r0 = (com.bilibili.video.story.f0) r0
                    r12 = r0
                L40:
                    r0 = r12
                    return r0
                L42:
                    r0 = r14
                    com.bilibili.ship.theseus.united.page.videoquality.E r0 = (com.bilibili.ship.theseus.united.page.videoquality.E) r0
                    r14 = r0
                    r0 = r14
                    com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService r0 = r0.f103702a
                    vk.e r0 = r0.e()
                    r15 = r0
                    r0 = r13
                    r12 = r0
                    r0 = r15
                    if (r0 == 0) goto La6
                    r0 = r14
                    com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService r0 = r0.f103702a
                    r16 = r0
                    r0 = r16
                    boolean r0 = r0.c()
                    if (r0 != 0) goto L77
                    r0 = r13
                    r12 = r0
                    r0 = r16
                    int r0 = r0.m()
                    r1 = 2
                    boolean r0 = vk.f.a(r0, r1)
                    if (r0 == 0) goto La6
                L77:
                    r0 = r16
                    int r0 = r0.m()
                    r1 = 1
                    boolean r0 = vk.f.a(r0, r1)
                    if (r0 == 0) goto L88
                    r0 = r13
                    r12 = r0
                    goto La6
                L88:
                    com.bilibili.ship.theseus.united.page.videoquality.z0 r0 = new com.bilibili.ship.theseus.united.page.videoquality.z0
                    r1 = r0
                    r2 = -334222157(0xffffffffec142cb3, float:-7.165284E26)
                    r3 = 1
                    com.bilibili.ship.theseus.united.page.videoquality.C r4 = new com.bilibili.ship.theseus.united.page.videoquality.C
                    r5 = r4
                    r6 = r15
                    sk.a r6 = r6.h
                    r7 = r14
                    r8 = r15
                    r5.<init>(r6, r7, r8)
                    androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r2, r3, r4)
                    r1.<init>(r2)
                    r12 = r0
                La6:
                    r0 = r12
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.B.invoke():java.lang.Object");
            }
        });
    }
}

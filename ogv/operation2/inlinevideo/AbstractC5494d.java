package com.bilibili.ogv.operation2.inlinevideo;

import GA0.a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.operation3.module.operablecard.BizType;
import com.bilibili.upper.module.contribute.picker.v2.VideoPickerFragmentV2;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/d.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC5494d extends AbstractC5495e<A> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70917g = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.bilibili.ogv.kmm.operation.inlinevideo.k f70918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private s f70919f;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/d$a.class */
    public static final class a implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5494d f70920a;

        public a(AbstractC5494d abstractC5494d) {
            this.f70920a = abstractC5494d;
        }

        public void onDetach(InlinePanel inlinePanel) {
            this.f70920a.u().resetProgress();
            this.f70920a.u().setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.d$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/d$b.class */
    public static final class b implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5494d f70921a;

        public b(AbstractC5494d abstractC5494d) {
            this.f70921a = abstractC5494d;
        }

        @Override // com.bilibili.ogv.operation2.inlinevideo.E
        public void onWidgetShow() {
            this.f70921a.L();
            this.f70921a.H();
            this.f70921a.J();
        }
    }

    public AbstractC5494d(@NotNull View view) {
        super(view);
    }

    public static /* synthetic */ void C(AbstractC5494d abstractC5494d, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoDetail");
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        abstractC5494d.B(gVar, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(AbstractC5494d abstractC5494d, A a7, View view) {
        abstractC5494d.I();
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = abstractC5494d.z();
        if (gVarZ != null) {
            abstractC5494d.B(gVarZ, a7.p().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(AbstractC5494d abstractC5494d, View view) {
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = abstractC5494d.z();
        if (gVarZ == null) {
            return Unit.INSTANCE;
        }
        C(abstractC5494d, gVarZ, false, 2, null);
        return Unit.INSTANCE;
    }

    private final void N(A a7, com.bilibili.ogv.kmm.operation.inlinevideo.g gVar) {
        if (gVar == null) {
            return;
        }
        a7.s().setOnWidgetClickListener(new com.bilibili.bililive.room.ui.roomv3.voice.m(this, 1));
        a7.getDanmaku().setOnWidgetClickListener(new Function2(this) { // from class: com.bilibili.ogv.operation2.inlinevideo.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbstractC5494d f70913a;

            {
                this.f70913a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                return AbstractC5494d.P(this.f70913a, ((Boolean) obj).booleanValue(), (Map) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(AbstractC5494d abstractC5494d, boolean z6) {
        abstractC5494d.K(z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(AbstractC5494d abstractC5494d, boolean z6, Map map) {
        abstractC5494d.G(z6);
        return Unit.INSTANCE;
    }

    @Nullable
    public final s A() {
        return this.f70919f;
    }

    public abstract void B(@NotNull com.bilibili.ogv.kmm.operation.inlinevideo.g gVar, boolean z6);

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void onBindPanel(@NotNull final A a7) {
        super.onBindPanel(a7);
        if (z() == null) {
            return;
        }
        a7.getAvatar().displayAvatar((InlinePendantAvatar) null);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerU = u();
        inlineGestureSeekBarContainerU.setVisibility(0);
        inlineGestureSeekBarContainerU.resetProgress();
        inlineGestureSeekBarContainerU.setGestureEnable(false);
        a7.q().j(inlineGestureSeekBarContainerU, v());
        a7.q().setUserInputEnable(false);
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        if (gVarZ == null || !gVarZ.f68504j) {
            a7.p().setVisibility(0);
            final int i7 = 0;
            a7.p().setOnClickListener(new View.OnClickListener(i7, this, a7) { // from class: com.bilibili.ogv.operation2.inlinevideo.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f70914a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f70915b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f70916c;

                {
                    this.f70914a = i7;
                    this.f70915b = this;
                    this.f70916c = a7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f70914a) {
                        case 0:
                            AbstractC5494d.E((AbstractC5494d) this.f70915b, (A) this.f70916c, view);
                            break;
                        default:
                            VideoPickerFragmentV2 videoPickerFragmentV2 = (VideoPickerFragmentV2) this.f70915b;
                            String str = (String) this.f70916c;
                            InfoEyesManager.getInstance().report2(false, "000377", new String[]{"contribute_guide_view", "show", "1"});
                            LinearLayout linearLayout = videoPickerFragmentV2.s;
                            LinearLayout linearLayout2 = linearLayout;
                            if (linearLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLlSubmissionTip");
                                linearLayout2 = null;
                            }
                            linearLayout2.setVisibility(8);
                            new SharedPreferencesHelper(videoPickerFragmentV2.getApplicationContext()).setBoolean("display_submission_tip1", false);
                            a.C0040a.b(GA0.a.f6978a, videoPickerFragmentV2.getApplicationContext(), str);
                            break;
                    }
                }
            });
        } else {
            a7.p().setVisibility(8);
        }
        a7.setSupportShowEndPage(false);
        a7.addOnDetachListener(new a(this));
        a7.y(new b(this));
        N(a7, z());
        a7.setOnClickListener(new Vn.o(this, 1));
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{a7.getInline4GWarningWidget(), new InlineToastTask(a7)})).execute();
        a7.z(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.HashMap] */
    public void G(boolean z6) {
        Map<String, String> map;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        Map map2 = (gVarZ == null || (map = gVarZ.f68505k) == null) ? null : new HashMap(map);
        if (map2 != null) {
        }
        com.bilibili.ogv.kmm.operation.inlinevideo.k kVar = this.f70918e;
        String strC = null;
        if (kVar != null) {
            strC = kVar.c();
        }
        String strA = android.support.v4.media.a.a("pgc.", strC, ".recommend.dm.click");
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, strA, map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.k r0 = r0.f70918e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L13
            r0 = r8
            java.lang.String r0 = r0.c()
            r8 = r0
            goto L15
        L13:
            r0 = 0
            r8 = r0
        L15:
            java.lang.String r0 = "pgc."
            r1 = r8
            java.lang.String r2 = ".recommend.dm.show"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            r10 = r0
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r8
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f68505k
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L37
            goto L3a
        L37:
            goto L41
        L3a:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r8 = r0
            goto L37
        L41:
            r0 = 0
            r1 = r10
            r2 = r8
            r3 = 0
            r4 = 8
            r5 = 0
            com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.H():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I() {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ogv.kmm.operation.inlinevideo.k r0 = r0.f70918e
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L13
            r0 = r5
            java.lang.String r0 = r0.c()
            r5 = r0
            goto L15
        L13:
            r0 = 0
            r5 = r0
        L15:
            java.lang.String r0 = "pgc."
            r1 = r5
            java.lang.String r2 = ".recommend.fullscreen.click"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            r7 = r0
            r0 = r4
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L34
            r0 = r5
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f68505k
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L38
        L34:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r5 = r0
        L38:
            r0 = 0
            r1 = r7
            r2 = r5
            com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.I():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.k r0 = r0.f70918e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L13
            r0 = r8
            java.lang.String r0 = r0.c()
            r8 = r0
            goto L15
        L13:
            r0 = 0
            r8 = r0
        L15:
            java.lang.String r0 = "pgc."
            r1 = r8
            java.lang.String r2 = ".recommend.fullscreen.show"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            r10 = r0
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r8
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f68505k
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L37
            goto L3a
        L37:
            goto L41
        L3a:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r8 = r0
            goto L37
        L41:
            r0 = 0
            r1 = r10
            r2 = r8
            r3 = 0
            r4 = 8
            r5 = 0
            com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.J():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.HashMap] */
    public void K(boolean z6) {
        Map<String, String> map;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        Map map2 = (gVarZ == null || (map = gVarZ.f68505k) == null) ? null : new HashMap(map);
        if (map2 != null) {
        }
        com.bilibili.ogv.kmm.operation.inlinevideo.k kVar = this.f70918e;
        String strC = null;
        if (kVar != null) {
            strC = kVar.c();
        }
        String strA = android.support.v4.media.a.a("pgc.", strC, ".recommend.sound.click");
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, strA, map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.k r0 = r0.f70918e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L13
            r0 = r8
            java.lang.String r0 = r0.c()
            r8 = r0
            goto L15
        L13:
            r0 = 0
            r8 = r0
        L15:
            java.lang.String r0 = "pgc."
            r1 = r8
            java.lang.String r2 = ".recommend.sound.show"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            r10 = r0
            r0 = r7
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r8
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f68505k
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L37
            goto L3a
        L37:
            goto L41
        L3a:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r8 = r0
            goto L37
        L41:
            r0 = 0
            r1 = r10
            r2 = r8
            r3 = 0
            r4 = 8
            r5 = 0
            com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.L():void");
    }

    public final void M(@Nullable com.bilibili.ogv.kmm.operation.inlinevideo.k kVar) {
        this.f70918e = kVar;
    }

    public final void Q(@Nullable s sVar) {
        this.f70919f = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.card.IInlineProperty d() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ogv.operation2.inlinevideo.s r0 = r0.f70919f
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L14
            r0 = r4
            com.bilibili.inline.card.IInlineProperty r0 = r0.b()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L1c
        L14:
            com.bilibili.inline.card.DefaultInlineProperty r0 = new com.bilibili.inline.card.DefaultInlineProperty
            r1 = r0
            r1.<init>()
            r4 = r0
        L1c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.d():com.bilibili.inline.card.IInlineProperty");
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    @Nullable
    public Video.PlayableParams e() {
        Video.PlayableParams playableParamsD;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        if ((gVarZ != null ? gVarZ.f68497b : null) == BizType.UGC) {
            com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ2 = z();
            playableParamsD = null;
            if (gVarZ2 != null) {
                playableParamsD = y.e(gVarZ2, w());
            }
        } else {
            com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ3 = z();
            playableParamsD = null;
            if (gVarZ3 != null) {
                playableParamsD = y.d(gVarZ3, w());
            }
        }
        return playableParamsD;
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    @NotNull
    public CharSequence g() {
        StringBuilder sb = new StringBuilder("Inline playable card log info");
        Video.PlayableParams playableParamsE = e();
        sb.append(playableParamsE != null ? playableParamsE.getLogDescription() : null);
        return sb;
    }

    @NotNull
    public IInlineCardData getCardData() {
        s sVar;
        s sVar2 = this.f70919f;
        if ((sVar2 != null ? sVar2.a() : null) == null && (sVar = this.f70919f) != null) {
            sVar.c(c());
        }
        s sVar3 = this.f70919f;
        IInlineCardData iInlineCardDataA = null;
        if (sVar3 != null) {
            iInlineCardDataA = sVar3.a();
        }
        return iInlineCardDataA;
    }

    @NotNull
    public Class<? extends A> getPanelType() {
        return A.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.inline.utils.InlineReportParam l() {
        /*
            r17 = this;
            r0 = r17
            com.bilibili.ogv.kmm.operation.inlinevideo.k r0 = r0.f70918e
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L23
            r0 = r26
            java.lang.String r0 = r0.getModuleType()
            r27 = r0
            r0 = r27
            r26 = r0
            r0 = r27
            if (r0 != 0) goto L20
            goto L23
        L20:
            goto L2b
        L23:
            java.lang.String r0 = ""
            r26 = r0
            goto L20
        L2b:
            r0 = r17
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r27 = r0
            r0 = 0
            r24 = r0
            r0 = r27
            if (r0 == 0) goto L4e
            r0 = r27
            com.bilibili.ogv.kmm.operation.inlinevideo.d r0 = r0.f68496a
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L4e
            r0 = r27
            long r0 = r0.f68483a
            r18 = r0
            goto L50
        L4e:
            r0 = 0
            r18 = r0
        L50:
            r0 = r17
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L70
            r0 = r27
            com.bilibili.ogv.kmm.operation.inlinevideo.d r0 = r0.f68496a
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L70
            r0 = r27
            long r0 = r0.f68484b
            r20 = r0
            goto L72
        L70:
            r0 = 0
            r20 = r0
        L72:
            r0 = r17
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L87
            r0 = r27
            long r0 = r0.f68501f
            r22 = r0
            goto L8a
        L87:
            r0 = 0
            r22 = r0
        L8a:
            r0 = r17
            com.bilibili.ogv.kmm.operation.inlinevideo.g r0 = r0.z()
            r27 = r0
            r0 = r27
            if (r0 == 0) goto L9c
            r0 = r27
            long r0 = r0.f68502g
            r24 = r0
        L9c:
            com.bilibili.inline.utils.InlineReportParam r0 = new com.bilibili.inline.utils.InlineReportParam
            r1 = r0
            r2 = r26
            r3 = r18
            r4 = r20
            r5 = r22
            r6 = r24
            r7 = 0
            r8 = 0
            r9 = 64
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.AbstractC5494d.l():com.bilibili.inline.utils.InlineReportParam");
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    public boolean m() {
        com.bilibili.ogv.kmm.operation.inlinevideo.d dVar;
        com.bilibili.ogv.kmm.operation.inlinevideo.g gVarZ = z();
        return ((gVarZ == null || (dVar = gVarZ.f68496a) == null) ? null : dVar.f68488f) != null;
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    public boolean n() {
        return false;
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    public int o() {
        return -1;
    }

    @NotNull
    public final InlineGestureSeekBarContainer u() {
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = f().findViewById(2131303684);
        inlineGestureSeekBarContainerFindViewById.setVisibility(0);
        return inlineGestureSeekBarContainerFindViewById;
    }

    @Nullable
    public Drawable v() {
        return null;
    }

    @Nullable
    public String w() {
        return null;
    }

    @Nullable
    public final com.bilibili.ogv.kmm.operation.inlinevideo.k x() {
        return this.f70918e;
    }

    @Override // com.bilibili.ogv.operation2.inlinevideo.AbstractC5495e
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public CardFragmentPlayerContainerLayout i() {
        return f().findViewById(r.n());
    }

    @Nullable
    public final com.bilibili.ogv.kmm.operation.inlinevideo.g z() {
        com.bilibili.ogv.kmm.operation.inlinevideo.k kVar = this.f70918e;
        return kVar != null ? kVar.d() : null;
    }
}

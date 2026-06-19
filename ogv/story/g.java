package com.bilibili.ogv.story;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.VipBarData;
import com.bilibili.video.story.helper.O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/g.class */
@StabilityInferred(parameters = 0)
public final class g extends ConstraintLayout implements com.bilibili.video.story.action.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73065d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.bilibili.video.story.action.g f73066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.video.story.action.i> f73067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gl0.e f73068c;

    public g(@NotNull Context context) {
        super(context, null, 0);
        this.f73067b = new ArrayList();
        this.f73068c = Gl0.e.inflate(LayoutInflater.from(getContext()), this, true);
        j0(this);
    }

    public final void Y(@NotNull com.bilibili.video.story.action.g gVar) {
        this.f73066a = gVar;
        if (gVar.getData() != null) {
            Gl0.e eVar = this.f73068c;
            Gl0.c cVar = eVar.f7143B;
            ConstraintLayout constraintLayout = cVar.f7135x;
            O.a commonReportInfo = gVar.getCommonReportInfo();
            Kd.a aVar = new Kd.a(gVar, 1);
            f fVar = new f(constraintLayout, 0);
            Kd.e eVar2 = new Kd.e(cVar.f7126C, 2);
            OgvStoryBottomVm ogvStoryBottomVm = new OgvStoryBottomVm();
            ogvStoryBottomVm.f72976N = commonReportInfo;
            ogvStoryBottomVm.f72969G = aVar;
            ogvStoryBottomVm.f72967E = fVar;
            ogvStoryBottomVm.f72968F = eVar2;
            eVar.q(ogvStoryBottomVm);
        } else {
            setVisibility(8);
        }
        Iterator it = ((ArrayList) this.f73067b).iterator();
        while (it.hasNext()) {
            ((com.bilibili.video.story.action.i) it.next()).Y(gVar);
        }
    }

    public final void j0(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                com.bilibili.video.story.action.i childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ViewGroup) {
                    j0(childAt);
                } else if (childAt instanceof com.bilibili.video.story.action.i) {
                    ((ArrayList) this.f73067b).add(childAt);
                }
            }
        }
    }

    public final void onStart(int i7) {
        String strK;
        String strL;
        com.bilibili.video.story.player.m player;
        Iterator it = ((ArrayList) this.f73067b).iterator();
        while (it.hasNext()) {
            ((com.bilibili.video.story.action.i) it.next()).onStart(i7);
        }
        OgvStoryBottomVm ogvStoryBottomVm = this.f73068c.f7144C;
        if (ogvStoryBottomVm != null) {
            com.bilibili.video.story.action.g gVar = this.f73066a;
            Integer numValueOf = (gVar == null || (player = gVar.getPlayer()) == null) ? null : Integer.valueOf(player.getIndex());
            Integer num = numValueOf;
            if (numValueOf == null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Integer.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    num = (Integer) Double.valueOf(0.0d);
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    num = (Integer) Float.valueOf(0.0f);
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    num = (Integer) 0L;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    num = 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                    num = (Integer) (char) 0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                    num = (Integer) (short) 0;
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                        throw new RuntimeException("not primitive number type");
                    }
                    num = (Integer) (byte) 0;
                }
            }
            int iIntValue = num.intValue();
            O.a aVar = ogvStoryBottomVm.f72976N;
            if (aVar != null) {
                aVar.i = iIntValue + 1;
            }
            Context context = getContext();
            ogvStoryBottomVm.f72970H = true;
            O.a aVar2 = ogvStoryBottomVm.f72976N;
            if (aVar2 != null) {
                Neurons.reportExposure$default(true, "main.ugc-video-detail-vertical.drama.0.show", OgvStoryBottomVm.q(aVar2), (List) null, 8, (Object) null);
            }
            Kd.a aVar3 = ogvStoryBottomVm.f72969G;
            Kd.a aVar4 = aVar3;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("obtainStoryDetail");
                aVar4 = null;
            }
            StoryDetail storyDetail = (StoryDetail) aVar4.invoke();
            if (storyDetail == null) {
                return;
            }
            StoryDetail.SeasonCardInfo seasonInfo = storyDetail.getSeasonInfo();
            int vipStyle = seasonInfo != null ? seasonInfo.getVipStyle() : 0;
            VipBarData vipBarDataO = OgvStoryBottomVm.o(storyDetail);
            if (vipBarDataO != null) {
                if (ogvStoryBottomVm.f72991o && ogvStoryBottomVm.f72970H) {
                    boolean z6 = (vipStyle != 0 || (strK = vipBarDataO.k()) == null || strK.length() == 0 || (strL = vipBarDataO.l()) == null || strL.length() == 0) ? false : true;
                    boolean zL = OgvStoryBottomVm.L(vipBarDataO, vipStyle);
                    boolean z7 = false;
                    if (vipStyle == 2) {
                        z7 = false;
                        if (OgvStoryBottomVm.I(vipBarDataO)) {
                            z7 = true;
                        }
                    }
                    if (z6 || zL || z7) {
                        ogvStoryBottomVm.r();
                    }
                }
                if (OgvStoryBottomVm.L(vipBarDataO, vipStyle)) {
                    BuildersKt.launch$default(ogvStoryBottomVm.f72971I, (CoroutineContext) null, (CoroutineStart) null, new OgvStoryBottomVm$onStart$1$1(ogvStoryBottomVm, context, null), 3, (Object) null);
                }
            }
        }
    }

    public final void onStop(int i7) {
        Iterator<T> it = this.f73067b.iterator();
        while (it.hasNext()) {
            ((com.bilibili.video.story.action.i) it.next()).onStop(i7);
        }
        OgvStoryBottomVm ogvStoryBottomVm = this.f73068c.f7144C;
        if (ogvStoryBottomVm != null) {
            ogvStoryBottomVm.f72970H = false;
            JobKt.cancelChildren$default(ogvStoryBottomVm.f72971I.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void onUnbind() {
        Iterator<T> it = this.f73067b.iterator();
        while (it.hasNext()) {
            ((com.bilibili.video.story.action.i) it.next()).onUnbind();
        }
        OgvStoryBottomVm ogvStoryBottomVm = this.f73068c.f7144C;
        if (ogvStoryBottomVm != null) {
            ogvStoryBottomVm.H(false);
        }
        this.f73066a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(@org.jetbrains.annotations.NotNull com.bilibili.video.story.action.StoryActionType r8, @org.jetbrains.annotations.Nullable com.bilibili.video.story.action.i r9) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.story.g.r(com.bilibili.video.story.action.StoryActionType, com.bilibili.video.story.action.i):void");
    }
}

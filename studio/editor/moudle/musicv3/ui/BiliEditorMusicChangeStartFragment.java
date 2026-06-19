package com.bilibili.studio.editor.moudle.musicv3.ui;

import Pa.F;
import TB0.x0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.holders.X0;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmPointEntry;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kntr.common.chronos.debug.z;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicChangeStartFragment.class */
public class BiliEditorMusicChangeStartFragment extends BiliEditorBaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewBinding f107952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f107953m = LazyKt.lazy(new F(this, 3));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public a f107954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f107955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f107957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Kz0.a f107958r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicChangeStartFragment$a.class */
    public interface a {
        long a();

        void b(@Nullable BMusic bMusic, @NotNull Function1<? super Boolean, Unit> function1);

        @Nullable
        EditVideoInfo c(@Nullable BMusic bMusic);

        void d(@Nullable BMusic bMusic);

        @Nullable
        BMusic e();

        void onCancel();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicChangeStartFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f107959a;

        public b(Function1 function1) {
            this.f107959a = function1;
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
            return this.f107959a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107959a.invoke(obj);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        this.f107957q = true;
        wf().M0();
        BMusic bMusicI0 = wf().I0();
        a aVar = this.f107954n;
        if (aVar != null) {
            aVar.b(bMusicI0, function1);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        BMusic bMusicI0 = wf().I0();
        a aVar = this.f107954n;
        return aVar != null ? aVar.c(bMusicI0) : null;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void j8() {
        super.j8();
        com.bilibili.studio.videoeditor.capturev3.music.r rVar = wf().f15023e;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void l4(long j7) {
        com.bilibili.studio.videoeditor.capturev3.music.r rVar;
        super.l4(j7);
        Lz0.c cVarWf = wf();
        BMusic value = cVarWf.f15024f.getValue();
        if (value != null && j7 == value.inPoint && (rVar = cVarWf.f15023e) != null) {
            Long value2 = cVarWf.f15020b.getValue();
            rVar.g((value2 != null ? value2.longValue() : 0L) / 1000);
        }
        com.bilibili.studio.videoeditor.capturev3.music.r rVar2 = wf().f15023e;
        if (rVar2 != null) {
            rVar2.f();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 2131302460) {
            if (numValueOf != null && numValueOf.intValue() == 2131302459) {
                wf().L0();
                wf().M0();
                this.f105685b.x();
                a aVar = this.f107954n;
                if (aVar != null) {
                    aVar.onCancel();
                }
                this.f105685b.g(this.f107955o);
                return;
            }
            return;
        }
        BMusic bMusicI0 = wf().I0();
        wf().L0();
        wf().M0();
        this.f105685b.x();
        a aVar2 = this.f107954n;
        if (aVar2 != null) {
            aVar2.d(bMusicI0);
        }
        com.bilibili.studio.editor.moudle.musicv3.logic.b.d(bMusicI0);
        this.f105685b.g(this.f107955o);
        Xz0.d dVar = Xz0.d.f28458a;
        String str = Jz0.f.f11746a;
        String str2 = this.f107955o == 1 ? "musictrack" : "musictab";
        String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        boolean z6 = this.f107956p;
        dVar.getClass();
        Xz0.d.R(str2, strE, z6);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f107958r = yf();
        return xf(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f107954n = null;
        wf().L0();
        super.onDestroy();
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f107957q) {
            this.f107957q = false;
            wf().J0();
        }
        Xz0.d dVar = Xz0.d.f28458a;
        String str = Jz0.f.f11746a;
        String str2 = this.f107955o == 1 ? "musictrack" : "musictab";
        String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("from", str2);
        map.put("fast_video", strE);
        Neurons.reportExposure$default(false, "creation.new-video-editor.choose-music.music-cut.show", mapB, (List) null, 8, (Object) null);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        BMusic bMusicE;
        super.onViewCreated(view, bundle);
        this.f105692j = false;
        View viewFindViewById = view.findViewById(2131302459);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        view.findViewById(2131302460).setOnClickListener(this);
        ((TextView) view.findViewById(2131309694)).setText(2131841967);
        Kz0.a aVar = this.f107958r;
        if (aVar != null) {
            aVar.a(this.f107952l, new d(this));
        }
        final ViewBinding viewBinding = this.f107952l;
        if (viewBinding != null) {
            wf().f15028k = new e(this);
            final int i7 = 0;
            wf().f15024f.observe(getViewLifecycleOwner(), new b(new Function1(i7, this, viewBinding) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f108029a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f108030b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f108031c;

                {
                    this.f108029a = i7;
                    this.f108030b = this;
                    this.f108031c = viewBinding;
                }

                public final Object invoke(Object obj) {
                    Unit unit;
                    ArrayList<BgmPointEntry> arrayList;
                    switch (this.f108029a) {
                        case 0:
                            BMusic bMusic = (BMusic) obj;
                            if (bMusic == null) {
                                unit = Unit.INSTANCE;
                            } else {
                                BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = (BiliEditorMusicChangeStartFragment) this.f108030b;
                                Kz0.a aVar2 = biliEditorMusicChangeStartFragment.f107958r;
                                ViewBinding viewBinding2 = (ViewBinding) this.f108031c;
                                if (aVar2 != null) {
                                    aVar2.h(bMusic.totalTime, viewBinding2);
                                }
                                Kz0.a aVar3 = biliEditorMusicChangeStartFragment.f107958r;
                                if (aVar3 != null) {
                                    Bgm bgm = bMusic.bgm;
                                    LongSparseArray<String> longSparseArray = new LongSparseArray<>(0, 1, null);
                                    if (bgm != null && (arrayList = bgm.timeline) != null) {
                                        for (BgmPointEntry bgmPointEntry : arrayList) {
                                            longSparseArray.put(bgmPointEntry.point * 1000, bgmPointEntry.comment);
                                        }
                                    }
                                    aVar3.d(viewBinding2, longSparseArray);
                                }
                                biliEditorMusicChangeStartFragment.f105685b.y(bMusic.inPoint, bMusic.outPoint);
                                unit = Unit.INSTANCE;
                            }
                            break;
                        case 1:
                            ((MutableState) this.f108030b).setValue((String) obj);
                            ((MutableState) this.f108031c).setValue(z.c.a);
                            break;
                        default:
                            List list = (List) this.f108030b;
                            List list2 = (List) this.f108031c;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Placeable.PlacementScope.place$default(placementScope, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
                            }
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                Placeable.PlacementScope.place$default(placementScope, (Placeable) it2.next(), 0, 0, 0.0f, 4, null);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            wf().f15020b.observe(getViewLifecycleOwner(), new b(new X0(1, this, viewBinding)));
            wf().f15021c.observe(getViewLifecycleOwner(), new b(new Function1(this, viewBinding) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMusicChangeStartFragment f108032a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ViewBinding f108033b;

                {
                    this.f108032a = this;
                    this.f108033b = viewBinding;
                }

                public final Object invoke(Object obj) {
                    Long l7 = (Long) obj;
                    Kz0.a aVar2 = this.f108032a.f107958r;
                    if (aVar2 != null) {
                        aVar2.f(this.f108033b, U.c(l7.longValue() / 1000));
                    }
                    return Unit.INSTANCE;
                }
            }));
            wf().f15025g.observe(getViewLifecycleOwner(), new b(new com.bilibili.lib.accountsui.i(1, this, viewBinding)));
            wf().h.observe(getViewLifecycleOwner(), new b(new Function1(this, viewBinding) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMusicChangeStartFragment f108034a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ViewBinding f108035b;

                {
                    this.f108034a = this;
                    this.f108035b = viewBinding;
                }

                public final Object invoke(Object obj) {
                    Long l7 = (Long) obj;
                    BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = this.f108034a;
                    Kz0.a aVar2 = biliEditorMusicChangeStartFragment.f107958r;
                    if (aVar2 != null) {
                        boolean z6 = biliEditorMusicChangeStartFragment.wf().f15026i;
                        aVar2.b(this.f108035b, l7.longValue(), z6);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        Bundle arguments = getArguments();
        this.f107955o = arguments != null ? arguments.getInt("cut_tab_from") : 0;
        wf().J0();
        Lz0.c cVarWf = wf();
        a aVar2 = this.f107954n;
        cVarWf.f15022d = aVar2 != null ? aVar2.a() : Long.MAX_VALUE;
        a aVar3 = this.f107954n;
        if (aVar3 != null && (bMusicE = aVar3.e()) != null) {
            wf().f15024f.setValue(bMusicE.mo9886clone());
            wf().N0(bMusicE.trimIn);
            Kz0.a aVar4 = this.f107958r;
            if (aVar4 != null) {
                ViewBinding viewBinding2 = this.f107952l;
                Long value = wf().f15020b.getValue();
                aVar4.e(value != null ? value.longValue() : 0L, viewBinding2);
            }
            wf().K0();
        }
        this.f105693k = false;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void vd() {
        super.vd();
        com.bilibili.studio.videoeditor.capturev3.music.r rVar = wf().f15023e;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void w2(long j7) {
        super.w2(j7);
        Lz0.c cVarWf = wf();
        com.bilibili.studio.videoeditor.capturev3.music.r rVar = cVarWf.f15023e;
        long jD = (rVar != null ? rVar.d() : 0L) * 1000;
        Long value = cVarWf.f15021c.getValue();
        long j8 = jD;
        if (value != null) {
            long jLongValue = value.longValue();
            j8 = jD;
            if (jD > jLongValue) {
                j8 = jLongValue;
            }
        }
        cVarWf.f15025g.setValue(Long.valueOf(j8));
    }

    public final Lz0.c wf() {
        return (Lz0.c) this.f107953m.getValue();
    }

    @Nullable
    public View xf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        x0 x0VarInflate = x0.inflate(layoutInflater, viewGroup, false);
        this.f107952l = x0VarInflate;
        LinearLayout linearLayout = null;
        if (x0VarInflate == null) {
            x0VarInflate = null;
        }
        if (x0VarInflate != null) {
            linearLayout = x0VarInflate.f24053a;
        }
        return linearLayout;
    }

    @NotNull
    public Kz0.a yf() {
        return new Kz0.a();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }
}

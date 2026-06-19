package com.bilibili.studio.editor.moudle.musicv3.ui;

import TB0.o0;
import UC0.n;
import Xz0.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.animation.core.C3339q;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBinding;
import c6.Q;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicVolumeFragment.class */
public class BiliEditorMusicVolumeFragment extends BiliEditorBaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewBinding f108005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f108006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f108007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public BMusic f108008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f108009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Jz0.e f108010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final b f108011r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f108012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Kz0.i f108013t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicVolumeFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f108015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f108016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f108017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f108018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f108019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f108020g;
        public float h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f108021i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f108022j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final b f108023k;

        public a(boolean z6, boolean z7, long j7, long j8, long j9, long j10, float f7, float f8, int i7, int i8, @Nullable b bVar) {
            this.f108014a = z6;
            this.f108015b = z7;
            this.f108016c = j7;
            this.f108017d = j8;
            this.f108018e = j9;
            this.f108019f = j10;
            this.f108020g = f7;
            this.h = f8;
            this.f108021i = i7;
            this.f108022j = i8;
            this.f108023k = bVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f108014a == aVar.f108014a && this.f108015b == aVar.f108015b && this.f108016c == aVar.f108016c && this.f108017d == aVar.f108017d && this.f108018e == aVar.f108018e && this.f108019f == aVar.f108019f && Float.compare(this.f108020g, aVar.f108020g) == 0 && Float.compare(this.h, aVar.h) == 0 && this.f108021i == aVar.f108021i && this.f108022j == aVar.f108022j && Intrinsics.areEqual(this.f108023k, aVar.f108023k);
        }

        public final int hashCode() {
            int iA = I.a(this.f108022j, I.a(this.f108021i, androidx.compose.animation.n.a(this.h, androidx.compose.animation.n.a(this.f108020g, C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(androidx.compose.animation.z.a(Boolean.hashCode(this.f108014a) * 31, 31, this.f108015b), 31, this.f108016c), 31, this.f108017d), 31, this.f108018e), 31, this.f108019f), 31), 31), 31), 31);
            b bVar = this.f108023k;
            return iA + (bVar == null ? 0 : bVar.hashCode());
        }

        @NotNull
        public final String toString() {
            boolean z6 = this.f108014a;
            boolean z7 = this.f108015b;
            long j7 = this.f108016c;
            long j8 = this.f108017d;
            long j9 = this.f108018e;
            long j10 = this.f108019f;
            float f7 = this.f108020g;
            float f8 = this.h;
            StringBuilder sbA = Q.a("MusicEditingData(fadeIn=", ", fadeOut=", ", fadeInValue=", z6, z7);
            sbA.append(j7);
            J1.z.a(j8, ", fadeOutValue=", ", musicTrimIn=", sbA);
            sbA.append(j9);
            J1.z.a(j10, ", musicTrimOut=", ", musicVolume=", sbA);
            C3339q.b(sbA, f7, ", nativeVolume=", f8, ", originVolumeProgress=");
            sbA.append(this.f108021i);
            sbA.append(", musicVolumeProgress=");
            sbA.append(this.f108022j);
            sbA.append(", userAction=");
            sbA.append(this.f108023k);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicVolumeFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f108025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f108026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f108027d;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicVolumeFragment$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AP.d f108028a;

        public c(AP.d dVar) {
            this.f108028a = dVar;
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
            return this.f108028a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f108028a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$b, java.lang.Object] */
    public BiliEditorMusicVolumeFragment() {
        final com.bilibili.campus.tabs.billboard.B b7 = new com.bilibili.campus.tabs.billboard.B(this, 1);
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(b7) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$1
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = b7;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10134invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function0 = null;
        this.f108012s = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(Lz0.a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$2
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10135invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function0, lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$3
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function0;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10136invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$3.m10136invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$4
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10137invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$4.m10137invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public static String wf(int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return s8.f.a(1, "%.1f", DynamicModel.KEY_ABBR_ADYNAMIC_SWI, new Object[]{Float.valueOf(i7 / 1000)});
    }

    @Nullable
    public View Af(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        o0 o0VarInflate = o0.inflate(layoutInflater, viewGroup, false);
        this.f108005l = o0VarInflate;
        LinearLayout linearLayout = null;
        if (o0VarInflate == null) {
            o0VarInflate = null;
        }
        if (o0VarInflate != null) {
            linearLayout = o0VarInflate.f23896a;
        }
        return linearLayout;
    }

    @NotNull
    public Kz0.i Bf() {
        return new Kz0.i();
    }

    public final void Cf(@NotNull String str) {
        UC0.a audioTrackByMusic;
        BMusic bMusic = this.f108008o;
        if (bMusic != null) {
            Lazy<UC0.n> lazy = UC0.n.f24629b;
            n.a.a().getClass();
            UpperTimeline upperTimelineC = UC0.n.c();
            if (upperTimelineC == null || (audioTrackByMusic = upperTimelineC.getAudioTrackByMusic(bMusic)) == null) {
                return;
            }
            audioTrackByMusic.y();
            audioTrackByMusic.i(bMusic, this.f105687d.i() != null ? this.f105687d.i().a.getDuration() : 0L, str.concat("->updateMusicFx"));
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        BMusic bMusicE;
        EditVideoInfo editVideoInfo;
        a aVarXf = xf();
        if (aVarXf != null) {
            EditVideoInfo editVideoInfo2 = this.f105686c;
            if (!Intrinsics.areEqual(editVideoInfo2 != null ? Float.valueOf(editVideoInfo2.getUserTrackNativeVolume()) : null, aVarXf.h) && (editVideoInfo = this.f105686c) != null) {
                EditorUsedFunctionUtil.b(editVideoInfo, "音乐");
            }
            EditVideoInfo editVideoInfo3 = this.f105686c;
            if (editVideoInfo3 != null) {
                editVideoInfo3.setUserTrackNativeVolume(aVarXf.h);
            }
            Jz0.e eVar = this.f108010q;
            if (eVar != null && (bMusicE = eVar.e(this.f108007n)) != null) {
                bMusicE.fadeIn = aVarXf.f108014a;
                bMusicE.fadeOut = aVarXf.f108015b;
                bMusicE.ratioMusic = aVarXf.f108020g;
                bMusicE.trimIn = aVarXf.f108018e;
                bMusicE.trimOut = aVarXf.f108019f;
            }
        }
        Jz0.e eVar2 = this.f108010q;
        if (eVar2 != null) {
            eVar2.g(function1);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        EditVideoInfo editVideoInfoM10450clone;
        ArrayList<BMusic> arrayList;
        BMusic bMusic;
        EditVideoInfo editVideoInfo = this.f105686c;
        if (editVideoInfo == null || (editVideoInfoM10450clone = editVideoInfo.m10450clone()) == null) {
            return null;
        }
        Jz0.e eVar = this.f108010q;
        if (eVar != null) {
            eVar.i(editVideoInfoM10450clone);
        }
        a aVarXf = xf();
        if (aVarXf != null) {
            editVideoInfoM10450clone.setUserTrackNativeVolume(aVarXf.h);
            EditorMusicInfo editorMusicInfo = editVideoInfoM10450clone.getEditorMusicInfo();
            if (editorMusicInfo != null && (arrayList = editorMusicInfo.bMusicList) != null && (bMusic = (BMusic) CollectionsKt.getOrNull(arrayList, this.f108007n)) != null) {
                bMusic.fadeIn = aVarXf.f108014a;
                bMusic.fadeOut = aVarXf.f108015b;
                bMusic.ratioMusic = aVarXf.f108020g;
                bMusic.trimIn = aVarXf.f108018e;
                bMusic.trimOut = aVarXf.f108019f;
            }
        }
        return editVideoInfoM10450clone;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void jf() {
        super.jf();
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        dz0.g gVar;
        ez0.d dVar;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z6 = true;
        if (numValueOf != null && numValueOf.intValue() == 2131302459) {
            jf();
            this.f105685b.x();
            Jz0.e eVar = this.f108010q;
            if (eVar != null) {
                eVar.h(this.f108007n);
            }
            this.f105685b.w(true);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131302460) {
            jf();
            this.f105685b.x();
            UC0.a aVarNf = nf();
            float fS = aVarNf != null ? aVarNf.s() : 1.0f;
            this.f105685b.A(true);
            ey0.c cVar = this.f105685b;
            if (fS != 0.0f) {
                z6 = false;
            }
            dz0.c cVar2 = ((Yv0.b) cVar.a).B;
            if (cVar2 != null && (gVar = cVar2.c) != null && (dVar = gVar.d) != null) {
                dVar.h.setValue(Gy0.b.a(dVar.a(), 0, z6, null, 5));
            }
            a aVarXf = xf();
            Jz0.e eVar2 = this.f108010q;
            if (eVar2 != null) {
                eVar2.d(this.f108007n, aVarXf, false);
            }
            this.f105685b.w(false);
            mf(this.f105686c, BackUpTag.MUSIC_VOLUME);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f108013t = Bf();
        return Af(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Xz0.d dVar = Xz0.d.f28458a;
        String str = Jz0.f.f11746a;
        String str2 = this.f108009p == 1 ? "musictrack" : "musictab";
        String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("from", str2);
        map.put("fast_video", strE);
        Neurons.reportExposure$default(false, "creation.new-video-editor.music.volume-tab.show", mapB, (List) null, 8, (Object) null);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f108007n = arguments.getInt("current_select_index");
            Serializable serializable = arguments.getSerializable("current_select_music");
            this.f108008o = serializable instanceof BMusic ? (BMusic) serializable : null;
            this.f108009p = arguments.getInt("volume_tab_from");
        }
        this.f105693k = false;
        this.f105692j = false;
        yf();
        zf();
        if (this.f108009p == 1) {
            return;
        }
        ((Lz0.a) this.f108012s.getValue()).f15017c.observe(getViewLifecycleOwner(), new c(new AP.d(1, this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment.a xf() {
        /*
            r6 = this;
            r0 = r6
            Kz0.i r0 = r0.f108013t
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r7
            r1 = r6
            androidx.viewbinding.ViewBinding r1 = r1.f108005l
            r2 = r6
            com.bilibili.studio.videoeditor.bean.BMusic r2 = r2.f108008o
            r3 = r6
            UC0.a r3 = r3.nf()
            r4 = r6
            com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$b r4 = r4.f108011r
            com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$a r0 = r0.a(r1, r2, r3, r4)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L30
            r0 = r7
            r1 = r6
            com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r1 = r1.f105686c
            float r1 = r1.getUserTrackNativeVolume()
            r0.h = r1
            goto L32
        L30:
            r0 = 0
            r7 = r0
        L32:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment.xf():com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment$a");
    }

    public final void yf() {
        BMusic bMusic = this.f108008o;
        long j7 = (bMusic != null ? bMusic.outPoint : 0L) - (bMusic != null ? bMusic.inPoint : 0L);
        this.f108006m = j7;
        if (j7 > 10000000) {
            this.f108006m = 10000000L;
        }
        if (this.f108006m < 0) {
            this.f108006m = 0L;
        }
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }

    public final void zf() {
        BMusic bMusic;
        dz0.f fVar;
        Ex0.n nVar;
        Kz0.i iVar;
        ViewBinding viewBinding = this.f108005l;
        if (viewBinding != null) {
            if (getContext() == null) {
                return;
            }
            Kz0.i iVar2 = this.f108013t;
            if (iVar2 != null) {
                iVar2.c(viewBinding, this.f108009p == 1, this.f108008o, requireContext(), this, new y(this), new z(this), new A(this), new B(this));
            }
        }
        BMusic bMusic2 = this.f108008o;
        EditVideoInfo editVideoInfo = this.f105686c;
        if (editVideoInfo != null) {
            editVideoInfo.getUserTrackNativeVolume();
        }
        ViewBinding viewBinding2 = this.f108005l;
        if (viewBinding2 != null && (iVar = this.f108013t) != null) {
            iVar.d(viewBinding2, bMusic2, this.f108006m);
        }
        if (this.f108009p != 1 || (bMusic = this.f108008o) == null) {
            return;
        }
        long j7 = bMusic.inPoint;
        long j8 = bMusic.outPoint;
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null && (fVar = cVar.d) != null && (nVar = fVar.a) != null) {
            nVar.l(j7, j8);
        }
        this.f105685b.y(bMusic.inPoint, bMusic.outPoint);
    }
}

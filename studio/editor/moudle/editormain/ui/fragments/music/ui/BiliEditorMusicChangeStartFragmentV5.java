package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import D60.o;
import Ky0.a0;
import TB0.y0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.gripper.api.ad.biz.nonstandard.view.PlantSeedsScene;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.MusicModuleUseCase;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmPointEntry;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.U;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicChangeStartFragmentV5.class */
@AndroidEntryPoint
public final class BiliEditorMusicChangeStartFragmentV5 extends Hilt_BiliEditorMusicChangeStartFragmentV5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public y0 f106815g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f106816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f106817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ly0.a f106818k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicChangeStartFragmentV5$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106819a;

        public a(Function1 function1) {
            this.f106819a = function1;
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
            return this.f106819a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106819a.invoke(obj);
        }
    }

    public BiliEditorMusicChangeStartFragmentV5() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10014invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10015invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(my0.b.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10016invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10017invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$4.m10017invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10018invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicChangeStartFragmentV5$special$$inlined$viewModels$default$5.m10018invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public final my0.b kf() {
        return (my0.b) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f106818k = new Kz0.a();
        y0 y0VarInflate = y0.inflate(layoutInflater, viewGroup, false);
        this.f106815g = y0VarInflate;
        return y0VarInflate != null ? y0VarInflate.f24065a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        kf().L0();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        BMusic bMusic;
        UpperTimeline upperTimelineB;
        UC0.a audioTrackByMusic;
        EditorMusicInfo editorMusicInfo;
        super.onViewCreated(view, bundle);
        y0 y0Var = this.f106815g;
        if (y0Var != null) {
            y0Var.f24069e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMusicChangeStartFragmentV5 f106857a;

                {
                    this.f106857a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.bilibili.studio.editor.timeline.i iVar;
                    BMusic bMusic2;
                    UpperTimeline upperTimelineB2;
                    UC0.a audioTrackByMusic2;
                    BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = this.f106857a;
                    my0.b bVarKf = biliEditorMusicChangeStartFragmentV5.kf();
                    int i7 = biliEditorMusicChangeStartFragmentV5.f106816i;
                    boolean z6 = biliEditorMusicChangeStartFragmentV5.f106817j;
                    bVarKf.d.n();
                    Pair pair = bVarKf.r;
                    if (pair != null && (bMusic2 = bVarKf.n) != null && (upperTimelineB2 = bVarKf.e.f25039e.b()) != null && (audioTrackByMusic2 = upperTimelineB2.getAudioTrackByMusic(bMusic2)) != null) {
                        audioTrackByMusic2.E(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
                    }
                    MusicModuleUseCase musicModuleUseCase = bVarKf.f;
                    musicModuleUseCase.f107196e.a(musicModuleUseCase.f107208r, "MusicModuleUseCase");
                    Uy0.a aVar = bVarKf.e;
                    BMusic bMusic3 = bVarKf.n;
                    a0 a0Var = aVar.f25038d;
                    a0Var.getClass();
                    Runnable runnable = new Runnable(i7, a0Var) { // from class: Ky0.S

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f13057a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final a0 f13058b;

                        {
                            this.f13057a = i7;
                            this.f13058b = a0Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = this.f13057a;
                            a0 a0Var2 = this.f13058b;
                            if (i8 == 1) {
                                MiddleControlUseCase middleControlUseCase = a0Var2.f13081i;
                                Boolean bool = Boolean.TRUE;
                                MiddleControlUseCase.m(middleControlUseCase, bool, null, 2);
                                MiddleControlUseCase middleControlUseCase2 = a0Var2.f13081i;
                                middleControlUseCase2.o(true);
                                middleControlUseCase2.j(true);
                                Hx.n nVar = a0Var2.f13082j.f23141e;
                                if (nVar != null) {
                                    nVar.invoke(bool);
                                }
                            }
                        }
                    };
                    ez0.a aVar2 = a0Var.f13074a;
                    Dy0.m mVar = (Dy0.m) aVar2.A.getValue();
                    Dy0.m mVar2 = mVar;
                    if (mVar == null) {
                        mVar2 = new Dy0.m(false, 0, null, FragmentContainerModal.MODAL_ALL);
                    }
                    aVar2.A.setValue(new Dy0.m(false, i7, runnable, mVar2.f3328d));
                    if (z6) {
                        aVar.f25035a.a();
                        if (bMusic3 != null) {
                            UpperTimeline upperTimelineB3 = aVar.f25039e.b();
                            UC0.a audioTrackByMusic3 = null;
                            if (upperTimelineB3 != null) {
                                audioTrackByMusic3 = upperTimelineB3.getAudioTrackByMusic(bMusic3);
                            }
                            if (audioTrackByMusic3 != null) {
                                audioTrackByMusic3.y();
                                Os.f.b(z.a(bMusic3.inPoint, "onConfirm inPoint=", ",outPoint="), bMusic3.outPoint, "BiliEditorMusicChangeStartUseCase");
                                audioTrackByMusic3.i(bMusic3, aVar.f25039e.f107210a.g(), "ChangeStartUseCase.onConfirm");
                            }
                            if (i7 == 1 && (iVar = aVar.f25036b.f4833c) != null) {
                                iVar.a(aVar.f25035a.f4806b, BackUpTag.MUSIC_POINT_CHANGE);
                            }
                            Ex0.n nVar = aVar.f25036b;
                            long j7 = bMusic3.inPoint;
                            nVar.getClass();
                            BLog.d("StreamingRepository", "onAskVideoSeek");
                            com.bilibili.studio.editor.timeline.i iVar2 = nVar.f4833c;
                            if (iVar2 != null) {
                                iVar2.r(j7, 0L);
                            }
                        }
                    }
                    BMusic bMusic4 = bVarKf.n;
                    if (bMusic4 != null) {
                        bVarKf.f.p(bMusic4.inPoint);
                    }
                    bVarKf.L0();
                    Xz0.d dVar = Xz0.d.f28458a;
                    String str = Jz0.f.f11746a;
                    String str2 = i7 == 1 ? "musictrack" : "musictab";
                    String strE = com.bilibili.studio.videoeditor.extension.l.e(bVarKf.c.f4806b);
                    dVar.getClass();
                    Xz0.d.R(str2, strE, z6);
                }
            });
        }
        ly0.a aVar = this.f106818k;
        if (aVar != null) {
            aVar.a(this.f106815g, new e(this));
        }
        final y0 y0Var2 = this.f106815g;
        if (y0Var2 != null) {
            kf().s = new com.bilibili.gripper.container.share.c(this);
            final int i7 = 0;
            kf().m.observe(getViewLifecycleOwner(), new a(new Function1(i7, this, y0Var2) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106849a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f106850b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f106851c;

                {
                    this.f106849a = i7;
                    this.f106850b = this;
                    this.f106851c = y0Var2;
                }

                public final Object invoke(Object obj) {
                    Unit unit;
                    ArrayList<BgmPointEntry> arrayList;
                    Object obj2 = this.f106850b;
                    Object obj3 = this.f106851c;
                    switch (this.f106849a) {
                        case 0:
                            BMusic bMusic2 = (BMusic) obj;
                            if (bMusic2 == null) {
                                unit = Unit.INSTANCE;
                            } else {
                                BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = (BiliEditorMusicChangeStartFragmentV5) obj2;
                                ly0.a aVar2 = biliEditorMusicChangeStartFragmentV5.f106818k;
                                y0 y0Var3 = (y0) obj3;
                                if (aVar2 != null) {
                                    aVar2.h(bMusic2.totalTime, y0Var3);
                                }
                                ly0.a aVar3 = biliEditorMusicChangeStartFragmentV5.f106818k;
                                if (aVar3 != null) {
                                    Bgm bgm = bMusic2.bgm;
                                    LongSparseArray longSparseArray = new LongSparseArray(0, 1, null);
                                    if (bgm != null && (arrayList = bgm.timeline) != null) {
                                        for (BgmPointEntry bgmPointEntry : arrayList) {
                                            longSparseArray.put(bgmPointEntry.point * 1000, bgmPointEntry.comment);
                                        }
                                    }
                                    aVar3.d(y0Var3, longSparseArray);
                                }
                                biliEditorMusicChangeStartFragmentV5.kf().d.p(bMusic2.inPoint, bMusic2.outPoint);
                                unit = Unit.INSTANCE;
                            }
                            return unit;
                        default:
                            Context context = (Context) obj3;
                            if (((Boolean) obj).booleanValue()) {
                                d9.c cVar = (d9.c) obj2;
                                PlantSeedsScene.Comment scene = cVar.getScene();
                                if (!(scene instanceof PlantSeedsScene.Comment) || scene.getFrom() != PlantSeedsScene.Comment.From.STORY) {
                                    List list = b9.b.a;
                                    b9.b.a(context, cVar.getInfo(), cVar.getScene(), "recommend", cVar.getCallBack());
                                }
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
            kf().h.observe(getViewLifecycleOwner(), new a(new Function1(this, y0Var2) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorMusicChangeStartFragmentV5 f106852a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final y0 f106853b;

                {
                    this.f106852a = this;
                    this.f106853b = y0Var2;
                }

                public final Object invoke(Object obj) {
                    Long l7 = (Long) obj;
                    BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = this.f106852a;
                    ly0.a aVar2 = biliEditorMusicChangeStartFragmentV5.f106818k;
                    y0 y0Var3 = this.f106853b;
                    if (aVar2 != null) {
                        aVar2.g(y0Var3, U.c(l7.longValue() / 1000));
                    }
                    ly0.a aVar3 = biliEditorMusicChangeStartFragmentV5.f106818k;
                    if (aVar3 != null) {
                        aVar3.e(l7.longValue(), y0Var3);
                    }
                    return Unit.INSTANCE;
                }
            }));
            final int i8 = 0;
            kf().i.observe(getViewLifecycleOwner(), new a(new Function1(this, y0Var2, i8) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106854a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BaseFragment f106855b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f106856c;

                {
                    this.f106854a = i8;
                    this.f106855b = this;
                    this.f106856c = y0Var2;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r55) {
                    /*
                        Method dump skipped, instruction units count: 263
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.c.invoke(java.lang.Object):java.lang.Object");
                }
            }));
            kf().o.observe(getViewLifecycleOwner(), new a(new UD.b(1, this, y0Var2)));
            kf().p.observe(getViewLifecycleOwner(), new a(new o(2, this, y0Var2)));
        }
        my0.b bVarKf = kf();
        bVarKf.e.f25037c.a(bVarKf.t, "BiliEditorMusicChangeStartUseCase");
        Bundle arguments = getArguments();
        this.f106816i = arguments != null ? arguments.getInt("cut_tab_from") : 0;
        my0.b bVarKf2 = kf();
        if (this.f106816i == 2) {
            EditVideoInfo editVideoInfo = bVarKf2.c.f4806b;
            bMusic = (editVideoInfo == null || (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) == null) ? null : editorMusicInfo.selectMusic;
        } else {
            bMusic = bVarKf2.e.f25039e.f107212c;
        }
        bVarKf2.n = bMusic;
        if (bMusic != null) {
            bVarKf2.j = bMusic.outPoint - bMusic.inPoint;
            bVarKf2.m.setValue(bMusic);
            bVarKf2.h.setValue(Long.valueOf(bMusic.trimIn));
            bVarKf2.i.setValue(Long.valueOf(bMusic.trimOut));
            bVarKf2.k = bMusic.trimOut - bMusic.trimIn;
            bVarKf2.J0();
        }
        MusicModuleUseCase musicModuleUseCase = bVarKf2.f;
        musicModuleUseCase.f107196e.b(musicModuleUseCase.f107208r, "MusicModuleUseCase");
        my0.b bVarKf3 = kf();
        BMusic bMusic2 = bVarKf3.n;
        if (bMusic2 != null && (upperTimelineB = bVarKf3.e.f25039e.b()) != null && (audioTrackByMusic = upperTimelineB.getAudioTrackByMusic(bMusic2)) != null) {
            bVarKf3.r = new Pair(Float.valueOf(audioTrackByMusic.s()), Float.valueOf(audioTrackByMusic.u()));
            audioTrackByMusic.E(0.0f, 0.0f);
        }
        ly0.a aVar2 = this.f106818k;
        if (aVar2 != null) {
            y0 y0Var3 = this.f106815g;
            Long l7 = (Long) kf().h.getValue();
            aVar2.e(l7 != null ? l7.longValue() : 0L, y0Var3);
        }
        kf().K0();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }
}

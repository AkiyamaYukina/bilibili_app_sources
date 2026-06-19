package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import Dy0.s;
import Ky0.a0;
import TB0.F;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.biligame.api.BiligameStrategyPage;
import com.bilibili.biligame.ui.minev3.child.MineFavoriteFragment;
import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.uiManager.weight.EditorVolumeSeekbar;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BMusic;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicVolumeFragment.class */
@AndroidEntryPoint
public final class BiliEditorMusicVolumeFragment extends Hilt_BiliEditorMusicVolumeFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public F f106825g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f106826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f106827j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicVolumeFragment$a.class */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorMusicVolumeFragment f106828a;

        public a(BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment) {
            this.f106828a = biliEditorMusicVolumeFragment;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = this.f106828a;
            float f7 = i7 / 100.0f;
            com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.a aVar = biliEditorMusicVolumeFragment.kf().e.f25046b;
            BMusic bMusic = aVar.f107212c;
            UC0.a audioTrackByMusic = null;
            if (bMusic != null) {
                UpperTimeline upperTimelineB = aVar.b();
                audioTrackByMusic = null;
                if (upperTimelineB != null) {
                    audioTrackByMusic = upperTimelineB.getAudioTrackByMusic(bMusic);
                }
            }
            if (audioTrackByMusic != null) {
                audioTrackByMusic.B(f7, f7);
            }
            BMusic bMusic2 = biliEditorMusicVolumeFragment.kf().e.f25046b.f107212c;
            if (bMusic2 != null) {
                bMusic2.ratioMusic = f7;
            }
            biliEditorMusicVolumeFragment.kf().J0();
            F f8 = biliEditorMusicVolumeFragment.f106825g;
            if (f8 != null) {
                f8.f23516f.setText(String.valueOf(i7));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f106828a.f106826i = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            my0.k kVarKf = this.f106828a.kf();
            BMusic bMusic = kVarKf.e.f25046b.f107212c;
            if (bMusic != null) {
                Ex0.n nVar = kVarKf.d;
                nVar.j();
                nVar.l(bMusic.inPoint, bMusic.outPoint);
            }
        }
    }

    public BiliEditorMusicVolumeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10029invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10030invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(my0.k.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10031invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10032invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$4.m10032invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10033invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragment$special$$inlined$viewModels$default$5.m10033invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106827j = new a(this);
    }

    public final my0.k kf() {
        return (my0.k) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        F fInflate = F.inflate(layoutInflater, viewGroup, false);
        this.f106825g = fInflate;
        return fInflate != null ? fInflate.f23511a : null;
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        F f7 = this.f106825g;
        if (f7 != null) {
            final int i7 = 0;
            f7.f23512b.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106865a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BaseFragment f106866b;

                {
                    this.f106865a = i7;
                    this.f106866b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.bilibili.studio.editor.timeline.i iVar;
                    switch (this.f106865a) {
                        case 0:
                            BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = (BiliEditorMusicVolumeFragment) this.f106866b;
                            my0.k kVarKf = biliEditorMusicVolumeFragment.kf();
                            boolean z6 = biliEditorMusicVolumeFragment.f106826i;
                            kVarKf.c.a();
                            if (z6 && (iVar = kVarKf.d.f4833c) != null) {
                                iVar.a(kVarKf.c.f4806b, BackUpTag.MUSIC_VOLUME);
                            }
                            Uy0.c cVar = kVarKf.e;
                            cVar.f25047c.r(false, cVar.f25046b.a(), true, true);
                            a0 a0Var = cVar.f25045a;
                            if (a0Var.f13079f.f4806b != null) {
                                Sy0.a.H(a0Var.f13082j, EditorTrackLocationMode.LOCATION_TOP, BiliEditorTrackMode.TRACK_MODE_EASY_EDIT, null, false, 12);
                                a0Var.f13078e.j();
                                a0Var.f13081i.o(true);
                                MiddleControlUseCase middleControlUseCase = a0Var.f13081i;
                                Boolean bool = Boolean.TRUE;
                                middleControlUseCase.l(bool, bool);
                                a0Var.f13081i.j(true);
                                ez0.a aVar = a0Var.f13074a;
                                s sVar = (s) aVar.y.getValue();
                                s sVar2 = sVar;
                                if (sVar == null) {
                                    sVar2 = new s(false, null, FragmentContainerModal.MODAL_HALF_LESS);
                                }
                                aVar.y.setValue(s.a(sVar2, false, null, 6));
                                a0Var.p();
                                break;
                            }
                            break;
                        default:
                            MineFavoriteFragment mineFavoriteFragment = this.f106866b;
                            mineFavoriteFragment.getClass();
                            Object tag = view2.getTag();
                            if (tag != null) {
                                try {
                                    if (tag instanceof BiligameStrategyPage) {
                                        BiligameStrategyPage biligameStrategyPage = (BiligameStrategyPage) tag;
                                        com.bilibili.biligame.widget.l lVar = new com.bilibili.biligame.widget.l(view2.getContext(), 0);
                                        lVar.setSingleChoiceItems(view2.getResources().getStringArray(2130903076), new ns.b(mineFavoriteFragment, biligameStrategyPage));
                                        lVar.show();
                                    }
                                } catch (Throwable th) {
                                    CatchUtils.e("MineFavoriteFragment", "open menu", th);
                                }
                            }
                            break;
                    }
                }
            });
            com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule.a aVar = kf().e.f25046b;
            BMusic bMusic = aVar.f107212c;
            UC0.a audioTrackByMusic = null;
            if (bMusic != null) {
                UpperTimeline upperTimelineB = aVar.b();
                audioTrackByMusic = null;
                if (upperTimelineB != null) {
                    audioTrackByMusic = upperTimelineB.getAudioTrackByMusic(bMusic);
                }
            }
            int iS = (int) ((audioTrackByMusic != null ? audioTrackByMusic.s() : 1.0f) * 100.0f);
            f7.f23516f.setText(String.valueOf(iS));
            EditorVolumeSeekbar editorVolumeSeekbar = f7.f23515e;
            editorVolumeSeekbar.setProgress(iS);
            editorVolumeSeekbar.setOnSeekBarChangeListener(this.f106827j);
            f7.f23514d.setOnClickListener(new com.bilibili.bililive.room.ui.guide.cnyredpacket.b(this, 1));
        }
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }
}

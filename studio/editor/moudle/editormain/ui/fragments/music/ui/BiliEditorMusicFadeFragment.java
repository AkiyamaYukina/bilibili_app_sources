package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import Dy0.o;
import Ky0.a0;
import TB0.C2893z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.biligame.api.BiligameStrategyPage;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.minev3.child.MineFavoriteFragment;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BMusic;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicFadeFragment.class */
@AndroidEntryPoint
public final class BiliEditorMusicFadeFragment extends Hilt_BiliEditorMusicFadeFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C2893z f106820g;

    @NotNull
    public final Lazy h;

    public BiliEditorMusicFadeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10019invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10020invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(my0.e.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10021invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10022invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$4.m10022invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10023invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicFadeFragment$special$$inlined$viewModels$default$5.m10023invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public static String kf(int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return s8.f.a(1, "%.1f", DynamicModel.KEY_ABBR_ADYNAMIC_SWI, new Object[]{Float.valueOf(i7 / 1000)});
    }

    public final my0.e lf() {
        return (my0.e) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2893z c2893zInflate = C2893z.inflate(layoutInflater, viewGroup, false);
        this.f106820g = c2893zInflate;
        return c2893zInflate != null ? c2893zInflate.f24072a : null;
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2893z c2893z = this.f106820g;
        if (c2893z != null) {
            final int i7 = 0;
            c2893z.f24073b.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f106859a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BaseFragment f106860b;

                {
                    this.f106859a = i7;
                    this.f106860b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f106859a) {
                        case 0:
                            Uy0.b bVar = ((BiliEditorMusicFadeFragment) this.f106860b).lf().c;
                            bVar.f25044e.r(false, bVar.f25043d.a(), true, true);
                            com.bilibili.studio.editor.timeline.i iVar = bVar.f25041b.f4833c;
                            if (iVar != null) {
                                iVar.a(bVar.f25040a.f4806b, BackUpTag.MUSIC_FADE);
                            }
                            a0 a0Var = bVar.f25042c;
                            if (a0Var.f13079f.f4806b != null) {
                                Sy0.a.H(a0Var.f13082j, EditorTrackLocationMode.LOCATION_TOP, BiliEditorTrackMode.TRACK_MODE_EASY_EDIT, null, false, 12);
                                a0Var.f13078e.j();
                                a0Var.f13081i.o(true);
                                MiddleControlUseCase middleControlUseCase = a0Var.f13081i;
                                Boolean bool = Boolean.TRUE;
                                middleControlUseCase.l(bool, bool);
                                a0Var.f13081i.j(true);
                                ez0.a aVar = a0Var.f13074a;
                                o oVar = (o) aVar.w.getValue();
                                o oVar2 = oVar;
                                if (oVar == null) {
                                    oVar2 = new o(false, null, FragmentContainerModal.MODAL_HALF_LESS);
                                }
                                aVar.w.setValue(o.a(oVar2, false, null, 6));
                                a0Var.p();
                                break;
                            }
                            break;
                        default:
                            MineFavoriteFragment mineFavoriteFragment = this.f106860b;
                            mineFavoriteFragment.getClass();
                            Object tag = view2.getTag();
                            if (tag != null && (tag instanceof BiligameStrategyPage)) {
                                mineFavoriteFragment.b = true;
                                BiligameStrategyPage biligameStrategyPage = (BiligameStrategyPage) tag;
                                int i8 = biligameStrategyPage.contentType;
                                if (i8 == 2) {
                                    BiligameRouterHelper.openVideo(mineFavoriteFragment.getContext(), biligameStrategyPage.avId, biligameStrategyPage.bvId);
                                    mineFavoriteFragment.getApiService().addStrategyPV(biligameStrategyPage.articleId).enqueue();
                                } else if (i8 == 1) {
                                    BiligameRouterHelper.openGameStrategy(mineFavoriteFragment.getContext(), biligameStrategyPage.articleId, biligameStrategyPage.strategyId);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C2893z c2893z2 = this.f106820g;
        if (c2893z2 != null) {
            c2893z2.f24077f.setOnSeekBarChangeListener(new h(this));
        }
        C2893z c2893z3 = this.f106820g;
        if (c2893z3 != null) {
            c2893z3.f24078g.setOnSeekBarChangeListener(new i(this));
        }
        my0.e eVarLf = lf();
        BMusic bMusic = eVarLf.c.f25043d.f107212c;
        long j7 = (bMusic != null ? bMusic.outPoint : 0L) - (bMusic != null ? bMusic.inPoint : 0L);
        eVarLf.e = j7;
        if (j7 > 10000000) {
            eVarLf.e = 10000000L;
        }
        if (eVarLf.e < 0) {
            eVarLf.e = 0L;
        }
        long j8 = 1000;
        int i8 = lf().e / j8 > 10000 ? 10000 : (int) (lf().e / j8);
        C2893z c2893z4 = this.f106820g;
        if (c2893z4 != null) {
            c2893z4.f24077f.setMax(i8);
            c2893z4.f24078g.setMax(i8);
            BMusic bMusic2 = lf().c.f25043d.f107212c;
            if (bMusic2 != null) {
                if (bMusic2.fadeInValue > lf().e) {
                    c2893z4.f24077f.setProgress(i8);
                } else {
                    c2893z4.f24077f.setProgress((int) (bMusic2.fadeInValue / j8));
                }
                if (bMusic2.fadeOutValue > lf().e) {
                    c2893z4.f24078g.setProgress(i8);
                } else {
                    c2893z4.f24078g.setProgress((int) (bMusic2.fadeOutValue / j8));
                }
                C2893z c2893z5 = this.f106820g;
                if (c2893z5 != null) {
                    c2893z5.f24075d.setText(kf(c2893z4.f24077f.getProgress()));
                }
                C2893z c2893z6 = this.f106820g;
                if (c2893z6 != null) {
                    c2893z6.f24076e.setText(kf(c2893z4.f24078g.getProgress()));
                }
            }
        }
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }
}

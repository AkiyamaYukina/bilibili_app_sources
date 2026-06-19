package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import UC0.c;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import bx0.C5168a;
import com.bilibili.base.MainThread;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorHorizontalSeekBar;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6550d;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionAnimationV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionAnimationV4Fragment extends Hilt_BiliEditorCaptionAnimationV4Fragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CaptionListItem> f106473r = new ArrayList<>();
    public ax0.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PagerSlidingTabStrip f106474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f106475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f106476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewPager f106477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BiliEditorHorizontalSeekBar f106478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f106479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ArrayList<C5168a> f106480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayList<BiliEditorCaptionAnimationListV4Fragment> f106481p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f106482q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionAnimationV4Fragment$a.class */
    public static final class a implements BiliEditorHorizontalSeekBar.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionAnimationV4Fragment f106483a;

        public a(BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment) {
            this.f106483a = biliEditorCaptionAnimationV4Fragment;
        }

        @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorHorizontalSeekBar.a
        public final void a(float f7, float f8) {
            ArrayList<CaptionListItem> arrayList = BiliEditorCaptionAnimationV4Fragment.f106473r;
            BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = this.f106483a;
            BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4FragmentUf = biliEditorCaptionAnimationV4Fragment.uf();
            int i7 = biliEditorCaptionAnimationListV4FragmentUf != null ? biliEditorCaptionAnimationListV4FragmentUf.f106464i : 0;
            float f9 = 1000;
            BiliEditorCaptionAnimationV4Fragment.rf(biliEditorCaptionAnimationV4Fragment, i7, (int) (f7 * f9), (int) (f8 * f9));
        }

        @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorHorizontalSeekBar.a
        public final void b(float f7, float f8, Boolean bool) {
            Object next;
            ArrayList<CaptionListItem> arrayList = BiliEditorCaptionAnimationV4Fragment.f106473r;
            BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = this.f106483a;
            BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4FragmentUf = biliEditorCaptionAnimationV4Fragment.uf();
            int i7 = 0;
            int i8 = biliEditorCaptionAnimationListV4FragmentUf != null ? biliEditorCaptionAnimationListV4FragmentUf.f106464i : 0;
            float f9 = 1000;
            BiliEditorCaptionAnimationV4Fragment.rf(biliEditorCaptionAnimationV4Fragment, i8, (int) (f7 * f9), (int) (f8 * f9));
            boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
            gx0.a aVar = biliEditorCaptionAnimationV4Fragment.vf().f106702c.f17474a;
            BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4FragmentUf2 = biliEditorCaptionAnimationV4Fragment.uf();
            aVar.k = (biliEditorCaptionAnimationListV4FragmentUf2 == null || biliEditorCaptionAnimationListV4FragmentUf2.f106464i != 2) ? zAreEqual ? 0 : 1 : 2;
            BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4FragmentUf3 = biliEditorCaptionAnimationV4Fragment.uf();
            if (biliEditorCaptionAnimationListV4FragmentUf3 != null) {
                gx0.a aVar2 = biliEditorCaptionAnimationListV4FragmentUf3.rf().f106697c.f17474a;
                C6526c c6526c = biliEditorCaptionAnimationListV4FragmentUf3.f106467l;
                CaptionListItem captionListItem = null;
                if (c6526c != null) {
                    Iterable iterable = c6526c.f54261a;
                    captionListItem = null;
                    if (iterable != null) {
                        Iterator it = iterable.iterator();
                        do {
                            next = null;
                            if (!it.hasNext()) {
                                break;
                            } else {
                                next = it.next();
                            }
                        } while (!((CaptionListItem) next).isSelected());
                        captionListItem = (CaptionListItem) next;
                    }
                }
                if (captionListItem == null) {
                    return;
                }
                com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar = biliEditorCaptionAnimationListV4FragmentUf3.rf().f106698d;
                Ny0.c cVar = bVar.f107164l;
                if (cVar.b("onSetAnim")) {
                    CaptionInfo captionInfo = cVar.f17480f;
                    if (captionInfo.captionAssetBean == null) {
                        captionInfo.captionAssetBean = new CaptionAssetBean();
                    }
                    int i9 = aVar2.i;
                    int i10 = aVar2.c;
                    int i11 = aVar2.f;
                    int i12 = i9;
                    if (i9 < 0) {
                        i12 = 0;
                    }
                    int i13 = i10;
                    if (i10 < 0) {
                        i13 = 0;
                    }
                    if (i11 >= 0) {
                        i7 = i11;
                    }
                    CaptionInfo captionInfo2 = cVar.f17480f;
                    int i14 = aVar2.h;
                    captionInfo2.circleAnimId = i14;
                    int i15 = aVar2.b;
                    captionInfo2.inAnimId = i15;
                    int i16 = aVar2.e;
                    captionInfo2.outAnimId = i16;
                    CaptionAssetBean captionAssetBean = captionInfo2.captionAssetBean;
                    if (captionAssetBean != null) {
                        captionAssetBean.captionAnimationPackagePath = aVar2.j;
                    }
                    if (captionAssetBean != null) {
                        captionAssetBean.captionInAnimationPackagePath = aVar2.d;
                    }
                    if (captionAssetBean != null) {
                        captionAssetBean.captionOutAnimationPackagePath = aVar2.g;
                    }
                    captionInfo2.circleAnimDuration = i12;
                    captionInfo2.inAnimDuration = i13;
                    captionInfo2.outAnimDuration = i7;
                    c.a aVar3 = UC0.c.f24618e;
                    P50.p pVar = captionInfo2.timelineCaption;
                    aVar3.getClass();
                    if (captionAssetBean != null && pVar != null) {
                        c.a.c(captionAssetBean, pVar, i12);
                        c.a.d(captionAssetBean, pVar, i13);
                        c.a.e(captionAssetBean, pVar, i7);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("in_animation_id", String.valueOf(i15));
                        linkedHashMap.put("out_animation_id", String.valueOf(i16));
                        linkedHashMap.put("animation_id", String.valueOf(i14));
                        pVar.addStatsExtraInfo(linkedHashMap);
                    }
                    CaptionInfo captionInfo3 = cVar.f17480f;
                    P50.p pVar2 = captionInfo3.timelineCaption;
                    if (pVar2 != null) {
                        com.bilibili.studio.videoeditor.extension.h.c(pVar2, "caption_info", captionInfo3);
                    }
                    CaptionInfo captionInfo4 = cVar.f17480f;
                    if (bVar.f107169q.f27447g) {
                        return;
                    }
                    int i17 = aVar2.k;
                    int i18 = captionInfo4.circleAnimDuration;
                    int i19 = captionInfo4.inAnimDuration;
                    int i20 = captionInfo4.outAnimDuration;
                    Ny0.n nVar = bVar.h;
                    Ly0.t tVar = nVar.f17525b;
                    P50.p pVar3 = tVar.f14993o;
                    if (pVar3 == null) {
                        BLog.e("EditorCaptionSettingPlayUseCase", "mRunSeekCurrCaption: mCurrTimelineCaption cant be null");
                        return;
                    }
                    tVar.f14996r = true;
                    Handler handler = nVar.f17526c;
                    handler.removeCallbacks(nVar.f17529f);
                    Ref.LongRef longRef = new Ref.LongRef();
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    Ref.LongRef longRef3 = new Ref.LongRef();
                    if (i17 == 0) {
                        longRef.element = pVar3.getInPoint();
                        long inPoint = pVar3.getInPoint() + ((long) (i19 * 1000));
                        longRef2.element = inPoint;
                        nVar.f17527d = inPoint;
                        nVar.f17528e = -1.0f;
                        longRef3.element = inPoint - longRef.element;
                    } else if (i17 == 1) {
                        longRef.element = pVar3.getOutPoint() - ((long) (1000 * i20));
                        longRef2.element = pVar3.getOutPoint();
                        nVar.f17527d = longRef.element;
                        nVar.f17528e = 1.0f;
                        longRef3.element = (((long) i20) * 1000) + 500000;
                    } else if (i17 == 2) {
                        longRef.element = pVar3.getInPoint();
                        long outPoint = pVar3.getOutPoint();
                        longRef2.element = outPoint;
                        nVar.f17527d = outPoint;
                        nVar.f17528e = -1.0f;
                        longRef3.element = outPoint - longRef.element;
                    }
                    if (longRef3.element > 0) {
                        handler.post(new Ny0.k(nVar, longRef, longRef2, longRef3));
                    }
                }
            }
        }
    }

    public BiliEditorCaptionAnimationV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9944invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9945invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106482q = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C6550d.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9946invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9947invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$4.m9947invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9948invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationV4Fragment$special$$inlined$viewModels$default$5.m9948invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public static final void rf(BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment, int i7, int i8, int i9) {
        gx0.a aVar = biliEditorCaptionAnimationV4Fragment.vf().f106702c.f17474a;
        if (i7 == 0 || i7 == 1) {
            if (i8 >= 0 || i7 == 0) {
                aVar.c = i8;
            }
            if (i9 > 0 || i7 == 1) {
                aVar.f = i9;
                return;
            }
            return;
        }
        if (i7 != 2) {
            return;
        }
        int i10 = i8;
        if (i8 < 100) {
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar = biliEditorCaptionAnimationV4Fragment.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar2 = biliEditorHorizontalSeekBar;
            if (biliEditorHorizontalSeekBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar2 = null;
            }
            biliEditorHorizontalSeekBar2.c(100, true);
            i10 = 100;
        }
        aVar.i = i10;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501679, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f106473r.clear();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        sf();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        wf();
        this.f106478m = (BiliEditorHorizontalSeekBar) view.findViewById(2131307326);
        this.f106479n = view.findViewById(2131317248);
        this.f106477l = (ViewPager) view.findViewById(2131316429);
        this.f106474i = view.findViewById(2131312846);
        this.f106475j = (TextView) view.findViewById(2131317287);
        this.f106476k = (TextView) view.findViewById(2131317286);
        this.h = new ax0.d(getChildFragmentManager(), 1);
        ViewPager viewPager = this.f106477l;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        ax0.d dVar = this.h;
        ax0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageAdapter");
            dVar2 = null;
        }
        viewPager2.setAdapter(dVar2);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f106474i;
        PagerSlidingTabStrip pagerSlidingTabStrip2 = pagerSlidingTabStrip;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabStrip");
            pagerSlidingTabStrip2 = null;
        }
        ViewPager viewPager3 = this.f106477l;
        ViewPager viewPager4 = viewPager3;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager4 = null;
        }
        pagerSlidingTabStrip2.setViewPager(viewPager4);
        ViewPager viewPager5 = this.f106477l;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager5 = null;
        }
        viewPager5.addOnPageChangeListener(new C6533j(this));
        FragmentExtKt.post(this, new com.bilibili.app.gemini.share.p(this, 4));
    }

    public final void sf() {
        gx0.a aVar = vf().f106702c.f17474a;
        ViewPager viewPager = null;
        if (aVar.b > 0) {
            ViewPager viewPager2 = this.f106477l;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(0);
            return;
        }
        if (aVar.e > 0) {
            ViewPager viewPager3 = this.f106477l;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager = viewPager3;
            }
            viewPager.setCurrentItem(1);
            return;
        }
        if (aVar.h > 0) {
            ViewPager viewPager4 = this.f106477l;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager4 = null;
            }
            viewPager4.setCurrentItem(2);
        }
    }

    public final void tf() {
        Fragment parentFragment = getParentFragment();
        View view = parentFragment instanceof BiliEditorCaptionSettingV2Fragment ? ((BiliEditorCaptionSettingV2Fragment) getParentFragment()).f105840k : parentFragment instanceof BiliEditorCaptionSettingV4Fragment ? ((BiliEditorCaptionSettingV4Fragment) getParentFragment()).f106515n : null;
        if ((view != null ? view.getLayoutParams() : null) instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (view != null ? view.getLayoutParams() : null);
            if (layoutParams != null) {
                View view2 = this.f106479n;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBarWrapper");
                    view2 = null;
                }
                layoutParams.bottomMargin = DensityUtil.dp2px(view2.getVisibility() == 8 ? 33.0f : 91.0f);
            }
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public final BiliEditorCaptionAnimationListV4Fragment uf() {
        ArrayList<BiliEditorCaptionAnimationListV4Fragment> arrayList = this.f106481p;
        ViewPager viewPager = this.f106477l;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        return (BiliEditorCaptionAnimationListV4Fragment) CollectionsKt.getOrNull(arrayList, viewPager2.getCurrentItem());
    }

    public final C6550d vf() {
        return (C6550d) this.f106482q.getValue();
    }

    public final void wf() {
        CaptionAssetBean captionAssetBean;
        CaptionAssetBean captionAssetBean2;
        int i7;
        CaptionInfo captionInfo = vf().f106703d.r().h;
        gx0.a aVar = vf().f106702c.f17474a;
        int i8 = 1000;
        if (captionInfo != null && (i7 = (int) ((captionInfo.outPoint - captionInfo.inPoint) / ((long) 1000))) <= 1000) {
            i8 = i7;
        }
        aVar.a = captionInfo;
        aVar.b = captionInfo != null ? captionInfo.inAnimId : 0;
        aVar.c = captionInfo != null ? captionInfo.inAnimDuration : i8;
        aVar.e = captionInfo != null ? captionInfo.outAnimId : 0;
        aVar.f = captionInfo != null ? captionInfo.outAnimDuration : i8;
        int i9 = 0;
        if (captionInfo != null) {
            i9 = captionInfo.circleAnimId;
        }
        aVar.h = i9;
        if (captionInfo != null) {
            i8 = captionInfo.circleAnimDuration;
        }
        aVar.i = i8;
        aVar.j = (captionInfo == null || (captionAssetBean2 = captionInfo.captionAssetBean) == null) ? null : captionAssetBean2.captionAnimationPackagePath;
        aVar.d = (captionInfo == null || (captionAssetBean = captionInfo.captionAssetBean) == null) ? null : captionAssetBean.captionInAnimationPackagePath;
        String str = null;
        if (captionInfo != null) {
            CaptionAssetBean captionAssetBean3 = captionInfo.captionAssetBean;
            str = null;
            if (captionAssetBean3 != null) {
                str = captionAssetBean3.captionOutAnimationPackagePath;
            }
        }
        aVar.g = str;
    }

    public final void xf() {
        if (vf().f106702c.f17474a.a != null) {
            int i7 = (int) ((r0.outPoint - r0.inPoint) / 1000.0f);
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar = this.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar2 = biliEditorHorizontalSeekBar;
            if (biliEditorHorizontalSeekBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar2 = null;
            }
            biliEditorHorizontalSeekBar2.setMaxProgress(i7);
        }
        BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar3 = this.f106478m;
        if (biliEditorHorizontalSeekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            biliEditorHorizontalSeekBar3 = null;
        }
        biliEditorHorizontalSeekBar3.setOnRangeListener(new a(this));
    }

    public final void yf(int i7) {
        gx0.a aVar = vf().f106702c.f17474a;
        BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar = this.f106478m;
        BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar2 = biliEditorHorizontalSeekBar;
        if (biliEditorHorizontalSeekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            biliEditorHorizontalSeekBar2 = null;
        }
        biliEditorHorizontalSeekBar2.setMoveIconLowPadding(0);
        BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar3 = this.f106478m;
        BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar4 = biliEditorHorizontalSeekBar3;
        if (biliEditorHorizontalSeekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBar");
            biliEditorHorizontalSeekBar4 = null;
        }
        biliEditorHorizontalSeekBar4.getClass();
        biliEditorHorizontalSeekBar4.f105899E = (int) Math.abs(1000);
        biliEditorHorizontalSeekBar4.f105900F = (int) Math.abs(1);
        View view = this.f106479n;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBarWrapper");
            view2 = null;
        }
        BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4FragmentUf = uf();
        Integer numValueOf = biliEditorCaptionAnimationListV4FragmentUf != null ? Integer.valueOf(biliEditorCaptionAnimationListV4FragmentUf.f106464i) : null;
        gx0.a aVar2 = vf().f106702c.f17474a;
        view2.setVisibility((numValueOf != null && numValueOf.intValue() == 0 ? aVar2.b <= 0 : numValueOf != null && numValueOf.intValue() == 1 ? aVar2.e <= 0 : numValueOf == null || numValueOf.intValue() != 2 || aVar2.h <= 0) ? 8 : 0);
        View view3 = this.f106479n;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekBarWrapper");
            view4 = null;
        }
        final boolean z6 = view4.getVisibility() == 0;
        MainThread.postOnMainThread(new Function0(this, z6) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionAnimationV4Fragment f106621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f106622b;

            {
                this.f106621a = this;
                this.f106622b = z6;
            }

            public final Object invoke() {
                Iterator<BiliEditorCaptionAnimationListV4Fragment> it = this.f106621a.f106481p.iterator();
                while (it.hasNext()) {
                    it.next().vf(this.f106622b);
                }
                return Unit.INSTANCE;
            }
        });
        if (i7 == 2) {
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar5 = this.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar6 = biliEditorHorizontalSeekBar5;
            if (biliEditorHorizontalSeekBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar6 = null;
            }
            biliEditorHorizontalSeekBar6.setRightProgress(0);
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar7 = this.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar8 = biliEditorHorizontalSeekBar7;
            if (biliEditorHorizontalSeekBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar8 = null;
            }
            biliEditorHorizontalSeekBar8.setRightMoveIcon(-1);
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar9 = this.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar10 = biliEditorHorizontalSeekBar9;
            if (biliEditorHorizontalSeekBar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar10 = null;
            }
            biliEditorHorizontalSeekBar10.setLeftMoveIcon(2131241964);
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar11 = this.f106478m;
            BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar12 = biliEditorHorizontalSeekBar11;
            if (biliEditorHorizontalSeekBar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                biliEditorHorizontalSeekBar12 = null;
            }
            biliEditorHorizontalSeekBar12.c(aVar.i, true);
            TextView textView = this.f106475j;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f106476k;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = this.f106475j;
            TextView textView6 = textView5;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                textView6 = null;
            }
            textView6.setText(2131841881);
            TextView textView7 = this.f106476k;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                textView7 = null;
            }
            textView7.setText(2131841833);
        } else {
            TextView textView8 = this.f106475j;
            TextView textView9 = textView8;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                textView9 = null;
            }
            textView9.setText(2131841926);
            TextView textView10 = this.f106476k;
            TextView textView11 = textView10;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                textView11 = null;
            }
            textView11.setText(2131841841);
            if (i7 == 0) {
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar13 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar14 = biliEditorHorizontalSeekBar13;
                if (biliEditorHorizontalSeekBar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar14 = null;
                }
                biliEditorHorizontalSeekBar14.c(0, false);
                if (aVar.e <= 0) {
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar15 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar16 = biliEditorHorizontalSeekBar15;
                    if (biliEditorHorizontalSeekBar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar16 = null;
                    }
                    biliEditorHorizontalSeekBar16.setRightMoveIcon(-1);
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar17 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar18 = biliEditorHorizontalSeekBar17;
                    if (biliEditorHorizontalSeekBar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar18 = null;
                    }
                    biliEditorHorizontalSeekBar18.setRightProgress(0);
                    TextView textView12 = this.f106476k;
                    TextView textView13 = textView12;
                    if (textView12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                        textView13 = null;
                    }
                    textView13.setVisibility(4);
                } else {
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar19 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar20 = biliEditorHorizontalSeekBar19;
                    if (biliEditorHorizontalSeekBar19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar20 = null;
                    }
                    biliEditorHorizontalSeekBar20.setRightMoveIcon(2131241965);
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar21 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar22 = biliEditorHorizontalSeekBar21;
                    if (biliEditorHorizontalSeekBar21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar22 = null;
                    }
                    biliEditorHorizontalSeekBar22.setRightProgress(aVar.f);
                    TextView textView14 = this.f106476k;
                    TextView textView15 = textView14;
                    if (textView14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                        textView15 = null;
                    }
                    textView15.setVisibility(0);
                }
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar23 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar24 = biliEditorHorizontalSeekBar23;
                if (biliEditorHorizontalSeekBar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar24 = null;
                }
                biliEditorHorizontalSeekBar24.setLeftMoveIcon(2131241963);
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar25 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar26 = biliEditorHorizontalSeekBar25;
                if (biliEditorHorizontalSeekBar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar26 = null;
                }
                biliEditorHorizontalSeekBar26.c(aVar.c, false);
                TextView textView16 = this.f106475j;
                if (textView16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                    textView16 = null;
                }
                textView16.setVisibility(0);
            } else if (i7 == 1) {
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar27 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar28 = biliEditorHorizontalSeekBar27;
                if (biliEditorHorizontalSeekBar27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar28 = null;
                }
                biliEditorHorizontalSeekBar28.setRightProgress(0);
                if (aVar.b <= 0) {
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar29 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar30 = biliEditorHorizontalSeekBar29;
                    if (biliEditorHorizontalSeekBar29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar30 = null;
                    }
                    biliEditorHorizontalSeekBar30.setLeftMoveIcon(-1);
                    TextView textView17 = this.f106475j;
                    TextView textView18 = textView17;
                    if (textView17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                        textView18 = null;
                    }
                    textView18.setVisibility(4);
                } else {
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar31 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar32 = biliEditorHorizontalSeekBar31;
                    if (biliEditorHorizontalSeekBar31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar32 = null;
                    }
                    biliEditorHorizontalSeekBar32.setLeftMoveIcon(2131241963);
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar33 = this.f106478m;
                    BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar34 = biliEditorHorizontalSeekBar33;
                    if (biliEditorHorizontalSeekBar33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                        biliEditorHorizontalSeekBar34 = null;
                    }
                    biliEditorHorizontalSeekBar34.c(aVar.c, false);
                    TextView textView19 = this.f106475j;
                    TextView textView20 = textView19;
                    if (textView19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSeekStart");
                        textView20 = null;
                    }
                    textView20.setVisibility(0);
                }
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar35 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar36 = biliEditorHorizontalSeekBar35;
                if (biliEditorHorizontalSeekBar35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar36 = null;
                }
                biliEditorHorizontalSeekBar36.setRightMoveIcon(2131241965);
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar37 = this.f106478m;
                BiliEditorHorizontalSeekBar biliEditorHorizontalSeekBar38 = biliEditorHorizontalSeekBar37;
                if (biliEditorHorizontalSeekBar37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBar");
                    biliEditorHorizontalSeekBar38 = null;
                }
                biliEditorHorizontalSeekBar38.setRightProgress(aVar.f);
                TextView textView21 = this.f106476k;
                if (textView21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvSeekEnd");
                    textView21 = null;
                }
                textView21.setVisibility(0);
            }
        }
        tf();
    }

    public final void zf(@Nullable CaptionInfo captionInfo) {
        if (f106473r.isEmpty()) {
            return;
        }
        Ny0.b bVar = vf().f106702c;
        bVar.getClass();
        bVar.f17474a = new gx0.a();
        wf();
        final Ref.IntRef intRef = new Ref.IntRef();
        int i7 = -1;
        if (captionInfo != null) {
            int i8 = captionInfo.inAnimId;
            if (i8 > 0) {
                i7 = i8;
            } else {
                int i9 = captionInfo.outAnimId;
                if (i9 > 0) {
                    i7 = i9;
                } else {
                    int i10 = captionInfo.circleAnimId;
                    if (i10 > 0) {
                        i7 = i10;
                    }
                }
            }
        }
        ArrayList<C5168a> arrayList = this.f106480o;
        if (arrayList != null) {
            int i11 = 0;
            for (C5168a c5168a : arrayList) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i12 = 0;
                for (CaptionListItem captionListItem : c5168a.f57117c) {
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Integer animId = captionListItem.getAnimId();
                    if (animId != null && animId.intValue() == i7) {
                        intRef.element = i11;
                    }
                    i12++;
                }
                i11++;
            }
        }
        ViewPager viewPager = this.f106477l;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.setCurrentItem(intRef.element);
        FragmentExtKt.post(this, new Function0(this, intRef) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionAnimationV4Fragment f106619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.IntRef f106620b;

            {
                this.f106619a = this;
                this.f106620b = intRef;
            }

            public final Object invoke() {
                C5168a c5168a2;
                ArrayList<CaptionListItem> arrayList2 = BiliEditorCaptionAnimationV4Fragment.f106473r;
                BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = this.f106619a;
                biliEditorCaptionAnimationV4Fragment.xf();
                ArrayList<C5168a> arrayList3 = biliEditorCaptionAnimationV4Fragment.f106480o;
                biliEditorCaptionAnimationV4Fragment.yf((arrayList3 == null || (c5168a2 = arrayList3.get(this.f106620b.element)) == null) ? 0 : c5168a2.f57116b);
                biliEditorCaptionAnimationV4Fragment.sf();
                MainThread.postOnMainThread(new Ct0.v(biliEditorCaptionAnimationV4Fragment, 3));
                return Unit.INSTANCE;
            }
        });
    }
}

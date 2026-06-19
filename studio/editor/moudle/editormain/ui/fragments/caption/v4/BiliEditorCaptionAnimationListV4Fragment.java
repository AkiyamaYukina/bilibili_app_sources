package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import UC0.c;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.C4914a;
import com.bilibili.base.MainThread;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6547a;
import com.bilibili.studio.videoeditor.util.C6631d;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionAnimationListV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionAnimationListV4Fragment extends Hilt_BiliEditorCaptionAnimationListV4Fragment {

    @Nullable
    public CaptionInfo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f106464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ArrayList<CaptionListItem> f106465j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public C6526c f106467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public RecyclerView f106468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f106469n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f106471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public C4914a f106472q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f106466k = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f106470o = new HashSet<>();

    public BiliEditorCaptionAnimationListV4Fragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m9938invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m9939invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f106471p = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C6547a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9940invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m9941invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$4.m9941invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m9942invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionAnimationListV4Fragment$special$$inlined$viewModels$default$5.m9942invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501678, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ax0.c, com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.c] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.h = rf().f106697c.f17474a.a;
        final ?? cVar = new ax0.c();
        cVar.f54262b = 2131501708;
        cVar.f54263c = new Function3(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionAnimationListV4Fragment f106612a;

            {
                this.f106612a = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                View view2 = (View) obj;
                ((Integer) obj2).getClass();
                CaptionListItem captionListItem = (CaptionListItem) obj3;
                BiliImageView biliImageViewFindViewById = view2.findViewById(2131298306);
                ImageView imageView = (ImageView) view2.findViewById(2131298305);
                ProgressBar progressBar = (ProgressBar) view2.findViewById(2131300293);
                ImageView imageView2 = (ImageView) view2.findViewById(2131317231);
                if (captionListItem.isLocal()) {
                    Cs.k.a(biliImageViewFindViewById, BiliImageLoader.INSTANCE, BiliImageLoaderHelper.resourceToUri(bi.b.a(Foundation.Companion), captionListItem.getImageLocal()), biliImageViewFindViewById);
                } else if (captionListItem.getImageHttp() != null && (biliImageViewFindViewById.getTag() == null || !biliImageViewFindViewById.getTag().equals(captionListItem.getImageHttp()))) {
                    ConcurrentHashMap<BiliImageView, C6631d.a> concurrentHashMap = C6631d.f110226a;
                    C6631d.a(biliImageViewFindViewById, captionListItem.getImageHttp(), this.f106612a);
                    biliImageViewFindViewById.setTag(captionListItem.getImageHttp());
                }
                if (captionListItem.isDownloaded()) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                if (captionListItem.isDownloading()) {
                    progressBar.setVisibility(0);
                    imageView.setVisibility(8);
                } else {
                    progressBar.setVisibility(8);
                }
                Integer animId = captionListItem.getAnimId();
                if (animId != null && animId.intValue() == -1) {
                    biliImageViewFindViewById.setVisibility(8);
                    imageView.setVisibility(8);
                    progressBar.setVisibility(8);
                    imageView2.setVisibility(0);
                } else {
                    biliImageViewFindViewById.setVisibility(0);
                    imageView2.setVisibility(8);
                }
                view2.setSelected(captionListItem.isSelected());
                return Unit.INSTANCE;
            }
        };
        cVar.f54264d = new Function2(this, cVar) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionAnimationListV4Fragment f106613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6526c f106614b;

            {
                this.f106613a = this;
                this.f106614b = cVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                CaptionListItem captionListItem = (CaptionListItem) obj2;
                BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = this.f106613a;
                biliEditorCaptionAnimationListV4Fragment.getClass();
                Integer animId = captionListItem.getAnimId();
                if (animId == null || animId.intValue() != -1) {
                    gx0.a aVar = biliEditorCaptionAnimationListV4Fragment.rf().f106697c.f17474a;
                    CaptionInfo captionInfo = biliEditorCaptionAnimationListV4Fragment.rf().f106697c.f17474a.a;
                    if (captionInfo != null) {
                        int i7 = (int) ((captionInfo.outPoint - captionInfo.inPoint) / ((long) 1000));
                        int i8 = biliEditorCaptionAnimationListV4Fragment.f106464i;
                        if (i8 == 0) {
                            if (aVar.e != -1) {
                                int i9 = aVar.f;
                                if (i9 == i7) {
                                    ToastHelper.showToast(biliEditorCaptionAnimationListV4Fragment.getContext(), 2131842291, 3000);
                                    aVar.c = 0;
                                } else if (aVar.c + i9 >= i7) {
                                    int i10 = i7 - i9;
                                    int i11 = i10;
                                    if (i10 > 1000) {
                                        i11 = 1000;
                                    }
                                    aVar.c = i11;
                                }
                            }
                        } else if (i8 == 1 && aVar.b != -1) {
                            int i12 = aVar.c;
                            if (i12 == i7) {
                                ToastHelper.showToast(biliEditorCaptionAnimationListV4Fragment.getContext(), 2131842291, 3000);
                                aVar.f = 0;
                            } else if (aVar.f + i12 >= i7) {
                                int i13 = i7 - i12;
                                int i14 = i13;
                                if (i13 > 1000) {
                                    i14 = 1000;
                                }
                                aVar.f = i14;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (biliEditorCaptionAnimationListV4Fragment.getParentFragment() instanceof BiliEditorCaptionAnimationV4Fragment) {
                    CaptionInfo captionInfo2 = biliEditorCaptionAnimationListV4Fragment.rf().f106698d.r().h;
                    int i15 = biliEditorCaptionAnimationListV4Fragment.f106464i;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2 && captionInfo2 != null) {
                                captionInfo2.circleAnimDuration = 1000;
                            }
                        } else if (captionInfo2 != null) {
                            captionInfo2.outAnimDuration = 1000;
                        }
                    } else if (captionInfo2 != null) {
                        captionInfo2.inAnimDuration = 1000;
                    }
                    ((BiliEditorCaptionAnimationV4Fragment) biliEditorCaptionAnimationListV4Fragment.getParentFragment()).wf();
                }
                biliEditorCaptionAnimationListV4Fragment.uf(captionListItem);
                Iterable<CaptionListItem> iterable = this.f106614b.f54261a;
                if (iterable != null) {
                    for (CaptionListItem captionListItem2 : iterable) {
                        captionListItem2.setSelected(Intrinsics.areEqual(captionListItem2, captionListItem));
                    }
                }
                C6526c c6526c = biliEditorCaptionAnimationListV4Fragment.f106467l;
                if (c6526c != null) {
                    c6526c.notifyDataSetChanged();
                }
                gx0.a aVar2 = biliEditorCaptionAnimationListV4Fragment.rf().f106697c.f17474a;
                aVar2.k = biliEditorCaptionAnimationListV4Fragment.f106464i;
                int id = captionListItem.getId();
                int i16 = biliEditorCaptionAnimationListV4Fragment.f106464i;
                Xz0.d.t(i16 != 0 ? i16 != 1 ? "循环动画" : "出场动画" : "入场动画", String.valueOf(id), "5");
                Integer animId2 = captionListItem.getAnimId();
                if (animId2 != null && animId2.intValue() == -1) {
                    com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar = biliEditorCaptionAnimationListV4Fragment.rf().f106698d;
                    Ny0.c cVar2 = bVar.f107164l;
                    if (cVar2.b("onSetAnim")) {
                        CaptionInfo captionInfo3 = cVar2.f17480f;
                        if (captionInfo3.captionAssetBean == null) {
                            captionInfo3.captionAssetBean = new CaptionAssetBean();
                        }
                        int i17 = aVar2.i;
                        int i18 = aVar2.c;
                        int i19 = aVar2.f;
                        int i20 = i17;
                        if (i17 < 0) {
                            i20 = 0;
                        }
                        int i21 = i18;
                        if (i18 < 0) {
                            i21 = 0;
                        }
                        int i22 = i19 >= 0 ? i19 : 0;
                        CaptionInfo captionInfo4 = cVar2.f17480f;
                        int i23 = aVar2.h;
                        captionInfo4.circleAnimId = i23;
                        int i24 = aVar2.b;
                        captionInfo4.inAnimId = i24;
                        int i25 = aVar2.e;
                        captionInfo4.outAnimId = i25;
                        CaptionAssetBean captionAssetBean = captionInfo4.captionAssetBean;
                        if (captionAssetBean != null) {
                            captionAssetBean.captionAnimationPackagePath = aVar2.j;
                        }
                        if (captionAssetBean != null) {
                            captionAssetBean.captionInAnimationPackagePath = aVar2.d;
                        }
                        if (captionAssetBean != null) {
                            captionAssetBean.captionOutAnimationPackagePath = aVar2.g;
                        }
                        captionInfo4.circleAnimDuration = i20;
                        captionInfo4.inAnimDuration = i21;
                        captionInfo4.outAnimDuration = i22;
                        c.a aVar3 = UC0.c.f24618e;
                        P50.p pVar = captionInfo4.timelineCaption;
                        aVar3.getClass();
                        if (captionAssetBean != null && pVar != null) {
                            c.a.c(captionAssetBean, pVar, i20);
                            c.a.d(captionAssetBean, pVar, i21);
                            c.a.e(captionAssetBean, pVar, i22);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("in_animation_id", String.valueOf(i24));
                            linkedHashMap.put("out_animation_id", String.valueOf(i25));
                            linkedHashMap.put("animation_id", String.valueOf(i23));
                            pVar.addStatsExtraInfo(linkedHashMap);
                        }
                        CaptionInfo captionInfo5 = cVar2.f17480f;
                        P50.p pVar2 = captionInfo5.timelineCaption;
                        if (pVar2 != null) {
                            com.bilibili.studio.videoeditor.extension.h.c(pVar2, "caption_info", captionInfo5);
                        }
                        CaptionInfo captionInfo6 = cVar2.f17480f;
                        if (!bVar.f107169q.f27447g) {
                            int i26 = aVar2.k;
                            int i27 = captionInfo6.circleAnimDuration;
                            int i28 = captionInfo6.inAnimDuration;
                            int i29 = captionInfo6.outAnimDuration;
                            Ny0.n nVar = bVar.h;
                            Ly0.t tVar = nVar.f17525b;
                            P50.p pVar3 = tVar.f14993o;
                            if (pVar3 == null) {
                                BLog.e("EditorCaptionSettingPlayUseCase", "mRunSeekCurrCaption: mCurrTimelineCaption cant be null");
                            } else {
                                tVar.f14996r = true;
                                Handler handler = nVar.f17526c;
                                handler.removeCallbacks(nVar.f17529f);
                                Ref.LongRef longRef = new Ref.LongRef();
                                Ref.LongRef longRef2 = new Ref.LongRef();
                                Ref.LongRef longRef3 = new Ref.LongRef();
                                if (i26 == 0) {
                                    longRef.element = pVar3.getInPoint();
                                    long inPoint = pVar3.getInPoint() + ((long) (i28 * 1000));
                                    longRef2.element = inPoint;
                                    nVar.f17527d = inPoint;
                                    nVar.f17528e = -1.0f;
                                    longRef3.element = inPoint - longRef.element;
                                } else if (i26 == 1) {
                                    longRef.element = pVar3.getOutPoint() - ((long) (i29 * 1000));
                                    longRef2.element = pVar3.getOutPoint();
                                    nVar.f17527d = longRef.element;
                                    nVar.f17528e = 1.0f;
                                    longRef3.element = (((long) i29) * 1000) + 500000;
                                } else if (i26 == 2) {
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
                } else {
                    BiliEditorCaptionBaseFragment.nf(captionListItem, "caption_anim");
                    biliEditorCaptionAnimationListV4Fragment.rf().f106699e.f17486a.a(captionListItem, biliEditorCaptionAnimationListV4Fragment.f106464i, new C6527d(biliEditorCaptionAnimationListV4Fragment, captionListItem, aVar2));
                }
                return Unit.INSTANCE;
            }
        };
        this.f106467l = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310646);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f106466k, 1, false));
        recyclerView.setAdapter(this.f106467l);
        vf(this.f106469n);
        recyclerView.addOnScrollListener(new C6528e(this));
        this.f106468m = recyclerView;
        ArrayList<CaptionListItem> arrayList = this.f106465j;
        if (arrayList != null) {
            tf(this.f106464i, arrayList);
        }
        wf();
    }

    public final C6547a rf() {
        return (C6547a) this.f106471p.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setMenuVisibility(boolean z6) {
        super.setMenuVisibility(z6);
        if (z6) {
            wf();
        }
    }

    public final void sf() {
        CaptionListItem captionListItem;
        Integer animId;
        RecyclerView recyclerView = this.f106468m;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            for (int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1; iFindFirstVisibleItemPosition++) {
                ArrayList<CaptionListItem> arrayList = this.f106465j;
                if (arrayList != null && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(arrayList, iFindFirstVisibleItemPosition)) != null && (animId = captionListItem.getAnimId()) != null) {
                    this.f106470o.add(String.valueOf(animId.intValue()));
                }
            }
        }
    }

    public final void tf(int i7, @NotNull ArrayList<CaptionListItem> arrayList) {
        CaptionInfo captionInfo;
        CaptionInfo captionInfo2;
        CaptionInfo captionInfo3;
        this.f106464i = i7;
        this.f106465j = arrayList;
        C6526c c6526c = this.f106467l;
        if (c6526c != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CaptionListItem captionListItem = new CaptionListItem();
            captionListItem.setAnimId(-1);
            int i8 = this.f106464i;
            boolean z6 = true;
            if (i8 == 0 ? (captionInfo = this.h) == null || captionInfo.inAnimId != -1 : i8 == 1 ? (captionInfo2 = this.h) == null || captionInfo2.outAnimId != -1 : i8 == 2 && ((captionInfo3 = this.h) == null || captionInfo3.circleAnimId != -1)) {
                z6 = false;
            }
            captionListItem.setSelected(z6);
            Unit unit = Unit.INSTANCE;
            arrayList2.add(0, captionListItem);
            c6526c.f54261a = arrayList2;
            C6526c c6526c2 = this.f106467l;
            if (c6526c2 != null) {
                c6526c2.notifyDataSetChanged();
            }
        }
    }

    public final void uf(CaptionListItem captionListItem) {
        gx0.a aVar = rf().f106697c.f17474a;
        int i7 = this.f106464i;
        if (i7 == 0) {
            aVar.h = -1;
            aVar.b = captionListItem.getAnimId().intValue();
            CaptionAssetBean captionAssetBean = captionListItem.captionAssetBean;
            aVar.d = captionAssetBean != null ? captionAssetBean.captionInAnimationPackagePath : null;
            aVar.j = null;
        } else if (i7 == 1) {
            aVar.h = -1;
            aVar.e = captionListItem.getAnimId().intValue();
            CaptionAssetBean captionAssetBean2 = captionListItem.captionAssetBean;
            aVar.g = captionAssetBean2 != null ? captionAssetBean2.captionOutAnimationPackagePath : null;
            aVar.j = null;
        } else if (i7 == 2) {
            aVar.b = -1;
            aVar.e = -1;
            aVar.h = captionListItem.getAnimId().intValue();
            CaptionAssetBean captionAssetBean3 = captionListItem.captionAssetBean;
            aVar.j = captionAssetBean3 != null ? captionAssetBean3.captionAnimationPackagePath : null;
            aVar.d = null;
            aVar.g = null;
        }
        Fragment parentFragment = getParentFragment();
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = parentFragment instanceof BiliEditorCaptionAnimationV4Fragment ? (BiliEditorCaptionAnimationV4Fragment) parentFragment : null;
        if (biliEditorCaptionAnimationV4Fragment != null) {
            biliEditorCaptionAnimationV4Fragment.yf(this.f106464i);
        }
        Fragment parentFragment2 = getParentFragment();
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment2 = parentFragment2 instanceof BiliEditorCaptionAnimationV4Fragment ? (BiliEditorCaptionAnimationV4Fragment) parentFragment2 : null;
        if (biliEditorCaptionAnimationV4Fragment2 != null) {
            MainThread.postOnMainThread(new Ct0.v(biliEditorCaptionAnimationV4Fragment2, 3));
        }
        Fragment parentFragment3 = getParentFragment();
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment3 = null;
        if (parentFragment3 instanceof BiliEditorCaptionAnimationV4Fragment) {
            biliEditorCaptionAnimationV4Fragment3 = (BiliEditorCaptionAnimationV4Fragment) parentFragment3;
        }
        if (biliEditorCaptionAnimationV4Fragment3 != null) {
            biliEditorCaptionAnimationV4Fragment3.tf();
        }
    }

    public final void vf(boolean z6) {
        RecyclerView recyclerView;
        if (lf()) {
            C4914a c4914a = this.f106472q;
            if (c4914a != null && (recyclerView = this.f106468m) != null) {
                recyclerView.removeItemDecoration(c4914a);
            }
            C4914a c4914a2 = new C4914a(0, this.f106466k, z6 ? DensityUtil.dp2px(124.0f) : DensityUtil.dp2px(62.0f));
            this.f106472q = c4914a2;
            RecyclerView recyclerView2 = this.f106468m;
            if (recyclerView2 != null) {
                recyclerView2.addItemDecoration(c4914a2);
            }
        }
    }

    public final void wf() {
        if (lf()) {
            gx0.a aVar = rf().f106697c.f17474a;
            int i7 = this.f106464i;
            Integer numValueOf = i7 != 0 ? i7 != 1 ? i7 != 2 ? null : Integer.valueOf(aVar.h) : Integer.valueOf(aVar.e) : Integer.valueOf(aVar.b);
            if (numValueOf != null) {
                C6526c c6526c = this.f106467l;
                RecyclerView recyclerView = this.f106468m;
                if (c6526c == null || recyclerView == null || com.bilibili.studio.videoeditor.util.V.e(c6526c.f54261a)) {
                    return;
                }
                Iterable iterable = c6526c.f54261a;
                int i8 = 0;
                if (iterable != null) {
                    i8 = 0;
                    int i9 = 0;
                    for (Object obj : iterable) {
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        CaptionListItem captionListItem = (CaptionListItem) obj;
                        captionListItem.setSelected(false);
                        if (Intrinsics.areEqual(captionListItem.getAnimId(), numValueOf)) {
                            captionListItem.setSelected(true);
                            i8 = i9;
                        }
                        i9++;
                    }
                }
                c6526c.notifyDataSetChanged();
                recyclerView.scrollToPosition(i8);
            }
        }
    }
}

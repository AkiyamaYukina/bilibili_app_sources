package com.bilibili.studio.editor.moudle.templatev2.ui;

import De0.C1565C;
import De0.M;
import Ny0.r;
import TB0.Z;
import VC0.D;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.adcommon.utils.i;
import com.bilibili.app.comm.emoticon.emoji2.j;
import com.bilibili.app.comm.emoticon.emoji2.n;
import com.bilibili.app.comm.emoticon.emoji2.s;
import com.bilibili.campus.tabs.billboard.H;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateMusicViewModel;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.pb.PbTemplateEngine;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.videoshortcut.sidecenter.SideCenterActivity;
import com.mall.ui.composePage.shopreplay.MallShopLiveReplayFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment.class */
public final class BiliEditorTemplateMusicFragment extends BaseFragment implements Mw0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Z f108088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f108089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f108090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f108091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Qz0.h f108092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Qz0.e f108093g;

    @Nullable
    public Qz0.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public List<Rect> f108094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f108095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f108096k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108097a;

        static {
            int[] iArr = new int[BiliEditorTemplateMusicViewModel.LoadState.values().length];
            try {
                iArr[BiliEditorTemplateMusicViewModel.LoadState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BiliEditorTemplateMusicViewModel.LoadState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BiliEditorTemplateMusicViewModel.LoadState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f108097a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliEditorTemplateMusicFragment f108099b;

        public b(BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment) {
            this.f108099b = biliEditorTemplateMusicFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            boolean z6 = true;
            if (i7 != 1) {
                z6 = false;
            }
            this.f108098a = z6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            if (this.f108098a) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModelQf = this.f108099b.qf();
                    int i9 = -1;
                    if (iFindLastVisibleItemPosition == biliEditorTemplateMusicViewModelQf.f108122l.size() - 1) {
                        EditorTemplateTabItemBean editorTemplateTabItemBean = (EditorTemplateTabItemBean) CollectionsKt.lastOrNull(biliEditorTemplateMusicViewModelQf.f108122l);
                        if (editorTemplateTabItemBean != null) {
                            i9 = editorTemplateTabItemBean.tabIndex;
                        }
                    } else {
                        EditorTemplateTabItemBean editorTemplateTabItemBean2 = (EditorTemplateTabItemBean) CollectionsKt.getOrNull(biliEditorTemplateMusicViewModelQf.f108122l, iFindFirstVisibleItemPosition);
                        if (editorTemplateTabItemBean2 != null) {
                            i9 = editorTemplateTabItemBean2.tabIndex;
                        }
                    }
                    if (i9 >= 0) {
                        MutableLiveData<Integer> mutableLiveData = biliEditorTemplateMusicViewModelQf.f108116e;
                        Integer value = mutableLiveData.getValue();
                        if (value != null && i9 == value.intValue()) {
                            return;
                        }
                        mutableLiveData.setValue(Integer.valueOf(i9));
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f108100a;

        public c(Function1 function1) {
            this.f108100a = function1;
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
            return this.f108100a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f108100a.invoke(obj);
        }
    }

    public BiliEditorTemplateMusicFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10149invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10150invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f108089c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BiliEditorTemplateMusicViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10151invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10152invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$4.m10152invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10153invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment$special$$inlined$viewModels$default$5.m10153invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f108090d = LazyKt.lazy(new Df.f(this, 5));
        this.f108091e = LazyKt.lazy(new C1565C(this, 7));
        this.f108094i = CollectionsKt.emptyList();
        this.f108095j = DensityUtil.dp2px(16.0f);
        this.f108096k = new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void rf(com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment.rf(com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean, java.lang.String, java.lang.String):void");
    }

    public static void sf(BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment, boolean z6, int i7) {
        k.b bVar = biliEditorTemplateMusicFragment.of().f108193a;
        if (bVar != null) {
            bVar.b(z6, false, false);
        }
    }

    public final void jf(EditorTemplateTabItemBean editorTemplateTabItemBean, boolean z6, String str) {
        i.a("applyTemplateFailed ", editorTemplateTabItemBean.name, ", ", str, "BiliEditorTemplateMusicFragment");
        sf(this, true, 4);
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        rf(editorTemplateTabItemBean, "fail", str2);
        if (isVisible() && z6) {
            ToastHelper.showToastShort(getContext(), 2131842234);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.bilibili.studio.editor.moudle.templatev2.ui.b, java.lang.Object] */
    public final void kf(long j7, EditVideoInfo editVideoInfo, EditorTemplateTabItemBean editorTemplateTabItemBean, boolean z6) {
        ArrayList<BMusic> arrayList;
        IntelligenceAudioConfig intelligenceAudioConfig;
        EditorMusicInfo editorMusicInfo;
        ArrayList<BMusic> arrayList2;
        EditVideoIntelligenceInfo intelligenceInfo = editVideoInfo.getIntelligenceInfo();
        if (intelligenceInfo != null && (intelligenceAudioConfig = intelligenceInfo.audioConfig) != null && !intelligenceAudioConfig.autoBgm && (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) != null && (arrayList2 = editorMusicInfo.bMusicList) != null) {
            final ?? obj = new Object();
            arrayList2.removeIf(new Predicate(obj) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f108102a;

                {
                    this.f108102a = obj;
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((Boolean) this.f108102a.invoke(obj2)).booleanValue();
                }
            });
        }
        if (editVideoInfo.getIntelligenceInfo() != null && editVideoInfo.getIntelligenceInfo().audioConfig != null) {
            Integer num = editVideoInfo.getIntelligenceInfo().audioConfig.audioSrcVolume;
            Integer num2 = editVideoInfo.getIntelligenceInfo().audioConfig.audioVolume;
            if (num != null) {
                editVideoInfo.setUserTrackNativeVolume(num.intValue() / 100.0f);
            }
            if (num2 != null) {
                float fIntValue = num2.intValue() / 100.0f;
                IntelligenceMusicInfo intelligenceMusicInfo = editVideoInfo.getIntelligenceInfo().musicInfo;
                if (intelligenceMusicInfo != null) {
                    intelligenceMusicInfo.volume = fIntValue;
                    EditorMusicInfo editorMusicInfo2 = editVideoInfo.getEditorMusicInfo();
                    if (editorMusicInfo2 != null && (arrayList = editorMusicInfo2.bMusicList) != null) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((BMusic) it.next()).ratioMusic = fIntValue;
                        }
                    }
                }
            }
        }
        com.bilibili.studio.editor.timeline.i iVarPf = pf();
        if (iVarPf != null) {
            iVarPf.b(editVideoInfo, true, "TemplateMusicFragment-applyTemplateParseSuccess");
        }
        EditVideoInfo editVideoInfo2 = of().f108196d;
        if (editVideoInfo2 != null) {
            editVideoInfo2.update(editVideoInfo, true);
        }
        EditVideoInfo editVideoInfo3 = of().f108196d;
        if (editVideoInfo3 != null) {
            editVideoInfo3.setEditorMusicInfo(editVideoInfo.getEditorMusicInfo());
        }
        if (z6) {
            EditVideoInfo editVideoInfo4 = of().f108197e;
            if (editVideoInfo4 != null) {
                editVideoInfo4.setIntelligenceInfo(editVideoInfo.getIntelligenceInfo());
            }
            BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModelQf = qf();
            biliEditorTemplateMusicViewModelQf.getClass();
            biliEditorTemplateMusicViewModelQf.L0(editVideoInfo, false, true, true);
            rf(editorTemplateTabItemBean, "success", "");
            lf(editVideoInfo.getEditTemplateInfo());
        } else {
            lf(editorTemplateTabItemBean);
        }
        Bz0.a.g(editVideoInfo);
        v0.b(System.currentTimeMillis() - j7, " loadPBTimeline time=", "BiliEditorTemplateMusicFragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf(com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean r6) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.ui.BiliEditorTemplateMusicFragment.lf(com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean):void");
    }

    public final void mf(BiliEditorTemplateMusicViewModel.LoadState loadState) {
        Z z6 = this.f108088b;
        if (z6 != null) {
            if (loadState != null) {
                int i7 = a.f108097a[loadState.ordinal()];
                RecyclerView recyclerView = z6.f23723j;
                ConstraintLayout constraintLayout = z6.f23716b;
                if (i7 == 1) {
                    constraintLayout.setVisibility(qf().f108114c.getValue() == BiliEditorTemplateMusicViewModel.LoadState.LOADING ? 8 : 0);
                    z6.f23717c.setVisibility(0);
                    z6.f23719e.setVisibility(0);
                    z6.f23720f.setVisibility(8);
                    recyclerView.setVisibility(8);
                } else if (i7 == 2) {
                    constraintLayout.setVisibility(qf().f108114c.getValue() == BiliEditorTemplateMusicViewModel.LoadState.ERROR ? 8 : 0);
                    z6.f23717c.setVisibility(0);
                    z6.f23719e.setVisibility(8);
                    z6.f23720f.setVisibility(0);
                    recyclerView.setVisibility(8);
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    constraintLayout.setVisibility(0);
                    z6.f23717c.setVisibility(8);
                    recyclerView.setVisibility(0);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void nf(EditorTemplateTabItemBean editorTemplateTabItemBean) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        Rect rect2 = null;
        int i7 = 0;
        for (Object obj : qf().f108122l) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            boolean zAreEqual = Intrinsics.areEqual(editorTemplateTabItemBean, (EditorTemplateTabItemBean) obj);
            if (zAreEqual) {
                rect = new Rect(0, 0, 0, 0);
            } else if (i7 == 0) {
                int i8 = this.f108095j;
                rect = new Rect(i8, 0, i8, 0);
            } else {
                rect = new Rect(0, 0, this.f108095j, 0);
            }
            if (zAreEqual && rect2 != null) {
                rect2.right = 0;
            }
            arrayList.add(rect);
            i7++;
            rect2 = rect;
        }
        this.f108094i = arrayList;
    }

    public final k of() {
        return (k) this.f108090d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Z zInflate = Z.inflate(layoutInflater, viewGroup, false);
        this.f108088b = zInflate;
        return zInflate != null ? zInflate.f23715a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PbTemplateEngine pbTemplateEngine = ((com.bilibili.studio.editor.moudle.templatev2.vm.e) this.f108091e.getValue()).f108165b;
        D d7 = pbTemplateEngine.f109861a;
        if (d7 != null) {
            d7.c();
        }
        pbTemplateEngine.f109861a = null;
        qf().J0(false);
        if (EntryPointKt.getMemleakOptEnable()) {
            Z z6 = this.f108088b;
            if (z6 != null) {
                z6.f23725l.setAdapter(null);
            }
            Z z7 = this.f108088b;
            if (z7 != null) {
                z7.f23724k.setAdapter(null);
            }
            Z z8 = this.f108088b;
            if (z8 != null) {
                z8.f23724k.removeOnScrollListener(this.f108096k);
            }
            Z z9 = this.f108088b;
            if (z9 != null) {
                z9.f23723j.setAdapter(null);
            }
            this.f108092f = null;
            this.f108093g = null;
            this.h = null;
        }
        this.f108088b = null;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [Qz0.h, androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        k.b bVar = of().f108193a;
        if (bVar != null) {
            bVar.c(new BiliEditorTemplateMusicFragment$initViewModel$1(this));
        }
        BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModelQf = qf();
        EditVideoInfo editVideoInfo = of().f108196d;
        int i7 = BiliEditorTemplateMusicViewModel.f108113o;
        biliEditorTemplateMusicViewModelQf.L0(editVideoInfo, true, true, true);
        qf().f108114c.observe(getViewLifecycleOwner(), new c(new r(this, 1)));
        qf().h.observe(getViewLifecycleOwner(), new c(new n(this, 1)));
        qf().f108118g.observe(getViewLifecycleOwner(), new c(new H(this, 1)));
        qf().f108116e.observe(getViewLifecycleOwner(), new c(new d(0, this)));
        qf().f108117f.observe(getViewLifecycleOwner(), new c(new e(0, this)));
        qf().f108121k.observe(getViewLifecycleOwner(), new c(new com.bilibili.pegasus.holders.bannerv8.items.c(this, 1)));
        qf().f108120j.observe(getViewLifecycleOwner(), new c(new com.bilibili.pegasus.holders.bannerv8.items.d(this, 1)));
        qf().f108115d.observe(getViewLifecycleOwner(), new c(new com.bilibili.bililive.room.ui.roomv3.viewv5.player.a(this, 2)));
        final int i8 = 0;
        qf().f108119i.observe(getViewLifecycleOwner(), new c(new Function1(this, i8) { // from class: com.bilibili.studio.editor.moudle.templatev2.ui.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f108107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f108108b;

            {
                this.f108107a = i8;
                this.f108108b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f108107a) {
                    case 0:
                        List list = (List) obj;
                        BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = (BiliEditorTemplateMusicFragment) this.f108108b;
                        Qz0.c cVar = biliEditorTemplateMusicFragment.h;
                        if (cVar != null) {
                            Pair<EditorMusicItem, Boolean> value = biliEditorTemplateMusicFragment.qf().f108120j.getValue();
                            cVar.f20279e = value != null ? (EditorMusicItem) value.getFirst() : null;
                            cVar.f20280f.clear();
                            cVar.f20278d.clear();
                            cVar.f20278d.addAll(list != null ? list : CollectionsKt.emptyList());
                            cVar.notifyDataSetChanged();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        ViewPager viewPager = ((SideCenterActivity) this.f108108b).B;
                        if (viewPager != null) {
                            viewPager.setCurrentItem(iIntValue, false);
                        }
                        return Unit.INSTANCE;
                    default:
                        return MallShopLiveReplayFragment.pf((MallShopLiveReplayFragment) this.f108108b, ((Boolean) obj).booleanValue());
                }
            }
        }));
        FlowLiveDataConversions.b(((com.bilibili.studio.editor.moudle.templatev2.vm.e) this.f108091e.getValue()).f108167d, null, 3).observe(getViewLifecycleOwner(), new c(new s(this, 2)));
        Z z6 = this.f108088b;
        if (z6 != null) {
            z6.f23727n.setOnClickListener(new com.bilibili.app.comm.emoticon.emoji2.i(this, 1));
            z6.f23726m.setOnClickListener(new j(this, 1));
            com.bilibili.studio.editor.moudle.templatev2.ui.a aVar = new com.bilibili.studio.editor.moudle.templatev2.ui.a(this);
            ?? adapter = new RecyclerView.Adapter();
            adapter.f20296a = aVar;
            adapter.f20297b = new ArrayList();
            adapter.f20298c = -1;
            this.f108092f = adapter;
            this.f108093g = new Qz0.e(of().f108196d, new M(this, 2));
            this.h = new Qz0.c(new BiliEditorTemplateMusicFragment$initView$1$7(this), new BiliEditorTemplateMusicFragment$initView$1$5(this), new BiliEditorTemplateMusicFragment$initView$1$6(this));
            Qz0.h hVar = this.f108092f;
            RecyclerView recyclerView = z6.f23725l;
            recyclerView.setAdapter(hVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            Qz0.e eVar = this.f108093g;
            RecyclerView recyclerView2 = z6.f23724k;
            recyclerView2.setAdapter(eVar);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setItemAnimator(null);
            recyclerView2.addOnScrollListener(this.f108096k);
            recyclerView2.addItemDecoration(new g(this));
            Qz0.c cVar = this.h;
            RecyclerView recyclerView3 = z6.f23723j;
            recyclerView3.setAdapter(cVar);
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext(), 0, false));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final com.bilibili.studio.editor.timeline.i pf() {
        ey0.a aVar = of().f108195c;
        return aVar != null ? aVar.e() : null;
    }

    public final BiliEditorTemplateMusicViewModel qf() {
        return (BiliEditorTemplateMusicViewModel) this.f108089c.getValue();
    }
}

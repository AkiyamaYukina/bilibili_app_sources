package com.bilibili.upper.module.draft.vm;

import X60.e;
import Xz0.g;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import cF0.C5234a;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.room.ui.roomv3.hybrid.k;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import fD0.InterfaceC7041a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel.class */
@StabilityInferred(parameters = 0)
public final class DraftViewModel extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<DraftItemBean>> f113119b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f113120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<DraftItemBean>> f113121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<DraftItemBean>> f113122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f113124g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f113125i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((DraftItemBean) t8).updateTime), Long.valueOf(((DraftItemBean) t7).updateTime));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113126a;

        public b(Function1 function1) {
            this.f113126a = function1;
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
            return this.f113126a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113126a.invoke(obj);
        }
    }

    public DraftViewModel() {
        MutableLiveData<List<DraftItemBean>> mutableLiveData = new MutableLiveData<>();
        this.f113121d = mutableLiveData;
        MutableLiveData<List<DraftItemBean>> mutableLiveData2 = new MutableLiveData<>();
        this.f113122e = mutableLiveData2;
        this.f113124g = new MutableLiveData<>();
        mutableLiveData.observeForever(new b(new e(this, 4)));
        mutableLiveData2.observeForever(new b(new k(this, 1)));
    }

    public final void I0(@NotNull DraftItemBean draftItemBean) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        if (draftItemBean.isBCutDraft().booleanValue()) {
            BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new DraftViewModel$deleteDraft$1(this, draftItemBean, null), 3, (Object) null);
        } else {
            BLog.i("DraftViewModel", "deleteDraft item=" + draftItemBean.draftId);
            C5234a.f(application).b(draftItemBean.draftId, "DraftViewModel-deleteDraft");
        }
        MutableLiveData<List<DraftItemBean>> mutableLiveData = this.f113119b;
        List<DraftItemBean> value = mutableLiveData.getValue();
        if (value == null) {
            return;
        }
        value.remove(draftItemBean);
        mutableLiveData.setValue(value);
    }

    public final void J0(boolean z6) {
        BLog.ifmt("DraftViewModel", "getData...asyncReturn = " + z6 + ", mInnerDrafts.value = " + this.f113121d.getValue() + ", mBCutDrafts.value = " + this.f113122e.getValue(), new Object[0]);
        this.h = false;
        this.f113125i = false;
        this.f113123f = z6;
        Application application = BiliContext.application();
        if (application != null) {
            BuildersKt.launch$default(this.f29514a, Dispatchers.getIO(), (CoroutineStart) null, new DraftViewModel$getInnerDraftsData$1(application, this, null), 2, (Object) null);
        }
        BiliTemplateEngineManager biliTemplateEngineManager = this.f113120c;
        if (biliTemplateEngineManager != null) {
            BuildersKt.launch$default(this.f29514a, Dispatchers.getIO(), (CoroutineStart) null, new DraftViewModel$getBCutDraftsData$1$1(biliTemplateEngineManager, this, null), 2, (Object) null);
        }
    }

    public final void K0(@Nullable Context context) {
        if (zw0.b.u()) {
            BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(0);
            biliTemplateEngineManager.i(context);
            this.f113120c = biliTemplateEngineManager;
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Comparator] */
    public final void L0() {
        MutableLiveData<List<DraftItemBean>> mutableLiveData = this.f113121d;
        List<DraftItemBean> value = mutableLiveData.getValue();
        MutableLiveData<List<DraftItemBean>> mutableLiveData2 = this.f113122e;
        int size = 0;
        BLog.ifmt("DraftViewModel", "mergeDrafts...mInnerDrafts.value = " + value + ", mBCutDrafts.value = " + mutableLiveData2.getValue(), new Object[0]);
        if (this.h && this.f113125i) {
            List<DraftItemBean> value2 = mutableLiveData.getValue();
            int size2 = value2 != null ? value2.size() : 0;
            List<DraftItemBean> value3 = mutableLiveData2.getValue();
            if (value3 != null) {
                size = value3.size();
            }
            this.f113124g.setValue(Integer.valueOf(size2 + size));
        }
        List<DraftItemBean> value4 = mutableLiveData.getValue();
        if (value4 == null) {
            return;
        }
        List<DraftItemBean> value5 = mutableLiveData2.getValue();
        List<DraftItemBean> arrayList = value5;
        if (value5 == null) {
            if (!this.f113123f) {
                return;
            } else {
                arrayList = new ArrayList();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(value4);
        arrayList2.addAll(arrayList);
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, (Comparator) new Object());
        }
        this.f113119b.setValue(arrayList2);
    }

    public final boolean M0(@Nullable final FragmentActivity fragmentActivity, @Nullable DraftItemBean draftItemBean, int i7) {
        if (fragmentActivity == null || draftItemBean == null) {
            return false;
        }
        final BiliTemplateEngineManager biliTemplateEngineManager = this.f113120c;
        boolean z6 = false;
        if (biliTemplateEngineManager != null) {
            z6 = false;
            if (draftItemBean.isBCutDraft().booleanValue()) {
                z6 = true;
                if (i7 == 0) {
                    g.e(fragmentActivity, "草稿独立页", "draft_individual");
                } else if (i7 == 1) {
                    g.e(fragmentActivity, "上传-草稿页", "draft_upload");
                }
                final Bundle bundle = new Bundle();
                bundle.putString("bbs_key_template_track_id", g.d());
                String str = draftItemBean.bCutDraftId;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                bundle.putBoolean("bbs_key_template_sdk_montage", true);
                bundle.putString("bbs_key_template_aurora_resource_path", EditorEngineSDKLoadManager.getAuroraResourcesDirPath());
                final String str3 = str2;
                BiliTemplateEngineManager.c(biliTemplateEngineManager, false, true, false, new Function1(biliTemplateEngineManager, fragmentActivity, str3, bundle) { // from class: com.bilibili.studio.videoeditor.template.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliTemplateEngineManager f110068a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Context f110069b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f110070c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Bundle f110071d;

                    {
                        this.f110068a = biliTemplateEngineManager;
                        this.f110069b = fragmentActivity;
                        this.f110070c = str3;
                        this.f110071d = bundle;
                    }

                    public final Object invoke(Object obj) {
                        Unit unit;
                        final Context context = this.f110069b;
                        final Bundle bundle2 = this.f110071d;
                        if (((Boolean) obj).booleanValue()) {
                            final String str4 = this.f110070c;
                            final BiliTemplateEngineManager biliTemplateEngineManager2 = this.f110068a;
                            biliTemplateEngineManager2.e(true, true, new Function1(biliTemplateEngineManager2, context, str4, bundle2) { // from class: com.bilibili.studio.videoeditor.template.i

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final BiliTemplateEngineManager f110103a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Context f110104b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final String f110105c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final Bundle f110106d;

                                {
                                    this.f110103a = biliTemplateEngineManager2;
                                    this.f110104b = context;
                                    this.f110105c = str4;
                                    this.f110106d = bundle2;
                                }

                                public final Object invoke(Object obj2) {
                                    Unit unit2;
                                    Context context2 = this.f110104b;
                                    Bundle bundle3 = this.f110106d;
                                    if (((Boolean) obj2).booleanValue()) {
                                        BiliTemplateEngineManager biliTemplateEngineManager3 = this.f110103a;
                                        biliTemplateEngineManager3.h();
                                        InterfaceC7041a interfaceC7041a = biliTemplateEngineManager3.f109914e;
                                        if (interfaceC7041a != null) {
                                            interfaceC7041a.q(context2, this.f110105c, bundle3);
                                        }
                                        unit2 = Unit.INSTANCE;
                                    } else {
                                        unit2 = Unit.INSTANCE;
                                    }
                                    return unit2;
                                }
                            });
                            unit = Unit.INSTANCE;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    }
                }, 4);
            }
        }
        return z6;
    }

    public final void N0() {
        BLog.ifmt("DraftViewModel", "release", new Object[0]);
        BiliTemplateEngineManager biliTemplateEngineManager = this.f113120c;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
        this.f113120c = null;
    }
}

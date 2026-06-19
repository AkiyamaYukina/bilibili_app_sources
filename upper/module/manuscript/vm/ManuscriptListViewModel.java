package com.bilibili.upper.module.manuscript.vm;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.upper.api.bean.manuscript.ArchivePre;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptListViewModel.class */
@StabilityInferred(parameters = 0)
public final class ManuscriptListViewModel extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f113677b = "upper_manuscript_pre";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ArchivePre> f113678c;

    public ManuscriptListViewModel() {
        Object obj;
        MutableLiveData<ArchivePre> mutableLiveData = new MutableLiveData<>();
        this.f113678c = mutableLiveData;
        Application application = BiliContext.application();
        if (application != null) {
            try {
                Result.Companion companion = Result.Companion;
                mutableLiveData.setValue((ArchivePre) JSON.parseObject(BiliGlobalPreferenceHelper.getInstance(application).optString("upper_manuscript_pre", ""), ArchivePre.class));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Result.box-impl(obj);
        }
        I0();
    }

    public final void I0() {
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ManuscriptListViewModel$getDataFromNet$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.upper.api.bean.manuscript.ArchivePre.SortField> J0() {
        /*
            r4 = this;
            r0 = r4
            androidx.lifecycle.MutableLiveData<com.bilibili.upper.api.bean.manuscript.ArchivePre> r0 = r0.f113678c
            java.lang.Object r0 = r0.getValue()
            com.bilibili.upper.api.bean.manuscript.ArchivePre r0 = (com.bilibili.upper.api.bean.manuscript.ArchivePre) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1a
            r0 = r6
            java.util.List r0 = r0.sorts
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L84
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L33
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r6 = r0
            goto L84
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = 6
            if (r0 >= r1) goto L84
            com.bilibili.upper.api.bean.manuscript.ArchivePre$SortField r0 = new com.bilibili.upper.api.bean.manuscript.ArchivePre$SortField
            r1 = r0
            r1.<init>()
            r6 = r0
            int[] r0 = fI0.C7042a.f117736b
            r1 = r5
            java.lang.Integer r0 = kotlin.collections.ArraysKt.getOrNull(r0, r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r6
            r1 = r8
            r2 = r9
            int r2 = r2.intValue()
            java.lang.String r1 = r1.getString(r2)
            r0.name = r1
        L61:
            java.lang.String[] r0 = fI0.C7042a.f117738d
            r1 = r5
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L78
            r0 = r6
            r1 = r9
            r0.value = r1
        L78:
            r0 = r7
            r1 = r6
            boolean r0 = r0.add(r1)
            int r5 = r5 + 1
            goto L35
        L84:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptListViewModel.J0():java.util.List");
    }
}

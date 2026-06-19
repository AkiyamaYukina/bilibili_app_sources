package com.bilibili.studio.centerplus.model;

import androidx.fragment.app.FragmentActivity;
import bolts.Task;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/PermissionCheckViewModel$checkNeededPermissions$1.class */
final class PermissionCheckViewModel$checkNeededPermissions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final String $curPage;
    final Integer[] $permissions;
    final String $relationFrom;
    final int $tabIndex;
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionCheckViewModel$checkNeededPermissions$1(g gVar, Integer[] numArr, FragmentActivity fragmentActivity, String str, int i7, String str2, Continuation<? super PermissionCheckViewModel$checkNeededPermissions$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$permissions = numArr;
        this.$activity = fragmentActivity;
        this.$curPage = str;
        this.$tabIndex = i7;
        this.$relationFrom = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(g gVar, String str, String str2, int i7, Integer[] numArr, FragmentActivity fragmentActivity, boolean z6, boolean z7, PreviewData previewData) {
        BuildersKt.launch$default(gVar.f29514a, Dispatchers.getMain(), (CoroutineStart) null, new PermissionCheckViewModel$checkNeededPermissions$1$1$1(gVar, previewData, str, str2, i7, numArr, fragmentActivity, z6, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionCheckViewModel$checkNeededPermissions$1(this.this$0, this.$permissions, this.$activity, this.$curPage, this.$tabIndex, this.$relationFrom, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BLog.e("CenterPlus1CPPermissionCheck", "checkNeededPermissions thread=" + Thread.currentThread());
        g gVar = this.this$0;
        Integer[] numArr = this.$permissions;
        FragmentActivity fragmentActivity = this.$activity;
        gVar.getClass();
        Integer[] numArr2 = numArr;
        if (numArr == null) {
            numArr2 = new Integer[0];
        }
        int length = numArr2.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z6 = true;
                break;
            }
            if (!PermissionsChecker.checkSelfPermissions(fragmentActivity, g.f105168g[numArr2[i7].intValue()])) {
                z6 = false;
                break;
            }
            i7++;
        }
        this.this$0.f105174e.postValue(Boxing.boxBoolean(z6));
        String str = CenterPlusStatisticsHelper.f105195a;
        CenterPlusStatisticsHelper.p(this.$curPage);
        CenterPlusStatisticsHelper.p("preV2_load");
        CenterPlusStatisticsHelper.g(this.$tabIndex, "archive_authority", null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        final g gVar2 = this.this$0;
        final String str2 = this.$relationFrom;
        final String str3 = this.$curPage;
        final int i8 = this.$tabIndex;
        final Integer[] numArr3 = this.$permissions;
        final FragmentActivity fragmentActivity2 = this.$activity;
        final boolean z7 = z6;
        Task.callInBackground(new h(true, false, new Function2(gVar2, str2, str3, i8, numArr3, fragmentActivity2, z7) { // from class: com.bilibili.studio.centerplus.model.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f105156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f105159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Integer[] f105160e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final FragmentActivity f105161f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f105162g;

            {
                this.f105156a = gVar2;
                this.f105157b = str2;
                this.f105158c = str3;
                this.f105159d = i8;
                this.f105160e = numArr3;
                this.f105161f = fragmentActivity2;
                this.f105162g = z7;
            }

            public final Object invoke(Object obj2, Object obj3) {
                FragmentActivity fragmentActivity3 = this.f105161f;
                boolean z8 = this.f105162g;
                return PermissionCheckViewModel$checkNeededPermissions$1.invokeSuspend$lambda$0(this.f105156a, this.f105157b, this.f105158c, this.f105159d, this.f105160e, fragmentActivity3, z8, ((Boolean) obj2).booleanValue(), (PreviewData) obj3);
            }
        }));
        return Unit.INSTANCE;
    }
}

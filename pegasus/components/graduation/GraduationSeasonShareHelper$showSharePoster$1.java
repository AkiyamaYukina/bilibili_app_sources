package com.bilibili.pegasus.components.graduation;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import kntr.common.share.api.session.ShareSessionCoordinator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonShareHelper$showSharePoster$1.class */
final class GraduationSeasonShareHelper$showSharePoster$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final GraduationSeasonAnalysisDialogType $dialogType;
    final Function0<Unit> $onDismiss;
    final Function1<String, Unit> $onToastShow;
    final GraduationSeasonShareConfig $shareConfig;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonShareHelper$showSharePoster$1$a.class */
    public static final class a implements com.bilibili.app.gemini.share.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0<Unit> f76027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.app.gemini.share.t f76028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1<String, Unit> f76029c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Unit> function0, com.bilibili.app.gemini.share.t tVar, Function1<? super String, Unit> function1) {
            this.f76027a = function0;
            this.f76028b = tVar;
            this.f76029c = function1;
        }

        public final void c(kntr.common.share.core.g gVar) {
            BLog.i("[GraduationSeason]Share", "share result=" + gVar);
            com.bilibili.app.gemini.share.t tVar = this.f76028b;
            ShareSessionCoordinator shareSessionCoordinator = tVar.e;
            if (shareSessionCoordinator != null) {
                shareSessionCoordinator.b();
            }
            tVar.e = null;
        }

        public final boolean e(String str) {
            Function1<String, Unit> function1 = this.f76029c;
            if (function1 != null) {
                function1.invoke(str);
            }
            return function1 != null;
        }

        public final void f() {
            Function0<Unit> function0 = this.f76027a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final boolean h() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraduationSeasonShareHelper$showSharePoster$1(GraduationSeasonShareConfig graduationSeasonShareConfig, GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType, FragmentActivity fragmentActivity, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super GraduationSeasonShareHelper$showSharePoster$1> continuation) {
        super(2, continuation);
        this.$shareConfig = graduationSeasonShareConfig;
        this.$dialogType = graduationSeasonAnalysisDialogType;
        this.$activity = fragmentActivity;
        this.$onDismiss = function0;
        this.$onToastShow = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GraduationSeasonShareHelper$showSharePoster$1 graduationSeasonShareHelper$showSharePoster$1 = new GraduationSeasonShareHelper$showSharePoster$1(this.$shareConfig, this.$dialogType, this.$activity, this.$onDismiss, this.$onToastShow, continuation);
        graduationSeasonShareHelper$showSharePoster$1.L$0 = obj;
        return graduationSeasonShareHelper$showSharePoster$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0192 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:9:0x004a, B:29:0x017b, B:31:0x0192, B:33:0x019c, B:42:0x01bc, B:52:0x01e1, B:53:0x01ea, B:56:0x01ed, B:58:0x01f6, B:60:0x0200, B:71:0x0225, B:73:0x0231, B:82:0x0250, B:15:0x008d, B:23:0x010f, B:18:0x00c3), top: B:91:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:9:0x004a, B:29:0x017b, B:31:0x0192, B:33:0x019c, B:42:0x01bc, B:52:0x01e1, B:53:0x01ea, B:56:0x01ed, B:58:0x01f6, B:60:0x0200, B:71:0x0225, B:73:0x0231, B:82:0x0250, B:15:0x008d, B:23:0x010f, B:18:0x00c3), top: B:91:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.GraduationSeasonShareHelper$showSharePoster$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.ui.graphics.ImageBitmap;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.pic.IPosterShareListener;
import com.bilibili.app.comm.supermenu.share.pic.Orientation;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareParam;
import com.bilibili.app.comm.supermenu.share.pic.PosterShareTask;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.playerbizcommonv2.widget.share.ShareLoadingDialog;
import java.util.List;
import kntr.common.share.domain.model.ShareParams;
import kntr.common.share.domain.model.SharePlacardMode;
import kntr.common.share.domain.model.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordShareService$share$1.class */
final class CheeseStudyRecordShareService$share$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $duration;
    final long $epId;
    final Function0<Unit> $onShareFinished;
    int label;
    final B this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordShareService$share$1$a.class */
    public static final class a implements com.bilibili.app.gemini.share.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0<Unit> f90203a;

        public a(Function0<Unit> function0) {
            this.f90203a = function0;
        }

        public final void f() {
            this.f90203a.invoke();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordShareService$share$1$b.class */
    public static final class b implements IPosterShareListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0<Unit> f90204a;

        public b(Function0<Unit> function0) {
            this.f90204a = function0;
        }

        public final void onDismiss() {
            this.f90204a.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyRecordShareService$share$1(B b7, long j7, Function0<Unit> function0, long j8, Continuation<? super CheeseStudyRecordShareService$share$1> continuation) {
        super(2, continuation);
        this.this$0 = b7;
        this.$epId = j7;
        this.$onShareFinished = function0;
        this.$duration = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyRecordShareService$share$1(this.this$0, this.$epId, this.$onShareFinished, this.$duration, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ShareLoadingDialog shareLoadingDialog = new ShareLoadingDialog();
            B b7 = this.this$0;
            FragmentActivity fragmentActivity = b7.f90136c;
            CheeseStudyRecordShareService$share$1$shareInfo$1 cheeseStudyRecordShareService$share$1$shareInfo$1 = new CheeseStudyRecordShareService$share$1$shareInfo$1(b7, this.$duration, this.$epId, null);
            this.label = 1;
            Object objHf = shareLoadingDialog.hf(fragmentActivity, cheeseStudyRecordShareService$share$1$shareInfo$1, this);
            obj = objHf;
            if (objHf == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        StudyShareInfo studyShareInfo = (StudyShareInfo) obj;
        if (studyShareInfo != null) {
            List list = com.bilibili.app.gemini.share.t.f;
            if (kntr.common.share.core.b.a()) {
                kntr.common.share.domain.model.e eVarG = yk.c.G(this.this$0.f90138e, "", (Function0) null, (Y9.b) null, 6);
                long j7 = this.this$0.f90137d.f117531a;
                long j8 = this.$epId;
                List list2 = com.bilibili.app.gemini.share.t.f;
                FragmentActivity fragmentActivity2 = this.this$0.f90136c;
                SessionManager sessionManager = SessionManager.INSTANCE;
                sessionManager.generateSessionId();
                com.bilibili.app.gemini.share.t.g(new com.bilibili.app.gemini.share.t(fragmentActivity2, new kntr.common.share.domain.model.h(new ShareParams("pugv.detail.player.study-share.click", String.valueOf(j7), "", String.valueOf(j8), new ShareParams.PageInfo("", (String) null, (String) null, (String) null, (String) null), list2), sessionManager.getSessionId()), eVarG), (kntr.common.share.domain.model.e) null, new kntr.common.share.domain.model.i(this.this$0.f90139f.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? j.a.a : new j.b(), (ImageBitmap) null, studyShareInfo.f90217a, (SharePlacardMode) null, 0, false, 0L, false, 1018), new a(this.$onShareFinished), 1);
            } else {
                PosterShareTask.Companion.with(this.this$0.f90136c).posterParams(new PosterShareParam("pugv.detail.player.study-share.click", "", String.valueOf(this.this$0.f90137d.f117531a), (String) null, (String) null, (String) null, "cheese", (String) null, (String) null, 0, (String) null, (String) null, (String) null, 8064, (DefaultConstructorMarker) null)).imageUrl(studyShareInfo.f90217a).shareCallback(new b(this.$onShareFinished)).orientation(!this.this$0.f90135b.h().f102987a ? Orientation.LANDSCAPE : Orientation.VERTICAL).show();
            }
        } else {
            this.$onShareFinished.invoke();
        }
        return Unit.INSTANCE;
    }
}

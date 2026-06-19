package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import android.content.Context;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.j;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/CommercialTimeView$showUpperSloganSelector$1.class */
final class CommercialTimeView$showUpperSloganSelector$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<CommandsPanel.Panel.Extra.GuideMaterial> $guideList;
    final CommandsPanel.Panel.Form $upperSloganForm;
    final CommandsPanel.Panel.Form $userSloganForm;
    Object L$0;
    int label;
    final f this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/CommercialTimeView$showUpperSloganSelector$1$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CommandsPanel.Panel.Extra.GuideMaterial> f81015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f81016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CommandsPanel.Panel.Form f81017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CommandsPanel.Panel.Form f81018d;

        public a(List<CommandsPanel.Panel.Extra.GuideMaterial> list, f fVar, CommandsPanel.Panel.Form form, CommandsPanel.Panel.Form form2) {
            this.f81015a = list;
            this.f81016b = fVar;
            this.f81017c = form;
            this.f81018d = form2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialTimeView$showUpperSloganSelector$1(f fVar, List<CommandsPanel.Panel.Extra.GuideMaterial> list, CommandsPanel.Panel.Form form, CommandsPanel.Panel.Form form2, Continuation<? super CommercialTimeView$showUpperSloganSelector$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$guideList = list;
        this.$upperSloganForm = form;
        this.$userSloganForm = form2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommercialTimeView$showUpperSloganSelector$1(this.this$0, this.$guideList, this.$upperSloganForm, this.$userSloganForm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        j jVar;
        j jVar2;
        j jVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = this.this$0;
            Context context = fVar.f81035d;
            int i8 = fVar.f81039i;
            int iF = fVar.f81037f.f();
            List<CommandsPanel.Panel.Extra.GuideMaterial> list = this.$guideList;
            jVar = new j(context, new j.a(i8, iF, list), new a(list, this.this$0, this.$upperSloganForm, this.$userSloganForm));
            jVar.show();
            try {
                this.L$0 = jVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                jVar2 = jVar;
                jVar2.dismiss();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar4 = (j) this.L$0;
            jVar3 = jVar4;
            try {
                ResultKt.throwOnFailure(obj);
                jVar = jVar4;
            } catch (Throwable th2) {
                jVar2 = jVar3;
                th = th2;
                jVar2.dismiss();
                throw th;
            }
        }
        jVar3 = jVar;
        throw new KotlinNothingValueException();
    }
}

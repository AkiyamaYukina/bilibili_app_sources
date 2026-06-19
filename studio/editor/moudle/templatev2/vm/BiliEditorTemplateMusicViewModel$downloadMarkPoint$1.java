package com.bilibili.studio.editor.moudle.templatev2.vm;

import G.p;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$downloadMarkPoint$1.class */
public final class BiliEditorTemplateMusicViewModel$downloadMarkPoint$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BMusic $bMusic;
    final BgmMissionInfo $bgm;
    private Object L$0;
    int label;
    final BiliEditorTemplateMusicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateMusicViewModel$downloadMarkPoint$1(BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, BgmMissionInfo bgmMissionInfo, BMusic bMusic, Continuation<? super BiliEditorTemplateMusicViewModel$downloadMarkPoint$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorTemplateMusicViewModel;
        this.$bgm = bgmMissionInfo;
        this.$bMusic = bMusic;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliEditorTemplateMusicViewModel$downloadMarkPoint$1 biliEditorTemplateMusicViewModel$downloadMarkPoint$1 = new BiliEditorTemplateMusicViewModel$downloadMarkPoint$1(this.this$0, this.$bgm, this.$bMusic, continuation);
        biliEditorTemplateMusicViewModel$downloadMarkPoint$1.L$0 = obj;
        return biliEditorTemplateMusicViewModel$downloadMarkPoint$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objBoxBoolean;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel = this.this$0;
                BgmMissionInfo bgmMissionInfo = this.$bgm;
                Result.Companion companion = Result.Companion;
                com.bilibili.studio.editor.moudle.intelligence.logic.g gVar = biliEditorTemplateMusicViewModel.f108124n;
                String str = bgmMissionInfo.markPointDownloadUrl;
                gVar.getClass();
                String strB = com.bilibili.studio.editor.moudle.intelligence.logic.g.b();
                biliEditorTemplateMusicViewModel.f108124n.getClass();
                String strD = com.bilibili.studio.editor.moudle.intelligence.logic.g.d(bgmMissionInfo);
                this.L$0 = coroutineScope;
                this.label = 1;
                Object objA = com.bilibili.studio.editor.moudle.intelligence.logic.g.a(str, strB, strD, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objBoxBoolean = Result.constructor-impl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objBoxBoolean = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(objBoxBoolean) != null) {
            objBoxBoolean = Boxing.boxBoolean(false);
        }
        if (((Boolean) objBoxBoolean).booleanValue()) {
            this.this$0.f108124n.getClass();
            String strB2 = com.bilibili.studio.editor.moudle.intelligence.logic.g.b();
            com.bilibili.studio.editor.moudle.intelligence.logic.g gVar2 = this.this$0.f108124n;
            BgmMissionInfo bgmMissionInfo2 = this.$bgm;
            gVar2.getClass();
            String strA = p.a(strB2, com.bilibili.studio.editor.moudle.intelligence.logic.g.d(bgmMissionInfo2));
            if (strA.length() == 0) {
                return Unit.INSTANCE;
            }
            BMusic bMusic = this.$bMusic;
            try {
                obj2 = Result.constructor-impl((IntelligenceMusicInfo.MusicMarker) JSON.parseObject(PB0.c.d(strA), IntelligenceMusicInfo.MusicMarker.class));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            Object obj3 = obj2;
            if (Result.isFailure-impl(obj2)) {
                obj3 = null;
            }
            bMusic.musicMarker = (IntelligenceMusicInfo.MusicMarker) obj3;
        }
        return Unit.INSTANCE;
    }
}

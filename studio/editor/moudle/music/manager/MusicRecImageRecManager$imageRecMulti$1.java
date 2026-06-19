package com.bilibili.studio.editor.moudle.music.manager;

import android.text.TextUtils;
import com.bilibili.studio.editor.moudle.intelligence.data.FileFrameResult;
import com.bilibili.studio.editor.moudle.music.manager.c;
import com.bilibili.studio.editor.moudle.music.manager.musicrec.MaterialLabelError;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/MusicRecImageRecManager$imageRecMulti$1.class */
final class MusicRecImageRecManager$imageRecMulti$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c.a $callback;
    final List<FileFrameResult> $frameResultList;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.music.manager.MusicRecImageRecManager$imageRecMulti$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/MusicRecImageRecManager$imageRecMulti$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.a $callback;
        final List<FileFrameResult> $frameResultList;
        final List<String> $imageRecResult;
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, c cVar, c.a aVar, List<FileFrameResult> list2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$imageRecResult = list;
            this.this$0 = cVar;
            this.$callback = aVar;
            this.$frameResultList = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$imageRecResult, this.this$0, this.$callback, this.$frameResultList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$imageRecResult.isEmpty()) {
                this.this$0.a(MaterialLabelError.ERROR_SDK_REC, this.$callback);
            } else {
                kz0.a.a(this.$imageRecResult, this.$frameResultList);
                String str = this.$imageRecResult.get(0);
                if (TextUtils.isEmpty(str)) {
                    this.this$0.a(MaterialLabelError.ERROR_SDK_REC, this.$callback);
                } else {
                    String str2 = (String) StringsKt.R(str, new String[]{":"}, 0, 6).get(0);
                    c cVar = this.this$0;
                    c.a aVar = this.$callback;
                    if (cVar.f107915f) {
                        BLog.e("MusicRecImageRecManager", "callbackRecSuccess isReleased=true");
                    } else {
                        aVar.a(str2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicRecImageRecManager$imageRecMulti$1(c cVar, List<FileFrameResult> list, c.a aVar, Continuation<? super MusicRecImageRecManager$imageRecMulti$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$frameResultList = list;
        this.$callback = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicRecImageRecManager$imageRecMulti$1(this.this$0, this.$frameResultList, this.$callback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            List listF = this.this$0.f107916g.f(this.$frameResultList);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(listF, this.this$0, this.$callback, this.$frameResultList, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

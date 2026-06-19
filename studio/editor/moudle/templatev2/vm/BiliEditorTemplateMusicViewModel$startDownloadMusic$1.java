package com.bilibili.studio.editor.moudle.templatev2.vm;

import G.p;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$startDownloadMusic$1.class */
public final class BiliEditorTemplateMusicViewModel$startDownloadMusic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MusicDownloadData $downloadData;
    int label;
    final BiliEditorTemplateMusicViewModel this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateMusicViewModel$startDownloadMusic$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$startDownloadMusic$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MusicDownloadData $downloadData;
        int label;
        final BiliEditorTemplateMusicViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, MusicDownloadData musicDownloadData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliEditorTemplateMusicViewModel;
            this.$downloadData = musicDownloadData;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$downloadData, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Bgm bgm;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.this$0.f108121k.getValue(), this.$downloadData)) {
                String strA = p.a(this.$downloadData.getLocalFilePath(), this.$downloadData.getFileName());
                EditorMusicItem musicItem = this.$downloadData.getMusicItem();
                if (musicItem != null) {
                    musicItem.downloadStatus = 5;
                }
                this.this$0.f108121k.setValue(null);
                if (strA.length() <= 0 || !m.b(strA)) {
                    ToastHelper.showToastShort(this.this$0.getApplication(), 2131841972);
                } else {
                    EditorMusicItem musicItem2 = this.$downloadData.getMusicItem();
                    if (musicItem2 != null && (bgm = musicItem2.editBgm) != null) {
                        bgm.localPath = strA;
                    }
                    this.this$0.f108120j.setValue(TuplesKt.to(this.$downloadData.getMusicItem(), Boxing.boxBoolean(true)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateMusicViewModel$startDownloadMusic$1(BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, MusicDownloadData musicDownloadData, Continuation<? super BiliEditorTemplateMusicViewModel$startDownloadMusic$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorTemplateMusicViewModel;
        this.$downloadData = musicDownloadData;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateMusicViewModel$startDownloadMusic$1(this.this$0, this.$downloadData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel = this.this$0;
            MusicDownloadData musicDownloadData = this.$downloadData;
            this.label = 1;
            int i8 = BiliEditorTemplateMusicViewModel.f108113o;
            biliEditorTemplateMusicViewModel.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            com.bilibili.studio.editor.moudle.music.manager.b.d().f107903a = new i(cancellableContinuationImpl);
            if (!Intrinsics.areEqual(com.bilibili.studio.editor.moudle.music.manager.b.d().f107904b, musicDownloadData)) {
                musicDownloadData.setStartDownloadTime(System.currentTimeMillis());
                com.bilibili.studio.editor.moudle.music.manager.b.d().c(musicDownloadData);
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$downloadData, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

package com.bilibili.tgwt.service;

import HD0.B;
import android.media.MediaPlayer;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$downloadVoiceFile$1.class */
final class ChatService$downloadVoiceFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    final B $vm;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$downloadVoiceFile$1(ChatService chatService, String str, B b7, Continuation<? super ChatService$downloadVoiceFile$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$url = str;
        this.$vm = b7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$downloadVoiceFile$1(this.this$0, this.$url, this.$vm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        Object obj2;
        B next;
        MediaPlayer mediaPlayer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.infra.tempfile.e eVar = com.bilibili.ogv.infra.tempfile.a.f67935a;
            com.bilibili.ogv.infra.tempfile.d dVar = new com.bilibili.ogv.infra.tempfile.d(this.this$0.f111878a, this.$url);
            this.label = 1;
            Object objA = eVar.a(dVar, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        if (Result.isSuccess-impl(obj2)) {
            final ChatService chatService = this.this$0;
            final B b7 = this.$vm;
            ResultKt.throwOnFailure(obj2);
            String absolutePath = ((File) obj2).getAbsolutePath();
            if (chatService.f111877Z == b7.f8166c && (mediaPlayer = chatService.f111879a0) != null && mediaPlayer.isPlaying()) {
                chatService.m(1.0f);
                MediaPlayer mediaPlayer2 = chatService.f111879a0;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.reset();
                }
                b7.q(false);
            } else {
                Iterator<B> it = chatService.g().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.f8166c == chatService.f111877Z) {
                        break;
                    }
                }
                B b8 = next;
                if (b8 != null) {
                    b8.q(false);
                }
                chatService.f111877Z = b7.f8166c;
                MediaPlayer mediaPlayer3 = chatService.f111879a0;
                MediaPlayer mediaPlayer4 = mediaPlayer3;
                if (mediaPlayer3 == null) {
                    mediaPlayer4 = new MediaPlayer();
                    chatService.f111879a0 = mediaPlayer4;
                }
                mediaPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener(chatService, b7) { // from class: com.bilibili.tgwt.service.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatService f111961a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final B f111962b;

                    {
                        this.f111961a = chatService;
                        this.f111962b = b7;
                    }

                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer5) {
                        ChatService chatService2 = this.f111961a;
                        B b9 = this.f111962b;
                        chatService2.m(1.0f);
                        mediaPlayer5.reset();
                        b9.q(false);
                    }
                });
                mediaPlayer4.setOnErrorListener(new MediaPlayer.OnErrorListener(chatService, b7) { // from class: com.bilibili.tgwt.service.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatService f111963a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final B f111964b;

                    {
                        this.f111963a = chatService;
                        this.f111964b = b7;
                    }

                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer5, int i8, int i9) {
                        ChatService chatService2 = this.f111963a;
                        B b9 = this.f111964b;
                        chatService2.m(1.0f);
                        b9.q(false);
                        return false;
                    }
                });
                mediaPlayer4.setOnPreparedListener(new MediaPlayer.OnPreparedListener(chatService, b7) { // from class: com.bilibili.tgwt.service.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatService f111965a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final B f111966b;

                    {
                        this.f111965a = chatService;
                        this.f111966b = b7;
                    }

                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer5) {
                        ChatService chatService2 = this.f111965a;
                        B b9 = this.f111966b;
                        chatService2.m(0.1f);
                        b9.q(true);
                        mediaPlayer5.start();
                    }
                });
                mediaPlayer4.reset();
                mediaPlayer4.setDataSource(absolutePath);
                mediaPlayer4.prepareAsync();
            }
        } else {
            Kl.a.a(this.this$0.f111899r, 2131836341);
        }
        return Unit.INSTANCE;
    }
}

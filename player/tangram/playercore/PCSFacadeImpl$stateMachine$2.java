package com.bilibili.player.tangram.playercore;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;
import tv.danmaku.videoplayer.coreV2.MediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2.class */
final class PCSFacadeImpl$stateMachine$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final boolean $seeksAccurately;
    final long $targetPosition;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<MediaItem<?>> $mediaItem;
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, Ref.ObjectRef<MediaItem<?>> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
            this.$mediaItem = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$mediaItem, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                MediaItem mediaItem = (MediaItem) this.$mediaItem.element;
                this.label = 1;
                if (PCSFacadeImpl.e(pCSFacadeImpl, mediaItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BLog.i("PCSFacadeImpl$stateMachine$2$1-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$stateMachine$2$1-invokeSuspend] Dropping preloaded media item on asset update request...");
            MediaItem mediaItem2 = (MediaItem) this.$mediaItem.element;
            if (mediaItem2 != null) {
                mediaItem2.release(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            boolean Z$0;
            int label;
            final PCSFacadeImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = pCSFacadeImpl;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (PlayerAvailability) obj2, (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.L$0 = playerAvailability;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl$stateMachine$2$2$1-invokeSuspend] ", "allowedToPlay: " + z6 + " playerAvailability: " + this.this$0.f79394l.getValue() + " ", "PCSFacadeImpl$stateMachine$2$2$1-invokeSuspend");
                return Boxing.boxBoolean(z6 && playerAvailability != PlayerAvailability.FORBIDDEN);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PCSFacadeImpl f79411a;

            public a(PCSFacadeImpl pCSFacadeImpl) {
                this.f79411a = pCSFacadeImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl$stateMachine$2$2$2-emit] ", com.bilibili.app.comm.bh.x5.b.a("Allowed to play: ", zBooleanValue), "PCSFacadeImpl$stateMachine$2$2$2-emit");
                PCSFacadeImpl pCSFacadeImpl = this.f79411a;
                pCSFacadeImpl.f79401s = zBooleanValue;
                IPlayerCoreService iPlayerCoreService = pCSFacadeImpl.f79384a;
                if (zBooleanValue) {
                    iPlayerCoreService.resume();
                } else {
                    iPlayerCoreService.pause();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowB = CompoundPlayStateProviderKt.b(this.this$0.f79388e);
                    PCSFacadeImpl pCSFacadeImpl = this.this$0;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(flowB, pCSFacadeImpl.f79394l, new AnonymousClass1(pCSFacadeImpl, null)));
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BLog.i("PCSFacadeImpl$stateMachine$2$2-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$stateMachine$2$2-invokeSuspend] Pausing on leaving...");
                this.this$0.f79384a.pause();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLog.i("PCSFacadeImpl$stateMachine$2$2-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$stateMachine$2$2-invokeSuspend] Pausing on leaving...");
                this.this$0.f79384a.pause();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.player.tangram.playercore.PCSFacadeImpl$collectAssetUpdate$2] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final PCSFacadeImpl pCSFacadeImpl = this.this$0;
                this.label = 1;
                pCSFacadeImpl.getClass();
                Object objI = IPlayerCoreServiceKtxKt.i(pCSFacadeImpl.f79384a, (PCSFacadeImpl$collectAssetUpdate$2) new tv.danmaku.biliplayerv2.service.F(pCSFacadeImpl) { // from class: com.bilibili.player.tangram.playercore.PCSFacadeImpl$collectAssetUpdate$2

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PCSFacadeImpl f79406a;

                    {
                        this.f79406a = pCSFacadeImpl;
                    }

                    public final MediaResource a(int i8, int i9, int i10) {
                        Function2<C, Continuation<? super MediaResource>, Object> function2 = this.f79406a.o().f79465i;
                        if (function2 != null) {
                            return (MediaResource) BuildersKt.runBlocking$default((CoroutineContext) null, new PCSFacadeImpl$collectAssetUpdate$2$obtainUpdateAsset$1(function2, i9, i10, i8, this.f79406a, null), 1, (Object) null);
                        }
                        BLog.i("PCSFacadeImpl$collectAssetUpdate$2-obtainUpdateAsset-4pVzu0o", "[tangram-player-core-PCSFacadeImpl$collectAssetUpdate$2-obtainUpdateAsset-4pVzu0o] no updater");
                        return null;
                    }
                }, this);
                if (objI != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objI = Unit.INSTANCE;
                }
                if (objI == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$stateMachine$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r12 = r0
                r0 = r8
                int r0 = r0.label
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L24
                r0 = r10
                r1 = 1
                if (r0 != r1) goto L1a
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                goto L9a
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L24:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                com.bilibili.player.tangram.playercore.PCSFacadeImpl r0 = r0.this$0
                r14 = r0
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r14
                tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f79384a
                r9 = r0
                r0 = r9
                kotlinx.coroutines.flow.Flow r0 = tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt.c(r0)
                r13 = r0
                r0 = r9
                kotlinx.coroutines.flow.Flow r0 = tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt.e(r0)
                r15 = r0
                r0 = r14
                tv.danmaku.biliplayerv2.service.U r0 = r0.f79391i
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5c
                r0 = r9
                kotlinx.coroutines.flow.Flow r0 = r0.T()
                r11 = r0
                r0 = r11
                r9 = r0
                r0 = r11
                if (r0 != 0) goto L61
            L5c:
                r0 = 0
                kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
                r9 = r0
            L61:
                r0 = r13
                r1 = r15
                r2 = r9
                com.bilibili.player.tangram.playercore.PCSFacadeImpl$collectPlayerState$2 r3 = new com.bilibili.player.tangram.playercore.PCSFacadeImpl$collectPlayerState$2
                r4 = r3
                r5 = r14
                r6 = 0
                r4.<init>(r5, r6)
                kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2, r3)
                com.bilibili.player.tangram.playercore.k r1 = new com.bilibili.player.tangram.playercore.k
                r2 = r1
                r3 = r14
                r2.<init>(r3)
                r2 = r8
                java.lang.Object r0 = r0.collect(r1, r2)
                r9 = r0
                r0 = r9
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L8d
                goto L91
            L8d:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r9 = r0
            L91:
                r0 = r9
                r1 = r12
                if (r0 != r1) goto L9a
                r0 = r12
                return r0
            L9a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$stateMachine$2(PCSFacadeImpl pCSFacadeImpl, long j7, boolean z6, Continuation<? super PCSFacadeImpl$stateMachine$2> continuation) {
        super(2, continuation);
        this.this$0 = pCSFacadeImpl;
        this.$targetPosition = j7;
        this.$seeksAccurately = z6;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    private static final boolean invokeSuspend$applyMedia(PCSFacadeImpl pCSFacadeImpl, Ref.ObjectRef<MediaItem<?>> objectRef, MediaItemParams mediaItemParams) {
        boolean z6 = pCSFacadeImpl.o().f79463f;
        IPlayerCoreService iPlayerCoreService = pCSFacadeImpl.f79384a;
        if (z6) {
            iPlayerCoreService.playFromShared((Function0) new Object(), (Function0) new Object());
            pCSFacadeImpl.f79401s = iPlayerCoreService.getState() == 4;
            return false;
        }
        Object obj = objectRef.element;
        if (obj == null || !((MediaItem) obj).valid()) {
            BLog.i("PCSFacadeImpl$stateMachine$2-invokeSuspend$applyMedia", "[tangram-player-core-PCSFacadeImpl$stateMachine$2-invokeSuspend$applyMedia] Enforcing plain media resource");
            iPlayerCoreService.setMediaResource(pCSFacadeImpl.o().f79460c, pCSFacadeImpl.f79401s, mediaItemParams);
            return false;
        }
        BLog.i("PCSFacadeImpl$stateMachine$2-invokeSuspend$applyMedia", "[tangram-player-core-PCSFacadeImpl$stateMachine$2-invokeSuspend$applyMedia] Enforcing prepared mediaItem");
        iPlayerCoreService.setMediaResource((MediaItem) objectRef.element, pCSFacadeImpl.o().f79460c, pCSFacadeImpl.f79401s, mediaItemParams);
        return false;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$stateMachine$2 pCSFacadeImpl$stateMachine$2 = new PCSFacadeImpl$stateMachine$2(this.this$0, this.$targetPosition, this.$seeksAccurately, continuation);
        pCSFacadeImpl$stateMachine$2.L$0 = obj;
        return pCSFacadeImpl$stateMachine$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Path cross not found for [B:66:0x02d5, B:69:0x02f4], limit reached: 159 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05f6 A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:15:0x004b, B:138:0x0736, B:140:0x073e, B:121:0x067c, B:123:0x068d, B:129:0x06d0, B:130:0x06da, B:132:0x06e2, B:142:0x074f, B:143:0x0758, B:22:0x008a, B:107:0x05d2, B:109:0x05f6, B:111:0x0607, B:113:0x0611, B:115:0x0640, B:117:0x0649, B:119:0x0670), top: B:158:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0649 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:15:0x004b, B:138:0x0736, B:140:0x073e, B:121:0x067c, B:123:0x068d, B:129:0x06d0, B:130:0x06da, B:132:0x06e2, B:142:0x074f, B:143:0x0758, B:22:0x008a, B:107:0x05d2, B:109:0x05f6, B:111:0x0607, B:113:0x0611, B:115:0x0640, B:117:0x0649, B:119:0x0670), top: B:158:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x068d A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:15:0x004b, B:138:0x0736, B:140:0x073e, B:121:0x067c, B:123:0x068d, B:129:0x06d0, B:130:0x06da, B:132:0x06e2, B:142:0x074f, B:143:0x0758, B:22:0x008a, B:107:0x05d2, B:109:0x05f6, B:111:0x0607, B:113:0x0611, B:115:0x0640, B:117:0x0649, B:119:0x0670), top: B:158:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06da A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #1 {all -> 0x0058, blocks: (B:15:0x004b, B:138:0x0736, B:140:0x073e, B:121:0x067c, B:123:0x068d, B:129:0x06d0, B:130:0x06da, B:132:0x06e2, B:142:0x074f, B:143:0x0758, B:22:0x008a, B:107:0x05d2, B:109:0x05f6, B:111:0x0607, B:113:0x0611, B:115:0x0640, B:117:0x0649, B:119:0x0670), top: B:158:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0475  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x0733 -> B:138:0x0736). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

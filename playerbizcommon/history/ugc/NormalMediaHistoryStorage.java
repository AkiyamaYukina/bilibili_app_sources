package com.bilibili.playerbizcommon.history.ugc;

import Wr0.f;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.player.history.IMediaHistoryStorage;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import cq0.C6753f;
import java.util.HashMap;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/NormalMediaHistoryStorage.class */
@Singleton
@Named("media_history_type_ugc")
public final class NormalMediaHistoryStorage implements IMediaHistoryStorage<MediaHistoryEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f80081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, MediaHistoryEntry> f80082b = new HashMap<>(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommon.history.ugc.a f80083c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/NormalMediaHistoryStorage$a.class */
    public static final class a implements PassportObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NormalMediaHistoryStorage f80084a;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.history.ugc.NormalMediaHistoryStorage$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/NormalMediaHistoryStorage$a$a.class */
        public static final /* synthetic */ class C0521a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f80085a;

            static {
                int[] iArr = new int[Topic.values().length];
                try {
                    iArr[Topic.SIGN_IN.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                f80085a = iArr;
            }
        }

        public a(NormalMediaHistoryStorage normalMediaHistoryStorage) {
            this.f80084a = normalMediaHistoryStorage;
        }

        public final void onChange(Topic topic) {
            if ((topic == null ? -1 : C0521a.f80085a[topic.ordinal()]) == 1) {
                long jA = com.bilibili.adcommon.utils.a.a();
                NormalMediaHistoryStorage normalMediaHistoryStorage = this.f80084a;
                if (normalMediaHistoryStorage.f80081a != jA) {
                    synchronized (this) {
                        normalMediaHistoryStorage.f80082b.clear();
                        Unit unit = Unit.INSTANCE;
                    }
                }
                this.f80084a.f80081a = jA;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.history.ugc.NormalMediaHistoryStorage$readFromDB$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/NormalMediaHistoryStorage$readFromDB$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MediaHistoryEntry>, Object> {
        final IMediaHistoryKeyParams $mediaHistoryKeyParams;
        int label;
        final NormalMediaHistoryStorage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NormalMediaHistoryStorage normalMediaHistoryStorage, IMediaHistoryKeyParams iMediaHistoryKeyParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = normalMediaHistoryStorage;
            this.$mediaHistoryKeyParams = iMediaHistoryKeyParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$mediaHistoryKeyParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MediaHistoryEntry> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NormalMediaHistoryStorage normalMediaHistoryStorage = this.this$0;
            long j7 = ((C6753f) this.$mediaHistoryKeyParams).f116261a;
            normalMediaHistoryStorage.getClass();
            String strValueOf = j7 <= 0 ? "" : String.valueOf(j7);
            NormalMediaHistoryStorage normalMediaHistoryStorage2 = this.this$0;
            if (normalMediaHistoryStorage2.f80083c == null) {
                normalMediaHistoryStorage2.f80083c = new com.bilibili.playerbizcommon.history.ugc.a();
            }
            com.bilibili.playerbizcommon.history.ugc.a aVar = normalMediaHistoryStorage2.f80083c;
            long j8 = ((C6753f) this.$mediaHistoryKeyParams).f116261a;
            long jA = f.a(aVar.f80093a);
            Locale locale = Locale.US;
            PlayerDBEntity playerDBEntityB = aVar.f80094b.b(UgcVideoPlayerDBData.class, "av:" + jA + j8);
            if (playerDBEntityB == null) {
                return null;
            }
            MediaHistoryEntry mediaHistoryEntry = new MediaHistoryEntry((int) playerDBEntityB.f83836a);
            this.this$0.write(strValueOf, mediaHistoryEntry);
            return mediaHistoryEntry;
        }
    }

    public NormalMediaHistoryStorage() {
        a aVar = new a(this);
        BiliAccounts biliAccounts = BiliAccounts.get(BiliContext.application());
        this.f80081a = biliAccounts.mid();
        biliAccounts.subscribe(aVar, new Topic[]{Topic.SIGN_IN});
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @NotNull
    public final String generateKeyId(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        String strValueOf = "";
        if (iMediaHistoryKeyParams instanceof C6753f) {
            long j7 = ((C6753f) iMediaHistoryKeyParams).f116261a;
            strValueOf = j7 <= 0 ? "" : String.valueOf(j7);
        }
        return strValueOf;
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @Nullable
    public final MediaHistoryEntry read(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        return read(generateKeyId(iMediaHistoryKeyParams));
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @Nullable
    public final MediaHistoryEntry read(@NotNull String str) {
        MediaHistoryEntry mediaHistoryEntry;
        if (str.length() == 0) {
            return null;
        }
        synchronized (this) {
            mediaHistoryEntry = this.f80082b.get(str);
        }
        return mediaHistoryEntry;
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @Nullable
    public final Object readFromDB(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams, @NotNull Continuation<? super MediaHistoryEntry> continuation) {
        if (iMediaHistoryKeyParams instanceof C6753f) {
            return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this, iMediaHistoryKeyParams, null), continuation);
        }
        return null;
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    public final void write(@NotNull String str, @NotNull MediaHistoryEntry mediaHistoryEntry) {
        if (str.length() == 0) {
            return;
        }
        if (mediaHistoryEntry.getProgress() < 0) {
            mediaHistoryEntry.setProgress(0);
        }
        synchronized (this) {
            this.f80082b.put(str, mediaHistoryEntry);
            Unit unit = Unit.INSTANCE;
        }
    }
}

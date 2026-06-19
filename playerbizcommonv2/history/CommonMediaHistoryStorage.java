package com.bilibili.playerbizcommonv2.history;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.player.history.IMediaHistoryStorage;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import cq0.C6748a;
import java.util.HashMap;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonMediaHistoryStorage.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("media_history_type_common")
public final class CommonMediaHistoryStorage implements IMediaHistoryStorage<MediaHistoryEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f81775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, MediaHistoryEntry> f81776b = new HashMap<>(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public b f81777c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonMediaHistoryStorage$a.class */
    public static final class a implements PassportObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonMediaHistoryStorage f81778a;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.history.CommonMediaHistoryStorage$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonMediaHistoryStorage$a$a.class */
        public static final /* synthetic */ class C0532a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f81779a;

            static {
                int[] iArr = new int[Topic.values().length];
                try {
                    iArr[Topic.SIGN_IN.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                f81779a = iArr;
            }
        }

        public a(CommonMediaHistoryStorage commonMediaHistoryStorage) {
            this.f81778a = commonMediaHistoryStorage;
        }

        public final void onChange(Topic topic) {
            if ((topic == null ? -1 : C0532a.f81779a[topic.ordinal()]) == 1) {
                long jA = com.bilibili.adcommon.utils.a.a();
                CommonMediaHistoryStorage commonMediaHistoryStorage = this.f81778a;
                if (commonMediaHistoryStorage.f81775a != jA) {
                    synchronized (this) {
                        commonMediaHistoryStorage.f81776b.clear();
                        Unit unit = Unit.INSTANCE;
                    }
                }
                this.f81778a.f81775a = jA;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.history.CommonMediaHistoryStorage$readFromDB$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/CommonMediaHistoryStorage$readFromDB$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MediaHistoryEntry>, Object> {
        final IMediaHistoryKeyParams $mediaHistoryKeyParams;
        int label;
        final CommonMediaHistoryStorage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommonMediaHistoryStorage commonMediaHistoryStorage, IMediaHistoryKeyParams iMediaHistoryKeyParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = commonMediaHistoryStorage;
            this.$mediaHistoryKeyParams = iMediaHistoryKeyParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$mediaHistoryKeyParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MediaHistoryEntry> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CommonMediaHistoryStorage commonMediaHistoryStorage = this.this$0;
            long j7 = ((C6748a) this.$mediaHistoryKeyParams).f116261a;
            commonMediaHistoryStorage.getClass();
            String strValueOf = j7 <= 0 ? "" : String.valueOf(j7);
            CommonMediaHistoryStorage commonMediaHistoryStorage2 = this.this$0;
            if (commonMediaHistoryStorage2.f81777c == null) {
                commonMediaHistoryStorage2.f81777c = new b();
            }
            PlayerDBEntity<CommonVideoPlayerDBData> playerDBEntityA = commonMediaHistoryStorage2.f81777c.a(((C6748a) this.$mediaHistoryKeyParams).f116261a);
            if (playerDBEntityA == null) {
                return null;
            }
            MediaHistoryEntry mediaHistoryEntry = new MediaHistoryEntry((int) playerDBEntityA.f83836a);
            this.this$0.write(strValueOf, mediaHistoryEntry);
            return mediaHistoryEntry;
        }
    }

    public CommonMediaHistoryStorage() {
        a aVar = new a(this);
        BiliAccounts biliAccounts = BiliAccounts.get(BiliContext.application());
        this.f81775a = biliAccounts.mid();
        biliAccounts.subscribe(aVar, new Topic[]{Topic.SIGN_IN});
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @NotNull
    public final String generateKeyId(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        String strValueOf = "";
        if (iMediaHistoryKeyParams instanceof C6748a) {
            long j7 = ((C6748a) iMediaHistoryKeyParams).f116261a;
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
            mediaHistoryEntry = this.f81776b.get(str);
        }
        return mediaHistoryEntry;
    }

    @Override // com.bilibili.player.history.IMediaHistoryStorage
    @Nullable
    public final Object readFromDB(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams, @NotNull Continuation<? super MediaHistoryEntry> continuation) {
        if (iMediaHistoryKeyParams instanceof C6748a) {
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
            this.f81776b.put(str, mediaHistoryEntry);
            Unit unit = Unit.INSTANCE;
        }
    }
}
